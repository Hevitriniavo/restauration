package hei.tantely.managementofrestaurantchain.repositories;

import hei.tantely.managementofrestaurantchain.entities.OperationStock;


public interface OperationStockRepository {
    OperationStock save(OperationStock toSave);

    OperationStock findByIngredientId(Integer ingredientId);

    OperationStock findByStockId(Integer stockId);

}
