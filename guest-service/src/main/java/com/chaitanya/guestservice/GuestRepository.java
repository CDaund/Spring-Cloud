package com.chaitanya.guestservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{
	Guest findByEmailAddress(String emailAddress);
}
