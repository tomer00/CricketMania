package com.tomer.cric.repositories;

import com.tomer.cric.entities.StoredMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoMatch extends JpaRepository<StoredMatch,Integer> {

}
