package com.lucas.halterfactory.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.halterfactory.model.HalterModel;

@Repository
public interface HalterRepository extends JpaRepository<HalterModel,UUID>{

}
