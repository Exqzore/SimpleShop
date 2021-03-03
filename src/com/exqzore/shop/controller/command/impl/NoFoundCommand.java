package com.exqzore.shop.controller.command.impl;

import com.exqzore.shop.controller.command.Command;

public class NoFoundCommand implements Command {

    @Override
    public String execute(String request) {
        return "error-001: No such command exists";
    }
}
