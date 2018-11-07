package jdbc;

import model.Credit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CreditDAO implements DAO<Credit> {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("sql");

    @Override
    public Credit get(int id) throws SQLException {
            PreparedStatement statement = ConnectionPool.getConnection().prepareStatement(resourceBundle.getString("Credit.id"));
            statement.setInt(1,id);
            ResultSet resultSet =  statement.executeQuery();
            return new Credit(resultSet);
    }

    @Override
    public List<Credit> getAll() throws SQLException {
        PreparedStatement statement = ConnectionPool.getConnection().prepareStatement(resourceBundle.getString("Credit.all"));
        ResultSet resultSet =  statement.executeQuery();
        List<Credit>list= new ArrayList<>();
        while(resultSet.next()){
            list.add(new Credit(resultSet));
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
