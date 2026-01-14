package com.example.demo.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link UsuarioService}.
 */
@Generated
public class UsuarioService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static UsuarioService apply(RegisteredBean registeredBean, UsuarioService instance) {
    AutowiredFieldValueResolver.forRequiredField("UserRepo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
