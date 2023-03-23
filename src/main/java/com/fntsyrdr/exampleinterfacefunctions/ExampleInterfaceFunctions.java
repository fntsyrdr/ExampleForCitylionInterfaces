package com.fntsyrdr.exampleinterfacefunctions;

import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.C;

public final class ExampleInterfaceFunctions extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("Start Plugin");

        this.getLogger().info("Exponential");
        IFunctions exponential = new Exponential();
        ClassThatUsesFunctions classThatUsesFunctions = new ClassThatUsesFunctions();
        int result = classThatUsesFunctions.UseFunction(5, exponential);
        this.getLogger().info("" + result);

        this.getLogger().info("Linear");
        IFunctions linear = new Linear();
        result = classThatUsesFunctions.UseFunction(5, linear);
        this.getLogger().info("" + result);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
