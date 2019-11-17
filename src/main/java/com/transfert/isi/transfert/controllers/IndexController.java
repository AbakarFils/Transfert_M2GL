package com.transfert.isi.transfert.controllers;

import com.transfert.isi.transfert.models.Partenaire;
import com.transfert.isi.transfert.services.PartenaireService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class IndexController {

    private final PartenaireService partenaireService;

    public IndexController(PartenaireService partenaireService) {
        this.partenaireService = partenaireService;
    }

    @GetMapping("/")
    public String index(Model model, Pageable pageable) {
        Partenaire partenaire = new Partenaire();
        model.addAttribute("partenaire", partenaire);
        model.addAttribute("partenaires", partenaireService.findAll(pageable));
        return "sys/v_dashboard";
    }

    @PostMapping(value = "/")
    public String create(@Valid Partenaire partenaire, BindingResult result, Model model, Pageable pageable) {
        if (result.hasErrors()) {
            return "index";
        }
        partenaireService.save(partenaire);
        model.addAttribute("partenaires", partenaireService.findAll(pageable));
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        Partenaire partenaire = partenaireService.findOne(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("partenaire", partenaire);
        return "update-partenaire";
    }

    @PostMapping("/update/{id}")
    public String updatePartenaire(@PathVariable("id") Integer id, @Valid Partenaire partenaire,
                                   Pageable pageable,
                                   BindingResult result, Model model) {
        if (result.hasErrors()) {
            partenaire.setId(id);
            return "update-user";
        }

        partenaireService.save(partenaire);
        model.addAttribute("partenaires", partenaireService.findAll(pageable));
        return "index";
    }


    @GetMapping("/delete/{id}")
    public String deletePartenaire(@PathVariable("id") Integer id, Model model, Pageable pageable) {
        Partenaire partenaire = partenaireService.findOne(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        partenaireService.delete(partenaire);
        model.addAttribute("partenaires", partenaireService.findAll(pageable));
        return "index";
    }
}
