package jdbc;

import model.Credit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Class with CRUD operations
 * @see jdbc.DAO
 */
public class CreditDAO implements DAO<Credit> {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("sql");

    @Override
    public Credit get(int id) {
        Credit credit = null;
        try (Connection connection = ConnectionPool.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(resourceBundle.getString("Credit.id"));
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            credit = new Credit(resultSet);
        } catch (SQLException e) {
            logger.error("cannot execute query credits.getById", e);
        }

        return credit;//todo change nullpoinerex to myEx
    }

    @Override
    public List<Credit> getAll() {
        List<Credit> list = new ArrayList<>();
        try (Connection connection = ConnectionPool.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(resourceBundle.getString("Credit.all"));
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(new Credit(resultSet));
            }
        } catch (SQLException e) {
            logger.error("cannot execute query getAll", e);
        }
        return list;
    }

    @Override
    public void save(Credit credit) {

    }

    @Override
    public void update(Credit credit, String[] params) {

    }

    @Override
    public void delete(Credit credit) {

    }
}
