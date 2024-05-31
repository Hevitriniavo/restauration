package hei.tantely.managementofrestaurantchain.repositories;

import hei.tantely.managementofrestaurantchain.entities.Sale;


public interface SaleRepository {
    Sale save(Sale toSave);

    Sale findById(Integer id);

}
