﻿---
title: CellArea
second_title: Aspose.Cells for Node.js via C++ API Reference
description: Represent an area of cells.
type: docs
url: /nodejs-cpp/cellarea/
---

## CellArea class
Represent an area of cells.



### Example
```javascript
const { CellArea } = require("aspose.cells.node");

//Create Cell Area
var ca = new CellArea();
ca.startRow = 0;
ca.endRow = 0;
ca.startColumn = 0;
ca.endColumn = 0;
```

## Constructors

| Constructor | Description |
| --- | --- |
| [constructor()](#constructor--)| Default Constructor. |

## Properties

| Property | Type | Description |
| --- | --- | --- |
| startRow | number | Gets or sets the start row of this area. |
| endRow | number | Gets or sets the end row of this area. |
| startColumn | number | Gets or sets the start column of this area. |
| endColumn | number | Gets or sets the end column of this area. |

## Methods

| Method | Description |
| --- | --- |
| [toString()](#toString--)| Returns a string represents the current cell area object. |
| static [createCellArea(number, number, number, number)](#createCellArea-number-number-number-number-)| Creates a cell area. |
| static [createCellArea(string, string)](#createCellArea-string-string-)| Creates a cell area. |


### constructor() {#constructor--}

Default Constructor.

```javascript
constructor();
```

### toString() {#toString--}

Returns a string represents the current cell area object.

```javascript
toString() : string;
```

### createCellArea(number, number, number, number) {#createCellArea-number-number-number-number-}

Creates a cell area.

```javascript
static createCellArea(startRow: number, startColumn: number, endRow: number, endColumn: number) : CellArea;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startRow | number | The start row. |
| startColumn | number | The start column. |
| endRow | number | The end row. |
| endColumn | number | The end column. |

**Returns**

[CellArea](../cellarea/)


### createCellArea(string, string) {#createCellArea-string-string-}

Creates a cell area.

```javascript
static createCellArea(startCellName: string, endCellName: string) : CellArea;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startCellName | string | The top-left cell of the range. |
| endCellName | string | The bottom-right cell of the range. |

**Returns**

[CellArea](../cellarea/)

