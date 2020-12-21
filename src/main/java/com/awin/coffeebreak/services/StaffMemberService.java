package com.awin.coffeebreak.services;

import java.util.Optional;

import com.awin.coffeebreak.entity.StaffMember;

public interface StaffMemberService {

	Optional<StaffMember> findById(int id);

}
