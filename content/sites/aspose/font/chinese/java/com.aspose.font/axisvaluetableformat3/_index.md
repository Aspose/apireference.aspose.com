---
title: "AxisValueTableFormat3"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示轴值表格式 3"
type: docs
weight: 15
url: /zh/java/com.aspose.font/axisvaluetableformat3/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.AxisValueTableBase](../../com.aspose.font/axisvaluetablebase)
```
public class AxisValueTableFormat3 extends AxisValueTableBase
```

表示轴值表格式 3
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [AxisValueTableFormat3(int flags, int valueNameId, int axisIndex, float value, float linkedValue)](#AxisValueTableFormat3-int-int-int-float-float-) | 构造函数 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisIndex()](#getAxisIndex--) | 获取指向轴记录数组的零基索引，用于标识设计变体的轴，该轴值表适用于此轴。 |
| [getClass()](#getClass--) |  |
| [getFlags()](#getFlags--) | 获取轴值表标志字段。 |
| [getFormat()](#getFormat--) | 获取格式标识符（版本号）。 |
| [getLinkedValue()](#getLinkedValue--) | 此值的样式关联映射的数值。 |
| [getValue()](#getValue--) | 此属性值的数值。 |
| [getValueName()](#getValueName--) | 获取 'name' 表中的名称，为此属性值提供显示字符串。 |
| [getValueNameId()](#getValueNameId--) | 获取 'name' 表中条目的名称 ID，为此属性值提供显示字符串。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisValueTableFormat3(int flags, int valueNameId, int axisIndex, float value, float linkedValue) {#AxisValueTableFormat3-int-int-int-float-float-}
```
public AxisValueTableFormat3(int flags, int valueNameId, int axisIndex, float value, float linkedValue)
```


构造函数

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标志 | int | 标志 |
| valueNameId | int | 用于 'name' 表中条目提供此属性值显示字符串的名称 ID |
| axisIndex | int | 规范：指向轴记录数组的零基索引，用于标识设计变体的轴，该轴值表适用于此轴。必须小于 designAxisCount。 |
| 值 | float | 此属性值的数值。 |
| linkedValue | float | 此值的样式关联映射的数值。 |

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
### getAxisIndex() {#getAxisIndex--}
```
public int getAxisIndex()
```


获取指向轴记录数组的零基索引，用于标识设计变体的轴，该轴值表适用于此轴。

**Returns:**
int - 零基索引，指向轴记录数组，用于标识轴值表适用的设计变体轴。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFlags() {#getFlags--}
```
public int getFlags()
```


获取轴值表标志字段。

**Returns:**
int - 轴值表标志字段。
### getFormat() {#getFormat--}
```
public int getFormat()
```


获取格式标识符（版本号）。

**Returns:**
int - 格式标识符（版本号）。
### getLinkedValue() {#getLinkedValue--}
```
public float getLinkedValue()
```


此值的样式关联映射的数值。

**Returns:**
float - 此值的样式关联映射的数值。
### getValue() {#getValue--}
```
public float getValue()
```


此属性值的数值。

**Returns:**
float - 此属性值的数值。
### getValueName() {#getValueName--}
```
public String getValueName()
```


获取 'name' 表中的名称，为此属性值提供显示字符串。

**Returns:**
java.lang.String - 来自 'name' 表的名称，为此属性值提供显示字符串。
### getValueNameId() {#getValueNameId--}
```
public int getValueNameId()
```


获取 'name' 表中条目的名称 ID，为此属性值提供显示字符串。

**Returns:**
int - 'name' 表中条目的名称 ID，用于为此属性值提供显示字符串。
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

