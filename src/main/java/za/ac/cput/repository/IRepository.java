package za.ac.cput.repository;

//Amanda Satu (221094008)


public interface IRepository<T, ID> {
    T create(T t);
   T read(ID id);
    T update(T t);
    boolean delete (ID id);
}
