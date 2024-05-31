package hei.tantely.managementofrestaurantchain.dtos.responses;

public record TopXUsedIngredient(
        Integer ingredientId,
        String ingredientName,
        String menuName,
        Double remainingQuantity,
        String unitName
) { }
