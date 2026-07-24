---
title: "OutputBin.OutputBinOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 JobOutputBin、DocumentOutputBin 和 PageOutputBin 功能选项。"
type: docs
weight: 12
url: /zh/java/com.aspose.xps.metadata/outputbin.outputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.OutputBin.IOutputBinItem](../../com.aspose.xps.metadata/ioutputbinitem)
```
public static final class OutputBin.OutputBinOption extends Option implements OutputBin.IOutputBinItem
```

描述  JobOutputBin、DocumentOutputBin 和 PageOutputBin 功能选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [OutputBinOption(OutputBin.IOutputBinOptionItem[] items)](#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | 创建一个新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 将一系列项目添加到此选项的项目列表末尾。 |
| [add(OutputBin.IOutputBinOptionItem[] items)](#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | 向该功能添加一个 IOutputBinOptionItem 实例数组。 |
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
### OutputBinOption(OutputBin.IOutputBinOptionItem[] items) {#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBinOption(OutputBin.IOutputBinOptionItem[] items)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | 任意的 IOutputBinOptionItem 实例数组。 |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


将一系列项目添加到此选项的项目列表末尾。每个项目必须是 ScoredProperty 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 要添加的项目列表。 |

### add(OutputBin.IOutputBinOptionItem[] items) {#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBin.OutputBinOption add(OutputBin.IOutputBinOptionItem[] items)
```


向该功能添加一个 IOutputBinOptionItem 实例数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | 任意的 IOutputBinOptionItem 实例数组。 |

**Returns:**
[OutputBinOption](../../com.aspose.xps.metadata/outputbinoption) - This options instance.
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

