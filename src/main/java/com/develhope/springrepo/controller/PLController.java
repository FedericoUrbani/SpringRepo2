package com.develhope.springrepo.controller;

import com.develhope.springrepo.entites.ProgrammingLanguage;
import com.develhope.springrepo.repositories.PLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pl")
public class PLController {

    @Autowired
    private PLRepository plRepo;

    @PostMapping
    public ProgrammingLanguage create(@RequestBody ProgrammingLanguage pl) {
       return plRepo.saveAndFlush(pl);

    }

    @GetMapping
    public List<ProgrammingLanguage> findAllpl() {
        return plRepo.findAll();
    }

    @GetMapping("/pages")
    public Page<ProgrammingLanguage> getPlPages(@RequestParam(required = false) Optional<Integer> page,
                                                @RequestParam(required = false) Optional<Integer> size) {
        if (page.isPresent() && size.isPresent()) {
            Pageable pageable = PageRequest.of(page.get(), size.get());
            Page<ProgrammingLanguage> pl  = plRepo.findAll(pageable);
            return pl;
        } else {
            Page<ProgrammingLanguage> pageLang = Page.empty();
            return pageLang;
        }
    }

}
