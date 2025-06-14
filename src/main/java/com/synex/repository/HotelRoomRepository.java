package com.synex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synex.domain.HotelRoom;

@Repository
public interface HotelRoomRepository extends JpaRepository<HotelRoom, Integer> {}
