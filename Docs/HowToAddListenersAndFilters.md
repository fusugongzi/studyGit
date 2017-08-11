### 方法1：使用注解
1. 注解可以针对 Servlet、Filter、Listener添加  
2. 在开发相应类时添加如下注解  
	@javax.servlet.annotation.WebListener  
	@javax.servlet.annotation.WebFilter  
	@javax.servlet.annotation.WebServlet  
3. 在Application.java中加入如下注解  
	@ServletComponentScan({"com.package.scan","com.package.application"})  
	*** 注意，注解后不加value的情况下，默认从Application类所在包开始扫描，如果非Applicaiton子包要加到value中，那么Application所在包也需要加在value中，否则就不会扫描

### 方法2：使用RegistrationBean
1. 适用于在开发时没有加注解的类
2. 在Application.java类中添加若干个方法，每一个方法可以注册一个Filter或Listener或Servlet。所以如果要注册两个Filter，需要两个方法。
3. 方法要加@Bean注解
4. 注册Filter的方法返回FilterRegistrationBean类
5. 注册Listener的方法返回ServletListenerRegistrationBean类
6. 注册Servlet的方法返回ServletRegistrationBean类
7. 例子  

```java
	 @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setFilter(new SessionFilter());
        return registration;
    }
```