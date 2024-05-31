package hei.tantely.managementofrestaurantchain.advices;


import java.time.LocalDate;

public record ApplicationError(
        String message,
        LocalDate errorDate,
        int status
) {
}
