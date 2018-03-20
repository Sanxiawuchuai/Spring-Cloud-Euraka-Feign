# Spring-Cloud-Euraka-Feign
spring boot 、EurakaServer、EurakaClient服务提供、Feign声明式消费服务使用案例
spring-cloud 1.5.9版本

准备工作：需要安装mysql

新建数据库drzk

新建表tbl_user  表中两列id、name

启动步骤：
1、先启动注册中心

访问：http://localhost:8088/

2、再启动服务提供者
访问：localhost:8090/drzk/user/list

3、最后启动消费者

测试：从消费者服务-->访问到provider的服务，通过provider返回数据
localhost:8089/test/list
返回跟localhost:8090/drzk/user/list一样的数据



