package com.transfert.isi.transfert.repository;

import com.transfert.isi.transfert.models.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartenaireRepository  extends JpaRepository<Partenaire, Integer> {
}
