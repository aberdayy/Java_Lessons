import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;


public class Main {
    public static void main(String[] args) throws SQLException {
      selectFromDb();
    }
        public static void deleteFromDb()throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement = null;
            ResultSet resultSet;
            try {
                connection = helper.getConnection();
                String sql = "delete from city where id=?";
                statement= connection.prepareStatement(sql);
                statement.setInt(1,4081);
                int result = statement.executeUpdate();
                System.out.println("Kayit silindi ");

            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            } finally {
                statement.close();
                connection.close();
            }


        }
        public static void selectFromDb() throws SQLException {
            Connection connection = null;

            Statement statement;
            ResultSet resultSet;
            try {
                connection = helper.getConnection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select * from country ");

                ArrayList<Country> countries = new ArrayList<Country>();
                while (resultSet.next()){
                    countries.add(new Country(
                            resultSet.getString("Code"),
                            resultSet.getString("Name"),
                            resultSet.getString("Continent"),
                            resultSet.getString("Region")));
                }
                System.out.println(countries.size());


            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            } finally {
                connection.close();
            }

        }
        public static void insertToDbManual() throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement = null;
            ResultSet resultSet;
            try {
                connection = helper.getConnection();
                statement= connection.prepareStatement("insert into city(Name,CountryCode,District,Population) values ('Duzce','TUR','Duzce','50000')");
                int result = statement.executeUpdate();
                System.out.println("Kayit eklendi ");

            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            } finally {
                statement.close();
                connection.close();
            }


        }
        public static void insertToDbAuto()throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement = null;
            ResultSet resultSet;
            try {
                connection = helper.getConnection();
                String sql = "insert into city(Name,CountryCode,District,Population) values (?,?,?,?)";
                statement= connection.prepareStatement(sql);

                statement.setString(1,"Duzce 2");
                statement.setString(2,"TUR");
                statement.setString(3,"Marmara");
                statement.setInt(4,99920);

                int result = statement.executeUpdate();
                System.out.println("Kayit eklendi ");

            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            } finally {
                statement.close();
                connection.close();
            }

        }
        public static void updateFromDb() throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement = null;
            ResultSet resultSet;
            try {
                connection = helper.getConnection();
                String sql = "update city set Population = 00, district ='karadenizz' where id=?";
                statement= connection.prepareStatement(sql);
                statement.setInt(1,4081);
                int result = statement.executeUpdate();
                System.out.println("Kayit guncellendi ");

            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            } finally {
                statement.close();
                connection.close();
            }


        }
}
