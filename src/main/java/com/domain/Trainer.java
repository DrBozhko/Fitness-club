package com.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

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
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trainer_id")
    @Min(value = 0)
    int id;

    @Version
    @Column(name = "VERSION")
    @Min(value = 0)
    int version;

    @NotBlank
    @Size(min = 2, max = 20)
    String name;

    @NotBlank
    @Size(min = 2, max = 20)
    String surname;

    @NotBlank
    @Size(min = 2, max = 20)
    String patronymic;

    @Size(min = 18, max = 150)
    int age;

    // collection table?

    @ElementCollection
    @CollectionTable(name = "trainer_programms", joinColumns = @JoinColumn(name = "trainer_id"))
    @Column(name = "programm")
    List<@NotNull ProgramType> programms;
}
