package com.msrdevxpert.msrDevXpertpProfile.controller;



import com.msrdevxpert.msrDevXpertpProfile.IO.CompanyProfileDTO;
import com.msrdevxpert.msrDevXpertpProfile.service.CompanyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyProfileController {

    @Autowired
    private CompanyProfileService service;

    @PostMapping
    public CompanyProfileDTO create(@RequestBody CompanyProfileDTO dto) {
        return service.createCompany(dto);
    }

    @GetMapping("/{id}")
    public CompanyProfileDTO getById(@PathVariable Long id) {
        return service.getCompanyById(id);
    }

    @GetMapping
    public List<CompanyProfileDTO> getAll() {
        return service.getAllCompanies();
    }

    @PutMapping("/{id}")
    public CompanyProfileDTO update(@PathVariable Long id, @RequestBody CompanyProfileDTO dto) {
        return service.updateCompany(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteCompany(id);
    }
}

