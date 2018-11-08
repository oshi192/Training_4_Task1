package jdbc;

import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * General interface with main CRUD methods
 * @param <T>
 */
public interface DAO<T> {
    Logger logger = Logger.getLogger(DAO.class);

    T get(int id) throws SQLException;

    List<T> getAll() throws SQLException;

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}