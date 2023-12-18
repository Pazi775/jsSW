package juilestudio.jssw.commands;

import juilestudio.jssw.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import juilestudio.jssw.utils.Config;
import juilestudio.jssw.utils.DataConfig;
import juilestudio.jssw.utils.Utils;

public class JsStaffWorkCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (args.length == 1) {

            if (args[0].equalsIgnoreCase("reload")) {

                if (sender.hasPermission("jsstaffwork.reload")) {

                    Config.reloadConfig(Main.getInstance());
                    DataConfig.reloadData(Main.getInstance());
                    Utils.sendMessage(sender, Utils.getString("messages.reload"));

                } else {

                    Utils.sendMessage(sender, Utils.getString("messages.no-permission"));

                }

                return true;
            } else {

                for (String help : Utils.getStringList("messages.help")) {
                    Utils.sendMessage(sender, help);
                }

            }

            return true;
        } else {

            for (String help : Utils.getStringList("messages.help")) {
                Utils.sendMessage(sender, help);
            }

        }
        return false;
    }
}
