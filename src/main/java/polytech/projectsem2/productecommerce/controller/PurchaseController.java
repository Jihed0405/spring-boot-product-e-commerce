package polytech.projectsem2.productecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import polytech.projectsem2.productecommerce.model.Purchase;
import polytech.projectsem2.productecommerce.security.UserPrincipal;
import polytech.projectsem2.productecommerce.service.PurchaseService;



@RestController
@RequestMapping("api/purchase")
public class PurchaseController
{
    @Autowired
    private PurchaseService purchaseService;
    
    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase )
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
       
    return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrincipal.getId()));
    }

   
}
