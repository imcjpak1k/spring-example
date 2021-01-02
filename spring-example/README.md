# SpringFrame WebMVC
## Database 설정
>
### MaridaDB 다운로드 및 설치
[MariaDB Download Click](https://mariadb.org/download/)





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

## xxx

