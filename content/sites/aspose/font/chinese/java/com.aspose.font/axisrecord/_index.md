---
title: "AxisRecord"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示轴记录结构。"
type: docs
weight: 10
url: /zh/java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

表示 Axis Record 结构。规范：该轴记录提供有关单个设计轴的信息。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | 构造函数 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | 返回 axisNameID 字段。 |
| [getAxisOrdering()](#getAxisOrdering--) | 返回 axisOrdering 字段。 |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | 返回一个标识设计变体轴的 tag。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


构造函数

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tag | java.lang.String | Tag，规范：标识设计变体轴的标签 |
| axisNameId | int | 用于在 'name' 表中为此轴提供显示字符串的条目的名称 ID |
| axisOrdering | int | 应用程序可用于确定字形名称的主要排序，或在组合系列或字形名称时对标签进行排序的值。 |

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
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


返回 axisNameID 字段。规范：axisNameID 字段提供一个名称 ID，可用于从 'name' 表中获取字符串，以在应用程序用户界面中引用该轴。

**Returns:**
int - axisNameID 字段。
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


返回 axisOrdering 字段。规范：一个值，应用程序可用于确定字形名称的主要排序，或在组合系列或字形名称时对标签进行排序。

**Returns:**
int - axisOrdering 字段。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


返回一个标识设计变体轴的 tag。规范：每个轴记录都有一个指定该轴的 tag。tag 值必须遵循 OpenType 设计变体轴标签注册表中描述的轴标签规则。

**Returns:**
java.lang.String - 标识设计变体轴的 tag。
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

