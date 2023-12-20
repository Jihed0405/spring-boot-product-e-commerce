package polytech.project.productecommerce.service;

import java.util.List;
import java.util.Optional;

import polytech.project.productecommerce.model.Supplier;

public interface ISupplierService {
    Supplier saveSupplier(Supplier supplier);

    void deleteSupplier(Long id);

    public List<Supplier> findAllSuppliers();

    Optional<Supplier> findBySupplierById(Long id);

}
