1. 把原工程中所有日志相关依赖都去掉
2. 日志句柄使用slf4j生成，底层会使用logback去打印  

```java
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;    
public class TestClazz {   
	private Logger log =   LoggerFactory.getLogger(TestClazz.class);  
}
```
3. 修改 logback-spring.xml 中log.base、log.error、app.name配置值
4. log.base会写入所有日志，log.error只会写入错误日志。  
	log.base 使用标准路径 /home/cafintech/Logs/\${app.name}/  
	log.error 使用另外的路径，避免被日志采集系统采集走  
		&nbsp;&nbsp;&nbsp;&nbsp;/home/cafintech/Logs/\${app.name}_error
5. app.name会作为文件名使用
	