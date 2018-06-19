# DB-Analyse数据库分析

NewSQL以及基于mysql分库分表的中间件的分析 





### 数据库

| 项目名称       | 提供者                      | 类型 | 实现语言 | 项目说明                                                    | 项目地址                                                     |
| -------------- | --------------------------- | ---- | -------- | ----------------------------------------------------------- | ------------------------------------------------------------ |
| mysql          | oracle                      |      |          |                                                             |                                                              |
| mariadb        | Monty Widenius，mysql初创者 | 开源 |          | mysql的分支版本，支持MyISAM、InnoDB，XtraDB存储引擎         | https://mariadb.org/                                         |
| Percona Server | Percona                     | 开源 |          | mysql的分支版本，不接受外部贡献作者。XtraDB存储引擎的原作者 | https://www.percona.com/software/mysql-database/percona-server |
| TiDB           | PingCap                     | 开源 | go/rust  | pingcap团队开发的NewSQL数据库                               | https://github.com/pingcap/tidb                              |
| TDSQL          | 腾讯                        | 闭源 |          | 基于MariaDB内核开发的分布式数据库                           | http://tdsql.org                                             |
|                |                             |      |          |                                                             |                                                              |



### 数据库扩展和中间件


| 项目名称                | 提供者   | 类型 | 实现语言 | 项目说明                                                     | 项目地址                                    |
| :---------------------- | :------- | ---- | -------- | :----------------------------------------------------------- | :------------------------------------------ |
| mysql group replication |          |      |          | mysql5.7提供的组复制功能，可以进行集群多写，且可以保证写一致性，但不能保证读一致性 |                                             |
| Galera Cluster          |          |      |          | 类似于组复制，但读写波动比较大                               |                                             |
| PhxSQL                  | 腾讯     | 开源 | C++      | 自己在集群中实现binlog同步，确保可靠性。只支持主从模式       | https://github.com/Tencent/phxsql           |
| mycat                   | 开源团队 | 开源 | java     | 提供代理连接池，支持多种底层同步及机制，支持分库分表。       | https://github.com/MyCATApache/Mycat-Server |
| vitess                  | Youtube  |      |          |                                                              | https://vitess.io                           |
| Oceanus                 | 58同城   | 开源 | java     | 提供代理连接池，支持多库读写。3年没有维护了                  | https://github.com/58code/Oceanus           |
| cetus                   | 网易     | 开源 | C        | 提供代理连接池，底层采用mha4mysql-manager项目做高可用，支持读写分离与分库分表 | https://github.com/Lede-Inc/cetus           |
| DBProxy                 | 美团     | 开源 | C        | 提供代理连接池，底层同步机制不明，支持分库分表。源代码中有测试用例 | https://github.com/Meituan-Dianping/DBProxy |
| SOHU-DBProxy            | 搜狐     | 开源 | C        | 提供一个代理连接池，将读写分散到多个Galera集群上，并能够进行sql监控，杀死等能力。 | https://github.com/SOHUDBA/SOHU-DBProxy     |
|                         |          |      |          |                                                              |                                             |
|                         |          |      |          |                                                              |                                             |
|                         |          |      |          |                                                              |                                             |
|                         |          |      |          |                                                              |                                             |
|                         |          |      |          |                                                              |                                             |
|                         |          |      |          |                                                              |                                             |
|                         |          |      |          |                                                              |                                             |
|                         |          |      |          |                                                              |                                             |

