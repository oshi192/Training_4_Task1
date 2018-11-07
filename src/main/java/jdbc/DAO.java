package jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    T get(int id) throws SQLException;

    List<T> getAll() throws SQLException;

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}