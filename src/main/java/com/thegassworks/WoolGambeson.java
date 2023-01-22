package com.thegassworks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WoolGambeson implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("wool_gambeson");

	@Override
	public void onInitialize() {

		RegisterItems.register();
		LOGGER.info("Wool Gambeson Items Registered");
		
	}

}