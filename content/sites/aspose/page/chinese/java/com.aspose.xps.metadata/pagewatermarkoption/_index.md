---
title: "PageWatermark.PageWatermarkOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 PageWatermark 功能选项。"
type: docs
weight: 12
url: /zh/java/com.aspose.xps.metadata/pagewatermark.pagewatermarkoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem](../../com.aspose.xps.metadata/ipagewatermarkitem)
```
public static final class PageWatermark.PageWatermarkOption extends Option implements PageWatermark.IPageWatermarkItem
```

描述 PageWatermark 功能选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)](#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | 创建一个新实例。 |
| [PageWatermarkOption(PageWatermark.PageWatermarkOption option)](#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-) | 克隆此选项实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| [Text](#Text) | 指定仅文本水印。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 将一系列项目添加到此选项的项目列表末尾。 |
| [add(PageWatermark.IPageWatermarkOptionItem[] items)](#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | 向选项添加一个  IPageWatermarkOptionItem  实例数组。 |
| [clone()](#clone--) | 克隆此选项实例。 |
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
### PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items) {#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| optionName | java.lang.String | 一个选项名称。 |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | 任意的  IPageWatermarkOptionItem  实例数组。 |

### PageWatermarkOption(PageWatermark.PageWatermarkOption option) {#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-}
```
public PageWatermarkOption(PageWatermark.PageWatermarkOption option)
```


克隆此选项实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| option | [PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) | 要克隆的实例。 |

### Text {#Text}
```
public static PageWatermark.PageWatermarkOption Text
```


指定仅文本水印。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


将一系列项目添加到此选项的项目列表末尾。每个项目必须是 ScoredProperty 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 要添加的项目列表。 |

### add(PageWatermark.IPageWatermarkOptionItem[] items) {#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermark.PageWatermarkOption add(PageWatermark.IPageWatermarkOptionItem[] items)
```


向选项添加一个  IPageWatermarkOptionItem  实例数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | 任意的  IPageWatermarkOptionItem  实例数组。 |

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - This options instance.
### clone() {#clone--}
```
public PageWatermark.PageWatermarkOption clone()
```


克隆此选项实例。这是克隆构造函数的快捷方式。

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - The clone of this option instance.
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

