package org.springframework.boot.http.converter.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.http.converter.json.JacksonJsonHttpMessageConverter;
import tools.jackson.databind.json.JsonMapper;

/**
 * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration}.
 */
@Generated
public class JacksonHttpMessageConvertersConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonHttpMessageConvertersConfiguration'.
   */
  public static BeanDefinition getJacksonHttpMessageConvertersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.class);
    beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration}.
   */
  @Generated
  public static class JacksonJsonHttpMessageConverterConfiguration {
    /**
     * Get the bean definition for 'jacksonJsonHttpMessageConverterConfiguration'.
     */
    public static BeanDefinition getJacksonJsonHttpMessageConverterConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration.class);
      beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jacksonJsonHttpMessageConverter'.
     */
    private static BeanInstanceSupplier<JacksonJsonHttpMessageConverter> getJacksonJsonHttpMessageConverterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JacksonJsonHttpMessageConverter>forFactoryMethod(JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration.class, "jacksonJsonHttpMessageConverter", JsonMapper.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.http.converter.autoconfigure.JacksonHttpMessageConvertersConfiguration$JacksonJsonHttpMessageConverterConfiguration", JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration.class).jacksonJsonHttpMessageConverter(args.get(0)));
    }

    /**
     * Get the bean definition for 'jacksonJsonHttpMessageConverter'.
     */
    public static BeanDefinition getJacksonJsonHttpMessageConverterBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonJsonHttpMessageConverter.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.http.converter.autoconfigure.JacksonHttpMessageConvertersConfiguration$JacksonJsonHttpMessageConverterConfiguration");
      beanDefinition.setInstanceSupplier(getJacksonJsonHttpMessageConverterInstanceSupplier());
      return beanDefinition;
    }
  }
}
