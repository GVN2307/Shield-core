package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\tH\u00d6\u0001R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/shieldcore/app/core/interfaces/ActivityLog;", "", "timestamp", "", "event", "Lcom/shieldcore/app/core/interfaces/ActivityEvent;", "contentCategory", "Lcom/shieldcore/app/core/interfaces/ContentCategory;", "sourceApp", "", "actionTaken", "(JLcom/shieldcore/app/core/interfaces/ActivityEvent;Lcom/shieldcore/app/core/interfaces/ContentCategory;Ljava/lang/String;Ljava/lang/String;)V", "getActionTaken", "()Ljava/lang/String;", "getContentCategory", "()Lcom/shieldcore/app/core/interfaces/ContentCategory;", "getEvent", "()Lcom/shieldcore/app/core/interfaces/ActivityEvent;", "getSourceApp", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ActivityLog {
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull
    private final com.shieldcore.app.core.interfaces.ActivityEvent event = null;
    @org.jetbrains.annotations.Nullable
    private final com.shieldcore.app.core.interfaces.ContentCategory contentCategory = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sourceApp = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionTaken = null;
    
    public ActivityLog(long timestamp, @org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ActivityEvent event, @org.jetbrains.annotations.Nullable
    com.shieldcore.app.core.interfaces.ContentCategory contentCategory, @org.jetbrains.annotations.NotNull
    java.lang.String sourceApp, @org.jetbrains.annotations.NotNull
    java.lang.String actionTaken) {
        super();
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.ActivityEvent getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.shieldcore.app.core.interfaces.ContentCategory getContentCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSourceApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionTaken() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.ActivityEvent component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.shieldcore.app.core.interfaces.ContentCategory component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.ActivityLog copy(long timestamp, @org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ActivityEvent event, @org.jetbrains.annotations.Nullable
    com.shieldcore.app.core.interfaces.ContentCategory contentCategory, @org.jetbrains.annotations.NotNull
    java.lang.String sourceApp, @org.jetbrains.annotations.NotNull
    java.lang.String actionTaken) {
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