package com.example.Cons.repos;

import com.example.Cons.model.PRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PRepository extends JpaRepository<PRequest, Integer> {
}
