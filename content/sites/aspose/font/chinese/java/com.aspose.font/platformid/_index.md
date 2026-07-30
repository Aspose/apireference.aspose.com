---
title: "PlatformId"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 PlatformId 枚举。"
type: docs
weight: 141
url: /zh/java/com.aspose.font/platformid/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PlatformId extends Enum<PlatformId>
```

表示 PlatformId 枚举。
## 字段

| 字段 | 描述 |
| --- | --- |
| [ISO](#ISO) | Value2 Apple 规范:（保留；请勿使用）MS 规范: ISO 编码。 |
| [Macintosh](#Macintosh) | Value 1 Macintosh 脚本管理器代码。 |
| [Microsoft](#Microsoft) | Value 3 Microsoft 编码。 |
| [Unicode](#Unicode) | Value 0 Unicode |
## 方法

| 方法 | 描述 |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ISO {#ISO}
```
public static final PlatformId ISO
```


Value2 Apple 规范:（保留；请勿使用）MS 规范: ISO 编码。注意，平台 ID 2（ISO）已在 OpenType 规范 v1.3 中弃用。它原本用于表示 ISO/IEC 10646，而非 Unicode；两者的字符代码分配完全相同。

### Macintosh {#Macintosh}
```
public static final PlatformId Macintosh
```


Value 1 Macintosh 脚本管理器代码。

### Microsoft {#Microsoft}
```
public static final PlatformId Microsoft
```


Value 3 Microsoft 编码。

### Unicode {#Unicode}
```
public static final PlatformId Unicode
```


Value 0 Unicode

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PlatformId valueOf(String name)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String |  |

**Returns:**
[PlatformId](../../com.aspose.font/platformid)
### values() {#values--}
```
public static PlatformId[] values()
```




**Returns:**
com.aspose.font.PlatformId[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

