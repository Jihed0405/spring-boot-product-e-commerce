package polytech.project.productecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import polytech.project.productecommerce.model.Purchase;
import polytech.project.productecommerce.security.UserPrincipal;
import polytech.project.productecommerce.service.IPurchaseService;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {
    @Autowired
    private IPurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {

        return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrincipal.getId()));
    }

}
