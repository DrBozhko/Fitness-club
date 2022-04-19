package com.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor(access = PACKAGE)
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    @Min(value = 0)
    int id;

    @Version
    @Column(name = "VERSION")
    @Min(value = 0)
    int version;

    @NotBlank
    @Size(min = 2, max = 20)
    String country;

    @NotBlank
    @Size(min = 2, max = 20)
    String city;

    @NotBlank
    @Size(min = 2, max = 20)
    String district;

    @NotBlank
    @Size(min = 2, max = 20)
    String street;
}
