package hei.tantely.managementofrestaurantchain.repositories;

import hei.tantely.managementofrestaurantchain.entities.Menu;

import java.util.List;


public interface MenuRepository {
    Menu save(Menu toSave);

    Menu findById(Integer id);

    List<Menu> findAll();
}
