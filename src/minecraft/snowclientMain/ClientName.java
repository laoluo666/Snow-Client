package snowclientMain;

import java.awt.Color;

import org.lwjgl.opengl.Display;

import net.minecraft.*;

import net.minecraft.client.Minecraft;

public class ClientName {
	public static void nameChange() {
		Display.setTitle("Snow Client 1.8.8");
	}

	public static void GUI() {
		Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("Snow Client", 1, 1, Color.ORANGE.getRGB());
	}
}
