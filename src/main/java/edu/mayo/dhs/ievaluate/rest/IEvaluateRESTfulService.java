package edu.mayo.dhs.ievaluate.rest;

import edu.mayo.dhs.ievaluate.core.IEvaluateCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

/**
 * An implementation of IEvaluate functionality supplied as a RESTful service
 */
@SpringBootApplication
public class IEvaluateRESTfulService {
    public static void main(String... args) {
        // Start the API in current folder TODO support tomcat/etc
        new IEvaluateCore(new File(""));
        // Now start the RESTful service
        SpringApplication.run(IEvaluateRESTfulService.class, args);
    }
}
