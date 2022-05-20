package polytech.projectsem2.productecommerce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import polytech.projectsem2.productecommerce.model.Purchase;
import polytech.projectsem2.productecommerce.repository.PurchaseRepository;
import polytech.projectsem2.productecommerce.repository.projection.PurchaseItem;


@Service
public class PurchaseServiceImpl implements PurchaseService 
{
    @Autowired
    private PurchaseRepository purchaseRepository;   

    @Override
    public Purchase savePurchase(Purchase purchase)
    {   
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);

    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId)
    {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }
    
}
    