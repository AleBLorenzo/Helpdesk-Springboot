package com.example.demo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HelpdeskSpringbootApplication}.
 */
@Generated
public class HelpdeskSpringbootApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'helpdeskSpringbootApplication'.
   */
  public static BeanDefinition getHelpdeskSpringbootApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HelpdeskSpringbootApplication.class);
    beanDefinition.setInstanceSupplier(HelpdeskSpringbootApplication::new);
    return beanDefinition;
  }
}
