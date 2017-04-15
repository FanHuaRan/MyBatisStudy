package pers.fhr.mybatisdemo.daos;

import java.util.List;

import org.apache.ibatis.annotations.Param;
/**
 * dao泛型接口
 * @author fhr
 * @date 2017/04/15
 * @param <T>
 */
public interface IEntityBaseDao<T>{

    public List<T> getAll();
    
    public T getById(@Param("id") int id);
   
    public int add(T entity);
    
    public int delete(int id);
   
    public int update(T entity);
}
