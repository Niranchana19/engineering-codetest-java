package com.awin.coffeebreak.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.awin.coffeebreak.entity.CoffeeBreakPreference;
import com.awin.coffeebreak.entity.StaffMember;

@Service
public class EmailNotifierServiceImpl implements EmailNotifierService {
	@Override
	public boolean emailStaffMember(final StaffMember staffMember, final List<CoffeeBreakPreference> preferences) {

        if (staffMember.getEmail() == "") {
            throw new RuntimeException();
        }

        return true;
    }
}
