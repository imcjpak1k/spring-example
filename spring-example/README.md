# SpringFrame WebMVC
## Database 설정
>
### MaridaDB 다운로드 및 설치
[MariaDB Download Click](https://mariadb.org/download/)

### 테이블생성
```sql
CREATE TABLE `board` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'PK',
	`title` TINYTEXT NOT NULL COMMENT '제목' COLLATE 'utf8_general_ci',
	`content` LONGTEXT NOT NULL DEFAULT '0' COMMENT '내용' COLLATE 'utf8_general_ci',
	`hit` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '조회수',
	`reg_dtm` TIMESTAMP NOT NULL DEFAULT current_timestamp() COMMENT '등록일시',
	`mod_dtm` TIMESTAMP NOT NULL DEFAULT current_timestamp() COMMENT '수정일시',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;

CREATE TABLE `comment` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '아이디',
	`board_id` INT(11) NOT NULL DEFAULT '0' COMMENT '게시글 아이디',
	`content` MEDIUMTEXT NOT NULL DEFAULT '0' COMMENT '내용' COLLATE 'utf8_general_ci',
	`reg_dtm` TIMESTAMP NOT NULL DEFAULT current_timestamp() COMMENT '등록일시',
	PRIMARY KEY (`id`) USING BTREE,
	INDEX `FK_comment_board` (`board_id`) USING BTREE,
	CONSTRAINT `FK_comment_board` FOREIGN KEY (`board_id`) REFERENCES `spring-example`.`board` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;



```




## Maven 설정
>	
### java.compliler		
```xml
<properties>
	<maven.compiler.source>1.8</maven.compiler.source>
	<maven.compiler.target>1.8</maven.compiler.target>
</properties>
```
### tomcat-api
```xml
<dependency>
	<groupId>org.apache.tomcat</groupId>
	<artifactId>tomcat-api</artifactId>
	<version>9.0.41</version>
</dependency>
```
### tiles-jsp
```xml
<dependency>
	<groupId>org.apache.tiles</groupId>
	<artifactId>tiles-jsp</artifactId>
	<version>3.0.8</version>
</dependency>
```
### jstl
```xml
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
	<version>1.2</version>
</dependency>
```
### spring-webmvc
```xml
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-webmvc</artifactId>
	<version>5.2.12.RELEASE</version>
</dependency>
```
### spring-jdbc
```xml
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-jdbc</artifactId>
	<version>5.2.12.RELEASE</version>
</dependency>
```
### Spring-test
```xml
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-test</artifactId>
	<version>5.2.12.RELEASE</version>
	<scope>test</scope>
</dependency>
```
### mariadb-jdbc-client
```xml
<dependency>
	<groupId>org.mariadb.jdbc</groupId>
	<artifactId>mariadb-java-client</artifactId>
	<version>2.7.1</version>
</dependency>
```
### jackson-databind	
```xml
<dependency>
	<groupId>com.fasterxml.jackson.core</groupId>
	<artifactId>jackson-databind</artifactId>
	<version>2.12.0</version>
</dependency>
```
@ResponseBody로 객체를 JSON으로 반환시 사용됨.
### MyBatis
```xml
<dependency>
	<groupId>org.mybatis</groupId>
	<artifactId>mybatis</artifactId>
	<version>3.5.6</version>
</dependency>
<dependency>
	<groupId>org.mybatis</groupId>
	<artifactId>mybatis-spring</artifactId>
	<version>2.0.6</version>
</dependency>
```

## vuejs 설치
```console
> cd C:\Users\박창준\git\spring-example\spring-example\src\main\webapp\static\js	
> npm install vue
```


## xxx


hibernate 공부해야함	
https://happygrammer.tistory.com/150	
https://blog.thereis.xyz/17?category=660025	
https://effectivesquid.tistory.com/entry/Spring-web-mvc-jpa-hibernate-%EB%B9%88-%EC%84%A4%EC%A0%95-MAVEN	
https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html
	

@Transactional 
https://crosstheline.tistory.com/96

## 참고사이트
[HowToDoJava](https://howtodoinjava.com/)
[javaguides](https://www.javaguides.net/)
[codejava](https://www.codejava.net/)