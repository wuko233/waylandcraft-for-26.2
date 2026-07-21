package dev.evvie.waylandcraft.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.opengl.GlTexture;

@Mixin(GlTexture.class)
public interface IGlTextureMixin {
	
	@Invoker("<init>")
	static GlTexture createTexture(int id, String string, GpuFormat gpuFormat, int width, int height, int depthOrLayers, int mipLevels, int usage) {
		throw new AssertionError();
	}
	
}
