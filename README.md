# spb-spring-data-jpa

一、jpa原理
jpa接口继承了PagingAndSortingRepository接口，jpa接口不需要写实现，就可以实现大部分数据访问操作。

二、各个层的包名称
bean:放置持久化类
repository：定义数据访问接口的包
service:业务逻辑处理类
controller：控制器

三、JpaRepository接口测使用
       
    public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);

    List<Student> findByNameAndAddress(String name, String address);

    List<Student> findByNameLike(String name);
}

1、自定义接口，继承JpaRepository<Student,Integer>，Student类作为参数

2、findByName，findByNameAndAddress，findByNameLike方法只需要声明一下

3、返回类型，List<Student> findByNameAndAddress(String name, String address);
       
四、jpa的查询关键字

比如：

And  findByNameAndAddress

Or findByNameOrAddress

Between findByAgeBetween

After findByStartDateAfter

等等

五、访问url

1、save，插入操作

http://127.0.0.1:8080/student/save

2、模糊查询

http://127.0.0.1:8080/student/nameLike?name=牛魔

六、pom的依赖

1、中文的配置
       
       	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>
      
2、jpa的依赖

       	<!-- 添加Spring Data JPA依赖 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
              
 3、springweb启动器的依赖

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
       

七、mysql删除表

delete from 表名；//清空表的内容

drop table 表名；//删除表
