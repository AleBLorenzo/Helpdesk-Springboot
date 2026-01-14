package com.example.demo.controller;

import com.example.demo.service.UsuarioService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UsuarioController}.
 */
@Generated
public class UsuarioController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'usuarioController'.
   */
  private static BeanInstanceSupplier<UsuarioController> getUsuarioControllerInstanceSupplier() {
    return BeanInstanceSupplier.<UsuarioController>forConstructor(UsuarioService.class)
            .withGenerator((registeredBean, args) -> new UsuarioController(args.get(0)));
  }

  /**
   * Get the bean definition for 'usuarioController'.
   */
  public static BeanDefinition getUsuarioControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UsuarioController.class);
    beanDefinition.setInstanceSupplier(getUsuarioControllerInstanceSupplier());
    return beanDefinition;
  }
}
