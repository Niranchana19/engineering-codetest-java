package com.awin.coffeebreak.repository;

import com.awin.coffeebreak.entity.StaffMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffMemberRepository extends CrudRepository<StaffMember, Integer> {
}
