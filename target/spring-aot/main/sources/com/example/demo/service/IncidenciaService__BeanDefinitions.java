package com.example.demo.service;

import com.example.demo.repository.IncidenciaRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IncidenciaService}.
 */
@Generated
public class IncidenciaService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'incidenciaService'.
   */
  private static BeanInstanceSupplier<IncidenciaService> getIncidenciaServiceInstanceSupplier() {
    return BeanInstanceSupplier.<IncidenciaService>forConstructor(IncidenciaRepository.class)
            .withGenerator((registeredBean, args) -> new IncidenciaService(args.get(0)));
  }

  /**
   * Get the bean definition for 'incidenciaService'.
   */
  public static BeanDefinition getIncidenciaServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IncidenciaService.class);
    InstanceSupplier<IncidenciaService> instanceSupplier = getIncidenciaServiceInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(IncidenciaService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
