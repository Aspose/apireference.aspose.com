---
title: "PageBlendColorSpace.PageBlendColorSpaceOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 PageBlendColorSpace 功能选项。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.metadata/pageblendcolorspace.pageblendcolorspaceoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageBlendColorSpace.PageBlendColorSpaceOption extends Option
```

描述 PageBlendColorSpace 功能选项。
## 字段

| 字段 | 描述 |
| --- | --- |
| [ICCProfile](#ICCProfile) | 指定定义应使用的颜色空间的 ICC 配置文件，用于混合。 |
| [sRGB](#sRGB) | 应使用 sRGB 颜色空间进行混合。 |
| [scRGB](#scRGB) | 应使用 scRGB 颜色空间进行混合。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 将一系列项目添加到此选项的项目列表末尾。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 获取元素名称。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ICCProfile {#ICCProfile}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption ICCProfile
```


指定用于定义应在混合时使用的颜色空间的 ICC 配置文件。注意：此仅适用于 XPS 文档，不应在任意 PrintTickets 中使用。

### sRGB {#sRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption sRGB
```


应使用 sRGB 颜色空间进行混合。

### scRGB {#scRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption scRGB
```


应使用 scRGB 颜色空间进行混合。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


将一系列项目添加到此选项的项目列表末尾。每个项目必须是 ScoredProperty 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 要添加的项目列表。 |

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
### getName() {#getName--}
```
public String getName()
```


获取元素名称。

**Returns:**
java.lang.String
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

