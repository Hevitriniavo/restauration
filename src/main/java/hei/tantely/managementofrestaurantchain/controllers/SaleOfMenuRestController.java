package hei.tantely.managementofrestaurantchain.controllers;

import hei.tantely.managementofrestaurantchain.dtos.requests.SaleOfMenu;
import hei.tantely.managementofrestaurantchain.services.SaleOfMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class SaleOfMenuRestController {
    private final SaleOfMenuService saleOfMenuService;


    @PostMapping("/sale-of-menu")
    public Double saleOfMenu(@RequestBody SaleOfMenu saleOfMenu){
        return saleOfMenuService.saleOfMenu(saleOfMenu);
    }
}
