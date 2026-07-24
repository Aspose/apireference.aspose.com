---
title: "Duplex.DuplexOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 JobDuplexAllDocumentsContiguously 和 DocumentDuplex 功能选项。"
type: docs
weight: 11
url: /zh/java/com.aspose.xps.metadata/duplex.duplexoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Duplex.DuplexOption extends Option
```

描述  JobDuplexAllDocumentsContiguously  和  DocumentDuplex  功能选项。
## 字段

| 字段 | 描述 |
| --- | --- |
| [OneSided](#OneSided) | 指定单面打印。 |
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
| [twoSidedLongEdge(Duplex.DuplexMode duplexMode)](#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | 指定双面打印，使页面沿  MediaSizeHeight  方向翻转。 |
| [twoSidedShortEdge(Duplex.DuplexMode duplexMode)](#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | 指定双面打印，使页面沿  MediaSizeWidth  方向翻转。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### OneSided {#OneSided}
```
public static final Duplex.DuplexOption OneSided
```


指定单面打印。

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
### twoSidedLongEdge(Duplex.DuplexMode duplexMode) {#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedLongEdge(Duplex.DuplexMode duplexMode)
```


指定双面打印，使页面沿  MediaSizeHeight  方向翻转。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The  Duplex  option.
### twoSidedShortEdge(Duplex.DuplexMode duplexMode) {#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedShortEdge(Duplex.DuplexMode duplexMode)
```


指定双面打印，使页面沿  MediaSizeWidth  方向翻转。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The

```
Duplex
```

选项。
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

