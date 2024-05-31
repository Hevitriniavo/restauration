package hei.tantely.managementofrestaurantchain.dtos.requests;

public record SupplyRequest (
        Integer restaurantId,
        Double quantity,
        Integer ingredientId
) {}
