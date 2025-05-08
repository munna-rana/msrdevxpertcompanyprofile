package com.msrdevxpert.msrDevXpertpProfile.service;


import com.msrdevxpert.msrDevXpertpProfile.IO.CompanyProfileDTO;

import java.util.List;

public interface CompanyProfileService {

    CompanyProfileDTO createCompany(CompanyProfileDTO dto);

    CompanyProfileDTO getCompanyById(Long id);

    List<CompanyProfileDTO> getAllCompanies();

    CompanyProfileDTO updateCompany(Long id, CompanyProfileDTO dto);

    void deleteCompany(Long id);
}

