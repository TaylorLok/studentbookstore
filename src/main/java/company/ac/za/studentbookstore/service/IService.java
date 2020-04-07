package company.ac.za.studentbookstore.service;

import java.util.List;

public interface IService<T,t> {
    T create(T t);
    T delete(T t);
    T read(String id);
    T update(T t);
    List<T> readAll();
}
