package org.sid.demo;

import org.sid.demo.dao.CategoryRepository;
import org.sid.demo.dao.ProductRepository;
import org.sid.demo.documents.Category;
import org.sid.demo.documents.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CategoryRepository categoryRepository , ProductRepository productRepository){
        return strings ->{

            categoryRepository.deleteAll();

            Category c1 = new Category("A","Samsung","good",new ArrayList<Product>());
            Category c2 = new Category("B","iphone","good",new ArrayList<Product>());
            Category c3 = new Category("C","Huawei","good",new ArrayList<Product>());
            Category c4 = new Category("D","Oppo","good",new ArrayList<Product>());

            categoryRepository.save(c1);
            categoryRepository.save(c2);
            categoryRepository.save(c3);
            categoryRepository.save(c4);


            productRepository.deleteAll();

            Product p2 = new Product("P2","S8","good Product",7000,true,40,c1);
            Product p3 = new Product("P3","S6","good Product",6300,true,30,c1);
            Product p5 = new Product("P5","S5","good Product",5700,true,90,c1);
            Product p6 = new Product("P6","iphone 6","good Product",7700,true,90,c2);
            Product p7 = new Product("P7","iphone 7","good Product",8700,true,90,c2);
            Product p8 = new Product("P8","iphone 8","good Product",9700,true,90,c2);
            Product p9 = new Product("P9","iphone 8 plus","good Product",10700,true,90,c2);
            Product p10 = new Product("P10","iphone 11","good Product",15700,true,90,c2);
            Product p1 = new Product("P1","iphoneX","good Product",12000,true,50,c2);
            Product p4 = new Product("P4","s9","good Product",8700,true,90,c1);
            Product p11 = new Product("P11","HUAWEI Nova i3","good Product",6700,true,90,c3);
            Product p12 = new Product("P12","HUAWEI Mate 40 Pro","good Product",7700,true,90,c3);
            Product p13 = new Product("P13","HUAWEI P40 Pro","good Product",8700,true,90,c3);
            Product p14 = new Product("P14","HUAWEI nova 7","good Product",9700,true,90,c3);
            Product p15 = new Product("P15","Oppo A12","good Product",6700,true,90,c4);
            Product p16 = new Product("P16","Oppo A15 (3/32GO) -Noir","good Product",7700,true,90,c4);
            Product p17 = new Product("P17","Oppo A15S - Blanc","good Product",8700,true,90,c4);
            Product p18 = new Product("P18","Oppo A7","good Product",9700,true,90,c4);
          

            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);
            productRepository.save(p5);
            productRepository.save(p6);
            productRepository.save(p7);
            productRepository.save(p8);
            productRepository.save(p9);
            productRepository.save(p10);
            productRepository.save(p11);
            productRepository.save(p12);
            productRepository.save(p13);
            productRepository.save(p14);
            productRepository.save(p15);
            productRepository.save(p16);
            productRepository.save(p17);
            productRepository.save(p18);


            c1.getProducts().add(p2);
            c1.getProducts().add(p3);
            c1.getProducts().add(p4);
            c1.getProducts().add(p5);
            c1.getProducts().add(p1);
            c2.getProducts().add(p6);
            c2.getProducts().add(p7);
            c2.getProducts().add(p8);
            c2.getProducts().add(p9);
            c2.getProducts().add(p10);
            c3.getProducts().add(p11);
            c3.getProducts().add(p12);
            c3.getProducts().add(p13);
            c3.getProducts().add(p14);
            c4.getProducts().add(p15);
            c4.getProducts().add(p16);
            c4.getProducts().add(p17);
            c4.getProducts().add(p18);

            categoryRepository.save(c1);
            categoryRepository.save(c2);
            categoryRepository.save(c3);
            categoryRepository.save(c4);


        };
    }

}
