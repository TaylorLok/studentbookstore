package company.ac.za.studentbookstore.controller;

import java.util.List;

public interface Icontroller<T,t> {
    T create(T t);
    T delete(T t);
    T read(String id);
    T update(T t);
    List<T> readAll();
}
