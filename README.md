# Spring-JPA-ORM

- ORM stands for Object Relational Mapping, used to map class to relational table schema
- JPA is just specification, so you need ORM tools for implementation
- Since there are different ORM tools, and at stage if you want to change from one ORM tool to another its bit complicated
- To solve that JPA has given some specification that makes change in ORM tools easy

## JPA XML TEMPLATE
- should be located at **src/main/resources/META-INF/persistence.xml**
```xml
<?xml version="1.0" encoding="UTF-8"?>

<persistence version="2.1"
    xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
    <persistence-unit name="pu">
        <class>Alien</class>
        <properties>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3307/spring" />
            <property name="javax.persistence.jdbc.user" value="root" />
            <property name="javax.persistence.jdbc.password" value="root" />
        </properties>
    </persistence-unit>
</persistence>
```
## Hibernate
- ORM tool
- two important files
    - hibernante.cfg.xml => used for configuring database
    - hibernatte.hbm.xml => used for mapping object to relation => can be replaced using annotation##s
## Annotations used
1. Entity(name="")
2. Table(name="")
3. Id
4. Column(name="", length="", nullable=true/false, umique=true/fasle)
5. Embeddable => tells the table to include this columns in the depended table
8. ElementCollection(fetch = FetchType.Eager) => when a object has a collection of dependent objects


## Configuring the class with table
```java
SessionFactory factory = new Configuration()
                                .configure()
                                .addAnnotatedClass(classname.class)
                                .buildSessionFactry();
Session session = factory.openSession();

Transaction tran = session.beginTransaction();
// modification on data in the table
tran.commit();
```

## hibernate.cfg.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC 
  "-//Hibernate/Hibernate Configuration DTD 3.0//EN" 
  "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<!-- Version 8 MySQL hiberante-cfg.xml example for Hibernate 5 -->

<hibernate-configuration>
  <session-factory>
    <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="connection.url">jdbc:mysql://localhost:3307/spring</property>
    <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
    <property name="connection.username">root</property>
    <property name="connection.password">root</property>
    <property name="connection.pool_size">3</property>
    <!--property name="dialect">org.hibernate.dialect.MySQLDialect</property-->
    <property name="current_session_context_class">thread</property>
    <property name="show_sql">true</property>
    <property name="format_sql">true</property>
    <property name="hbm2ddl.auto">update</property>
    <!-- mapping class="com.mcnz.jpa.examples.Player" / -->
  </session-factory>
</hibernate-configuration>
```
## Relationships
- @OneToOne
- @OneToMany
- @ManyToOne(mappedBy="", fetch = FetchType.Eager / FetchType.Lazy)
- @ManyToMany(mappedBy="", fetch = FetchType.Eager / FetchType.Lazy)

## Inheritance
- @Inheritance(strategy = InheritanceType.Single_Table) => creates only table for parent and child => placed over parent class
- @DiscriminatorColumn(name="") => to change the discriminator value => placed over parent class
- @Inheritance(strategy = InheritanceType.Table_Per_Class) => creates tables for all the parent and child classes, each child class has all the data in parent
- @Inheritance(strategy = InheritanceType.Joined) => normalized tables, need joining
- @DiscriminatorValue("name") => to change the name of child class table => placed over child classes

## CRUD Methods in Hibernate
- session.save(object) => saves object in the table
- session.get(class, id) => gets data from the table
- session.delete(object) => first get the object and delete that object
- session.update(object) => first get the object and then update

## HQL
- Import Query from org.hibernate.query.Query instead of org.hibernate.Query
   
1. public int executeUpdate() is used to execute the update or delete query.
2. public List list() returns the result of the ralation as a list.
3. public Query setFirstResult(int rowno) specifies the row number from where record will be retrieved.
4. public Query setMaxResult(int rowno) specifies the no. of records to be retrieved from the relation (table).
5. public Query setParameter(int position, Object value) it sets the value to the JDBC style query parameter.
6. public Query setParameter(String name, Object value) it sets the value to a named query parameter.
7. public Object getSingleRestult() it is used for query which returns single value => aggregate functions 
6. Transient => attribute is not added to the table

