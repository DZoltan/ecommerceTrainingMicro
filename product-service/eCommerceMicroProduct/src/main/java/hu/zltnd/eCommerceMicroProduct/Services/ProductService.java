package hu.zltnd.eCommerceMicroProduct.Services;

@Service
public class ProductService{

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
}
