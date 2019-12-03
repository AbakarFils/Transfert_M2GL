package com.transfert.isi.transfert.repository;

import com.transfert.isi.transfert.models.Authority;
import com.transfert.isi.transfert.models.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

}
