package com.example.demo.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ComentarioService}.
 */
@Generated
public class ComentarioService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ComentarioService apply(RegisteredBean registeredBean, ComentarioService instance) {
    AutowiredFieldValueResolver.forRequiredField("ComentRepo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
