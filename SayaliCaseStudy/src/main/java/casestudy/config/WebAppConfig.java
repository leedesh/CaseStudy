package casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("casestudy")
public class WebAppConfig implements WebMvcConfigurer{

	
	@Bean
	InternalResourceViewResolver viewResolver() {
	//	System.out.println("coming from webappconf");
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//System.out.println("coming from webappconfig2");
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	
	}
}
