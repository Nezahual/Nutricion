package com.backendmadrid.nutricion.config;

import com.backendmadrid.nutricion.dao.IngredienteDAOImpl;
import com.backendmadrid.nutricion.dao.PlatoDAOImpl;
import com.backendmadrid.nutricion.dao.UsuarioDAOImpl;
import com.backendmadrid.nutricion.dao.PlatoIngredienteDAOImpl;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.backendmadrid.nutricion")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
        public DriverManagerDataSource dataSource(){
        
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUrl("jdbc:mysql://cloud.josebelda.com:3306/nutricion");
            ds.setUsername("nutricion");
            ds.setPassword("root");
            
            return ds;
        }
        
        @Bean
        @Autowired
        public JdbcTemplate templateJDBC(DataSource ds){
        
            return new JdbcTemplate(ds);
        }
        
        @Bean
        public IngredienteDAOImpl ingredienteDAO(){
        
            return new IngredienteDAOImpl();
        }
        
        @Bean
        public PlatoDAOImpl platoDAO(){
        
            return new PlatoDAOImpl();
        }
        
        @Bean
        public UsuarioDAOImpl usuarioDAO(){
        
            return new UsuarioDAOImpl();
        }
        
        @Bean
        public PlatoIngredienteDAOImpl platoIngredienteDAO(){
        
            return new PlatoIngredienteDAOImpl();
        }
        
}
