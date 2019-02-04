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
