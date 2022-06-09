package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSearch {
    public static void main(String[] args) throws Exception{
        // 1.获取数据源
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("g641517196");
        // 2.获取连接对象，发起请求获取MySQL连接
        Connection connection = dataSource.getConnection();
        // 3.获取Statement对象，就是具体执行SQL的对象
        String sql = "select * from stu where name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"Joseph");
        // 4.执行SQL取得返回值，返回值存在ResultSet对象中
        ResultSet resultSet = statement.executeQuery();
        // 5.便利结果集
        while(resultSet.next()){
            //获取查询结果集中，列名为id的属性值，数据库中id是什么类型的，Java中就用对应的类型来接收
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String sex = resultSet.getString("sex");
            System.out.println("id = " + id + ",name = " + name + ",age = " + age + ",sex = " + sex);
        }
        // 6.关闭资源
        resultSet.close();
        connection.close();
    }
}
