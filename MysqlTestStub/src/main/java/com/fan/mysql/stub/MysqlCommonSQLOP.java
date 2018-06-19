package com.fan.mysql.stub;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Administrator on 2018/1/17.
 */
public class MysqlCommonSQLOP {

    public static void main(String[] args) throws Exception {

        Connection conn = DBUtil.getTiConnection();
        Statement stmt = conn.createStatement();

        // 要执行的SQL语句
        int deleteResult = stmt.executeUpdate("delete from region where R_REGIONKEY=999");

        int insertResult = stmt.executeUpdate("insert into region value(999,'999','999')");

        int updateResult = stmt.executeUpdate("update region set R_NAME='888' where R_REGIONKEY=999");

        ResultSet rs = stmt.executeQuery("select * from region");
        System.out.println("执行查询");
        while (rs.next()) {
            System.out.println(rs.getObject(1));
        }

        conn.close();
    }
}
