package com.msrdevxpert.msrDevXpertpProfile.IO;


import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyProfileDTO {
    private Long id;
    private String name;
    private String tagline;
    private String description;
    private Integer foundedYear;
    private String industry;
    private String email;
    private String phone;
    private String website;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String logoUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

