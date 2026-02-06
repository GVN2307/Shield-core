package com.shieldcore.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = ShieldCoreApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface ShieldCoreApplication_GeneratedInjector {
  void injectShieldCoreApplication(ShieldCoreApplication shieldCoreApplication);
}
