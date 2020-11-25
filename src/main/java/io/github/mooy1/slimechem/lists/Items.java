package io.github.mooy1.slimechem.lists;

import io.github.mooy1.slimechem.SlimeChem;
import io.github.mooy1.slimechem.implementation.machines.ChemicalDissolver;
import io.github.mooy1.slimechem.utils.LoreUtils;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Items {

    public static final SlimefunItemStack CHEMICAL_DISSOLVER = new SlimefunItemStack(
            "CHEMICAL_DISSOLVER",
            Material.DIAMOND_BLOCK,
            "&bChemical Dissolver",
            "",
            LoreUtils.energyPerSecond(ChemicalDissolver.ENERGY)
    );

    // add ur discord or smth if u want
    public static final SlimefunItemStack SLIMECHEM_ADDON_INFO = new SlimefunItemStack(
            "SLIMECHEM_ADDON_INFO",
            Material.NETHER_STAR,
            "&bAddon Info",
            "&fVersion: &7" + SlimeChem.getInstance().getPluginVersion(),
            "",
            "&fDiscord: &b@&7Riley&8#5911",
            "&7discord.gg/slimefun",
            "",
            "&fGithub: &b@&8&7Mooy1",
            "&7" + SlimeChem.getInstance().getBugTrackerURL()
    );
    
}