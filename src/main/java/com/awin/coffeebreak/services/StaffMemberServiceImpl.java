package com.awin.coffeebreak.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awin.coffeebreak.entity.StaffMember;
import com.awin.coffeebreak.repository.StaffMemberRepository;

@Service
public class StaffMemberServiceImpl implements StaffMemberService{
	@Autowired
    private StaffMemberRepository repository;

	@Override
	public Optional<StaffMember> findById(int id) {
		Optional<StaffMember> staffId =  repository.findById(id);
		return staffId;
	}

}
