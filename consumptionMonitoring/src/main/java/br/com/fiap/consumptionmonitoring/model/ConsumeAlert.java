package br.com.fiap.consumptionmonitoring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_alerta_consumo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ConsumeAlert {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_ID_ALERTA_CONSUMO"
    )
    @SequenceGenerator(
            name = "SQ_ID_ALERTA_CONSUMO",
            sequenceName = "SQ_ID_ALERTA_CONSUMO",
            allocationSize = 1
    )
    @Column(name = "id_alerta")
    private Long id;

    @Column(name = "data_alerta")
    @NotNull
    private LocalDate alertDate;

    @Column(name = "mensagem")
    @NotNull
    @NotBlank
    @Size(max = 500)
    private String message;

    @NotNull
    @Column(name = "t_equipamento_id_equipamento")
    private Long idEquipment;
}
