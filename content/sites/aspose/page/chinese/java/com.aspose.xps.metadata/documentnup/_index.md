---
title: "DocumentNUp"
second_title: "Aspose.Page for Java API 参考"
description: "描述将多个逻辑页面输出到单张物理纸张的格式和方式。"
type: docs
weight: 28
url: /zh/java/com.aspose.xps.metadata/documentnup/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentNUp extends NUp implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

描述将多个逻辑页输出到单张物理纸张的方式和格式。每个文档分别编译。DocumentNUp 和 JobNUpAllDocumentsContiguously 互斥。具体的约束处理由驱动程序决定。https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [DocumentNUp(NUp.INUpItem[] items)](#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-) | 创建一个新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | 将一系列项目添加到此功能的项目列表末尾。 |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | 添加一个带有  PagesPerSheet  计分属性值的选项。 |
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
### DocumentNUp(NUp.INUpItem[] items) {#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public DocumentNUp(NUp.INUpItem[] items)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [INUpItem\[\]](../../com.aspose.xps.metadata/inupitem) | 特定于该功能的项目数组。 |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


将一系列项目添加到此功能的项目列表末尾。每个项目必须是 Feature、Option 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | 要添加的项目列表。 |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public DocumentNUp addPagesPerSheetOption(int value)
```


添加一个带有  PagesPerSheet  计分属性值的选项。指定每个物理纸张上的逻辑页面数量。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
|  | 值 | int | A |

```
PagesPerSheet
```

计分属性值。支持的集合可以是任意整数集合，例如 \{1,2,4,6,8,9,16\}。 |

**Returns:**
[DocumentNUp](../../com.aspose.xps.metadata/documentnup) - This feature instance.
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

