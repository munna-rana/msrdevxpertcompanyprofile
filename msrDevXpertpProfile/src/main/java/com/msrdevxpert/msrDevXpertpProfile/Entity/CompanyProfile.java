package com.msrdevxpert.msrDevXpertpProfile.Entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "company_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String tagline;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Integer foundedYear;

    private String industry;

    private String email;

    private String phone;

    private String website;

    @Column(columnDefinition = "TEXT")
    private String address;

    private String city;

    private String state;

    private String country;

    private String postalCode;

    @Column(name = "logo_url", columnDefinition = "TEXT")
    private String logoUrl;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();
}

