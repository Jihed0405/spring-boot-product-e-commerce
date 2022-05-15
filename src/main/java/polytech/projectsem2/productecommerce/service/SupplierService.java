package polytech.projectsem2.productecommerce.service;
import java.util.List;
import java.util.Optional;
import polytech.projectsem2.productecommerce.model.Supplier;

public interface SupplierService {
    Supplier saveSupplier(Supplier supplier);
    void deleteSupplier(Long id);
    public List<Supplier> findAllSuppliers();
    Optional<Supplier> findBySupplierById(Long id);
 
}
