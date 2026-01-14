package com.example.demo.service;

import com.example.demo.repository.ComentarioRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ComentarioService}.
 */
@Generated
public class ComentarioService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'comentarioService'.
   */
  private static BeanInstanceSupplier<ComentarioService> getComentarioServiceInstanceSupplier() {
    return BeanInstanceSupplier.<ComentarioService>forConstructor(ComentarioRepository.class)
            .withGenerator((registeredBean, args) -> new ComentarioService(args.get(0)));
  }

  /**
   * Get the bean definition for 'comentarioService'.
   */
  public static BeanDefinition getComentarioServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComentarioService.class);
    InstanceSupplier<ComentarioService> instanceSupplier = getComentarioServiceInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(ComentarioService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
