package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCStudent {
    public static void main(String[] args) throws Exception {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/homework?characterEncoding=utf8&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("g641517196");
        Connection connection = dataSource.getConnection();
        //增
        String insert =
                "insert into student(name, age, sex) values('Harley',18,'male'),('Taylor',28,'female'),('Alec',20,'male')";
        PreparedStatement statement = connection.prepareStatement(insert);
        int rows = statement.executeUpdate();
        System.out.println("插入成功！，添加了" + rows + "行");
        //改
        String update = "update student set age = age - 5 where name = ?";
        PreparedStatement statement1 = connection.prepareStatement(update);
        statement1.setString(1, "Taylor");
        int row1 = statement1.executeUpdate();
        System.out.println("修改成功，修改了" + row1 + "行");
        //删
        String delete = "delete from student where name = 'Alec'";
        PreparedStatement statement2 = connection.prepareStatement(delete);
        int row2 = statement2.executeUpdate();
        System.out.println("删除成功，删除了" + row2 + "行");
        //查询
        String select = "select * from student";
        PreparedStatement statement3 = connection.prepareStatement(select);
        ResultSet resultSet = statement3.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String sex = resultSet.getString("sex");
            System.out.println("id = " + id + ", name = " + name + ", age = " + age + ", sex = " + sex);
        }
        resultSet.close();
        connection.close();
    }
}
