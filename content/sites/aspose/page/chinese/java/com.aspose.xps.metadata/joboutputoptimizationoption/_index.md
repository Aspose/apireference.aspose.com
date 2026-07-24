---
title: "JobOutputOptimization.JobOutputOptimizationOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 JobOutputOptimization 功能选项。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.metadata/joboutputoptimization.joboutputoptimizationoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobOutputOptimization.JobOutputOptimizationOption extends Option
```

描述  JobOutputOptimization  功能选项。
## 字段

| 字段 | 描述 |
| --- | --- |
| [ArchiveFormat](#ArchiveFormat) | 指定作业处理应针对归档输出进行优化。 |
| [None](#None) | 指定作业处理不应针对特定场景进行优化。 |
| [OptimizeForPortability](#OptimizeForPortability) | 指定作业处理应针对输出的可移植性（跨设备）进行优化。 |
| [OptimizeForQuality](#OptimizeForQuality) | 指定作业处理应针对输出质量进行优化。 |
| [OptimizeForSpeed](#OptimizeForSpeed) | 指定作业处理应针对输出速度进行优化。 |
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
### ArchiveFormat {#ArchiveFormat}
```
public static final JobOutputOptimization.JobOutputOptimizationOption ArchiveFormat
```


指定作业处理应针对归档输出进行优化。

### None {#None}
```
public static JobOutputOptimization.JobOutputOptimizationOption None
```


指定作业处理不应针对特定场景进行优化。

### OptimizeForPortability {#OptimizeForPortability}
```
public static final JobOutputOptimization.JobOutputOptimizationOption OptimizeForPortability
```


指定作业处理应针对输出的可移植性（跨设备）进行优化。

### OptimizeForQuality {#OptimizeForQuality}
```
public static final JobOutputOptimization.JobOutputOptimizationOption OptimizeForQuality
```


指定作业处理应针对输出质量进行优化。

### OptimizeForSpeed {#OptimizeForSpeed}
```
public static final JobOutputOptimization.JobOutputOptimizationOption OptimizeForSpeed
```


指定作业处理应针对输出速度进行优化。

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

