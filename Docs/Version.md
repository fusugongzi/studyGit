###Version 1.1
* pom.xml 中的版本号升级为1.1
* pom.xml 中spring-boot-dependencies版本由1.4.2.RELEASE变更为1.4.3.RELEASE
* pom.xml 增加了公共父配置，连接nexus.cafintech.service可使用

```xml
<parent>
	<groupId>com.cajl</groupId>  
	<artifactId>parent</artifactId>  
	<version>1.0</version>  
</parent>  
```
* 在src/main/resources中增加了logback-spring.xml 文件，用来配置logback
* bootstrap.properties 注释了spring.cloud.config相关配置
* 在Docs目录添加《HowToAddListenersAndFilters.md》文档
* 在Docs目录添加《HowToUseLogging.md》文档