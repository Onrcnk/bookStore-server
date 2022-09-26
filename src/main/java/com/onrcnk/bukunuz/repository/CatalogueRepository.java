package com.onrcnk.bukunuz.repository;

import com.onrcnk.bukunuz.domain.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, String> {
}
