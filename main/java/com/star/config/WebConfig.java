package com.star.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import javax.annotation.Resources;
import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by hp on 2017/3/20.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.star.controller")
@PropertySource("classpath:c3p0.properties")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.star.repository")

public class WebConfig  extends WebMvcConfigurerAdapter {
    //定义数据源属性
    @Value("${c3p0.driverClass}")
    private String driverClass;
    @Value("${c3p0.jdbcUrl}")
    private String jdbcUrl;
    @Value("${c3p0.user}")
    private String user;
    @Value("${c3p0.password}")
    private String password;
    @Value("${c3p0.maxPoolSize}")
    private String maxPoolSize;

    /*----------------使用@PropertySource获取配置文件必须的配置---------------------*/
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    //--------------------------配置Thymeleaf视图解析器开始-----------------------------
    //配置ViewResolver
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine engine){
        ThymeleafViewResolver resolver=new ThymeleafViewResolver();
        resolver.setTemplateEngine(engine);
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }


    //配置TemplateEngine
    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver resolver){
        SpringTemplateEngine engine=new SpringTemplateEngine();
        engine.setTemplateResolver(resolver);
        //注册安全方言，以便在Thymeleaf页面中使用Thymeleaf Security标签
        //使用之前要引入thymeleaf-extras-springsecurity4依赖
        return engine;
    }

    //配置TemplateResolver
    @Bean
    public TemplateResolver templateResolver(){
        TemplateResolver resolver=new ServletContextTemplateResolver();
        resolver.setPrefix("/WEB-INF/templates/");
        resolver.setSuffix(".html");
        resolver.setCharacterEncoding("UTF-8");
        resolver.setTemplateMode("HTML5");
        return resolver;
    }
    //--------------------------配置Thymeleaf视图解析器结束-----------------------------
    //配置数据源
    @Bean
    public DataSource dataSource() throws Exception {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setMaxPoolSize(Integer.parseInt(maxPoolSize));
        return dataSource;
    }


    @Bean
    public JpaTransactionManager transactionManager() {
        return new JpaTransactionManager(); // does this need an emf???
    }


    /*-------------------------配置基于JPA的EntityManagerFactoryBean-----------------------------------*/
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean emfb=new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter);
        emfb.setPackagesToScan("com.star.domain");
        return emfb;
    }


    /*-------------------------配置EntityManagerFactoryBean需要的JpaVendorAdapter-----------------------------------*/
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        return adapter;
    }

    /*-------------------------支持使用Spring的规范异常,与@Repository结合使用-----------------------------------*/
    @Bean
    public BeanPostProcessor persistenceTranslation(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

    //配置静态资源处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //配置multipart解析器
    //具体参数的配置在AbstractAnnotationConfigDispatcherServletInitializer的方法
    //customizeRegistration(Dynamic registration)方法或web.xml中设置
    @Bean
    public MultipartResolver multipartResolver() throws IOException {
        return new StandardServletMultipartResolver();
    }

}