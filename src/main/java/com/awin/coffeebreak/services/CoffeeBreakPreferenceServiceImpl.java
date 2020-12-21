package com.awin.coffeebreak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awin.coffeebreak.entity.CoffeeBreakPreference;
import com.awin.coffeebreak.repository.CoffeeBreakPreferenceRepository;

@Service
public class CoffeeBreakPreferenceServiceImpl implements CoffeeBreakPreferenceService{
	@Autowired
    private CoffeeBreakPreferenceRepository repository;

	/* Get CoffeeBreakPreferences for today */
	@Override
    public List<CoffeeBreakPreference> getPreferencesForToday() {

		List<CoffeeBreakPreference> preferences = repository.getPreferencesForToday();
        return preferences;
    }
}
