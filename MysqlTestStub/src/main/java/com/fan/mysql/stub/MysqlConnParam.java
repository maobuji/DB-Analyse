package com.fan.mysql.stub;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Administrator on 2018/6/6.
 */
public class MysqlConnParam {

    public static void main(String[] args) throws Exception {
        Connection conn = DBUtil.getTiConnection();
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT  @@session.auto_increment_increment AS auto_increment_increment, @@character_set_client AS character_set_client, \n" +
                "        @@character_set_connection AS character_set_connection, @@character_set_results AS character_set_results, \n" +
                "        @@character_set_server AS character_set_server, @@init_connect AS init_connect, @@interactive_timeout AS interactive_timeout, \n" +
                "        @@license AS license, @@lower_case_table_names AS lower_case_table_names, @@max_allowed_packet AS max_allowed_packet, \n" +
                "        @@net_buffer_length AS net_buffer_length, @@net_write_timeout AS net_write_timeout, @@query_cache_size AS query_cache_size, \n" +
                "        @@query_cache_type AS query_cache_type, @@sql_mode AS sql_mode, @@system_time_zone AS system_time_zone, \n" +
                "        @@time_zone AS time_zone, @@tx_isolation AS tx_isolation, @@wait_timeout AS wait_timeout");

        int columnCount = rs.getMetaData().getColumnCount();

        while (rs.next()) {
            for (int i = 0; i < columnCount; i++) {
                System.out.println(rs.getMetaData().getColumnName(i + 1) + "=" + rs.getObject(i + 1));
            }
        }
        stmt.close();
        conn.close();
    }
}
