package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\fH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JY\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\fH\u00d6\u0001J\t\u0010\"\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/shieldcore/app/core/interfaces/ShieldCoreConfig;", "", "enabledCategories", "", "Lcom/shieldcore/app/core/interfaces/ContentCategory;", "sensitivityLevels", "", "", "parentFaceIds", "", "", "privilegeTimeoutMinutes", "", "targetApplications", "(Ljava/util/Set;Ljava/util/Map;Ljava/util/List;ILjava/util/List;)V", "getEnabledCategories", "()Ljava/util/Set;", "getParentFaceIds", "()Ljava/util/List;", "getPrivilegeTimeoutMinutes", "()I", "getSensitivityLevels", "()Ljava/util/Map;", "getTargetApplications", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ShieldCoreConfig {
    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.shieldcore.app.core.interfaces.ContentCategory> enabledCategories = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<com.shieldcore.app.core.interfaces.ContentCategory, java.lang.Float> sensitivityLevels = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> parentFaceIds = null;
    private final int privilegeTimeoutMinutes = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> targetApplications = null;
    
    public ShieldCoreConfig(@org.jetbrains.annotations.NotNull
    java.util.Set<? extends com.shieldcore.app.core.interfaces.ContentCategory> enabledCategories, @org.jetbrains.annotations.NotNull
    java.util.Map<com.shieldcore.app.core.interfaces.ContentCategory, java.lang.Float> sensitivityLevels, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> parentFaceIds, int privilegeTimeoutMinutes, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> targetApplications) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.shieldcore.app.core.interfaces.ContentCategory> getEnabledCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<com.shieldcore.app.core.interfaces.ContentCategory, java.lang.Float> getSensitivityLevels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getParentFaceIds() {
        return null;
    }
    
    public final int getPrivilegeTimeoutMinutes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTargetApplications() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.shieldcore.app.core.interfaces.ContentCategory> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<com.shieldcore.app.core.interfaces.ContentCategory, java.lang.Float> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.ShieldCoreConfig copy(@org.jetbrains.annotations.NotNull
    java.util.Set<? extends com.shieldcore.app.core.interfaces.ContentCategory> enabledCategories, @org.jetbrains.annotations.NotNull
    java.util.Map<com.shieldcore.app.core.interfaces.ContentCategory, java.lang.Float> sensitivityLevels, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> parentFaceIds, int privilegeTimeoutMinutes, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> targetApplications) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}