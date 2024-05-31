package hei.tantely.managementofrestaurantchain.repositories;

public interface RestaurantMenuRepository {
    void create(Integer restaurantId, Integer menuId);

    void update(Integer restaurantId, Integer menuId, Integer id);
}
