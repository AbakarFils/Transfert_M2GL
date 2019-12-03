package com.transfert.isi.transfert.repository;

import com.transfert.isi.transfert.models.Authority;
import com.transfert.isi.transfert.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    public Utilisateur findUtilisateurByLogin(String login);
}
