---
title: "JobRollCutAtEndOfJob"
second_title: "Aspose.Page for Java API 参考"
description: "描述卷纸的切割方式。"
type: docs
weight: 71
url: /zh/java/com.aspose.xps.metadata/jobrollcutatendofjob/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.RollCut](../../com.aspose.xps.metadata/rollcut)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobRollCutAtEndOfJob extends RollCut implements IJobPrintTicketItem
```

描述卷纸的切割方法。卷纸应在作业结束时切割。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobrollcutatendofjob
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [JobRollCutAtEndOfJob(RollCut.RollCutOption[] options)](#JobRollCutAtEndOfJob-com.aspose.xps.metadata.RollCut.RollCutOption...-) | 创建一个新实例。 |
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
### JobRollCutAtEndOfJob(RollCut.RollCutOption[] options) {#JobRollCutAtEndOfJob-com.aspose.xps.metadata.RollCut.RollCutOption...-}
```
public JobRollCutAtEndOfJob(RollCut.RollCutOption[] options)
```


创建一个新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [RollCutOption\[\]](../../com.aspose.xps.metadata/rollcutoption) | 针对该功能的特定选项数组。 |

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

