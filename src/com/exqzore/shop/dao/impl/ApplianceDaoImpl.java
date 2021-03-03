package com.exqzore.shop.dao.impl;

import com.exqzore.shop.dao.ApplianceDao;
import com.exqzore.shop.entity.Appliance;
import com.exqzore.shop.entity.criteria.Criteria;
import com.exqzore.shop.exception.DaoException;
import com.exqzore.shop.factory.Factory;
import com.exqzore.shop.factory.FactoryProvider;
import com.exqzore.shop.parser.Parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplianceDaoImpl implements ApplianceDao {
    private static final String PATH_TO_SHOP_DB = "resources/shop_db.txt";

    @Override
    public List<Appliance> findByCategory(String name) throws DaoException {
        Factory<Appliance> factory = FactoryProvider.takeFactory(name);
        List<Appliance> appliances = new ArrayList<>();
        Parser parser = new Parser();
        try {
            Stream<String> lines = Files.lines(Path.of(PATH_TO_SHOP_DB));
            List<String> products = lines.filter(o -> parser.parsName(o).equals(name)).collect(Collectors.toList());
            for (String product : products) {
                Map<String, String> params = parser.parsParams(product);
                appliances.add(factory.create(params));
            }
        } catch (IOException exception) {
            //TODO: add logger
            throw new DaoException(exception);
        }
        return appliances;
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        Factory<Appliance> factory = FactoryProvider.takeFactory(criteria.getGroupSearchName());
        List<Appliance> appliances = new ArrayList<>();
        Parser parser = new Parser();
        Set<String> keyCriteria = criteria.getSearchCriteria();
        try {
            Stream<String> lines = Files.lines(Path.of(PATH_TO_SHOP_DB));
            List<String> products = lines.filter(o -> parser.parsName(o).equals(criteria.getGroupSearchName())).collect(Collectors.toList());
            products = products.stream().filter(o -> {
                Map<String, String> params = parser.parsParams(o);
                return keyCriteria.stream().allMatch(criterion -> criteria.get(criterion).toString().equals(params.get(criterion)));
            }).collect(Collectors.toList());
            for (String product : products) {
                Map<String, String> params = parser.parsParams(product);
                appliances.add(factory.create(params));
            }
        } catch (IOException exception) {
            //TODO: add logger
            throw new DaoException(exception);
        }
        return appliances;
    }
}
