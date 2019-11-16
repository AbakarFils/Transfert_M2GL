package com.transfert.isi.transfert.services.impl;

import com.transfert.isi.transfert.models.Partenaire;
import com.transfert.isi.transfert.repository.PartenaireRepository;
import com.transfert.isi.transfert.services.PartenaireService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PartenaireServicesImpl implements PartenaireService {

    //private final Logger log = LoggerFactory.getLogger(PartenaireServicesImpl.class);

    private final PartenaireRepository partenaireRepository;

    public PartenaireServicesImpl(PartenaireRepository partenaireRepository) {
        this.partenaireRepository = partenaireRepository;
    }

    @Override
    public Partenaire save(Partenaire partenaire) {
        //log.debug("Request to save partenaire : {}", partenaire);
        partenaireRepository.save(partenaire);
        return partenaireRepository.save(partenaire);
    }

    @Override
    public Page<Partenaire> findAll(Pageable pageable) {
        return partenaireRepository.findAll(pageable);
    }

    @Override
    public Optional<Partenaire> findOne(Integer id) {
        return partenaireRepository.findById(id);
    }

    @Override
    public Optional<Partenaire> findOneWithEager(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

}
