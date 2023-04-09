package com.acrifly.acrifly.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class GmCommand implements CommandExecutor {
    // gm 1
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            if(sender.hasPermission("gm_command.permission")){
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("0")) {
                        ((Player) sender).setGameMode(GameMode.SURVIVAL);
                        sender.sendMessage(ChatColor.GREEN + "Du bist jetzt im Überlebensmodus.");
                    } else if (args[0].equalsIgnoreCase("1")) {
                        ((Player) sender).setGameMode(GameMode.CREATIVE);
                        sender.sendMessage(ChatColor.GREEN + "Du bist jetzt im Krativmodus.");
                    } else if (args[0].equalsIgnoreCase("2")) {
                        ((Player) sender).setGameMode(GameMode.ADVENTURE);
                        sender.sendMessage(ChatColor.GREEN + "Du bist jetzt im Abenteuermodus.");
                    } else if (args[0].equalsIgnoreCase("3")) {
                        ((Player) sender).setGameMode(GameMode.SPECTATOR);
                        sender.sendMessage(ChatColor.GREEN + "Du bist jetzt im Zuschauermodus.");
                    } else {
                        sender.sendMessage(ChatColor.RED + "Bitte verwende /gm 0-3 (Spielername).");
                    }
                } else if (args.length == 2) {
                    if (args[0].equalsIgnoreCase("0")) {
                        if (Bukkit.getPlayer(args[1]) != null) {
                            Bukkit.getPlayer(args[1]).setGameMode(GameMode.SURVIVAL);
                            TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Überlebensmodus.");
                            message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                            sender.spigot().sendMessage(message);
                        } else {
                            sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                        }
                    } else if (args[0].equalsIgnoreCase("1")) {
                        if (Bukkit.getPlayer(args[1]) != null) {
                            Bukkit.getPlayer(args[1]).setGameMode(GameMode.CREATIVE);
                            TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Krativmodus.");
                            message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                            sender.spigot().sendMessage(message);
                        } else {
                            sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                        }
                    } else if (args[0].equalsIgnoreCase("2")) {
                        if (Bukkit.getPlayer(args[1]) != null) {
                            Bukkit.getPlayer(args[1]).setGameMode(GameMode.ADVENTURE);
                            TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Abenteuermodus.");
                            message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                            sender.spigot().sendMessage(message);
                        } else {
                            sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                        }
                    } else if (args[0].equalsIgnoreCase("3")) {
                        if (Bukkit.getPlayer(args[1]) != null) {
                            Bukkit.getPlayer(args[1]).setGameMode(GameMode.SPECTATOR);
                            TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Zuschauermodus.");
                            message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                            sender.spigot().sendMessage(message);
                        } else {
                            sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                        }
                    }
                }else{
                    sender.sendMessage(ChatColor.RED + "Bitte verwende /gm 0-3 (Spielername).");
                }
            }else{
                sender.sendMessage(ChatColor.RED + "Du hast keine Berechtigung.");
            }
        }else{
            if(args.length == 1){
                sender.sendMessage(ChatColor.RED + "Es ist nicht moeglich, die Konsole ohne den Namen des Spielers auszufuehren.");
            }else if(args.length == 2){
                if(args[0].equalsIgnoreCase("0")){
                    if(Bukkit.getPlayer(args[1]) != null){
                        Bukkit.getPlayer(args[1]).setGameMode(GameMode.SURVIVAL);
                        TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Ueberlebensmodus.");
                        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                        sender.spigot().sendMessage(message);
                    }else{
                        sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                    }
                }else if(args[0].equalsIgnoreCase("1")){
                    if(Bukkit.getPlayer(args[1]) != null){
                        Bukkit.getPlayer(args[1]).setGameMode(GameMode.CREATIVE);
                        TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Krativmodus.");
                        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                        sender.spigot().sendMessage(message);
                    }else{
                        sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                    }
                }else if(args[0].equalsIgnoreCase("2")){
                    if(Bukkit.getPlayer(args[1]) != null){
                        Bukkit.getPlayer(args[1]).setGameMode(GameMode.ADVENTURE);
                        TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Abenteuermodus.");
                        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                        sender.spigot().sendMessage(message);
                    }else{
                        sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                    }
                }else if(args[0].equalsIgnoreCase("3")){
                    if(Bukkit.getPlayer(args[1]) != null){
                        Bukkit.getPlayer(args[1]).setGameMode(GameMode.SPECTATOR);
                        TextComponent message = new TextComponent(ChatColor.GREEN + "" + ChatColor.UNDERLINE + args[1].replace("&", "§") + ChatColor.RESET + ChatColor.GREEN + " ist jetzt im Zuschauermodus.");
                        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://acrifly.com/minecraft/player-data?mc_name_input=" + args[1]));
                        sender.spigot().sendMessage(message);
                    }else{
                        sender.sendMessage(ChatColor.RED + "Spieler konnte nicht gefunden werden.");
                    }
                }
            }else{
                sender.sendMessage(ChatColor.RED + "Bitte verwende /gm 0-3 Spielername.");
            }
        }
        return false;
    }
}
