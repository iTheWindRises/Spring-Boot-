package com.zwj.springbootdive.annotation;

import com.zwj.springbootdive.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ImportSelector 实现
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
