package com.creeperface.nukkitx.emptyworld;

import cn.nukkit.level.generator.Generator;
import cn.nukkit.plugin.PluginBase;

/**
 * Created by CreeperFace on 16. 11. 2016.
 */
public class EmptyWorld extends PluginBase {

    @Override
    public void onLoad() {
        Generator.addGenerator(EmptyGenerator.class, "emptyworld", Generator.TYPE_INFINITE);
    }
}
