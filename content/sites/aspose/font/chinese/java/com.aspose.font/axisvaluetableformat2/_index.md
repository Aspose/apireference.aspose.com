---
title: "AxisValueTableFormat2"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示轴值表格式 2"
type: docs
weight: 14
url: /zh/java/com.aspose.font/axisvaluetableformat2/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.AxisValueTableBase](../../com.aspose.font/axisvaluetablebase)
```
public class AxisValueTableFormat2 extends AxisValueTableBase
```

表示轴值表格式 2
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue)](#AxisValueTableFormat2-int-int-int-float-float-float-) | 构造函数 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisIndex()](#getAxisIndex--) | 获取轴记录数组中的零基索引，该索引标识轴值表适用的设计变体轴。 |
| [getClass()](#getClass--) |  |
| [getFlags()](#getFlags--) | 获取轴值表标志字段。 |
| [getFormat()](#getFormat--) | 获取格式标识符（版本号）。 |
| [getNominalValue()](#getNominalValue--) | 名义数值 |
| [getRangeMaxValue()](#getRangeMaxValue--) | 与指定名称 ID 关联的范围的最大值。 |
| [getRangeMinValue()](#getRangeMinValue--) | 与指定名称 ID 关联的范围的最小值。 |
| [getValueName()](#getValueName--) | 获取 'name' 表中的名称，为此属性值提供显示字符串。 |
| [getValueNameId()](#getValueNameId--) | 获取 'name' 表中条目的名称 ID，为此属性值提供显示字符串。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue) {#AxisValueTableFormat2-int-int-int-float-float-float-}
```
public AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue)
```


构造函数

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标志 | int | 标志 |
| valueNameId | int | 用于 'name' 表中条目提供此属性值显示字符串的名称 ID |
| axisIndex | int | 规范：指向轴记录数组的零基索引，用于标识设计变体的轴，该轴值表适用于此轴。必须小于 designAxisCount。 |
| nominalValue | float | 此属性值的标称数值。 |
| rangeMinValue | float | 与指定名称 ID 关联的范围的最小值。 |
| rangeMaxValue | float | 与指定名称 ID 关联的范围的最大值。 |

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


获取轴记录数组中的零基索引，该索引标识轴值表适用的设计变体轴。

**Returns:**
int - 零基索引，在轴记录数组中标识适用于轴值表的设计变体轴。
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
### getNominalValue() {#getNominalValue--}
```
public float getNominalValue()
```


名义数值

**Returns:**
float - 标称数值
### getRangeMaxValue() {#getRangeMaxValue--}
```
public float getRangeMaxValue()
```


与指定名称 ID 关联的范围的最大值。

**Returns:**
float - 与指定名称 ID 关联的范围的最大值。
### getRangeMinValue() {#getRangeMinValue--}
```
public float getRangeMinValue()
```


与指定名称 ID 关联的范围的最小值。

**Returns:**
float - 与指定名称 ID 关联的范围的最小值。
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

