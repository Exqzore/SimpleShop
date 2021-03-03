package com.exqzore.shop.controller.command.impl;

import com.exqzore.shop.controller.command.Command;
import com.exqzore.shop.entity.Appliance;
import com.exqzore.shop.exception.ServiceException;
import com.exqzore.shop.service.ApplianceService;
import com.exqzore.shop.service.ServiceProvider;

import java.util.List;

public class FindByCategoryCommand implements Command {
    @Override
    public String execute(String request) {
        String[] params = request.split("\\s+_\\|_\\s+");
        String category = params[1].split("\\s+=\\s+")[1];

        ServiceProvider provider = ServiceProvider.getInstance();
        ApplianceService applianceService = provider.getApplianceService();

        String response;
        try {
            List<Appliance> appliances = applianceService.findByCategory(category);
            response = appliances.toString();
        } catch (ServiceException exception) {
            //TODO: add logger
            response = "error-010";
        }

        return response;
    }
}
