package net.nekonekoserver.forge.autojumpstopper;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(
        modid = AutoJumpStopper.MOD_ID,
        name = AutoJumpStopper.MOD_NAME,
        version = AutoJumpStopper.VERSION
)
public class AutoJumpStopper {

    public static final String MOD_ID = "AutoJumpStopper";
    public static final String MOD_NAME = "AutoJumpStopper";
    public static final String VERSION = "1.0-SNAPSHOT";

    @EventHandler
    @SideOnly(Side.CLIENT)
    public void init(FMLInitializationEvent event) {
        Minecraft.getMinecraft().gameSettings.autoJump = false;
    }
}
