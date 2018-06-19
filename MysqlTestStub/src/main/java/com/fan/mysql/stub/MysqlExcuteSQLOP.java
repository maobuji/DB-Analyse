package com.fan.mysql.stub;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by Administrator on 2018/1/17.
 */
public class MysqlExcuteSQLOP {

    public static void main(String[] args) throws Exception {
        Connection conn = DBUtil.getTiConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("select * from nation;select * from region");
        conn.close();
    }
}
