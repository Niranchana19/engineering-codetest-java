package com.awin.coffeebreak.services;

import java.util.List;

import com.awin.coffeebreak.entity.CoffeeBreakPreference;
import com.awin.coffeebreak.entity.StaffMember;

public interface SlackNotifierService {

	/**
	 * Imagine that this method:
	 * Sends a notification to the user on Slack that their coffee break refreshment today will be $preference
	 * returns true of false status of notification sent
	 */
	boolean notifyStaffMember(StaffMember staffMember, List<CoffeeBreakPreference> preferences);

}
