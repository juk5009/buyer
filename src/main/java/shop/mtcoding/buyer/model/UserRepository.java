package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/*
 * 회원가입, 로그인, 회원탈퇴, 회원수정
 */
@Mapper
public interface UserRepository { // CRUD
    public int insert(String username, String password, String email);

    public List<User> findAll();

    public User findById(int id);

    public int updateById(int id, String password);

    public int deleteById(int id);
    // public int insert(String username, String password, String email);

    // public User login(String username, String password);

    // public int delete(int id);

    // public int updatePassword(int id, String password);
}
