package com.exqzore.shop.controller.command.impl;

import com.exqzore.shop.controller.command.Command;
import com.exqzore.shop.entity.Appliance;
import com.exqzore.shop.entity.criteria.Criteria;
import com.exqzore.shop.exception.ServiceException;
import com.exqzore.shop.service.ApplianceService;
import com.exqzore.shop.service.ServiceProvider;

import java.util.List;

public class FindByCriteriaCommand implements Command {
    @Override
    public String execute(String request) {
        String[] params = request.split("\\s+_\\|_\\s+");
        String category = params[1].split("\\s+=\\s+")[1];

        String key;
        String value;

        Criteria criteria = new Criteria(category);
        for(int i = 2; i < params.length; i++) {
            key = params[i].split("\\s+=\\s+")[0];
            value = params[i].split("\\s+=\\s+")[1];
            criteria.add(key, value);
        }

        ServiceProvider provider = ServiceProvider.getInstance();
        ApplianceService applianceService = provider.getApplianceService();

        String response;
        try {
            List<Appliance> appliances = applianceService.find(criteria);
            response = appliances.toString();
        } catch (ServiceException exception) {
            //TODO: add logger
            response = "error-010";
        }

        return response;
    }
}
