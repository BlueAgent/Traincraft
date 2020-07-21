package traincraft.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.EnumHelper;
import traincraft.Traincraft;

import javax.annotation.Nullable;

public class ItemArmorOveralls extends ItemArmor {
    
    public static final ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial(Traincraft.MOD_ID + ":overalls", "overalls", 5, new int[]{1, 2, 2, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
    
    public ItemArmorOveralls() {
        super(ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST);
        this.setRegistryName(Traincraft.MOD_ID, "armor_overalls");
        this.setTranslationKey(this.getRegistryName().toString());
    
        this.setCreativeTab(Traincraft.TAB);
    }
    
    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return Traincraft.MOD_ID + ":textures/armor/blue_overalls.png";
    }
    
}
