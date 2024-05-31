package hei.tantely.managementofrestaurantchain.services;

import hei.tantely.managementofrestaurantchain.dtos.requests.CreateMenuRequest;
import hei.tantely.managementofrestaurantchain.dtos.responses.MenuResponse;

public interface MenuService {
    MenuResponse createMenu(CreateMenuRequest menuRequest);
}