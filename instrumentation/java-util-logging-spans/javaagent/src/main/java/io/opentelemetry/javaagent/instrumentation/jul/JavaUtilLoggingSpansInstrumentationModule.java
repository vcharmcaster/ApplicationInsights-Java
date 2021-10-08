/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.javaagent.instrumentation.jul;

import static java.util.Collections.singletonList;

import com.google.auto.service.AutoService;
import io.opentelemetry.javaagent.extension.instrumentation.InstrumentationModule;
import io.opentelemetry.javaagent.extension.instrumentation.TypeInstrumentation;
import java.util.List;

@AutoService(InstrumentationModule.class)
public class JavaUtilLoggingSpansInstrumentationModule extends InstrumentationModule {
  public JavaUtilLoggingSpansInstrumentationModule() {
    // this name is important currently because it's used to disable this instrumentation
    super("java-util-logging-spans");
  }

  @Override
  public List<TypeInstrumentation> typeInstrumentations() {
    return singletonList(new JavaUtilLoggingSpansInstrumentation());
  }
}
