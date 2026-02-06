package com.shieldcore.app.accessibility;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = ShieldCoreAccessibilityService.class
)
@GeneratedEntryPoint
@InstallIn(ServiceComponent.class)
public interface ShieldCoreAccessibilityService_GeneratedInjector {
  void injectShieldCoreAccessibilityService(
      ShieldCoreAccessibilityService shieldCoreAccessibilityService);
}
