---
title: "BeforePageSavingEventHandler"
second_title: "Aspose.Page for Java API 参考"
description: "页面保存前事件处理程序的基类。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.features.eventbasedmodifications/beforepagesavingeventhandler/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.xps.features.EventBasedModifications.IBeforeSavingEventHandler
```
public abstract class BeforePageSavingEventHandler implements EventBasedModifications.IBeforeSavingEventHandler<EventBasedModifications.PageAPI>
```

页面保存前事件处理程序的基类。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [BeforePageSavingEventHandler()](#BeforePageSavingEventHandler--) | 创建一个新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args)](#handle-com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs-com.aspose.xps.features.EventBasedModifications.PageAPI--) | 处理该事件。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BeforePageSavingEventHandler() {#BeforePageSavingEventHandler--}
```
public BeforePageSavingEventHandler()
```


创建一个新实例。

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
### handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args) {#handle-com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs-com.aspose.xps.features.EventBasedModifications.PageAPI--}
```
public abstract void handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args)
```


处理该事件。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| args | com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs<com.aspose.xps.features.EventBasedModifications.PageAPI> | 事件参数。 |

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

