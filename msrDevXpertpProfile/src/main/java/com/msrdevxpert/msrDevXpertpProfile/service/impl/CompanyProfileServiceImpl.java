package com.msrdevxpert.msrDevXpertpProfile.service.impl;


import com.msrdevxpert.msrDevXpertpProfile.Dao.CompanyProfileRepository;
import com.msrdevxpert.msrDevXpertpProfile.Entity.CompanyProfile;
import com.msrdevxpert.msrDevXpertpProfile.Exception.ResourceNotFoundException;
import com.msrdevxpert.msrDevXpertpProfile.IO.CompanyProfileDTO;
import com.msrdevxpert.msrDevXpertpProfile.service.CompanyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyProfileServiceImpl implements CompanyProfileService {

    @Autowired
    private CompanyProfileRepository repository;

    private CompanyProfileDTO mapToDTO(CompanyProfile entity) {
        return CompanyProfileDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .tagline(entity.getTagline())
                .description(entity.getDescription())
                .foundedYear(entity.getFoundedYear())
                .industry(entity.getIndustry())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .website(entity.getWebsite())
                .address(entity.getAddress())
                .city(entity.getCity())
                .state(entity.getState())
                .country(entity.getCountry())
                .postalCode(entity.getPostalCode())
                .logoUrl(entity.getLogoUrl())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

    private CompanyProfile mapToEntity(CompanyProfileDTO dto) {
        return CompanyProfile.builder()
                .id(dto.getId())
                .name(dto.getName())
                .tagline(dto.getTagline())
                .description(dto.getDescription())
                .foundedYear(dto.getFoundedYear())
                .industry(dto.getIndustry())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .website(dto.getWebsite())
                .address(dto.getAddress())
                .city(dto.getCity())
                .state(dto.getState())
                .country(dto.getCountry())
                .postalCode(dto.getPostalCode())
                .logoUrl(dto.getLogoUrl())
                .build();
    }

    @Override
    public CompanyProfileDTO createCompany(CompanyProfileDTO dto) {
        CompanyProfile saved = repository.save(mapToEntity(dto));
        return mapToDTO(saved);
    }

    @Override
    public CompanyProfileDTO getCompanyById(Long id) {
        CompanyProfile company = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Company not found with ID: " + id));
        return mapToDTO(company);
    }

    @Override
    public List<CompanyProfileDTO> getAllCompanies() {
        return repository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CompanyProfileDTO updateCompany(Long id, CompanyProfileDTO dto) {
        CompanyProfile existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Company not found with ID: " + id));

        existing.setName(dto.getName());
        existing.setTagline(dto.getTagline());
        existing.setDescription(dto.getDescription());
        existing.setFoundedYear(dto.getFoundedYear());
        existing.setIndustry(dto.getIndustry());
        existing.setEmail(dto.getEmail());
        existing.setPhone(dto.getPhone());
        existing.setWebsite(dto.getWebsite());
        existing.setAddress(dto.getAddress());
        existing.setCity(dto.getCity());
        existing.setState(dto.getState());
        existing.setCountry(dto.getCountry());
        existing.setPostalCode(dto.getPostalCode());
        existing.setLogoUrl(dto.getLogoUrl());

        return mapToDTO(repository.save(existing));
    }

    @Override
    public void deleteCompany(Long id) {
        CompanyProfile entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Company not found with ID: " + id));
        repository.delete(entity);
    }
}

