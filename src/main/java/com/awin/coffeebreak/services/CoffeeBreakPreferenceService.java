package com.awin.coffeebreak.services;

import java.util.List;

import com.awin.coffeebreak.entity.CoffeeBreakPreference;

public interface CoffeeBreakPreferenceService {

	List<CoffeeBreakPreference> getPreferencesForToday();
	 	
}
