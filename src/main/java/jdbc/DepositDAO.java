package jdbc;

import model.Deposit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DepositDAO implements DAO<Deposit> {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("sql");

    @Override
    public Deposit get(int id) throws SQLException {
        PreparedStatement statement = ConnectionPool.getConnection().prepareStatement(resourceBundle.getString("Deposit.id"));
        statement.setInt(1,id);
        ResultSet resultSet =  statement.executeQuery();
        return new Deposit(resultSet);
    }

    @Override
    public List<Deposit> getAll() throws SQLException {
        PreparedStatement statement = ConnectionPool.getConnection().prepareStatement(resourceBundle.getString("Deposit.all"));
        ResultSet resultSet =  statement.executeQuery();
        List<Deposit>list= new ArrayList<>();
        while(resultSet.next()){
            list.add(new Deposit(resultSet));
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
