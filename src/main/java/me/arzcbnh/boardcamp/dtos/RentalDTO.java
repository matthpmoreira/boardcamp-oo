package me.arzcbnh.boardcamp.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RentalDTO {
    @NotNull
    @Positive
    private Long gameId;

    @NotNull
    @Positive
    private Long customerId;

    @NotNull
    @Positive
    private Integer daysRented;
}
