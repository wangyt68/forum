#Demo

##Reference
[Spring 文档](https://spring.io/guides)

[github项目](https://github.com/wangyt68/forum)

[GitHub Deploy keys](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)

[GitHub Developer: OAuth](https://developer.github.com/apps/)

[mybatis](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

[bootstrap](http://v3.bootcss.com/)

[thyleaf](https://www.thymeleaf.org/)

##Tool
[flyway](https://flaywaydb.org)

[Lombok](https://projectlombok.org/)

##script
```sql
create table USER
(
    ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_9F2E7FD4_E121_4DE8_8F66_1D23B1C6E834) auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER1_PK
        primary key (ID)
);
```