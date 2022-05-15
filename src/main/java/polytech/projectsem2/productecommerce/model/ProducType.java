package polytech.projectsem2.productecommerce.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@Table(name = "productype")
public class ProducType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false,length = 100)
    private  String Categoryname;

    @OneToMany(mappedBy = "productype")
	private Set<Product> products=new HashSet<>() ;
  
  
}
