package com.koushik.springboot.repository;

import com.koushik.springboot.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
