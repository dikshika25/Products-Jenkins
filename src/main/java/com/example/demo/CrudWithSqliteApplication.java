package com.example.demo;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CrudWithSqliteApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(CrudWithSqliteApplication.class, args);
    }

    @Bean
    public Docket swaggerConfiguration()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/products/*"))
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .build();
    }

    @Override
    public void run(String... args) throws Exception {
        Demo4();
    }

//    private  void Demo1()
//    {
//             Product product= productService.find(2);
//             System.out.println("Id: "+product.getId());
//             System.out.println("Name: "+product.getName());
//             System.out.println("Price: "+product.getPrice());
//             System.out.println("Quantity: "+product.getQuantity());
//             System.out.println("Status: "+product.isStatus());
//             System.out.println("====================================");
//    }
//
//    private  void Demo2()
//    {
//        Product product= new Product();
//        product.setName("Navin");
//        product.setPrice(8.9);
//        product.setQuantity(100);
//        product.setStatus(true);
//        product=productService.save(product);
//        System.out.println("id: "+product.getId());
//    }
//
//    private  void Demo3()
//    {
//        try{
//            productService.delete(4);
//        }catch(Exception e)
//        {
//            System.out.println("Failed");
//        }
//    }
//
    private  void Demo4()
    {
        for(Product product: productService.findAll())
        {
            System.out.println("Id: "+product.getId());
            System.out.println("Name: "+product.getName());
            System.out.println("Price: "+product.getPrice());
            System.out.println("Quantity: "+product.getQuantity());
            System.out.println("Status: "+product.isStatus());
            System.out.println("====================================");
        }
    }

}
