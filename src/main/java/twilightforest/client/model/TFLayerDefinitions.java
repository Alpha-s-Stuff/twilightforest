package twilightforest.client.model;

import net.minecraft.client.model.*;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import twilightforest.TwilightForestMod;
import twilightforest.client.model.armor.ArcticArmorModel;
import twilightforest.client.model.armor.FieryArmorModel;
import twilightforest.client.model.armor.KnightmetalArmorModel;
import twilightforest.client.model.armor.YetiArmorModel;
import twilightforest.client.model.entity.*;
import twilightforest.client.model.tileentity.*;
import twilightforest.client.renderer.tileentity.CasketTileEntityRenderer;

@Mod.EventBusSubscriber(modid = TwilightForestMod.ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TFLayerDefinitions {

	@SubscribeEvent
	public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {

		event.registerLayerDefinition(TFModelLayers.ARCTIC_ARMOR, () -> ArcticArmorModel.addPieces(CubeDeformation.NONE));
		event.registerLayerDefinition(TFModelLayers.FIERY_ARMOR, () -> LayerDefinition.create(FieryArmorModel.createMesh(CubeDeformation.NONE, 0.5F), 64, 32));
		event.registerLayerDefinition(TFModelLayers.KNIGHTMETAL_ARMOR, KnightmetalArmorModel::addPieces);
		event.registerLayerDefinition(TFModelLayers.PHANTOM_ARMOR, KnightmetalArmorModel::addPieces);
		event.registerLayerDefinition(TFModelLayers.YETI_ARMOR, () -> YetiArmorModel.addPieces(CubeDeformation.NONE, 0.5F));

		event.registerLayerDefinition(TFModelLayers.ALPHA_YETI_TROPHY, AlphaYetiTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.HYDRA_TROPHY, HydraTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.KNIGHT_PHANTOM_TROPHY, KnightPhantomTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.KNIGHT_PHANTOM_ARMOR_TROPHY, PhantomArmorTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.LICH_TROPHY, LichTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.MINOSHROOM_TROPHY, MinoshroomTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.NAGA_TROPHY, NagaTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.QUEST_RAM_TROPHY, QuestRamTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.SNOW_QUEEN_TROPHY, SnowQueenTrophyModel::createHead);
		event.registerLayerDefinition(TFModelLayers.UR_GHAST_TROPHY, UrGhastTrophyModel::createHead);

		event.registerLayerDefinition(TFModelLayers.ADHERENT, AdherentModel::create);
		event.registerLayerDefinition(TFModelLayers.ALPHA_YETI, AlphaYetiModel::create);
		event.registerLayerDefinition(TFModelLayers.ARMORED_GIANT, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F), 64, 32));
		event.registerLayerDefinition(TFModelLayers.BIGHORN_SHEEP, BighornModel::create);
		event.registerLayerDefinition(TFModelLayers.BIGHORN_SHEEP_FUR, BighornFurLayer::create);
		event.registerLayerDefinition(TFModelLayers.BLOCKCHAIN_GOBLIN, BighornFurLayer::create);
		event.registerLayerDefinition(TFModelLayers.BOAR, BighornFurLayer::create);
		event.registerLayerDefinition(TFModelLayers.BUNNY, BighornFurLayer::create);
		event.registerLayerDefinition(TFModelLayers.CARMINITE_BROODLING, SpiderModel::createSpiderBodyLayer);
		event.registerLayerDefinition(TFModelLayers.CARMINITE_GOLEM, BighornFurLayer::create);
		event.registerLayerDefinition(TFModelLayers.CARMINITE_GHASTGUARD, TFGhastModel::create);
		event.registerLayerDefinition(TFModelLayers.CARMINITE_GHASTLING, TFGhastModel::create);
		event.registerLayerDefinition(TFModelLayers.CHAIN, ChainModel::create);
		event.registerLayerDefinition(TFModelLayers.CUBE_OF_ANNIHILATION, CubeOfAnnihilationModel::create);
		event.registerLayerDefinition(TFModelLayers.DEATH_TOME, DeathTomeModel::create);
		event.registerLayerDefinition(TFModelLayers.DEER, DeerModel::create);
		event.registerLayerDefinition(TFModelLayers.FIRE_BEETLE, FireBeetleModel::create);
		event.registerLayerDefinition(TFModelLayers.GIANT_MINER, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F), 64, 32));
		event.registerLayerDefinition(TFModelLayers.HARBINGER_CUBE, HarbingerCubeModel::create);
		event.registerLayerDefinition(TFModelLayers.HEDGE_SPIDER, SpiderModel::createSpiderBodyLayer);
		event.registerLayerDefinition(TFModelLayers.HELMET_CRAB, HelmetCrabModel::create);
		event.registerLayerDefinition(TFModelLayers.HOSTILE_WOLF, WolfModel::createBodyLayer);
		event.registerLayerDefinition(TFModelLayers.HYDRA_HEAD, HydraHeadModel::create);
		event.registerLayerDefinition(TFModelLayers.HYDRA, HydraModel::create);
		event.registerLayerDefinition(TFModelLayers.HYDRA_MORTAR, HydraMortarModel::create);
		event.registerLayerDefinition(TFModelLayers.HYDRA_NECK, HydraNeckModel::create);
		event.registerLayerDefinition(TFModelLayers.ICE_CRYSTAL, IceCrystalModel::create);
		event.registerLayerDefinition(TFModelLayers.KING_SPIDER, SpiderModel::createSpiderBodyLayer);
		event.registerLayerDefinition(TFModelLayers.KNIGHT_PHANTOM, KnightPhantomModel::create);
		event.registerLayerDefinition(TFModelLayers.KOBOLD, KoboldModel::create);
		event.registerLayerDefinition(TFModelLayers.LICH_MINION, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F), 64, 32));
		event.registerLayerDefinition(TFModelLayers.LICH, LichModel::create);
		event.registerLayerDefinition(TFModelLayers.LOWER_GOBLIN_KNIGHT, LowerGoblinKnightModel::create);
		event.registerLayerDefinition(TFModelLayers.LOYAL_ZOMBIE, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F), 64, 32));
		event.registerLayerDefinition(TFModelLayers.MAZE_SLIME, SlimeModel::createInnerBodyLayer);
		event.registerLayerDefinition(TFModelLayers.MAZE_SLIME_OUTER, SlimeModel::createOuterBodyLayer);
		event.registerLayerDefinition(TFModelLayers.MINOSHROOM, MinoshroomModel::create);
		event.registerLayerDefinition(TFModelLayers.MINOTAUR, MinotaurModel::create);
		event.registerLayerDefinition(TFModelLayers.MIST_WOLF, WolfModel::createBodyLayer);
		event.registerLayerDefinition(TFModelLayers.MOSQUITO_SWARM, MosquitoSwarmModel::create);
		event.registerLayerDefinition(TFModelLayers.NAGA, NagaModel::create);
		event.registerLayerDefinition(TFModelLayers.NAGA_BODY, NagaModel::create);
		event.registerLayerDefinition(TFModelLayers.NOOP, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F), 0, 0));
		event.registerLayerDefinition(TFModelLayers.PENGUIN, PenguinModel::create);
		event.registerLayerDefinition(TFModelLayers.PROTECTION_BOX, () -> LayerDefinition.create(ProtectionBoxModel.createMesh(), 16, 16));
		event.registerLayerDefinition(TFModelLayers.QUEST_RAM, QuestRamModel::create);
		event.registerLayerDefinition(TFModelLayers.RAVEN, RavenModel::create);
		event.registerLayerDefinition(TFModelLayers.REDCAP, RedcapModel::create);
		event.registerLayerDefinition(TFModelLayers.RISING_ZOMBIE, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F), 64, 32));
		event.registerLayerDefinition(TFModelLayers.ROVING_CUBE, CubeOfAnnihilationModel::create);
		event.registerLayerDefinition(TFModelLayers.SKELETON_DRUID, SkeletonDruidModel::create);
		event.registerLayerDefinition(TFModelLayers.SLIME_BEETLE, SlimeBeetleModel::create);
		event.registerLayerDefinition(TFModelLayers.SNOW_QUEEN, SnowQueenModel::create);
		event.registerLayerDefinition(TFModelLayers.CHAIN_BLOCK, SpikeBlockModel::create);
		event.registerLayerDefinition(TFModelLayers.SQUIRREL, SquirrelModel::create);
		event.registerLayerDefinition(TFModelLayers.STABLE_ICE_CORE, StableIceCoreModel::create);
		event.registerLayerDefinition(TFModelLayers.SWARM_SPIDER, SpiderModel::createSpiderBodyLayer);
		event.registerLayerDefinition(TFModelLayers.TINY_BIRD, TinyBirdModel::create);
		event.registerLayerDefinition(TFModelLayers.TOWERWOOD_BORER, SilverfishModel::createBodyLayer);
		event.registerLayerDefinition(TFModelLayers.TROLL, TrollModel::create);
		event.registerLayerDefinition(TFModelLayers.UNSTABLE_ICE_CORE, UnstableIceCoreModel::create);
		event.registerLayerDefinition(TFModelLayers.UPPER_GOBLIN_KNIGHT, UpperGoblinKnightModel::create);
		event.registerLayerDefinition(TFModelLayers.UR_GHAST, UrGhastModel::create);
		event.registerLayerDefinition(TFModelLayers.WINTER_WOLF, WolfModel::createBodyLayer);
		event.registerLayerDefinition(TFModelLayers.WRAITH, WraithModel::create);
		event.registerLayerDefinition(TFModelLayers.YETI, YetiModel::create);

		event.registerLayerDefinition(TFModelLayers.REDCAP_ARMOR_INNER, () -> LayerDefinition.create(HumanoidModel.createMesh(LayerDefinitions.INNER_ARMOR_DEFORMATION, 0.7F), 64, 32));
		event.registerLayerDefinition(TFModelLayers.REDCAP_ARMOR_OUTER, () -> LayerDefinition.create(HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0.7F), 64, 32));

		event.registerLayerDefinition(TFModelLayers.CICADA, CicadaModel::create);
		event.registerLayerDefinition(TFModelLayers.FIREFLY, FireflyModel::create);
		event.registerLayerDefinition(TFModelLayers.KEEPSAKE_CASKET, CasketTileEntityRenderer::create);
		event.registerLayerDefinition(TFModelLayers.MOONWORM, MoonwormModel::create);
	}
}