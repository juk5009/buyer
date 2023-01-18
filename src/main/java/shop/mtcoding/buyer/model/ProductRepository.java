package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductRepository { // CRUD
    public int insert(@Param("name") String name, @Param("price") String price, @Param("qty") String qty);

    public List<Product> findAll();

    public Product findById(@Param("id") int id);

    public int updateById(@Param("id") int id, @Param("name") String name, @Param("price") String price,
            @Param("qty") String qty);

    public int deleteById(@Param("id") int id);
}
