---
title: "TtfEncodingParameters"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 编码参数。"
type: docs
weight: 93
url: /zh/java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

表示 TTF 编码参数。应用于从 TTF 字体请求特定编码。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | 初始化 TtfEncodingParameters 类的新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | 获取 PlatformId 值。 |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | 获取 PlatformSpecificId 值。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | 设置 PlatformId 值。 |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | 设置 PlatformSpecificId 值。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


初始化 TtfEncodingParameters 类的新实例。接受 Platform Id 和 Platform-specific 编码 id 作为参数。这些参数用于从主字体 CMap 表请求特殊的 CMap 子表，详见 OpenType 字体文件规范中的表 'CMap'、'name'。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | int | 平台 id。 |
| platformSpecificId | int | 平台特定编码 id。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
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
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


获取 PlatformId 值。

**Returns:**
int - PlatformId 值。
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


获取 PlatformSpecificId 值。

**Returns:**
int - PlatformSpecificId 值。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


设置 PlatformId 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | PlatformId 值。 |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


设置 PlatformSpecificId 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | PlatformSpecificId 值。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

