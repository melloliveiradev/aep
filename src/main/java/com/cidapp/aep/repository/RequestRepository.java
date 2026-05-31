package com.cidapp.aep.repository;

import com.cidapp.aep.model.request.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}