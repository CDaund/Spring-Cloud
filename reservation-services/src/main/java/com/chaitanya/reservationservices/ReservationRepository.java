package com.chaitanya.reservationservices;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, Long>{
	List<ReservationEntity> findByDate(Date date);
}
