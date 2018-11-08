package jdbc;

import model.Credit;
import model.Deposit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Class with CRUD operations
 *
 * @see jdbc.DAO
 */
public class DepositDAO implements DAO<Deposit> {
    private static ResourceBundle sqlResource = ResourceBundle.getBundle("sql");

    @Override
    public Deposit get(int id) throws SQLException {
        Deposit deposit = null;
        try (Connection connection = ConnectionPool.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sqlResource.getString("Deposit.id"));
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            deposit = new Deposit(resultSet);
        } catch (SQLException e) {
            logger.error("cannot execute query deposit.getById", e);
        }
        return deposit;//todo change nullpoinerex to myEx
    }

    @Override
    public List<Deposit> getAll() throws SQLException {
        List<Deposit> list = new ArrayList<>();
        try (Connection connection = ConnectionPool.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sqlResource.getString("Deposit.all"));
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(new Deposit(resultSet));
            }
        }
        return list;
    }

    @Override
    public void save(Deposit deposit) {

    }

    @Override
    public void update(Deposit deposit, String[] params) {

    }

    @Override
    public void delete(Deposit deposit) {

    }
}
