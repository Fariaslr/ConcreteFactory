package com.lucas.halterfactory.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.halterfactory.model.RelatorioModel;

public interface RelatorioRepository extends JpaRepository<RelatorioModel,UUID>{

}
