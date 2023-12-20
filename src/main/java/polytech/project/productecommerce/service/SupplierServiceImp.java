package polytech.project.productecommerce.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.project.productecommerce.model.Supplier;
import polytech.project.productecommerce.repository.SupplierRepository;

@Service
public class SupplierServiceImp implements ISupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier saveSupplier(Supplier supplier) {

        return supplierRepository.save(supplier);

    }

    @Override
    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public List<Supplier> findAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Optional<Supplier> findBySupplierById(Long id) {

        return supplierRepository.findById(id);
    }

}
