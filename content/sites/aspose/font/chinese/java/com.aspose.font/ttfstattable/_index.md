---
title: "TtfStatTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: 
type: docs
weight: 109
url: /zh/java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## 方法

| 方法 | 描述 |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | 向表中添加 Axis Record 结构。 |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | 向表中添加 Axis Value Table 结构。 |
| [clearAxisRecords()](#clearAxisRecords--) | 从表中移除所有 Axis Record。 |
| [clearAxisValueTables()](#clearAxisValueTables--) | 从表中移除所有 Axis Value Table。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | 返回设计轴数组。 |
| [getAxisValueCount()](#getAxisValueCount--) | 返回轴值表的数量。 |
| [getAxisValueTables()](#getAxisValueTables--) | 返回 Axis Value Table 数组。 |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | 返回 Axis Record 的数量。 |
| [getElidedFallbackName()](#getElidedFallbackName--) | Spec: 当将名称投射到特定字体模型后产生仅包含可省略元素的子族名称时使用的备用名称。 |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Spec: 当将名称投射到特定字体模型后产生仅包含可省略元素的子族名称时使用的备用名称 ID。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addAxisRecord(AxisRecord axisRecord) {#addAxisRecord-com.aspose.font.AxisRecord-}
```
public void addAxisRecord(AxisRecord axisRecord)
```


向表中添加 Axis Record 结构。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | AxisRecord 结构 |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


向表中添加 Axis Value Table 结构。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | Axis Value Table 结构 |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


从表中移除所有 Axis Record。

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


从表中移除所有 Axis Value Table。

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
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


返回设计轴数组。轴数组是 Axis Record 类型结构的数组。Spec: 该轴记录提供有关单个设计轴的信息。

**Returns:**
com.aspose.font.AxisRecord[] - 设计轴数组。
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


返回轴值表的数量。

**Returns:**
int - Axis Value Table 的数量。
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


返回 Axis Value Table 数组。Spec: Axis Value Table 提供关于设计变体某特定轴上的特定样式属性值，或设计变体轴值组合的详细信息，以及这些值与用作子族名称元素的标签之间的关系。

**Returns:**
com.aspose.font.AxisValueTableBase[] - 轴值表数组。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDesignAxisCount() {#getDesignAxisCount--}
```
public int getDesignAxisCount()
```


Returns the number of axis records. Spec: in a font with an 'fvar' table, this value must be greater than or equal to the axisCount value in the 'fvar' table. In all fonts, must be greater than zero if axisValueCount is greater than zero.

**Returns:**
int - 轴记录的数量。
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Spec: 当将名称投射到特定字体模型后产生仅包含可省略元素的子族名称时使用的备用名称。

**Returns:**
java.lang.String - 当将名称投射到特定字体模型并产生仅包含可省略元素的子族名称时使用的回退名称。
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Spec: 当将名称投射到特定字体模型后产生仅包含可省略元素的子族名称时使用的备用名称 ID。

**Returns:**
int - 名称 ID。
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取自 sfnt 开始的偏移量。

**Returns:**
long - 自 sfnt 开始的偏移量。
### getTag() {#getTag--}
```
public static String getTag()
```


获取表标签。

**Returns:**
java.lang.String - 表标签。
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


指向 TTF 表仓库的引用。

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
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

