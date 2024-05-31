package hei.tantely.managementofrestaurantchain.dtos.responses;
public record IngredientResponse(
        Integer id,
        String name,
        Integer price,
        UnitResponse unit
) {
}
