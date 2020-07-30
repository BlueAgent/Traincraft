/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemSkinChanger.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

public class ItemSkinChanger extends BaseItem {
    
    public ItemSkinChanger(){
        super("skin_changer", item -> {
            item.setMaxStackSize(1);
        });
    }
}
