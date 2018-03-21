# Spring-Cloud-Euraka-Feign
spring boot 、EurakaServer集群、EurakaClient服务提供、Feign声明式消费服务使用案例
spring-cloud 1.5.9版本

准备工作：需要安装mysql

新建数据库drzk

新建表tbl_user  表中两列id、name

配置本地hosts文件：
加入这三个：
127.0.0.1 peer1
127.0.0.1 peer2
127.0.0.1 peer3

启动步骤：
1、先启动注册中心，platform、platform-euraka-server2、platform-euraka-server3

访问：http://peer1:8088/  http://peer2:8078/  http://peer3:8098/ 可以分别看到注册中心注册的其他两个注册中心

2、再启动服务提供者
访问：localhost:8090/drzk/user/list

3、最后启动消费者

测试：从消费者服务-->访问到provider的服务，通过provider返回数据
localhost:8089/test/list
返回跟localhost:8090/drzk/user/list一样的数据



