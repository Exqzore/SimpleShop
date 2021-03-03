package com.exqzore.shop.controller.command;

import com.exqzore.shop.controller.command.impl.FindByCategoryCommand;
import com.exqzore.shop.controller.command.impl.FindByCriteriaCommand;
import com.exqzore.shop.controller.command.impl.NoFoundCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("findcategory", new FindByCategoryCommand());
        commands.put("findcriteria", new FindByCriteriaCommand());
        commands.put("nocommand", new NoFoundCommand());
    }

    public Command getCommand(String commandName) {
        Command command = commands.get(commandName);
        if(command == null) {
            command = commands.get("nocommand");
        }
        return command;
    }
}
