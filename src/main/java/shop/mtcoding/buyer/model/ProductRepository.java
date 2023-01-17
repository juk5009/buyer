package shop.mtcoding.buyer.model;

import java.util.List;

public interface ProductRepository { // CRUD
    public int insert(String name, String price, String qty);

    public List<Product> findAll();

    public Product findById(int id);

    public int updateById(int id, String name, String price, String qty);

    public int deleteById(int id);
}
