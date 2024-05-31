package hei.tantely.managementofrestaurantchain.dtos.requests;

public record SaleOfMenu (
   Integer restaurantId,
   Integer menuId,
   Integer quantity
) {}
