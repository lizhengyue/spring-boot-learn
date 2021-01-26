# spring-boot框架
学习慕课网的spring-boot的基础知识  
* 整合mybatis

    - WARN: Establishing SSL connection without server's identity verification is not recommended  
      ```
      解决方案： 
      原因是MySQL在高版本需要指明是否进行SSL连接。
             在mysql连接字符串url中加入ssl=true或者false即可：  
             <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=true" />
    - 主键id  long 基础类  Long基础类   一般生成的代码是基础类long  需要改为引用类Long  
  
    - 用到了一个工具类  idwoker 这个可以生成唯一id  
 
     - ```
       mybatis和tk.mybatis 这2个都是可以使用 用tk.mybatis的需要导入mybatis包 
       tk.mybatis和mybatis得到区别在于,tk.mybatis 可以不用xml文件，并且crud的方法也有所不一样  

  
  
