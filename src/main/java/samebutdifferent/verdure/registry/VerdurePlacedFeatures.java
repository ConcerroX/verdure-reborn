package samebutdifferent.verdure.registry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.verdure.Verdure;

import java.util.List;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class VerdurePlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Verdure.MOD_ID);

    // MISC OVERWORLD PLACEMENTS
    public static final RegistryObject<PlacedFeature> BOULDER_STONE = PLACED_FEATURES.register("boulder_stone", () -> new PlacedFeature(VerdureConfiguredFeatures.BOULDER_STONE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.BOULDER_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> BOULDER_DIORITE = PLACED_FEATURES.register("boulder_diorite", () -> new PlacedFeature(VerdureConfiguredFeatures.BOULDER_DIORITE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.BOULDER_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> BOULDER_GRANITE = PLACED_FEATURES.register("boulder_granite", () -> new PlacedFeature(VerdureConfiguredFeatures.BOULDER_GRANITE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.BOULDER_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> BOULDER_ANDESITE = PLACED_FEATURES.register("boulder_andesite", () -> new PlacedFeature(VerdureConfiguredFeatures.BOULDER_ANDESITE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.BOULDER_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> BOULDER_SLATE = PLACED_FEATURES.register("boulder_slate", () -> new PlacedFeature(VerdureConfiguredFeatures.BOULDER_SLATE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.BOULDER_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> SMOOTH_DIRT_PATCH = PLACED_FEATURES.register("smooth_dirt_patch", () -> new PlacedFeature(VerdureConfiguredFeatures.SMOOTH_DIRT_PATCH.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.SMOOTH_DIRT_PATCH_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> SMOOTH_DIRT_PATCH_SWAMP = PLACED_FEATURES.register("smooth_dirt_patch_swamp", () -> new PlacedFeature(VerdureConfiguredFeatures.SMOOTH_DIRT_PATCH_SWAMP.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(Math.round(VerdureConfig.SMOOTH_DIRT_PATCH_RARITY.get() / 2.0F)), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> HUMUS_PATCH = PLACED_FEATURES.register("humus_patch", () -> new PlacedFeature(VerdureConfiguredFeatures.HUMUS_PATCH.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.HUMUS_PATCH_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    // VEGETATION PLACEMENTS
    public static final RegistryObject<PlacedFeature> PATCH_CLOVER = PLACED_FEATURES.register("patch_clover", () -> new PlacedFeature(VerdureConfiguredFeatures.PATCH_CLOVER.getHolder().get(), worldSurfaceSquaredWithRarityFilter(VerdureConfig.CLOVER_PATCH_RARITY.get())));
    public static final RegistryObject<PlacedFeature> PEBBLES = PLACED_FEATURES.register("pebbles", () -> new PlacedFeature(VerdureConfiguredFeatures.PEBBLES.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.PEBBLES_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(List.of(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL, Blocks.COARSE_DIRT, VerdureBlocks.SMOOTH_DIRT.get(), Blocks.SAND), new BlockPos(0, -1, 0))), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> ROCK = PLACED_FEATURES.register("rock", () -> new PlacedFeature(VerdureConfiguredFeatures.ROCK.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.ROCK_RARITY.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(List.of(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL, Blocks.COARSE_DIRT, VerdureBlocks.SMOOTH_DIRT.get(), Blocks.SAND), new BlockPos(0, -1, 0))), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> PATCH_DAISIES = PLACED_FEATURES.register("patch_daisies", () -> new PlacedFeature(VerdureConfiguredFeatures.PATCH_DAISIES.getHolder().get(), worldSurfaceSquaredWithRarityFilter(VerdureConfig.DAISIES_PATCH_RARITY.get())));
    public static final RegistryObject<PlacedFeature> PATCH_DAISIES_BLUE = PLACED_FEATURES.register("patch_daisies_blue", () -> new PlacedFeature(VerdureConfiguredFeatures.PATCH_DAISIES_BLUE.getHolder().get(), worldSurfaceSquaredWithRarityFilter(VerdureConfig.DAISIES_PATCH_RARITY.get())));
    public static final RegistryObject<PlacedFeature> PATCH_DAISIES_PINK = PLACED_FEATURES.register("patch_daisies_pink", () -> new PlacedFeature(VerdureConfiguredFeatures.PATCH_DAISIES_PINK.getHolder().get(), worldSurfaceSquaredWithRarityFilter(VerdureConfig.DAISIES_PATCH_RARITY.get())));
    public static final RegistryObject<PlacedFeature> PATCH_WILDFLOWERS = PLACED_FEATURES.register("patch_wildflowers", () -> new PlacedFeature(VerdureConfiguredFeatures.PATCH_WILDFLOWERS.getHolder().get(), worldSurfaceSquaredWithRarityFilter(VerdureConfig.DAISIES_PATCH_RARITY.get())));
    public static final RegistryObject<PlacedFeature> FALLEN_LOG = PLACED_FEATURES.register("fallen_log", () -> new PlacedFeature(VerdureConfiguredFeatures.FALLEN_LOG.getHolder().get(), worldSurfaceSquaredWithRarityFilter(VerdureConfig.FALLEN_LOG_RARITY.get())));
    public static final RegistryObject<PlacedFeature> FALLEN_LOG_SAVANNA = PLACED_FEATURES.register("fallen_log_savanna", () -> new PlacedFeature(VerdureConfiguredFeatures.FALLEN_LOG.getHolder().get(), worldSurfaceSquaredWithRarityFilter(Math.round(VerdureConfig.FALLEN_LOG_RARITY.get() * 1.5F))));
    public static final RegistryObject<PlacedFeature> MUSHROOM_SHELF = PLACED_FEATURES.register("mushroom_shelf", () -> new PlacedFeature(VerdureConfiguredFeatures.MUSHROOM_SHELF.getHolder().get(), List.of(CountPlacement.of(VerdureConfig.MUSHROOM_SHELF_SURFACE_COUNT.get()), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(100)), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> TREES_BIRCH_AND_OAK = PLACED_FEATURES.register("trees_birch_and_oak", () -> new PlacedFeature(VerdureConfiguredFeatures.TREES_BIRCH_AND_OAK.getHolder().get(), treePlacement(PlacementUtils.countExtra(10, 0.1F, 1))));
    public static final RegistryObject<PlacedFeature> DARK_FOREST_VEGETATION = PLACED_FEATURES.register("dark_forest_vegetation", () -> new PlacedFeature(VerdureConfiguredFeatures.DARK_FOREST_VEGETATION.getHolder().get(), List.of(CountPlacement.of(16), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> TREES_TAIGA = PLACED_FEATURES.register("trees_taiga", () -> new PlacedFeature(VerdureConfiguredFeatures.TREES_TAIGA.getHolder().get(), treePlacement(PlacementUtils.countExtra(10, 0.1F, 1))));
    public static final RegistryObject<PlacedFeature> TREES_WINDSWEPT_SAVANNA = PLACED_FEATURES.register("trees_windswept_savanna", () -> new PlacedFeature(VerdureConfiguredFeatures.TREES_SAVANNA.getHolder().get(), treePlacement(PlacementUtils.countExtra(2, 0.1F, 1))));
    public static final RegistryObject<PlacedFeature> TREES_SAVANNA = PLACED_FEATURES.register("trees_savanna", () -> new PlacedFeature(VerdureConfiguredFeatures.TREES_SAVANNA.getHolder().get(), treePlacement(PlacementUtils.countExtra(1, 0.1F, 1))));
    public static final RegistryObject<PlacedFeature> BIRCH_TALL = PLACED_FEATURES.register("birch_tall", () -> new PlacedFeature(VerdureConfiguredFeatures.BIRCH_TALL.getHolder().get(), treePlacement(PlacementUtils.countExtra(10, 0.1F, 1))));
    public static final RegistryObject<PlacedFeature> TREES_BIRCH = PLACED_FEATURES.register("trees_birch", () -> new PlacedFeature(VerdureConfiguredFeatures.BIRCH.getHolder().get(), treePlacement(PlacementUtils.countExtra(10, 0.1F, 1), Blocks.BIRCH_SAPLING)));
    public static final RegistryObject<PlacedFeature> TREES_JUNGLE = PLACED_FEATURES.register("trees_jungle", () -> new PlacedFeature(VerdureConfiguredFeatures.TREES_JUNGLE.getHolder().get(), treePlacement(PlacementUtils.countExtra(50, 0.1F, 1))));
    public static final RegistryObject<PlacedFeature> TREES_SPARSE_JUNGLE = PLACED_FEATURES.register("trees_sparse_jungle", () -> new PlacedFeature(VerdureConfiguredFeatures.TREES_SPARSE_JUNGLE.getHolder().get(), treePlacement(PlacementUtils.countExtra(2, 0.1F, 1))));
    public static final RegistryObject<PlacedFeature> TREES_FLOWER_FOREST = PLACED_FEATURES.register("trees_flower_forest", () -> new PlacedFeature(VerdureConfiguredFeatures.TREES_FLOWER_FOREST.getHolder().get(), treePlacement(PlacementUtils.countExtra(6, 0.1F, 1))));

    // CAVE PLACEMENTS
    public static final RegistryObject<PlacedFeature> UNDERGROUND_MUSHROOM_SHELF = PLACED_FEATURES.register("underground_mushroom_shelf", () -> new PlacedFeature(VerdureConfiguredFeatures.UNDERGROUND_MUSHROOM_SHELF.getHolder().get(), List.of(CountPlacement.of(UniformInt.of(VerdureConfig.MUSHROOM_SHELF_UNDERGROUND_COUNT_MIN.get(), VerdureConfig.MUSHROOM_SHELF_UNDERGROUND_COUNT_MAX.get())), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, InSquarePlacement.spread(), SurfaceRelativeThresholdFilter.of(Heightmap.Types.OCEAN_FLOOR_WG, Integer.MIN_VALUE, -13), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> HANGING_MOSS = PLACED_FEATURES.register("hanging_moss", () -> new PlacedFeature(VerdureConfiguredFeatures.HANGING_MOSS.getHolder().get(), List.of(CountPlacement.of(VerdureConfig.HANGING_MOSS_COUNT.get()), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome())));

    // TREE PLACEMENTS
    public static final RegistryObject<PlacedFeature> OAK_DAISIES = PLACED_FEATURES.register("oak_daisies", () -> new PlacedFeature(VerdureConfiguredFeatures.OAK_DAISIES.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.DAISY_TREE_RARITY.get()), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> BIRCH_DAISIES = PLACED_FEATURES.register("birch_daisies", () -> new PlacedFeature(VerdureConfiguredFeatures.BIRCH_DAISIES.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.DAISY_TREE_RARITY.get()), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.BIRCH_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> OAK_HOLLOW = PLACED_FEATURES.register("oak_hollow", () -> new PlacedFeature(VerdureConfiguredFeatures.OAK_HOLLOW.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.OAK_HOLLOW_RARITY.get()), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> FANCY_OAK_HOLLOW = PLACED_FEATURES.register("fancy_oak_hollow", () -> new PlacedFeature(VerdureConfiguredFeatures.FANCY_OAK_HOLLOW.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(VerdureConfig.OAK_HOLLOW_RARITY.get()), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> OAK_CHECKED = PLACED_FEATURES.register("oak_checked", () -> new PlacedFeature(VerdureConfiguredFeatures.OAK.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING))));
    public static final RegistryObject<PlacedFeature> BIRCH_CHECKED = PLACED_FEATURES.register("birch_checked", () -> new PlacedFeature(VerdureConfiguredFeatures.BIRCH.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.BIRCH_SAPLING))));
    public static final RegistryObject<PlacedFeature> SUPER_BIRCH_CHECKED = PLACED_FEATURES.register("super_birch_checked", () -> new PlacedFeature(VerdureConfiguredFeatures.SUPER_BIRCH.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.BIRCH_SAPLING))));
    public static final RegistryObject<PlacedFeature> DARK_OAK_CHECKED = PLACED_FEATURES.register("dark_oak_checked", () -> new PlacedFeature(VerdureConfiguredFeatures.DARK_OAK.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.DARK_OAK_SAPLING))));
    public static final RegistryObject<PlacedFeature> SPRUCE_CHECKED = PLACED_FEATURES.register("spruce_checked",  () -> new PlacedFeature(VerdureConfiguredFeatures.SPRUCE.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
    public static final RegistryObject<PlacedFeature> PINE_CHECKED = PLACED_FEATURES.register("pine_checked",  () -> new PlacedFeature(VerdureConfiguredFeatures.PINE.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING))));
    public static final RegistryObject<PlacedFeature> ACACIA_CHECKED = PLACED_FEATURES.register("acacia_checked",  () -> new PlacedFeature(VerdureConfiguredFeatures.ACACIA.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.ACACIA_SAPLING))));
    public static final RegistryObject<PlacedFeature> JUNGLE_TREE_CHECKED = PLACED_FEATURES.register("jungle_tree_checked",  () -> new PlacedFeature(VerdureConfiguredFeatures.JUNGLE_TREE.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival(Blocks.JUNGLE_SAPLING))));

    // NETHER PLACEMENTS
    public static final RegistryObject<PlacedFeature> FALLEN_LOG_NETHER = PLACED_FEATURES.register("fallen_log_nether", () -> new PlacedFeature(VerdureConfiguredFeatures.FALLEN_LOG.getHolder().get(), List.of(CountOnEveryLayerPlacement.of(VerdureConfig.FALLEN_LOG_NETHER_COUNT.get()), BiomeFilter.biome())));

    public static List<PlacementModifier> worldSurfaceSquaredWithRarityFilter(int chance) {
        return List.of(RarityFilter.onAverageOnceEvery(chance), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
    }
}
