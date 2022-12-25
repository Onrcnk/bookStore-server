package com.onrcnk.bookStore.repository;

import com.onrcnk.bookStore.domain.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, String> {
}
