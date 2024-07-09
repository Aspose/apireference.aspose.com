---
title: TtfStatTable
second_title: Aspose.Font for Java API Reference
description: 
type: docs
weight: 94
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
| [getTag()](#getTag--) | Gets table tag. |
| [getElidedFallbackNameId()](#getElidedFallbackNameId--) | Spec: Name ID used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| [getElidedFallbackName()](#getElidedFallbackName--) | Spec: Name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| [getDesignAxisCount()](#getDesignAxisCount--) | Returns the number of axis records. |
| [getAxisValueCount()](#getAxisValueCount--) | Returns the number of axis value tables. |
| [getAxisRecords()](#getAxisRecords--) | Returns design axes array. |
| [getAxisValueTables()](#getAxisValueTables--) | Returns array of Axis Value Tables. |
| [clearAxisRecords()](#clearAxisRecords--) | Removes all axis records from the table. |
| [addAxisRecord(TtfStatTable.AxisRecord axisRecord)](#addAxisRecord-com.aspose.font.TtfStatTable.AxisRecord-) | Adds an Axis Record structure to the table. |
| [clearAxisValueTables()](#clearAxisValueTables--) | Removes all axis value tables from the table. |
| [addAxisValueTable(TtfStatTable.AxisValueTableBase axisValueTable)](#addAxisValueTable-com.aspose.font.TtfStatTable.AxisValueTableBase-) | Adds an Axis Value Table structure to the table. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getElidedFallbackNameId() {#getElidedFallbackNameId--}
```
public int getElidedFallbackNameId()
```


Spec: Name ID used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements.

**Returns:**
int - The name ID.
### getElidedFallbackName() {#getElidedFallbackName--}
```
public String getElidedFallbackName()
```


Spec: Name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements.

**Returns:**
java.lang.String - The name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements.
### getDesignAxisCount() {#getDesignAxisCount--}
```
public int getDesignAxisCount()
```


Returns the number of axis records. Spec: in a font with an 'fvar' table, this value must be greater than or equal to the axisCount value in the 'fvar' table. In all fonts, must be greater than zero if axisValueCount is greater than zero.

**Returns:**
int - The number of axis records.
### getAxisValueCount() {#getAxisValueCount--}
```
public int getAxisValueCount()
```


Returns the number of axis value tables.

**Returns:**
int - The number of axis value tables.
### getAxisRecords() {#getAxisRecords--}
```
public TtfStatTable.AxisRecord[] getAxisRecords()
```


Returns design axes array. Axes array is array of structures of type Axis Record. Spec: the axis record provides information about a single design axis.

**Returns:**
com.aspose.font.TtfStatTable.AxisRecord[] - The design axes array.
### getAxisValueTables() {#getAxisValueTables--}
```
public TtfStatTable.AxisValueTableBase[] getAxisValueTables()
```


Returns array of Axis Value Tables. Spec: Axis Value Tables provide details regarding a specific style-attribute value on some specific axis of design variation, or a combination of design-variation axis values, and the relationship of those values to labels used as elements in subfamily names.

**Returns:**
com.aspose.font.TtfStatTable.AxisValueTableBase[] - The array of Axis Value Tables.
### clearAxisRecords() {#clearAxisRecords--}
```
public void clearAxisRecords()
```


Removes all axis records from the table.

### addAxisRecord(TtfStatTable.AxisRecord axisRecord) {#addAxisRecord-com.aspose.font.TtfStatTable.AxisRecord-}
```
public void addAxisRecord(TtfStatTable.AxisRecord axisRecord)
```


Adds an Axis Record structure to the table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| axisRecord | [AxisRecord](../../com.aspose.font/axisrecord) | AxisRecord structure |

### clearAxisValueTables() {#clearAxisValueTables--}
```
public void clearAxisValueTables()
```


Removes all axis value tables from the table.

### addAxisValueTable(TtfStatTable.AxisValueTableBase axisValueTable) {#addAxisValueTable-com.aspose.font.TtfStatTable.AxisValueTableBase-}
```
public void addAxisValueTable(TtfStatTable.AxisValueTableBase axisValueTable)
```


Adds an Axis Value Table structure to the table.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| axisValueTable | [AxisValueTableBase](../../com.aspose.font/axisvaluetablebase) | Axis value table structure |

