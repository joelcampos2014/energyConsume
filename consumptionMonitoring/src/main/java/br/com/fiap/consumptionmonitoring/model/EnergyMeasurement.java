package br.com.fiap.consumptionmonitoring.model;

import br.com.fiap.consumptionmonitoring.model.enums.EquipmentStatus;
import br.com.fiap.consumptionmonitoring.model.enums.MeasurementStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_medicao_energia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EnergyMeasurement {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_ID_MEDICAO_ENERGIA"
    )
    @SequenceGenerator(
            name = "SQ_ID_MEDICAO_ENERGIA",
            sequenceName = "SQ_ID_MEDICAO_ENERGIA",
            allocationSize = 1
    )
    @Column(name = "id_medicao")
    private Long id;

    @NotNull
    @Column(name = "data_medicao")
    private LocalDate measurementDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private MeasurementStatus status;

    @NotNull
    @Column(name = "consumo_kwh")
    private Long kwhConsumed;

    @NotNull
    @Column(name = "t_equipamento_id_equipamento")
    private Long idEquipment;
}
