package com.awin.coffeebreak.services;

import java.util.List;

import com.awin.coffeebreak.entity.CoffeeBreakPreference;
import com.awin.coffeebreak.entity.StaffMember;

public interface EmailNotifierService {

	boolean emailStaffMember(StaffMember staffMember, List<CoffeeBreakPreference> preferences);

}
