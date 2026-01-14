package org.springframework.boot.http.converter.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.http.converter.StringHttpMessageConverter;

/**
 * Bean definitions for {@link HttpMessageConvertersAutoConfiguration}.
 */
@Generated
public class HttpMessageConvertersAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'httpMessageConvertersAutoConfiguration'.
   */
  public static BeanDefinition getHttpMessageConvertersAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpMessageConvertersAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(HttpMessageConvertersAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'clientConvertersCustomizer'.
   */
  private static BeanInstanceSupplier<ClientHttpMessageConvertersCustomizer> getClientConvertersCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ClientHttpMessageConvertersCustomizer>forFactoryMethod(HttpMessageConvertersAutoConfiguration.class, "clientConvertersCustomizer", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.http.converter.autoconfigure.HttpMessageConvertersAutoConfiguration", HttpMessageConvertersAutoConfiguration.class).clientConvertersCustomizer(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'clientConvertersCustomizer'.
   */
  public static BeanDefinition getClientConvertersCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClientHttpMessageConvertersCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.http.converter.autoconfigure.HttpMessageConvertersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getClientConvertersCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'serverConvertersCustomizer'.
   */
  private static BeanInstanceSupplier<ServerHttpMessageConvertersCustomizer> getServerConvertersCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServerHttpMessageConvertersCustomizer>forFactoryMethod(HttpMessageConvertersAutoConfiguration.class, "serverConvertersCustomizer", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.http.converter.autoconfigure.HttpMessageConvertersAutoConfiguration", HttpMessageConvertersAutoConfiguration.class).serverConvertersCustomizer(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'serverConvertersCustomizer'.
   */
  public static BeanDefinition getServerConvertersCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServerHttpMessageConvertersCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.http.converter.autoconfigure.HttpMessageConvertersAutoConfiguration");
    beanDefinition.setInstanceSupplier(getServerConvertersCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration}.
   */
  @Generated
  public static class StringHttpMessageConverterConfiguration {
    /**
     * Get the bean definition for 'stringHttpMessageConverterConfiguration'.
     */
    public static BeanDefinition getStringHttpMessageConverterConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration.class);
      beanDefinition.setInstanceSupplier(HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'stringHttpMessageConverter'.
     */
    private static BeanInstanceSupplier<StringHttpMessageConverter> getStringHttpMessageConverterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<StringHttpMessageConverter>forFactoryMethod(HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration.class, "stringHttpMessageConverter", HttpMessageConvertersProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.http.converter.autoconfigure.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration", HttpMessageConvertersAutoConfiguration.StringHttpMessageConverterConfiguration.class).stringHttpMessageConverter(args.get(0)));
    }

    /**
     * Get the bean definition for 'stringHttpMessageConverter'.
     */
    public static BeanDefinition getStringHttpMessageConverterBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(StringHttpMessageConverter.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.http.converter.autoconfigure.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration");
      beanDefinition.setInstanceSupplier(getStringHttpMessageConverterInstanceSupplier());
      return beanDefinition;
    }
  }
}
