---
title: "Cache"
linktitle: "Cache"
second_title: "Aspose.CAD for Java"
description: "Contains cache settings."
type: docs
weight: 10
url: /java/com.aspose.cad/cache/
---

Contains cache settings.

## Fields

| Field | Description |
| --- | --- |
| [Reallocated](#Reallocated) |  |

## Methods

| Method | Description |
| --- | --- |
| [getExactReallocateOnly()](#getExactReallocateOnly) | Gets or sets a value indicating whether reallocation should be exact or not. If reallocation is non exact the performance should be higher. |
| [setExactReallocateOnly(boolean value)](#setExactReallocateOnly-boolean) | Gets or sets a value indicating whether reallocation should be exact or not. If reallocation is non exact the performance should be higher. |
| [getCacheFolder()](#getCacheFolder) | Gets or sets the cache folder. |
| [setCacheFolder(String value)](#setCacheFolder-java.lang.String) | Gets or sets the cache folder. |
| [getAllocatedMemoryBytesCount()](#getAllocatedMemoryBytesCount) | Gets the allocated in-memory bytes count. |
| [getAllocatedDiskBytesCount()](#getAllocatedDiskBytesCount) | Gets the allocated disk bytes count. |
| [getMaxMemoryForCache()](#getMaxMemoryForCache) | Gets or sets the maximum available memory for cache in memory. The value specified is megabytes count. |
| [setMaxMemoryForCache(int value)](#setMaxMemoryForCache-int) | Gets or sets the maximum available memory for cache in memory. The value specified is megabytes count. |
| [getMaxDiskSpaceForCache()](#getMaxDiskSpaceForCache) | Gets or sets the maximum available disk space for cache. The value specified is megabytes count. |
| [setMaxDiskSpaceForCache(int value)](#setMaxDiskSpaceForCache-int) | Gets or sets the maximum available disk space for cache. The value specified is megabytes count. |
| [getCacheType()](#getCacheType) | Gets or sets the cache scheme used. |
| [setCacheType(int value)](#setCacheType-int) | Gets or sets the cache scheme used. |
| [setDefaults()](#setDefaults) | Sets the Cache settings to defaults. |

### Reallocated {#Reallocated}
```java
public static final com.aspose.ms.lang.Event<com.aspose.ms.System.EventHandler> Reallocated
```

**Returns:** com.aspose.ms.lang.Event<com.aspose.ms.System.EventHandler>

### getExactReallocateOnly() {#getExactReallocateOnly}
```java
public static boolean getExactReallocateOnly()
```

Gets or sets a value indicating whether reallocation should be exact or not. If reallocation is non exact the performance should be higher.

**Returns:** boolean - true if reallocation is exact; otherwise, false . The exact reallocation will perform reallocation of additional memory only up to the upper limit specified. When passing upper limit for in-memory during reallocation the cached data will be copied to disk if possible. When passing upper limit for disk memory during reallocation the appropriate exception is thrown. The performance should be higher if this option is turned off as no additional copying will be performed if possible, however this may also lead to pass upper limits specified for memory or disk.

### setExactReallocateOnly(boolean value) {#setExactReallocateOnly-boolean}
```java
public static void setExactReallocateOnly(boolean value)
```

Gets or sets a value indicating whether reallocation should be exact or not. If reallocation is non exact the performance should be higher.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if reallocation is exact; otherwise, false . The exact reallocation will perform reallocation of additional memory only up to the upper limit specified. When passing upper limit for in-memory during reallocation the cached data will be copied to disk if possible. When passing upper limit for disk memory during reallocation the appropriate exception is thrown. The performance should be higher if this option is turned off as no additional copying will be performed if possible, however this may also lead to pass upper limits specified for memory or disk. |

### getCacheFolder() {#getCacheFolder}
```java
public static String getCacheFolder()
```

Gets or sets the cache folder.

**Returns:** String - The cache folder.

### setCacheFolder(String value) {#setCacheFolder-java.lang.String}
```java
public static void setCacheFolder(String value)
```

Gets or sets the cache folder.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The cache folder. |

### getAllocatedMemoryBytesCount() {#getAllocatedMemoryBytesCount}
```java
public static long getAllocatedMemoryBytesCount()
```

Gets the allocated in-memory bytes count.

**Returns:** long - The allocated in-memory bytes count.

### getAllocatedDiskBytesCount() {#getAllocatedDiskBytesCount}
```java
public static long getAllocatedDiskBytesCount()
```

Gets the allocated disk bytes count.

**Returns:** long - The allocated disk bytes count.

### getMaxMemoryForCache() {#getMaxMemoryForCache}
```java
public static int getMaxMemoryForCache()
```

Gets or sets the maximum available memory for cache in memory. The value specified is megabytes count.

**Returns:** int - The maximum memory for cache. Value of 0 will consume all available memory and serves as no upper limit.

### setMaxMemoryForCache(int value) {#setMaxMemoryForCache-int}
```java
public static void setMaxMemoryForCache(int value)
```

Gets or sets the maximum available memory for cache in memory. The value specified is megabytes count.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The maximum memory for cache. Value of 0 will consume all available memory and serves as no upper limit. |

### getMaxDiskSpaceForCache() {#getMaxDiskSpaceForCache}
```java
public static int getMaxDiskSpaceForCache()
```

Gets or sets the maximum available disk space for cache. The value specified is megabytes count.

**Returns:** int - The maximum available disk space for cache. Value of 0 will consume all available memory and serves as no upper limit.

### setMaxDiskSpaceForCache(int value) {#setMaxDiskSpaceForCache-int}
```java
public static void setMaxDiskSpaceForCache(int value)
```

Gets or sets the maximum available disk space for cache. The value specified is megabytes count.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The maximum available disk space for cache. Value of 0 will consume all available memory and serves as no upper limit. |

### getCacheType() {#getCacheType}
```java
public static int getCacheType()
```

Gets or sets the cache scheme used.

**Returns:** int - The cache scheme used.

### setCacheType(int value) {#setCacheType-int}
```java
public static void setCacheType(int value)
```

Gets or sets the cache scheme used.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The cache scheme used. |

### setDefaults() {#setDefaults}
```java
public static void setDefaults()
```

Sets the Cache settings to defaults.

