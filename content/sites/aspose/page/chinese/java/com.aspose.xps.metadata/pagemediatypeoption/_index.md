---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 PageMediaType 功能选项。"
type: docs
weight: 13
url: /zh/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

描述  PageMediaType  功能选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | 创建一个新实例。 |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | 克隆此选项实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| [Archival](#Archival) | 指定档案级质量的介质。 |
| [AutoSelect](#AutoSelect) | 指定媒体将自动选择。 |
| [BackPrintFilm](#BackPrintFilm) | 指定特殊背面印刷胶片介质。 |
| [Bond](#Bond) | 指定标准粘合介质。 |
| [CardStock](#CardStock) | 指定标准卡纸介质。 |
| [Continous](#Continous) | 指定连续供纸介质。 |
| [EnvelopePlain](#EnvelopePlain) | 指定标准信封介质。 |
| [EnvelopeWindow](#EnvelopeWindow) | 指定带窗信封介质。 |
| [Fabric](#Fabric) | 指定织物介质。 |
| [HighResolution](#HighResolution) | 指定特殊高分辨率介质。 |
| [Label](#Label) | 指定标签介质。 |
| [MultiLayerForm](#MultiLayerForm) | 指定附加式多部分表单介质。 |
| [MultiPartForm](#MultiPartForm) | 指定分离式多部分表单介质。 |
| [None](#None) | 指定未知或未列出的介质。 |
| [Photographic](#Photographic) | 指定标准摄影介质。 |
| [PhotographicFilm](#PhotographicFilm) | 指定胶片摄影介质。 |
| [PhotographicGlossy](#PhotographicGlossy) | 指定光面摄影介质。 |
| [PhotographicHighGloss](#PhotographicHighGloss) | 指定高光面摄影介质。 |
| [PhotographicMatte](#PhotographicMatte) | 指定哑光摄影介质。 |
| [PhotographicSatin](#PhotographicSatin) | 指定缎面摄影介质。 |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | 指定半光面摄影介质。 |
| [Plain](#Plain) | 指定标准纸张介质。 |
| [Screen](#Screen) | 指定以连续形式输出到输出显示器。 |
| [ScreenPaged](#ScreenPaged) | 指定以分页形式输出到输出显示器。 |
| [Stationary](#Stationary) | 指定特殊文具介质。 |
| [TShirtTransfer](#TShirtTransfer) | 指定特殊T恤转印介质。 |
| [TabStockFull](#TabStockFull) | 指定未预切割的标签纸介质（单个标签）。 |
| [TabStockPreCut](#TabStockPreCut) | 指定已预切割的标签纸介质（多个标签）。 |
| [Transparency](#Transparency) | 指定透明介质。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 将一系列项目添加到此选项的项目列表末尾。 |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | 向选项添加一个 IPageMediaTypeOptionItem 实例数组。 |
| [clone()](#clone--) | 克隆此选项实例。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 获取元素名称。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | 设置一个 Weight 计分属性值。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| optionName | java.lang.String | 一个选项名称。 |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | 任意的 IPageMediaTypeOptionItem 实例数组。 |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


克隆此选项实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | 要克隆的实例。 |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


指定档案级质量的介质。

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


指定媒体将自动选择。

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


指定特殊背面印刷胶片介质。

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


指定标准粘合介质。

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


指定标准卡纸介质。

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


指定连续供纸介质。

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


指定标准信封介质。

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


指定带窗信封介质。

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


指定织物介质。

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


指定特殊高分辨率介质。

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


指定标签介质。

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


指定附加式多部分表单介质。

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


指定分离式多部分表单介质。

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


指定未知或未列出的介质。

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


指定标准摄影介质。

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


指定胶片摄影介质。

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


指定光面摄影介质。

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


指定高光面摄影介质。

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


指定哑光摄影介质。

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


指定缎面摄影介质。

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


指定半光面摄影介质。

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


指定标准纸张介质。

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


指定以连续形式输出到输出显示器。

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


指定以分页形式输出到输出显示器。

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


指定特殊文具介质。

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


指定特殊T恤转印介质。

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


指定未预切割的标签纸介质（单个标签）。

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


指定已预切割的标签纸介质（多个标签）。

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


指定透明介质。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


将一系列项目添加到此选项的项目列表末尾。每个项目必须是 ScoredProperty 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 要添加的项目列表。 |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


向选项添加一个 IPageMediaTypeOptionItem 实例数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | 任意的 IPageMediaTypeOptionItem 实例数组。 |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


克隆此选项实例。这是克隆构造函数的快捷方式。

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


设置一个 Weight 计分属性值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 权重 | int | 一个 Weight 计分属性值。 |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

