package hei.tantely.managementofrestaurantchain.services;

import hei.tantely.managementofrestaurantchain.dtos.requests.SupplyRequest;

public interface SupplyService {
    Double addStock(SupplyRequest supplyRequest);
}
