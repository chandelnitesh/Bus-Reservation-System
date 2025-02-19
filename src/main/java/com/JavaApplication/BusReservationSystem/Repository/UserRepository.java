package com.JavaApplication.BusReservationSystem.Repository;

import com.JavaApplication.BusReservationSystem.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData, Long> {
}
