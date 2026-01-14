package com.example.demo.service;

import com.example.demo.repository.UsuarioRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UsuarioService}.
 */
@Generated
public class UsuarioService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'usuarioService'.
   */
  private static BeanInstanceSupplier<UsuarioService> getUsuarioServiceInstanceSupplier() {
    return BeanInstanceSupplier.<UsuarioService>forConstructor(UsuarioRepository.class)
            .withGenerator((registeredBean, args) -> new UsuarioService(args.get(0)));
  }

  /**
   * Get the bean definition for 'usuarioService'.
   */
  public static BeanDefinition getUsuarioServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(UsuarioService.class);
    InstanceSupplier<UsuarioService> instanceSupplier = getUsuarioServiceInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(UsuarioService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
