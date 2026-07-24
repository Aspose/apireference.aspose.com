---
title: "JobPrintTicket"
second_title: "Aspose.Page for Java API 参考"
description: "封装作业级打印票据的类。"
type: docs
weight: 70
url: /zh/java/com.aspose.xps.metadata/jobprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class JobPrintTicket extends PrintTicket
```

封装作业级打印票据的类。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [JobPrintTicket(IJobPrintTicketItem[] items)](#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-) | 创建作业级打印票实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IJobPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IJobPrintTicketItem...-) | 将一组项目添加到此 PrintTicket 项目列表的末尾。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | 返回打印票项目名称的迭代器。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | 从此 PrintTicket 项目列表中移除一个项目。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JobPrintTicket(IJobPrintTicketItem[] items) {#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public JobPrintTicket(IJobPrintTicketItem[] items)
```


创建作业级打印票实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | 任意的 IJobPrintTicketItem 实例数组。每个实例可以是 Feature、ParameterInit 或 Property 实例。 |

### add(IJobPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public void add(IJobPrintTicketItem[] items)
```


在此 PrintTicket 项目列表的末尾添加一个项目数组。每个项目可以是 Feature、ParameterInit 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | 要添加的项目数组。 |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


返回打印票项目名称的迭代器。

**Returns:**
java.util.Iterator<java.lang.String> - 返回列表的迭代器。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


从此 PrintTicket 项目列表中移除一个项目。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | java.lang.String[] | 项目名称的数组。 |

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

