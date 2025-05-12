package br.com.fiap.consumptionmonitoring.model;

import br.com.fiap.consumptionmonitoring.model.enums.EquipmentStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_equipamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Equipment {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_ID_EQUIPAMENTO"
    )
    @SequenceGenerator(
            name = "SQ_ID_EQUIPAMENTO",
            sequenceName = "SQ_ID_EQUIPAMENTO",
            allocationSize = 1
    )
    @Column(name = "id_equipamento")
    private Long id;

    @Column(name = "nome")
    @Size(max = 50)
    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EquipmentStatus status;

    @NotNull
    @Column(name = "data_reset")
    private LocalDate resetDate;

    @NotNull
    @Column(name = "consumo_total")
    @Positive
    private Long amountConsume;

    @NotNull
    @Column(name = "limite_consumo")
    @Positive
    private Long consumeLimit;

    @NotNull
    @Column(name = "t_setor_id_setor")
    private Long idSector;
}
