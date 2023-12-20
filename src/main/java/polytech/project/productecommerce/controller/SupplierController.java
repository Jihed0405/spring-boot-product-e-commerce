package polytech.project.productecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import polytech.project.productecommerce.model.Supplier;
import polytech.project.productecommerce.service.ISupplierService;

@RestController
@RequestMapping("api/supplier")
public class SupplierController {

    @Autowired
    private ISupplierService supplierService;

    @PostMapping
    public ResponseEntity<?> saveSupplier(@RequestBody Supplier supplier) {
        return new ResponseEntity<>(supplierService.saveSupplier(supplier), HttpStatus.CREATED);
    }

    @DeleteMapping("{supplierId}")
    public ResponseEntity<?> deleteSupplier(@PathVariable Long supplierId) {
        supplierService.deleteSupplier(supplierId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findAllSuppliers() {
        return new ResponseEntity<>(supplierService.findAllSuppliers(), HttpStatus.OK);
    }

}
