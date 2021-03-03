package com.exqzore.shop.main;

import com.exqzore.shop.controller.ApplianceController;
import com.exqzore.shop.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new ApplianceController();

        String request;
        String response;

        request = "findcategory _|_ category = Oven";
        response = controller.doAction(request);
        System.out.println(response);

        request = "findcriteria _|_ category = Oven _|_ PRICE = 349.99 _|_ CAPACITY = 33";
        response = controller.doAction(request);
        System.out.println(response);
    }
}
