---
title: TtfStatTable
second_title: Aspose.Font for Java API Reference
description: 
type: docs
weight: 108
url: /java/com.aspose.font/ttfstattable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfStatTable extends TtfTableBase
```
## Methods

| Method | Description |
| --- | --- |
| [addAxisRecord(AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.AxisRecord-) | Adds an Axis Record structure to the table. |
| [addAxisValueTable(AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.AxisValueTableBase-) | Adds an Axis Value Table structure to the table. |
| [clearAxisRecords()](#clearAxisRecords--) | Removes all axis records from the table. |
| [clearAxisValueTables()](#clearAxisValueTables--) | Removes all axis value tables from the table. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisRecords()](#getAxisRecords--) | Returns design axes array. |
| [getAxisValueCount()](#getAxisValueCount--) | Returns the number of axis value tables. |
| [getAxisValueTables()](#getAxisValueTables--) | Returns array of Axis Value Tables. |
| [getClass()](#getClass--) |  |
| [getDesignAxisCount()](#getDesignAxisCount--) | Returns the number of axis records. |
| [getElidedFallbackName()](#getElidedFallbackName--) | Spec: Name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Spec: Name ID used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getTag()](#getTag--) | Gets table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
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


Adds an Axis Record structure to the table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | AxisRecord structure |

### addAxisValueTable(AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.AxisValueTableBase-}
```
public void addAxisValueTable(AxisValueTableBase axisValueTable)
```


Adds an Axis Value Table structure to the table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | Axis value table structure |

### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


Removes all axis records from the table.

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


Removes all axis value tables from the table.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAxisRecords() {#getAxisRecords--}
```
public AxisRecord[] getAxisRecords()
```


Returns design axes array. Axes array is array of structures of type Axis Record. Spec: the axis record provides information about a single design axis.

**Returns:**
com.aspose.font.AxisRecord[] - The design axes array.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


Returns the number of axis value tables.

**Returns:**
int - The number of axis value tables.
### getAxisValueTables() {#getAxisValueTables--}
```
public AxisValueTableBase[] getAxisValueTables()
```


Returns array of Axis Value Tables. Spec: Axis Value Tables provide details regarding a specific style-attribute value on some specific axis of design variation, or a combination of design-variation axis values, and the relationship of those values to labels used as elements in subfamily names.

**Returns:**
com.aspose.font.AxisValueTableBase[] - The array of Axis Value Tables.
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
int - The number of axis records.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Spec: Name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements.

**Returns:**
java.lang.String - The name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Spec: Name ID used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements.

**Returns:**
int - The name ID.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Reference to TTF table repository.

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

