package com.example.bankdemo.Config;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

 // 如果启动器中添加了，则此处可以省略
@Configuration
public class SwaggerConfig {
    @Bean(value = "adminApi")
    public Docket adminApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("后端API分组")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("华杉科技接口文档")
                .contact(
                        new Contact("123","http://www.baidu.com","2840527760@qq.com"))
                .version("1.0").description("系统API描述").build();

    }
}