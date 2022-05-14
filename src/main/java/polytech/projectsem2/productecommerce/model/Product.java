package polytech.projectsem2.productecommerce.model;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

import lombok.Data;
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false,length = 100)
    private  String name;

    @Column(name = "reference",nullable = false,length = 200)
    private  String reference;
    
    @Column(name = "description",nullable = false,length = 1000)
    private  String description;

    @Column(name = "size_fit",nullable = false,length = 1000)
    private  String sizeFit;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name = "create_time",nullable = false)
    private LocalDateTime creatTime;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie_id",referencedColumnName = "id",insertable = false,updatable = false)
    private ProducType category;

    @Column(name = "category_id",nullable = false)
    private Long categoryId;

}
