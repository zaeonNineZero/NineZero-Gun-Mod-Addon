package zaeonninezero.nzgmaddon.client;

import zaeonninezero.nzgmaddon.nzgmAddon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = nzgmAddon.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public enum SpecialModels
{
    DOUBLE_BARRELED_SHOTGUN("gun/double_barreled_shotgun"),
    AUTOMATIC_SNIPER_RIFLE("gun/automatic_sniper_rifle"),
    HUNTING_RIFLE("gun/hunting_rifle"),

    BASIC_BULLET_LOADED("bullets/basic_bullet_loaded"),
    MEDIUM_BULLET_LOADED("bullets/medium_bullet_loaded"),
    ADVANCED_BULLET_LOADED("bullets/advanced_bullet_loaded"),
    SG_SHELL_LOADED("bullets/shell_loaded"),
	
    REVOLVER_BASE("revolver_base"),
    REVOLVER_RAIL("revolver_rail"),
    REVOLVER_SWING("revolver_swing_out"),
    REVOLVER_CYLINDER("revolver_cylinder"),
    REVOLVER_CHAMBERS("revolver_chambers"),
    REVOLVER_BULLETS("revolver_bullets"),
	
    HEAVY_PISTOL_BASE("heavy_pistol_base"),
    HEAVY_PISTOL_SLIDE("heavy_pistol_slide"),
    HEAVY_PISTOL_MAGAZINE("heavy_pistol_magazine"),
	
    HEAVY_REVOLVER_BASE("heavy_revolver_base"),
    HEAVY_REVOLVER_SWING("heavy_revolver_swing_out"),
    HEAVY_REVOLVER_CYLINDER("heavy_revolver_cylinder"),
    HEAVY_REVOLVER_CHAMBERS("heavy_revolver_chambers"),
    HEAVY_REVOLVER_BULLETS("heavy_revolver_bullets"),
	
    MICRO_SMG_BASE("micro_smg_base"),
    MICRO_SMG_RAIL("micro_smg_rail"),
    MICRO_SMG_CHARGEHANDLE("micro_smg_charge_handle"),
    MICRO_SMG_MAGAZINE("micro_smg_magazine"),
    MICRO_SMG_LIGHT_MAG("micro_smg_light_mag"),
    MICRO_SMG_EXTENDED_MAG("micro_smg_extended_mag"),
	
    SUBMACHINE_GUN_BASE("submachine_gun_base"),
    SUBMACHINE_GUN_BASE_1("submachine_gun_base_1"),
    SUBMACHINE_GUN_RAIL("submachine_gun_rail"),
    SUBMACHINE_GUN_RAIL_1("submachine_gun_rail_1"),
    SUBMACHINE_GUN_SIGHTS("submachine_gun_sights"),
    SUBMACHINE_GUN_CHARGEHANDLE("submachine_gun_charge_handle"),
    SUBMACHINE_GUN_MAGAZINE("submachine_gun_magazine"),
	
    COMPACT_SMG_BASE("compact_smg_base"),
    COMPACT_SMG_SIGHTS("compact_smg_sights"),
    COMPACT_SMG_MAGAZINE("compact_smg_magazine"),
	
    RAPID_SMG_BASE("rapid_smg_base"),
    RAPID_SMG_SIGHTS("rapid_smg_sights"),
    RAPID_SMG_BOLT_HANDLE("rapid_smg_bolt_handle"),
    RAPID_SMG_MAGAZINE("rapid_smg_magazine"),
    RAPID_SMG_LIGHT_MAG("rapid_smg_light_magazine"),
	
    PUMP_SHOTGUN_BASE("pump_shotgun_base"),
    PUMP_SHOTGUN_BASE_1("pump_shotgun_base_1"),
    PUMP_SHOTGUN_SIGHTS("pump_shotgun_sights"),
    PUMP_SHOTGUN_PUMP("pump_shotgun_pump"),
	
    HUNTING_SHOTGUN_BASE("hunting_shotgun_base"),
    HUNTING_SHOTGUN_PUMP("hunting_shotgun_pump"),
	
    AUTOMATIC_SHOTGUN_BASE("automatic_shotgun_base"),
    AUTOMATIC_SHOTGUN_SIGHTS("automatic_shotgun_sights"),
    AUTOMATIC_SHOTGUN_MAGAZINE("automatic_shotgun_drum"),
    AUTOMATIC_SHOTGUN_LIGHT_MAGAZINE("automatic_shotgun_light_mag"),
    
    HEAVY_AR_BASE("heavy_ar_base"),
    HEAVY_AR_BASE_1("heavy_ar_base_1"),
    HEAVY_AR_BOTTOM_RAIL("heavy_ar_bottom_rail"),
    HEAVY_AR_FORWARD_TOP_RAIL("heavy_ar_forward_top_rail"),
    HEAVY_AR_BOLT_HANDLE("heavy_ar_bolt_handle"),
    HEAVY_AR_MAGAZINE("heavy_ar_magazine"),
    HEAVY_AR_LIGHT_MAG("heavy_ar_light_mag"),
    HEAVY_AR_EXTENDED_MAG("heavy_ar_extended_mag"),
	
    BATTLE_RIFLE_BASE("battle_rifle_base"),
    BATTLE_RIFLE_SIGHTS("battle_rifle_sights"),
    BATTLE_RIFLE_MAGAZINE("battle_rifle_magazine"),
    BATTLE_RIFLE_LIGHT_MAG("battle_rifle_light_mag"),
    BATTLE_RIFLE_EXTENDED_MAG("battle_rifle_extended_mag"),
    BATTLE_RIFLE_BOLT_HANDLE("battle_rifle_bolt_handle"),
	
    BULLPUP_RIFLE_BASE("bullpup_rifle_base"),
    BULLPUP_RIFLE_SIGHTS("bullpup_rifle_sights"),
    BULLPUP_RIFLE_BOLT_HANDLE("bullpup_rifle_bolt_handle"),
    BULLPUP_RIFLE_MAGAZINE("bullpup_rifle_magazine"),
    BULLPUP_RIFLE_LIGHT_MAG("bullpup_rifle_light_mag"),
    BULLPUP_RIFLE_EXTENDED_MAG("bullpup_rifle_extended_mag"),
	
    MACHINE_GUN_BASE("machine_gun_base"),
    MACHINE_GUN_SIGHTS("machine_gun_sights"),
    MACHINE_GUN_BOLT("machine_gun_bolt"),
    MACHINE_GUN_BULLET1("machine_gun_bullet1"),
    MACHINE_GUN_BULLET2("machine_gun_bullet2"),
    MACHINE_GUN_BULLET3("machine_gun_bullet3"),
    MACHINE_GUN_BULLET4("machine_gun_bullet4"),
    MACHINE_GUN_BULLET5("machine_gun_bullet5"),
    MACHINE_GUN_BOX("machine_gun_box"),
    MACHINE_GUN_LIGHT_BOX("machine_gun_light_box"),
    MACHINE_GUN_HANDLE("machine_gun_handle"),
	
    INFANTRY_RIFLE_BASE("infantry_rifle_base"),
    INFANTRY_RIFLE_CHAMBER("infantry_rifle_chamber"),
    INFANTRY_RIFLE_RAIL("infantry_rifle_rail"),
    INFANTRY_RIFLE_MAGAZINE("infantry_rifle_magazine"),
    INFANTRY_RIFLE_LIGHT_MAG("infantry_rifle_light_mag"),
    INFANTRY_RIFLE_EXTENDED_MAG("infantry_rifle_extended_mag"),
    
    HUNTING_RIFLE_BASE("hunting_rifle_base"),
    HUNTING_RIFLE_BREECH("hunting_rifle_breech"),
    HUNTING_RIFLE_SIGHTS("hunting_rifle_rear_sight"),
    
    BOLT_ACTION_RIFLE_BASE("bolt_action_rifle_base"),
    BOLT_ACTION_RIFLE_BASE_1("bolt_action_rifle_base_1"),
    BOLT_ACTION_RIFLE_BASE_2("bolt_action_rifle_base_2"),
    BOLT_ACTION_RIFLE_SIGHTS("bolt_action_rifle_sights"),
    BOLT_ACTION_RIFLE_RAIL("bolt_action_rifle_rail"),
    BOLT_ACTION_RIFLE_CHAMBER("bolt_action_rifle_bolt1"),
    BOLT_ACTION_RIFLE_BOLT("bolt_action_rifle_bolt2"),
    BOLT_ACTION_RIFLE_BULLET("bolt_action_rifle_bullet"),
	
    SNIPER_RIFLE_BASE("sniper_rifle_base"),
    SNIPER_RIFLE_SIGHTS("sniper_rifle_sights"),
    SNIPER_RIFLE_CHAMBER("sniper_rifle_bolt1"),
    SNIPER_RIFLE_BOLT("sniper_rifle_bolt2"),
    SNIPER_RIFLE_MAGAZINE("sniper_rifle_magazine");

    /**
     * The location of an item model in the [MOD_ID]/models/special/[NAME] folder
     */
    private final ResourceLocation modelLocation;

    /**
     * Cached model
     */
    private BakedModel cachedModel;

    /**
     * Sets the model's location
     *
     * @param modelName name of the model file
     */
    SpecialModels(String modelName)
    {
        this.modelLocation = new ResourceLocation(nzgmAddon.MOD_ID, "special/" + modelName);
    }

    /**
     * Gets the model
     *
     * @return isolated model
     */
    public BakedModel getModel()
    {
        if(this.cachedModel == null)
        {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLocation);
        }
        return this.cachedModel;
    }

    /**
     * Registers the special models into the Forge Model Bakery. This is only called once on the
     * load of the game.
     */
    @SubscribeEvent
    public static void registerAdditional(ModelEvent.RegisterAdditional event)
    {
        for(SpecialModels model : values())
        {
            event.register(model.modelLocation);
        }
    }

    /**
     * Clears the cached BakedModel since it's been rebuilt. This is needed since the models may
     * have changed when a resource pack was applied, or if resources are reloaded.
     */
    @SubscribeEvent
    public static void onBake(ModelEvent.BakingCompleted event)
    {
        for(SpecialModels model : values())
        {
            model.cachedModel = null;
        }
    }
}