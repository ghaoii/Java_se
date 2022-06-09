package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCTest {
    public static void main(String[] args) throws Exception{
        //1.获取数据源
        MysqlDataSource dataSource = new MysqlDataSource();
        //2.配置数据源的属性，用户名，密码，连接的ip以及端口号
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&useSSL=false");
        // -u root
        dataSource.setUser("root");
        // -p
        dataSource.setPassword("g641517196");
        // 3.获取数据库连接 - 根据上面的配置发起网络请求
        // java.sql.Connection 连接对象
        Connection connection = dataSource.getConnection();
        // 4.写SQL语句，就是String对象
        String sql = "update stu set id = ? where name = 'Lena'";
        // 5.获取执行SQL的Statement对象，mysql中每一个sql的执行就对应一个Statement对象
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"8");
        // 6.执行这个SQL语句，增删改调用executeUpdate，返回受影响的行数
        int rows = statement.executeUpdate();
        System.out.println("修改成功，修改了" + rows + "行");
        // 7.关闭对象
        connection.close();
    }
}
