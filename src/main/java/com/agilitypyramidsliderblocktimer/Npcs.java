package com.agilitypyramidsliderblocktimer;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.Map;
import static net.runelite.api.NpcID.*;
import static net.runelite.api.NullNpcID.*;

import java.util.Set;
import static net.runelite.api.NullObjectID.NULL_10872;
import static net.runelite.api.NullObjectID.NULL_10873;

public class Npcs
{

	static final Set<Integer> NPC_IDS = ImmutableSet.of(
		// Agility Pyramid
		PYRAMID_BLOCK, PYRAMID_BLOCK_5788,
		// Hallowed Sepulchre
		NULL_9672, NULL_9673, NULL_9674,  // arrows
		NULL_9669, NULL_9670, NULL_9671   // swords
	);

	static final Set<Integer> TRAP_NPC_IDS = ImmutableSet.of(
		// Agility pyramid
		PYRAMID_BLOCK, PYRAMID_BLOCK_5788
	);

	static final Map<Integer, Integer> TRAP_RESTING_POSITION = ImmutableMap.of(
		PYRAMID_BLOCK, 2845,
		PYRAMID_BLOCK_5788, 3372
	);

	static final Map<Integer, String> TRAP_MOVEMENT_DIMENSION = ImmutableMap.of(
		PYRAMID_BLOCK, "y",
		PYRAMID_BLOCK_5788, "x"
	);

	static final Map<Integer, String> TRAP_RESTING_TIME = ImmutableMap.of(
		PYRAMID_BLOCK, "PT4.8S",
		PYRAMID_BLOCK_5788, "PT6.0S"
	);

	static final Map<Integer, Integer> TRAP_RESTING_TILE = ImmutableMap.of(
		PYRAMID_BLOCK, NULL_10873,
		PYRAMID_BLOCK_5788, NULL_10872
	);

	static final Set<Integer> SEPULCHRE_NPC_IDS = ImmutableSet.of(
		NULL_9672, NULL_9673, NULL_9674,  // arrows
		NULL_9669, NULL_9670, NULL_9671   // swords
	);
}