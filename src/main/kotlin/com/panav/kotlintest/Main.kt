package com.panav.kotlintest

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        println("Hello Kotlin! I'm working!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        println("Shutting down your very cool kotlin plugin!")
    }
}