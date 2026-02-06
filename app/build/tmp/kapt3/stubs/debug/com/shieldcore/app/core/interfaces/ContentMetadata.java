package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\tH\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/shieldcore/app/core/interfaces/ContentMetadata;", "", "author", "", "timestamp", "", "mediaType", "Lcom/shieldcore/app/core/interfaces/MediaType;", "interactionCount", "", "hashtags", "", "(Ljava/lang/String;Ljava/lang/Long;Lcom/shieldcore/app/core/interfaces/MediaType;Ljava/lang/Integer;Ljava/util/List;)V", "getAuthor", "()Ljava/lang/String;", "getHashtags", "()Ljava/util/List;", "getInteractionCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediaType", "()Lcom/shieldcore/app/core/interfaces/MediaType;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lcom/shieldcore/app/core/interfaces/MediaType;Ljava/lang/Integer;Ljava/util/List;)Lcom/shieldcore/app/core/interfaces/ContentMetadata;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ContentMetadata {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String author = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long timestamp = null;
    @org.jetbrains.annotations.NotNull
    private final com.shieldcore.app.core.interfaces.MediaType mediaType = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer interactionCount = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> hashtags = null;
    
    public ContentMetadata(@org.jetbrains.annotations.Nullable
    java.lang.String author, @org.jetbrains.annotations.Nullable
    java.lang.Long timestamp, @org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.MediaType mediaType, @org.jetbrains.annotations.Nullable
    java.lang.Integer interactionCount, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> hashtags) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.MediaType getMediaType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getInteractionCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getHashtags() {
        return null;
    }
    
    public ContentMetadata() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.MediaType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.ContentMetadata copy(@org.jetbrains.annotations.Nullable
    java.lang.String author, @org.jetbrains.annotations.Nullable
    java.lang.Long timestamp, @org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.MediaType mediaType, @org.jetbrains.annotations.Nullable
    java.lang.Integer interactionCount, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> hashtags) {
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