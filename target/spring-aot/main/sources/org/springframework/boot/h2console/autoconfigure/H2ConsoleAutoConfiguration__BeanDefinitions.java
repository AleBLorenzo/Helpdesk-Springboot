package org.springframework.boot.h2console.autoconfigure;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link H2ConsoleAutoConfiguration}.
 */
@Generated
public class H2ConsoleAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.h2console.autoconfigure.H2ConsoleAutoConfiguration'.
   */
  private static BeanInstanceSupplier<H2ConsoleAutoConfiguration> getHConsoleAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<H2ConsoleAutoConfiguration>forConstructor(H2ConsoleProperties.class)
            .withGenerator((registeredBean, args) -> new H2ConsoleAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'h2ConsoleAutoConfiguration'.
   */
  public static BeanDefinition getHConsoleAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(H2ConsoleAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getHConsoleAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'h2Console'.
   */
  private static BeanInstanceSupplier<ServletRegistrationBean> getHConsoleInstanceSupplier() {
    return BeanInstanceSupplier.<ServletRegistrationBean>forFactoryMethod(H2ConsoleAutoConfiguration.class, "h2Console")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.h2console.autoconfigure.H2ConsoleAutoConfiguration", H2ConsoleAutoConfiguration.class).h2Console());
  }

  /**
   * Get the bean definition for 'h2Console'.
   */
  public static BeanDefinition getHConsoleBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletRegistrationBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(ServletRegistrationBean.class, JakartaWebServlet.class));
    beanDefinition.setFactoryBeanName("org.springframework.boot.h2console.autoconfigure.H2ConsoleAutoConfiguration");
    beanDefinition.setInstanceSupplier(getHConsoleInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'h2ConsoleLogger'.
   */
  private static BeanInstanceSupplier<H2ConsoleAutoConfiguration.H2ConsoleLogger> getHConsoleLoggerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<H2ConsoleAutoConfiguration.H2ConsoleLogger>forFactoryMethod(H2ConsoleAutoConfiguration.class, "h2ConsoleLogger", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.h2console.autoconfigure.H2ConsoleAutoConfiguration", H2ConsoleAutoConfiguration.class).h2ConsoleLogger(args.get(0)));
  }

  /**
   * Get the bean definition for 'h2ConsoleLogger'.
   */
  public static BeanDefinition getHConsoleLoggerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(H2ConsoleAutoConfiguration.H2ConsoleLogger.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.h2console.autoconfigure.H2ConsoleAutoConfiguration");
    beanDefinition.setInstanceSupplier(getHConsoleLoggerInstanceSupplier());
    return beanDefinition;
  }
}
