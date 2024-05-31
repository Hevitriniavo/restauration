package hei.tantely.managementofrestaurantchain.dtos.requests;

public record SaveOneIngredientInMenu(
        Integer menuId,
        Integer ingredientId,
        Double quantity
){}
