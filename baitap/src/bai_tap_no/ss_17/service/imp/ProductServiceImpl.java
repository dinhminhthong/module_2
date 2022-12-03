package bai_tap_no.ss_17.service.imp;

import bai_tap_no.ss_12.module.Product;

import java.io.IOException;
import java.util.List;

public class ProductServiceImpl implements IProductService{
    private final String PATH_FILE = "src/bai_tap_no/ss_17/product.csv";

    private final IFileService<Product> iFileService = new ProductIOProduct();

    @Override
    public void add(Product product) throws IOException, ClassNotFoundException, ExistProductException {
        List<Product> products = this.iFileService.readFileBinary(PATH_FILE);
        for(Product p: products){
            if (p.getId() == product.getId()){
                throw new ExistProductException();
            }
        }
        products.add(product);
        this.iFileService.writeFileBinary(PATH_FILE, products);
    }

    @Override
    public List<Product> display() throws IOException, ClassNotFoundException {
        return this.iFileService.readFileBinary(PATH_FILE);
    }

    @Override
    public void find(int id) throws IOException, ClassNotFoundException {
        List<Product> products = this.iFileService.readFileBinary(PATH_FILE);

        for (Product p: products){
            if (p.getId() == id){
                System.out.println(p);
                break;
            }
        }
    }
}
