# DB-Analyse数据库分析

NewSQL以及基于mysql分库分表的中间件的分析 





### 数据库

| 项目名称             | 提供者                      | 类型 | 实现语言 | 项目说明                                                     | 项目地址                                                     |
| -------------------- | --------------------------- | ---- | -------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| mysql                | oracle                      |      |          |                                                              |                                                              |
| mariadb              | Monty Widenius，mysql初创者 | 开源 |          | mysql的分支版本，支持MyISAM、InnoDB，XtraDB存储引擎          | https://mariadb.org/                                         |
| Percona Server       | Percona                     | 开源 |          | mysql的分支版本，不接受外部贡献作者。XtraDB存储引擎的原作者  | https://www.percona.com/software/mysql-database/percona-server |
| [TiDB](./infos/TiDB) | PingCap                     | 开源 | go/rust  | pingcap团队开发的NewSQL数据库                                | https://github.com/pingcap/tidb                              |
| TDSQL                | 腾讯                        | 闭源 |          | 基于MariaDB内核开发的分布式数据库                            | http://tdsql.org                                             |
| Aurora               | 亚马逊                      |      |          | 一个兼容mysql并支持水平扩展的云数据库，底层结合ssd存储进行同步，性能有一定的提升 | https://amazonaws-china.com/cn/rds/aurora                    |



### 数据库扩展和中间件


| 项目名称                                                   | 提供者   | 类型 | 实现语言 | 项目说明                                                     | 项目地址                                           |
| :--------------------------------------------------------- | :------- | ---- | -------- | :----------------------------------------------------------- | :------------------------------------------------- |
| [mysql group replication](./infos/mysql-group-replication) |          |      |          | mysql5.7提供的组复制功能，可以进行集群多写，且可以保证写一致性，但不能保证读一致性。多中心时受到网络影响较大 |                                                    |
| MariaDB Galera Cluster                                     |          |      |          | 类似于组复制，多中心时受到网络影响较大，仅能使用于MariaDB    |                                                    |
| Percona XtraDB Cluster                                     |          |      |          | 类似于组复制，多中心时受到网络影响较大，仅能使用于Percna Server |                                                    |
| PhxSQL                                                     | 腾讯     | 开源 | C++      | 自己在集群中实现binlog同步，确保可靠性。只支持主从模式       | https://github.com/Tencent/phxsql                  |
| mycat                                                      | 开源团队 | 开源 | JAVA     | 提供代理连接池，支持多种底层同步机制，支持分库分表。支持多种数据库。 | https://github.com/MyCATApache/Mycat-Server        |
| cetus                                                      | 网易     | 开源 | C        | 提供代理连接池，底层采用mha4mysql-manager项目做高可用，支持读写分离与分库分表 | https://github.com/Lede-Inc/cetus                  |
| DBProxy                                                    | 美团     | 开源 | C        | 提供代理连接池，底层同步机制不明，支持分库分表。源代码中有测试用例 | https://github.com/Meituan-Dianping/DBProxy        |
| SOHU-DBProxy                                               | 搜狐     | 开源 | C        | 提供一个代理连接池，将读写分散到Galera集群上，并能够提供sql监控，进程杀死等能力。 | https://github.com/SOHUDBA/SOHU-DBProxy            |
| sharding-sphere                                            | 开源团队 | 开源 | JAVA     | 原来的Sharding-jdbc.以jar包方式嵌入，支持分库分表            | https://github.com/sharding-sphere/sharding-sphere |
| mixer                                                      | 开源团队 | 开源 | GO       | 一个简单的mysql代理工具，支持sharding，参考了Vitess的实现，但语法支持mysql的原生语法。 | https://github.com/siddontang/mixer                |
| Vitess                                                     | YouTube  | 开源 | GO       | 支持mysql分库分表，但是语法与mysql不兼容                     | https://github.com/vitessio/vitess                 |
| radondb                                                    | 青云     | 开源 | GO       | 独立实现的分布式数据库，但完成度不够                         | https://github.com/radondb/radon                   |
|                                                            |          |      |          |                                                              |                                                    |
|                                                            |          |      |          |                                                              |                                                    |
|                                                            |          |      |          |                                                              |                                                    |
|                                                            |          |      |          |                                                              |                                                    |
|                                                            |          |      |          |                                                              |                                                    |

