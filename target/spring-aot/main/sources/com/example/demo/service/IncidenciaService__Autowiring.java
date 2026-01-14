package com.example.demo.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link IncidenciaService}.
 */
@Generated
public class IncidenciaService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static IncidenciaService apply(RegisteredBean registeredBean, IncidenciaService instance) {
    AutowiredFieldValueResolver.forRequiredField("InciRepo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
