---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 JobPrimaryCoverBack 功能选项。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

描述  JobPrimaryCoverBack  功能选项。
## 字段

| 字段 | 描述 |
| --- | --- |
| [BlankCover](#BlankCover) | 指定应打印空白封面页。 |
| [NoCover](#NoCover) | 指定不输出封面。 |
| [PrintBack](#PrintBack) | 指定由 "CoverBackSource" 指示的封面应打印在封面纸的背面。 |
| [PrintBoth](#PrintBoth) | 指定由 "CoverBackSource" 指示的封面可以打印在封面纸的任一面。 |
| [PrintFront](#PrintFront) | 指定由 "CoverBackSource" 指示的封面应打印在封面纸的正面。 |
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
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


指定应打印空白封面页。

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


指定不输出封面。

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


指定由 "CoverBackSource" 指示的封面应打印在封面纸的背面。如果未指定 JobPrimaryCoverBackSource ParameterInit 元素，则应忽略此选项。

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


指定由 "CoverBackSource" 指示的封面可以打印在封面纸的任一面。如果未指定 JobPrimaryCoverBackSource ParameterInit 元素，则应忽略此选项。

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


指定由 "CoverBackSource" 指示的封面应打印在封面纸的正面。如果未指定 JobPrimaryCoverBackSource ParameterInit 元素，则应忽略此选项。

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

