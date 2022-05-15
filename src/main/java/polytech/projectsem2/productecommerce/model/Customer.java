package polytech.projectsem2.productecommerce.model;


import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false,length = 100)
    private  String name;

    @Column(name = "address",nullable = false,length = 100)
    private  String address;

    @Column(name = "phone_number",nullable = false,length = 100)
    private  Long phone;

    @Column(name = "details",nullable = false,length = 300)
    private  String details ;

  
}
