package com.fan.mysql.stub;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by Administrator on 2018/1/17.
 */
public class MysqlPreSQLOP {

    public static void main(String[] args) throws Exception {



        Connection conn = DBUtil.getTiConnection();
        PreparedStatement psmt =conn.prepareStatement("update region set R_NAME=? where R_REGIONKEY=999");
        psmt.setString(1,"test");
        psmt.executeUpdate();
        conn.close();
    }
}
