package com.lucas.halterfactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.halterfactory.model.Halter;

@Repository
public interface HalterRepository extends JpaRepository<Halter,Long>{

}
