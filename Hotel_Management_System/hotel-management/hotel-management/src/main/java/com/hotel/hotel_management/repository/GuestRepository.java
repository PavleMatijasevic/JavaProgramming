package com.hotel.hotel_management.repository;

import com.hotel.hotel_management.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
