---
title: IChartCategory
second_title: Aspose.Slides for Java API Reference
description: Represents chart categories.
type: docs
weight: 683
url: /java/com.aspose.slides/ichartcategory/
---```
public interface IChartCategory
```

Represents chart categories.
## Methods

| Method | Description |
| --- | --- |
| [getUseCell()](#getUseCell--) | If true then AsCell property is actual. |
| [getAsCell()](#getAsCell--) | Returns or sets IChartDataCell object. |
| [setAsCell(IChartDataCell value)](#setAsCell-com.aspose.slides.IChartDataCell-) | Returns or sets IChartDataCell object. |
| [getAsLiteral()](#getAsLiteral--) | Returns or sets AsLiteral if UseCell is false. |
| [setAsLiteral(Object value)](#setAsLiteral-java.lang.Object-) | Returns or sets AsLiteral if UseCell is false. |
| [getValue()](#getValue--) | If UseCell is true then this property represents AsCell.Value property. |
| [setValue(Object value)](#setValue-java.lang.Object-) | If UseCell is true then this property represents AsCell.Value property. |
| [getGroupingLevels()](#getGroupingLevels--) | Managed container of the values of the chart category grouping levels. |
| [remove()](#remove--) | Removes category from chart. |
### getUseCell() {#getUseCell--}
```
public abstract boolean getUseCell()
```


If true then AsCell property is actual. In other words, worksheet is used for storing category (this case supports a multi-level category). If false then AsLiteral property is actual. In other words, worksheet is NOT used for storing category (and this case doesn't support a multi-level categories). Read-only boolean.

--------------------

For change value of this property (for all categories in collection) set new value to [ChartCategoryCollection.getUseCells()](../../com.aspose.slides/chartcategorycollection\#getUseCells--) property.

**Returns:**
boolean
### getAsCell() {#getAsCell--}
```
public abstract IChartDataCell getAsCell()
```


Returns or sets IChartDataCell object. If category is multi-level then used IChartDataCell object for level "0". Read/write [IChartDataCell](../../com.aspose.slides/ichartdatacell).

**Returns:**
[IChartDataCell](../../com.aspose.slides/ichartdatacell)
### setAsCell(IChartDataCell value) {#setAsCell-com.aspose.slides.IChartDataCell-}
```
public abstract void setAsCell(IChartDataCell value)
```


Returns or sets IChartDataCell object. If category is multi-level then used IChartDataCell object for level "0". Read/write [IChartDataCell](../../com.aspose.slides/ichartdatacell).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IChartDataCell](../../com.aspose.slides/ichartdatacell) |  |

### getAsLiteral() {#getAsLiteral--}
```
public abstract Object getAsLiteral()
```


Returns or sets AsLiteral if UseCell is false. Read/write Object.

**Returns:**
java.lang.Object
### setAsLiteral(Object value) {#setAsLiteral-java.lang.Object-}
```
public abstract void setAsLiteral(Object value)
```


Returns or sets AsLiteral if UseCell is false. Read/write Object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Object |  |

### getValue() {#getValue--}
```
public abstract Object getValue()
```


If UseCell is true then this property represents AsCell.Value property. If UseCell is false then this property represents AsLiteral property. Read/write Object.

**Returns:**
java.lang.Object
### setValue(Object value) {#setValue-java.lang.Object-}
```
public abstract void setValue(Object value)
```


If UseCell is true then this property represents AsCell.Value property. If UseCell is false then this property represents AsLiteral property. Read/write Object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Object |  |

### getGroupingLevels() {#getGroupingLevels--}
```
public abstract IChartCategoryLevelsManager getGroupingLevels()
```


Managed container of the values of the chart category grouping levels. Multi-level category contain more then one grouping level. Grouping levels indexing is zero-based. Read-only [IChartCategoryLevelsManager](../../com.aspose.slides/ichartcategorylevelsmanager).

**Returns:**
[IChartCategoryLevelsManager](../../com.aspose.slides/ichartcategorylevelsmanager)
### remove() {#remove--}
```
public abstract void remove()
```


Removes category from chart.

