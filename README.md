# spring-boot框架
##学习spring-boot的基础知识  
* 整合mybatis
    - WARN: Establishing SSL connection without server's identity verification is not recommended  
      ```
      解决方案： 
      原因是MySQL在高版本需要指明是否进行SSL连接。
             在mysql连接字符串url中加入ssl=true或者false即可：  
             <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=true" />
       ```
    - 主键id  long 基础类  Long基础类   一般生成的代码是基础类long  需要改为引用类Long  
  
    - 用到了一个工具类  idwoker 这个可以生成唯一id  
 
 ```
       mybatis和tk.mybatis 这2个都是可以使用 用tk.mybatis的需要导入mybatis包 
       tk.mybatis和mybatis得到区别在于,tk.mybatis 可以不用xml文件，并且crud的方法也有所不一样 
 ```
##  pom.xml  
  - Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is 
  `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI
   and manual loading of the driver class is generally unnecessary
   ``` 
  出现这个报错的原因是因为 在  
  <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
  </dependency>
  没有指定版本号的时候 application.properties 文件配置需要
  spring.datasource.driver-class-name=com.mysql.jdbc.Driver需要改成com.mysql.cj.jdbc.Driver
   com.mysql.jdbc.Driver这个在高本版下已经被弃用了
   感悟 这种东西随着时间的推移需要多关注官方的文档 不然 死到找不到坟头
 ``` 
##  事务
    ```
   事务开始用@Transactional不起效果 排查半天 发现是数据库引擎是myisam 需要改成innodb 
   后面需要对@Transactiona里面的参数进行学习
   ```