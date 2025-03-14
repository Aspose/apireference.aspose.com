﻿---
title: PivotField
second_title: Aspose.Cells for Node.js via C++ API Reference
description: Represents a field in a PivotTable report.
type: docs
url: /nodejs-cpp/pivotfield/
---

## PivotField class

Represents a field in a PivotTable report.

```javascript
class PivotField;
```


## Methods

| Method | Description |
| --- | --- |
| [getPivotItems()](#getPivotItems--)| Gets the pivot items of the pivot field |
| [getGroupSettings()](#getGroupSettings--)| Gets the group settings of the pivot field. |
| [isCalculatedField()](#isCalculatedField--)| Indicates whether the specified PivotTable field is calculated field. |
| [isValueFields()](#isValueFields--)| Indicates whether this field represents values fields. |
| [getBaseIndex()](#getBaseIndex--)| Represents the PivotField index in the base PivotFields. |
| [setBaseIndex(number)](#setBaseIndex-number-)| Represents the PivotField index in the base PivotFields. |
| [getPosition()](#getPosition--)| Represents the index of [PivotField](../pivotfield/) in the region. |
| [getRegionType()](#getRegionType--)| Specifies the region of the PivotTable that this field is displayed. |
| [getName()](#getName--)| Represents the name of PivotField. |
| [setName(string)](#setName-string-)| Represents the name of PivotField. |
| [getDisplayName()](#getDisplayName--)| Represents the PivotField display name. |
| [setDisplayName(string)](#setDisplayName-string-)| Represents the PivotField display name. |
| [isAutoSubtotals()](#isAutoSubtotals--)| Indicates whether the specified field shows automatic subtotals. Default is true. |
| [setIsAutoSubtotals(boolean)](#setIsAutoSubtotals-boolean-)| Indicates whether the specified field shows automatic subtotals. Default is true. |
| [getDragToColumn()](#getDragToColumn--)| Indicates whether the specified field can be dragged to the column position. The default value is true. |
| [setDragToColumn(boolean)](#setDragToColumn-boolean-)| Indicates whether the specified field can be dragged to the column position. The default value is true. |
| [getDragToHide()](#getDragToHide--)| Indicates whether the specified field can be dragged to the hide position. The default value is true. |
| [setDragToHide(boolean)](#setDragToHide-boolean-)| Indicates whether the specified field can be dragged to the hide position. The default value is true. |
| [getDragToRow()](#getDragToRow--)| Indicates whether the specified field can be dragged to the row position. The default value is true. |
| [setDragToRow(boolean)](#setDragToRow-boolean-)| Indicates whether the specified field can be dragged to the row position. The default value is true. |
| [getDragToPage()](#getDragToPage--)| Indicates whether the specified field can be dragged to the page position. The default value is true. |
| [setDragToPage(boolean)](#setDragToPage-boolean-)| Indicates whether the specified field can be dragged to the page position. The default value is true. |
| [getDragToData()](#getDragToData--)| Indicates whether the specified field can be dragged to the data position. The default value is true. |
| [setDragToData(boolean)](#setDragToData-boolean-)| Indicates whether the specified field can be dragged to the data position. The default value is true. |
| [isMultipleItemSelectionAllowed()](#isMultipleItemSelectionAllowed--)| indicates whether the field can have multiple items selected in the page field The default value is false. |
| [setIsMultipleItemSelectionAllowed(boolean)](#setIsMultipleItemSelectionAllowed-boolean-)| indicates whether the field can have multiple items selected in the page field The default value is false. |
| [isRepeatItemLabels()](#isRepeatItemLabels--)| Indicates whether repeating labels of the field in the region. The default value is false. |
| [setIsRepeatItemLabels(boolean)](#setIsRepeatItemLabels-boolean-)| Indicates whether repeating labels of the field in the region. The default value is false. |
| [isIncludeNewItemsInFilter()](#isIncludeNewItemsInFilter--)| Indicates whether including new items to the field in manual filter. The default value is false. |
| [setIsIncludeNewItemsInFilter(boolean)](#setIsIncludeNewItemsInFilter-boolean-)| Indicates whether including new items to the field in manual filter. The default value is false. |
| [isInsertPageBreaksBetweenItems()](#isInsertPageBreaksBetweenItems--)| Indicates whether inserting page breaks after each item. The default value is false. |
| [setIsInsertPageBreaksBetweenItems(boolean)](#setIsInsertPageBreaksBetweenItems-boolean-)| Indicates whether inserting page breaks after each item. The default value is false. |
| [getShowAllItems()](#getShowAllItems--)| Indicates whether all items displays in the PivotTable report, even if they don't contain summary data. show items with no data The default value is false. |
| [setShowAllItems(boolean)](#setShowAllItems-boolean-)| Indicates whether all items displays in the PivotTable report, even if they don't contain summary data. show items with no data The default value is false. |
| [getNonAutoSortDefault()](#getNonAutoSortDefault--)| Indicates whether a sort operation that will be applied to this pivot field is an autosort operation or a simple data sort. |
| [setNonAutoSortDefault(boolean)](#setNonAutoSortDefault-boolean-)| Indicates whether a sort operation that will be applied to this pivot field is an autosort operation or a simple data sort. |
| [isAutoSort()](#isAutoSort--)| Indicates whether the specified PivotTable field is automatically sorted. |
| [setIsAutoSort(boolean)](#setIsAutoSort-boolean-)| Indicates whether the specified PivotTable field is automatically sorted. |
| [isAscendSort()](#isAscendSort--)| Indicates whether the specified PivotTable field is autosorted ascending. |
| [setIsAscendSort(boolean)](#setIsAscendSort-boolean-)| Indicates whether the specified PivotTable field is autosorted ascending. |
| [getSortSetting()](#getSortSetting--)| Gets all settings of auto sorting |
| [getAutoSortField()](#getAutoSortField--)| Represents the index of field which is auto sorted. -1 means PivotField itself,others means the position of the data fields. |
| [setAutoSortField(number)](#setAutoSortField-number-)| Represents the index of field which is auto sorted. -1 means PivotField itself,others means the position of the data fields. |
| [isAutoShow()](#isAutoShow--)| Indicates whether the specified PivotTable field is automatically shown,only valid for excel 2003. |
| [setIsAutoShow(boolean)](#setIsAutoShow-boolean-)| Indicates whether the specified PivotTable field is automatically shown,only valid for excel 2003. |
| [isAscendShow()](#isAscendShow--)| Indicates whether the specified PivotTable field is autoshown ascending. |
| [setIsAscendShow(boolean)](#setIsAscendShow-boolean-)| Indicates whether the specified PivotTable field is autoshown ascending. |
| [getAutoShowCount()](#getAutoShowCount--)| Represent the number of top or bottom items that are automatically shown in the specified PivotTable field. |
| [setAutoShowCount(number)](#setAutoShowCount-number-)| Represent the number of top or bottom items that are automatically shown in the specified PivotTable field. |
| [getAutoShowField()](#getAutoShowField--)| Represents auto show field index. -1 means PivotField itself. It should be the index of the data fields. |
| [setAutoShowField(number)](#setAutoShowField-number-)| Represents auto show field index. -1 means PivotField itself. It should be the index of the data fields. |
| [getFunction()](#getFunction--)| Represents the function used to summarize the PivotTable data field. |
| [setFunction(ConsolidationFunction)](#setFunction-consolidationfunction-)| Represents the function used to summarize the PivotTable data field. |
| [getShowValuesSetting()](#getShowValuesSetting--)| Gets the settings of showing values as when the ShowDataAs calculation is in use. |
| [getCurrentPageItem()](#getCurrentPageItem--)| Represents the current page item showing for the page field (valid only for page fields). |
| [setCurrentPageItem(number)](#setCurrentPageItem-number-)| Represents the current page item showing for the page field (valid only for page fields). |
| [getNumber()](#getNumber--)| Represents the built-in display format of numbers and dates. |
| [setNumber(number)](#setNumber-number-)| Represents the built-in display format of numbers and dates. |
| [getInsertBlankRow()](#getInsertBlankRow--)| Indicates whether inserting blank line after each item. |
| [setInsertBlankRow(boolean)](#setInsertBlankRow-boolean-)| Indicates whether inserting blank line after each item. |
| [getShowSubtotalAtTop()](#getShowSubtotalAtTop--)| when ShowInOutlineForm is true, then display subtotals at the top of the list of items instead of at the bottom |
| [setShowSubtotalAtTop(boolean)](#setShowSubtotalAtTop-boolean-)| when ShowInOutlineForm is true, then display subtotals at the top of the list of items instead of at the bottom |
| [getShowInOutlineForm()](#getShowInOutlineForm--)| Indicates whether layout this field in outline form on the Pivot Table view |
| [setShowInOutlineForm(boolean)](#setShowInOutlineForm-boolean-)| Indicates whether layout this field in outline form on the Pivot Table view |
| [get_NumberFormat()](#get_NumberFormat--)| Represents the custom display format of numbers and dates. |
| [setNumberFormat(string)](#setNumberFormat-string-)| Represents the custom display format of numbers and dates. |
| [getItems()](#getItems--)| Get all labels of pivot items in this field. |
| [getOriginalItems()](#getOriginalItems--)| Get the original base items; |
| [getItemCount()](#getItemCount--)| Gets the count of the base items in this pivot field. |
| [getShowCompact()](#getShowCompact--)| Indicates whether display labels from the next field in the same column on the Pivot Table view |
| [setShowCompact(boolean)](#setShowCompact-boolean-)| Indicates whether display labels from the next field in the same column on the Pivot Table view |
| [initPivotItems()](#initPivotItems--)| Init the pivot items of the pivot field |
| [groupBy(number, boolean)](#groupBy-number-boolean-)| Automatically group the field with internal |
| [groupBy(Date, Date, PivotGroupByType[], number, boolean)](#groupBy-date-date-pivotgroupbytypearray-number-boolean-)| Group the file by the date group types. |
| [groupBy(number, number, number, boolean)](#groupBy-number-number-number-boolean-)| Group the file by number. |
| [groupBy(CustomPiovtFieldGroupItem[], boolean)](#groupBy-custompiovtfieldgroupitemarray-boolean-)| Custom group the field. |
| [ungroup()](#ungroup--)| Ungroup the pivot field. |
| [getPivotFilterByType(PivotFilterType)](#getPivotFilterByType-pivotfiltertype-)| Gets the pivot filter of the pivot field by type |
| [getFilters()](#getFilters--)| Gets all pivot filters of this pivot field. |
| [clearFilter()](#clearFilter--)| Clears filter setting on this pivot field. |
| [filterTop10(number, PivotFilterType, boolean, number)](#filterTop10-number-pivotfiltertype-boolean-number-)| Filters by values of data pivot field. |
| [filterByValue(number, PivotFilterType, number, number)](#filterByValue-number-pivotfiltertype-number-number-)| Filters by values of data pivot field. |
| [filterByLabel(PivotFilterType, string, string)](#filterByLabel-pivotfiltertype-string-string-)| Filters by captions of row or column pivot field. |
| [filterByDate(PivotFilterType, Date, Date)](#filterByDate-pivotfiltertype-date-date-)| Filters by date setting of row or column pivot field. |
| [getFormula()](#getFormula--)| Gets formula of the calculated field . |
| [setSubtotals(PivotFieldSubtotalType, boolean)](#setSubtotals-pivotfieldsubtotaltype-boolean-)| Sets whether the specified field shows that subtotals. |
| [getSubtotals(PivotFieldSubtotalType)](#getSubtotals-pivotfieldsubtotaltype-)| Indicates whether showing specified subtotal. |
| [sortBy(SortOrder, number)](#sortBy-sortorder-number-)| Sorts this pivot field. |
| [sortBy(SortOrder, number, PivotLineType, string)](#sortBy-sortorder-number-pivotlinetype-string-)| Sorts this pivot field. |
| [showValuesAs(PivotFieldDataDisplayFormat, number, PivotItemPositionType, number)](#showValuesAs-pivotfielddatadisplayformat-number-pivotitempositiontype-number-)| Shows values of data field as different display format when the ShowDataAs calculation is in use. |
| [isHiddenItem(number)](#isHiddenItem-number-)| Gets whether the specific PivotItem is hidden. |
| [hideItem(number, boolean)](#hideItem-number-boolean-)| Sets whether the specific PivotItem in a data field is hidden. |
| [hideItem(string, boolean)](#hideItem-string-boolean-)| Sets whether the specific PivotItem in a data field is hidden. |
| [isHiddenItemDetail(number)](#isHiddenItemDetail-number-)| Gets whether hidding the detail of  the specific PivotItem.. |
| [hideItemDetail(number, boolean)](#hideItemDetail-number-boolean-)| Sets whether the specific PivotItem in a pivot field is hidden detail. |
| [hideDetail(boolean)](#hideDetail-boolean-)| Sets whether the PivotItems in a pivot field is hidden detail.That is collapse/expand this field. |
| [addCalculatedItem(string, string)](#addCalculatedItem-string-string-)| Add a calculated formula item to the pivot field. |
| [isNull()](#isNull--)| Checks whether the implementation object is null. |


### getPivotItems() {#getPivotItems--}

Gets the pivot items of the pivot field

```javascript
getPivotItems() : PivotItemCollection;
```


**Returns**

[PivotItemCollection](../pivotitemcollection/)

### getGroupSettings() {#getGroupSettings--}

Gets the group settings of the pivot field.

```javascript
getGroupSettings() : PivotFieldGroupSettings;
```


**Returns**

[PivotFieldGroupSettings](../pivotfieldgroupsettings/)

**Remarks**

If this field is not grouped, Null will be returned.

### isCalculatedField() {#isCalculatedField--}

Indicates whether the specified PivotTable field is calculated field.

```javascript
isCalculatedField() : boolean;
```


### isValueFields() {#isValueFields--}

Indicates whether this field represents values fields.

```javascript
isValueFields() : boolean;
```


### getBaseIndex() {#getBaseIndex--}

Represents the PivotField index in the base PivotFields.

```javascript
getBaseIndex() : number;
```


### setBaseIndex(number) {#setBaseIndex-number-}

Represents the PivotField index in the base PivotFields.

```javascript
setBaseIndex(value: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | number | The value to set. |

### getPosition() {#getPosition--}

Represents the index of [PivotField](../pivotfield/) in the region.

```javascript
getPosition() : number;
```


### getRegionType() {#getRegionType--}

Specifies the region of the PivotTable that this field is displayed.

```javascript
getRegionType() : PivotFieldType;
```


**Returns**

[PivotFieldType](../pivotfieldtype/)

### getName() {#getName--}

Represents the name of PivotField.

```javascript
getName() : string;
```


### setName(string) {#setName-string-}

Represents the name of PivotField.

```javascript
setName(value: string) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | string | The value to set. |

### getDisplayName() {#getDisplayName--}

Represents the PivotField display name.

```javascript
getDisplayName() : string;
```


### setDisplayName(string) {#setDisplayName-string-}

Represents the PivotField display name.

```javascript
setDisplayName(value: string) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | string | The value to set. |

### isAutoSubtotals() {#isAutoSubtotals--}

Indicates whether the specified field shows automatic subtotals. Default is true.

```javascript
isAutoSubtotals() : boolean;
```


### setIsAutoSubtotals(boolean) {#setIsAutoSubtotals-boolean-}

Indicates whether the specified field shows automatic subtotals. Default is true.

```javascript
setIsAutoSubtotals(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getDragToColumn() {#getDragToColumn--}

Indicates whether the specified field can be dragged to the column position. The default value is true.

```javascript
getDragToColumn() : boolean;
```


### setDragToColumn(boolean) {#setDragToColumn-boolean-}

Indicates whether the specified field can be dragged to the column position. The default value is true.

```javascript
setDragToColumn(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getDragToHide() {#getDragToHide--}

Indicates whether the specified field can be dragged to the hide position. The default value is true.

```javascript
getDragToHide() : boolean;
```


### setDragToHide(boolean) {#setDragToHide-boolean-}

Indicates whether the specified field can be dragged to the hide position. The default value is true.

```javascript
setDragToHide(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getDragToRow() {#getDragToRow--}

Indicates whether the specified field can be dragged to the row position. The default value is true.

```javascript
getDragToRow() : boolean;
```


### setDragToRow(boolean) {#setDragToRow-boolean-}

Indicates whether the specified field can be dragged to the row position. The default value is true.

```javascript
setDragToRow(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getDragToPage() {#getDragToPage--}

Indicates whether the specified field can be dragged to the page position. The default value is true.

```javascript
getDragToPage() : boolean;
```


### setDragToPage(boolean) {#setDragToPage-boolean-}

Indicates whether the specified field can be dragged to the page position. The default value is true.

```javascript
setDragToPage(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getDragToData() {#getDragToData--}

Indicates whether the specified field can be dragged to the data position. The default value is true.

```javascript
getDragToData() : boolean;
```


### setDragToData(boolean) {#setDragToData-boolean-}

Indicates whether the specified field can be dragged to the data position. The default value is true.

```javascript
setDragToData(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### isMultipleItemSelectionAllowed() {#isMultipleItemSelectionAllowed--}

indicates whether the field can have multiple items selected in the page field The default value is false.

```javascript
isMultipleItemSelectionAllowed() : boolean;
```


### setIsMultipleItemSelectionAllowed(boolean) {#setIsMultipleItemSelectionAllowed-boolean-}

indicates whether the field can have multiple items selected in the page field The default value is false.

```javascript
setIsMultipleItemSelectionAllowed(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### isRepeatItemLabels() {#isRepeatItemLabels--}

Indicates whether repeating labels of the field in the region. The default value is false.

```javascript
isRepeatItemLabels() : boolean;
```


### setIsRepeatItemLabels(boolean) {#setIsRepeatItemLabels-boolean-}

Indicates whether repeating labels of the field in the region. The default value is false.

```javascript
setIsRepeatItemLabels(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### isIncludeNewItemsInFilter() {#isIncludeNewItemsInFilter--}

Indicates whether including new items to the field in manual filter. The default value is false.

```javascript
isIncludeNewItemsInFilter() : boolean;
```


### setIsIncludeNewItemsInFilter(boolean) {#setIsIncludeNewItemsInFilter-boolean-}

Indicates whether including new items to the field in manual filter. The default value is false.

```javascript
setIsIncludeNewItemsInFilter(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### isInsertPageBreaksBetweenItems() {#isInsertPageBreaksBetweenItems--}

Indicates whether inserting page breaks after each item. The default value is false.

```javascript
isInsertPageBreaksBetweenItems() : boolean;
```


### setIsInsertPageBreaksBetweenItems(boolean) {#setIsInsertPageBreaksBetweenItems-boolean-}

Indicates whether inserting page breaks after each item. The default value is false.

```javascript
setIsInsertPageBreaksBetweenItems(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getShowAllItems() {#getShowAllItems--}

Indicates whether all items displays in the PivotTable report, even if they don't contain summary data. show items with no data The default value is false.

```javascript
getShowAllItems() : boolean;
```


### setShowAllItems(boolean) {#setShowAllItems-boolean-}

Indicates whether all items displays in the PivotTable report, even if they don't contain summary data. show items with no data The default value is false.

```javascript
setShowAllItems(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getNonAutoSortDefault() {#getNonAutoSortDefault--}

Indicates whether a sort operation that will be applied to this pivot field is an autosort operation or a simple data sort.

```javascript
getNonAutoSortDefault() : boolean;
```


### setNonAutoSortDefault(boolean) {#setNonAutoSortDefault-boolean-}

Indicates whether a sort operation that will be applied to this pivot field is an autosort operation or a simple data sort.

```javascript
setNonAutoSortDefault(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### isAutoSort() {#isAutoSort--}

Indicates whether the specified PivotTable field is automatically sorted.

```javascript
isAutoSort() : boolean;
```


### setIsAutoSort(boolean) {#setIsAutoSort-boolean-}

Indicates whether the specified PivotTable field is automatically sorted.

```javascript
setIsAutoSort(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### isAscendSort() {#isAscendSort--}

Indicates whether the specified PivotTable field is autosorted ascending.

```javascript
isAscendSort() : boolean;
```


### setIsAscendSort(boolean) {#setIsAscendSort-boolean-}

Indicates whether the specified PivotTable field is autosorted ascending.

```javascript
setIsAscendSort(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getSortSetting() {#getSortSetting--}

Gets all settings of auto sorting

```javascript
getSortSetting() : PivotFieldSortSetting;
```


**Returns**

[PivotFieldSortSetting](../pivotfieldsortsetting/)

### getAutoSortField() {#getAutoSortField--}

Represents the index of field which is auto sorted. -1 means PivotField itself,others means the position of the data fields.

```javascript
getAutoSortField() : number;
```


### setAutoSortField(number) {#setAutoSortField-number-}

Represents the index of field which is auto sorted. -1 means PivotField itself,others means the position of the data fields.

```javascript
setAutoSortField(value: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | number | The value to set. |

### isAutoShow() {#isAutoShow--}

Indicates whether the specified PivotTable field is automatically shown,only valid for excel 2003.

```javascript
isAutoShow() : boolean;
```


### setIsAutoShow(boolean) {#setIsAutoShow-boolean-}

Indicates whether the specified PivotTable field is automatically shown,only valid for excel 2003.

```javascript
setIsAutoShow(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### isAscendShow() {#isAscendShow--}

Indicates whether the specified PivotTable field is autoshown ascending.

```javascript
isAscendShow() : boolean;
```


### setIsAscendShow(boolean) {#setIsAscendShow-boolean-}

Indicates whether the specified PivotTable field is autoshown ascending.

```javascript
setIsAscendShow(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getAutoShowCount() {#getAutoShowCount--}

Represent the number of top or bottom items that are automatically shown in the specified PivotTable field.

```javascript
getAutoShowCount() : number;
```


### setAutoShowCount(number) {#setAutoShowCount-number-}

Represent the number of top or bottom items that are automatically shown in the specified PivotTable field.

```javascript
setAutoShowCount(value: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | number | The value to set. |

### getAutoShowField() {#getAutoShowField--}

Represents auto show field index. -1 means PivotField itself. It should be the index of the data fields.

```javascript
getAutoShowField() : number;
```


### setAutoShowField(number) {#setAutoShowField-number-}

Represents auto show field index. -1 means PivotField itself. It should be the index of the data fields.

```javascript
setAutoShowField(value: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | number | The value to set. |

### getFunction() {#getFunction--}

Represents the function used to summarize the PivotTable data field.

```javascript
getFunction() : ConsolidationFunction;
```


**Returns**

[ConsolidationFunction](../consolidationfunction/)

### setFunction(ConsolidationFunction) {#setFunction-consolidationfunction-}

Represents the function used to summarize the PivotTable data field.

```javascript
setFunction(value: ConsolidationFunction) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ConsolidationFunction](../consolidationfunction/) | The value to set. |

### getShowValuesSetting() {#getShowValuesSetting--}

Gets the settings of showing values as when the ShowDataAs calculation is in use.

```javascript
getShowValuesSetting() : PivotShowValuesSetting;
```


**Returns**

[PivotShowValuesSetting](../pivotshowvaluessetting/)

### getCurrentPageItem() {#getCurrentPageItem--}

Represents the current page item showing for the page field (valid only for page fields).

```javascript
getCurrentPageItem() : number;
```


### setCurrentPageItem(number) {#setCurrentPageItem-number-}

Represents the current page item showing for the page field (valid only for page fields).

```javascript
setCurrentPageItem(value: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | number | The value to set. |

### getNumber() {#getNumber--}

Represents the built-in display format of numbers and dates.

```javascript
getNumber() : number;
```


### setNumber(number) {#setNumber-number-}

Represents the built-in display format of numbers and dates.

```javascript
setNumber(value: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | number | The value to set. |

### getInsertBlankRow() {#getInsertBlankRow--}

Indicates whether inserting blank line after each item.

```javascript
getInsertBlankRow() : boolean;
```


### setInsertBlankRow(boolean) {#setInsertBlankRow-boolean-}

Indicates whether inserting blank line after each item.

```javascript
setInsertBlankRow(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getShowSubtotalAtTop() {#getShowSubtotalAtTop--}

when ShowInOutlineForm is true, then display subtotals at the top of the list of items instead of at the bottom

```javascript
getShowSubtotalAtTop() : boolean;
```


**Remarks**

Only works when ShowInOutlineForm is true.

### setShowSubtotalAtTop(boolean) {#setShowSubtotalAtTop-boolean-}

when ShowInOutlineForm is true, then display subtotals at the top of the list of items instead of at the bottom

```javascript
setShowSubtotalAtTop(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

**Remarks**

Only works when ShowInOutlineForm is true.

### getShowInOutlineForm() {#getShowInOutlineForm--}

Indicates whether layout this field in outline form on the Pivot Table view

```javascript
getShowInOutlineForm() : boolean;
```


### setShowInOutlineForm(boolean) {#setShowInOutlineForm-boolean-}

Indicates whether layout this field in outline form on the Pivot Table view

```javascript
setShowInOutlineForm(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### get_NumberFormat() {#get_NumberFormat--}

Represents the custom display format of numbers and dates.

```javascript
get_NumberFormat() : string;
```


### setNumberFormat(string) {#setNumberFormat-string-}

Represents the custom display format of numbers and dates.

```javascript
setNumberFormat(value: string) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | string | The value to set. |

### getItems() {#getItems--}

Get all labels of pivot items in this field.

```javascript
getItems() : string[];
```


**Returns**

string[]

### getOriginalItems() {#getOriginalItems--}

Get the original base items;

```javascript
getOriginalItems() : string[];
```


**Returns**

string[]

### getItemCount() {#getItemCount--}

Gets the count of the base items in this pivot field.

```javascript
getItemCount() : number;
```


### getShowCompact() {#getShowCompact--}

Indicates whether display labels from the next field in the same column on the Pivot Table view

```javascript
getShowCompact() : boolean;
```


### setShowCompact(boolean) {#setShowCompact-boolean-}

Indicates whether display labels from the next field in the same column on the Pivot Table view

```javascript
setShowCompact(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### initPivotItems() {#initPivotItems--}

Init the pivot items of the pivot field

```javascript
initPivotItems() : void;
```


### groupBy(number, boolean) {#groupBy-number-boolean-}

Automatically group the field with internal

```javascript
groupBy(interval: number, newField: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| interval | number | The internal of group.         /// Automatic value will be assigned if it's zero, |
| newField | boolean | Indicates whether adding a new field to the pivottable. |

### groupBy(Date, Date, PivotGroupByType[], number, boolean) {#groupBy-date-date-pivotgroupbytypearray-number-boolean-}

Group the file by the date group types.

```javascript
groupBy(start: Date, end: Date, groups: PivotGroupByType[], interval: number, firstAsNewField: boolean) : boolean;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| start | Date | The start datetime |
| end | Date | The end of datetime |
| groups | [PivotGroupByType](../pivotgroupbytype/)[] | Group types |
| interval | number | The interval |
| firstAsNewField | boolean | Indicates whether adding a new field to the pivottable.         /// Only for the first group item. |

**Returns**

False means this field could not be grouped by date time.

### groupBy(number, number, number, boolean) {#groupBy-number-number-number-boolean-}

Group the file by number.

```javascript
groupBy(start: number, end: number, interval: number, newField: boolean) : boolean;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| start | number | The start value |
| end | number | The end of value |
| interval | number | The interval |
| newField | boolean | Indicates whether adding a new field to the pivottable |

**Returns**

False means this field could not be grouped by date time.

### groupBy(CustomPiovtFieldGroupItem[], boolean) {#groupBy-custompiovtfieldgroupitemarray-boolean-}

Custom group the field.

```javascript
groupBy(customGroupItems: CustomPiovtFieldGroupItem[], newField: boolean) : boolean;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| customGroupItems | [CustomPiovtFieldGroupItem](../custompiovtfieldgroupitem/)[] | The custom group items. |
| newField | boolean | Indicates whether adding a new field to the pivottable |

**Returns**

False means this field could not be grouped by date time.

### ungroup() {#ungroup--}

Ungroup the pivot field.

```javascript
ungroup() : void;
```


### getPivotFilterByType(PivotFilterType) {#getPivotFilterByType-pivotfiltertype-}

Gets the pivot filter of the pivot field by type

```javascript
getPivotFilterByType(type: PivotFilterType) : PivotFilter;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [PivotFilterType](../pivotfiltertype/) |  |

**Returns**

[PivotFilter](../pivotfilter/)

### getFilters() {#getFilters--}

Gets all pivot filters of this pivot field.

```javascript
getFilters() : PivotFilter[];
```


**Returns**

[PivotFilter](../pivotfilter/)[]

### clearFilter() {#clearFilter--}

Clears filter setting on this pivot field.

```javascript
clearFilter() : void;
```


### filterTop10(number, PivotFilterType, boolean, number) {#filterTop10-number-pivotfiltertype-boolean-number-}

Filters by values of data pivot field.

```javascript
filterTop10(valueFieldIndex: number, type: PivotFilterType, isTop: boolean, itemCount: number) : PivotFilter;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| valueFieldIndex | number | The index of data field  in the data region. |
| type | [PivotFilterType](../pivotfiltertype/) | The type of filtering data. Only can be Count,Sum and Percent. |
| isTop | boolean | Indicates whether filter from top or bottom |
| itemCount | number | The item count |

**Returns**

[PivotFilter](../pivotfilter/)

### filterByValue(number, PivotFilterType, number, number) {#filterByValue-number-pivotfiltertype-number-number-}

Filters by values of data pivot field.

```javascript
filterByValue(valueFieldIndex: number, type: PivotFilterType, value1: number, value2: number) : PivotFilter;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| valueFieldIndex | number | The index of value field in the value region. |
| type | [PivotFilterType](../pivotfiltertype/) | The type of filtering data. |
| value1 | number | The value of filter condition |
| value2 | number | The upper-bound value of between filter condition |

**Returns**

[PivotFilter](../pivotfilter/)

### filterByLabel(PivotFilterType, string, string) {#filterByLabel-pivotfiltertype-string-string-}

Filters by captions of row or column pivot field.

```javascript
filterByLabel(type: PivotFilterType, label1: string, label2: string) : PivotFilter;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [PivotFilterType](../pivotfiltertype/) | The type of filtering data. |
| label1 | string | The label of filter condition |
| label2 | string | The upper-bound label of between filter condition |

**Returns**

[PivotFilter](../pivotfilter/)

### filterByDate(PivotFilterType, Date, Date) {#filterByDate-pivotfiltertype-date-date-}

Filters by date setting of row or column pivot field.

```javascript
filterByDate(type: PivotFilterType, dateTime1: Date, dateTime2: Date) : PivotFilter;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [PivotFilterType](../pivotfiltertype/) | The type of filtering data. |
| dateTime1 | Date | The date label of filter condition |
| dateTime2 | Date | The upper-bound date label of between filter condition |

**Returns**

[PivotFilter](../pivotfilter/)

### getFormula() {#getFormula--}

Gets formula of the calculated field .

```javascript
getFormula() : string;
```


### setSubtotals(PivotFieldSubtotalType, boolean) {#setSubtotals-pivotfieldsubtotaltype-boolean-}

Sets whether the specified field shows that subtotals.

```javascript
setSubtotals(subtotalType: PivotFieldSubtotalType, shown: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| subtotalType | [PivotFieldSubtotalType](../pivotfieldsubtotaltype/) | subtotals type. |
| shown | boolean | whether the specified field shows that subtotals. |

### getSubtotals(PivotFieldSubtotalType) {#getSubtotals-pivotfieldsubtotaltype-}

Indicates whether showing specified subtotal.

```javascript
getSubtotals(subtotalType: PivotFieldSubtotalType) : boolean;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| subtotalType | [PivotFieldSubtotalType](../pivotfieldsubtotaltype/) | subtotal type. |

**Returns**

Returns whether showing specified subtotal.

### sortBy(SortOrder, number) {#sortBy-sortorder-number-}

Sorts this pivot field.

```javascript
sortBy(sortType: SortOrder, fieldSortedBy: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sortType | [SortOrder](../sortorder/) | The type of sorting this field. |
| fieldSortedBy | number | The index of pivot field sorted by.         /// -1 means sorting by data labels of this field, others mean the index of data field sorted by. |

### sortBy(SortOrder, number, PivotLineType, string) {#sortBy-sortorder-number-pivotlinetype-string-}

Sorts this pivot field.

```javascript
sortBy(sortType: SortOrder, fieldSortedBy: number, dataType: PivotLineType, cellName: string) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sortType | [SortOrder](../sortorder/) | The type of sorting this field. |
| fieldSortedBy | number | The index of pivot field sorted by.         /// -1 means sorting by data labels of this field, others mean the index of data field sorted by. |
| dataType | [PivotLineType](../pivotlinetype/) | The type of data sorted by. |
| cellName | string | Sort by values in the row or column |

### showValuesAs(PivotFieldDataDisplayFormat, number, PivotItemPositionType, number) {#showValuesAs-pivotfielddatadisplayformat-number-pivotitempositiontype-number-}

Shows values of data field as different display format when the ShowDataAs calculation is in use.

```javascript
showValuesAs(displayFormat: PivotFieldDataDisplayFormat, baseField: number, baseItemPositionType: PivotItemPositionType, baseItem: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| displayFormat | [PivotFieldDataDisplayFormat](../pivotfielddatadisplayformat/) | The data display format type. |
| baseField | number | The index to the field which ShowDataAs calculation bases on. |
| baseItemPositionType | [PivotItemPositionType](../pivotitempositiontype/) | The position type of base iteam. |
| baseItem | number | The index to the base item which ShowDataAs calculation bases on.         /// Only works when baseItemPositionType is custom. |

**Remarks**

Only for data field.

### isHiddenItem(number) {#isHiddenItem-number-}

Gets whether the specific PivotItem is hidden.

```javascript
isHiddenItem(index: number) : boolean;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | The index of the pivotItem in the pivotField. |

**Returns**

whether the specific PivotItem is hidden

### hideItem(number, boolean) {#hideItem-number-boolean-}

Sets whether the specific PivotItem in a data field is hidden.

```javascript
hideItem(index: number, isHidden: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | the index of the pivotItem in the pivotField. |
| isHidden | boolean | whether the specific PivotItem is hidden |

### hideItem(string, boolean) {#hideItem-string-boolean-}

Sets whether the specific PivotItem in a data field is hidden.

```javascript
hideItem(itemValue: string, isHidden: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| itemValue | string | the value of the pivotItem in the pivotField. |
| isHidden | boolean | whether the specific PivotItem is hidden |

### isHiddenItemDetail(number) {#isHiddenItemDetail-number-}

Gets whether hidding the detail of  the specific PivotItem..

```javascript
isHiddenItemDetail(index: number) : boolean;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | The index of the pivotItem in the pivotField. |

**Returns**

whether the specific PivotItem is hidden detail

### hideItemDetail(number, boolean) {#hideItemDetail-number-boolean-}

Sets whether the specific PivotItem in a pivot field is hidden detail.

```javascript
hideItemDetail(index: number, isHiddenDetail: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | the index of the pivotItem in the pivotField. |
| isHiddenDetail | boolean | whether the specific PivotItem is hidden |

### hideDetail(boolean) {#hideDetail-boolean-}

Sets whether the PivotItems in a pivot field is hidden detail.That is collapse/expand this field.

```javascript
hideDetail(isHiddenDetail: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| isHiddenDetail | boolean | Whether hide the detail of the pivot field. |

### addCalculatedItem(string, string) {#addCalculatedItem-string-string-}

Add a calculated formula item to the pivot field.

```javascript
addCalculatedItem(name: string, formula: string) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | string | The item's name. |
| formula | string | The formula of pivot item. |

**Remarks**

Only supports to add calculated item to Row/Column field.

### isNull() {#isNull--}

Checks whether the implementation object is null.

```javascript
isNull() : boolean;
```



