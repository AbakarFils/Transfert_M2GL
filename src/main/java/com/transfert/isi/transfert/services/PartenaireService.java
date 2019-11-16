package com.transfert.isi.transfert.services;

import com.transfert.isi.transfert.models.Partenaire;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PartenaireService {
    /**
     * Save a Partenaire.
     *
     * @param partenaire the entity to save
     * @return the persisted entity
     */
    Partenaire save(Partenaire partenaire);

    /**
     * Get all the Partenaires.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<Partenaire> findAll(Pageable pageable);
    /**

     * Get all the Partenaires.
     *
     * @return the list of entities

    List<Partenaire> findAll(); */


    /**
     * Get the "id" categorie.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Partenaire> findOne(Integer id);

    /**
     * Get the "id" Partenaire.
     *
     * @param id the id of the entity
     * @return the entity with all Eager
     */
    Optional<Partenaire> findOneWithEager(Integer id);

    /**
     * Delete the "id" Partenaire.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

}
