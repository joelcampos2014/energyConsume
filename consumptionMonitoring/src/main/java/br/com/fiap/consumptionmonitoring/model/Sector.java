package br.com.fiap.consumptionmonitoring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "t_setor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Sector {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_ID_SETOR"
    )
    @SequenceGenerator(
            name = "SQ_ID_SETOR",
            sequenceName = "SQ_ID_SETOR",
            allocationSize = 1
    )
    @Column(name = "id_setor")
    private Long id;

    @Column(name = "NOME")
    @NotNull
    @NotBlank
    @Size(max = 50)
    private String name;
}
