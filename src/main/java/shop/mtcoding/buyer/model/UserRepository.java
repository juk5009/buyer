package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/*
 * 회원가입, 로그인, 회원탈퇴, 회원수정
 * 기능을 위한 쿼리가 필요하다는걸 생각하자
 */
@Mapper
public interface UserRepository { // CRUD

    public int insert(@Param("username") String username, @Param("password") String password,
            @Param("email") String email);

    public List<User> findAll();

    public User findById(int id);

    public int updateById(@Param("id") int id, @Param("password") String password);

    public int deleteById(int id);
    // public int insert(String username, String password, String email);

    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    // public User login(String username, String password);

    // public int delete(int id);

    // public int updatePassword(int id, String password);
}