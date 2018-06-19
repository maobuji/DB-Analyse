package com.fan.mysql.stub;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Administrator on 2018/6/6.
 */
public class DBUtil {

    public static Connection getTiConnection() throws Exception {

        // 驱动名称
        String driver = "com.mysql.jdbc.Driver";
        // URL指向要访问的数据库名
        String url = "jdbc:mysql://172.20.51.68:4000/tpch?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&useServerPrepStmts=true";
        // MySQL配置时的用户名
        String user = "root";
        // Java连接MySQL配置时的密码
        String password = "";

        // 加载驱动程序
        Class.forName(driver);
        // 连续数据库
        Connection conn = DriverManager.getConnection(url, user, password);
        if (conn.isClosed()) {
            System.out.println("Succeeded connecting to the Database!");
            throw new Exception("数据库连接已关闭");
        }

        return conn;
    }

    public static Connection getMysqlConnection() throws Exception {

        // 驱动名称
        String driver = "com.mysql.jdbc.Driver";
        // URL指向要访问的数据库名
        String url = "jdbc:mysql://172.18.100.65:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";
        // MySQL配置时的用户名
        String user = "root";
        // Java连接MySQL配置时的密码
        String password = "root";

        // 加载驱动程序
        Class.forName(driver);
        // 连续数据库
        Connection conn = DriverManager.getConnection(url, user, password);
        if (conn.isClosed()) {
            System.out.println("Succeeded connecting to the Database!");
            throw new Exception("数据库连接已关闭");
        }

        return conn;
    }
}
