package com.awin.coffeebreak.services;

import com.awin.coffeebreak.entity.CoffeeBreakPreference;
import com.awin.coffeebreak.entity.StaffMember;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SlackNotifierServiceImpl implements SlackNotifierService {

    /**
     * Imagine that this method:
     * Sends a notification to the user on Slack that their coffee break refreshment today will be $preference
     * returns true of false status of notification sent
     */
	@Override
    public boolean notifyStaffMember(final StaffMember staffMember, final List<CoffeeBreakPreference> preferences) {

        if (staffMember.getSlackIdentifier() == "") {
            throw new RuntimeException();
        }

        return true;
    }

}
