package com.example.demo.controller;

import com.example.demo.service.IncidenciaService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IncidenciaController}.
 */
@Generated
public class IncidenciaController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'incidenciaController'.
   */
  private static BeanInstanceSupplier<IncidenciaController> getIncidenciaControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<IncidenciaController>forConstructor(IncidenciaService.class)
            .withGenerator((registeredBean, args) -> new IncidenciaController(args.get(0)));
  }

  /**
   * Get the bean definition for 'incidenciaController'.
   */
  public static BeanDefinition getIncidenciaControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(IncidenciaController.class);
    beanDefinition.setInstanceSupplier(getIncidenciaControllerInstanceSupplier());
    return beanDefinition;
  }
}
