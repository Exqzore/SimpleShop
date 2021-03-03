package com.exqzore.shop.controller;

import com.exqzore.shop.controller.command.Command;
import com.exqzore.shop.controller.command.CommandProvider;

public class ApplianceController implements Controller {
    private final CommandProvider provider = new CommandProvider();

    @Override
    public String doAction(String request) {
        String commandName;
        commandName = request.split("\\s+_\\|_\\s+",2)[0];
        Command command = provider.getCommand(commandName);
        return command.execute(request);
    }
}
