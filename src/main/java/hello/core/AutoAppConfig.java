package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        //예제 프로젝트에서 @Configuration 을 사용하기 때문에 해당 클래스를 스캔하지 않기 위해서 사용.
        excludeFilters = @Filter(type = FilterType.ANNOTATION , classes = Configuration.class)
)
public class AutoAppConfig {
}
