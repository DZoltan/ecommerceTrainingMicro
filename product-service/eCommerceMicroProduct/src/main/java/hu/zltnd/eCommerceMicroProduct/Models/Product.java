package hu.zltnd.eCommerceMicroProduct.Models;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private Integer id;
    private String productName;
    private String productShortDescription;
    private String productLongDescription;
    private Integer price;
}
