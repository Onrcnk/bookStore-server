package com.onrcnk.bookStore.repository;

import com.onrcnk.bookStore.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Category, String> {
}
