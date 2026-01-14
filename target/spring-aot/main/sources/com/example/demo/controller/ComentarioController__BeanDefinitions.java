package com.example.demo.controller;

import com.example.demo.service.ComentarioService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ComentarioController}.
 */
@Generated
public class ComentarioController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'comentarioController'.
   */
  private static BeanInstanceSupplier<ComentarioController> getComentarioControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComentarioController>forConstructor(ComentarioService.class)
            .withGenerator((registeredBean, args) -> new ComentarioController(args.get(0)));
  }

  /**
   * Get the bean definition for 'comentarioController'.
   */
  public static BeanDefinition getComentarioControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComentarioController.class);
    beanDefinition.setInstanceSupplier(getComentarioControllerInstanceSupplier());
    return beanDefinition;
  }
}
