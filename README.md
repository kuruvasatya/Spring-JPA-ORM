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
