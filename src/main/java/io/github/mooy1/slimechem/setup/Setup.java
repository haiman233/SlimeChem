package io.github.mooy1.slimechem.setup;

import io.github.mooy1.slimechem.SlimeChem;
import io.github.mooy1.slimechem.implementation.Registry;
import io.github.mooy1.slimechem.implementation.atomic.Element;
import io.github.mooy1.slimechem.implementation.atomic.Isotope;
import io.github.mooy1.slimechem.implementation.machines.ChemicalDissolver;
import io.github.mooy1.slimechem.lists.Categories;
import io.github.mooy1.slimechem.lists.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

import java.util.logging.Level;

public final class Setup {
    
    public static void setup(SlimeChem plugin) {
        
        new ElementCategory(plugin).register();
        
        new SlimefunItem(Categories.MACHINES, Items.SLIMECHEM_ADDON_INFO, RecipeType.NULL, null);
        
        for (Element element : Element.values()) {
            SlimefunItem slimefunItem = new SlimefunItem(Categories.ELEMENTS, element.getItem(), RecipeType.ENHANCED_CRAFTING_TABLE, null);
            slimefunItem.register(plugin);
            Registry.ITEMS.put(slimefunItem, element);
        }
        plugin.getLogger().log(Level.INFO, "Registered " + Element.values().length + " Elements!");
    
        for (Isotope isotope : Isotope.values()) {
            SlimefunItem slimefunItem = new SlimefunItem(Categories.ELEMENTS, isotope.getItem(), RecipeType.ENHANCED_CRAFTING_TABLE, null);
            slimefunItem.register(plugin);
            Registry.ITEMS.put(slimefunItem, isotope);
        }
        plugin.getLogger().log(Level.INFO, "Registered " + Isotope.values().length + " Isotopes!");
    
        for (Molecule molecule : Molecule.values()) {
            SlimefunItem slimefunItem = new SlimefunItem(Categories.MOLECULES, molecule.getItem(), RecipeType.ENHANCED_CRAFTING_TABLE, null);
            slimefunItem.register(plugin);
            Registry.ITEMS.put(slimefunItem, molecule);
        }
        plugin.getLogger().log(Level.INFO, "Registered " + Molecule.values().length + " Molecules!");

        new ChemicalDissolver().register(plugin);
        
    }
    
}
