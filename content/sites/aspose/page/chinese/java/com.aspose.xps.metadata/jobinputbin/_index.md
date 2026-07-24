---
title: "JobInputBin"
second_title: "Aspose.Page for Java API 参考"
description: "描述设备中已安装的输入纸盒或设备支持的全部纸盒列表。"
type: docs
weight: 57
url: /zh/java/com.aspose.xps.metadata/jobinputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.InputBin](../../com.aspose.xps.metadata/inputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobInputBin extends InputBin implements IJobPrintTicketItem
```

描述设备中已安装的输入盒或设备支持的全部输入盒列表。允许在每个作业基础上指定输入盒。JobInputBin、DocumentInputBin 和 PageInputBin 关键字相互排斥。它们不应在 PrintTicket 或 Print Capabilities 文档中同时指定。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [JobInputBin(InputBin.IInputBinItem[] items)](#JobInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-) | 创建一个新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | 将一系列项目添加到此功能的项目列表末尾。 |
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
### JobInputBin(InputBin.IInputBinItem[] items) {#JobInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-}
```
public JobInputBin(InputBin.IInputBinItem[] items)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IInputBinItem\[\]](../../com.aspose.xps.metadata/iinputbinitem) | 特定于该功能的项目数组。 |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


将一系列项目添加到此功能的项目列表末尾。每个项目必须是 Feature、Option 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | 要添加的项目列表。 |

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

