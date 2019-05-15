package org.sito.facturacio.config;


import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

//EnableJpaRepositories("mvcsample.repositories")

@Configuration
@ComponentScan(basePackages= {"org.sito.facturacio.config.services"})
@PropertySource({"classpath:/META-INF/application.properties","classpath:/META-INF/database.properties"})
public class ServiceRootConfig {
	@Value("${database.driverClassName}")
	private String driverClassName;
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String username;
	@Value("${database.password}")
	private String password;
	
		
	@Value("${database.initialSize}")	
	private int initialSize;
	
	@Value("${hibernate.dialect}")
	private String dialect;
	
	@Value("${hibernate.hbm2ddl.auto}")
	private String auto;

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUsername(this.username);
		dataSource.setUrl(this.url);
		dataSource.setPassword(this.password);
		dataSource.setInitialSize(this.initialSize);		
		return dataSource;
	}
	
	/*@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		
		ClassPathResource resourceApp = new ClassPathResource("/META-INF/application.properties");
		ClassPathResource resourceDB = new ClassPathResource("/META-INF/database.properties");
		placeholderConfigurer.setLocations(resourceApp, resourceDB);
		return placeholderConfigurer;
	}*/
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();	
		return placeholderConfigurer;
	}
	
	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager(entityManagerFactory().getObject());
		return transactionManager;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		localContainerEntityManagerFactoryBean.setDataSource(dataSource());
		localContainerEntityManagerFactoryBean.setPackagesToScan(org.sito.facturacio.model.Address.class.getPackage().getName());
		localContainerEntityManagerFactoryBean.setPersistenceUnitName("DBPersistenciaUnit");
		
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		
		jpaVendorAdapter.setDatabasePlatform(dialect);		
		
		
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
		return localContainerEntityManagerFactoryBean;
	}
}