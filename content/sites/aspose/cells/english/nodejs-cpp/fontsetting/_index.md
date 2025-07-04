﻿---
title: FontSetting
second_title: Aspose.Cells for Node.js via C++ API Reference
description: Represents a range of characters within the cell text.
type: docs
url: /nodejs-cpp/fontsetting/
---

## FontSetting class

Represents a range of characters within the cell text.

```javascript
class FontSetting;
```


### Example
```javascript
const { Workbook, Color } = require("aspose.cells.node");

//Instantiating a Workbook object
var workbook = new Workbook();
//Adding a new worksheet to the Excel object
workbook.worksheets.add();
//Obtaining the reference of the newly added worksheet by passing its sheet index
var worksheet = workbook.worksheets.get(0);
//Accessing the "A1" cell from the worksheet
var cell = worksheet.cells.get("A1");
//Adding some value to the "A1" cell
cell.putValue("Visit Aspose!");
//getting charactor
var charactor = cell.characters(6, 7);
//Setting the font of selected characters to bold
charactor.font.isBold = true;
//Setting the font color of selected characters to blue
charactor.font.color = Color.Blue;
//Saving the Excel file
workbook.save("output/FontSetting.xls");
```
## Constructors

| Constructor | Description |
| --- | --- |
| [constructor(number, number, WorksheetCollection)](#constructor-number-number-worksheetcollection-)|  |

## Properties

| Property | Type | Description |
| --- | --- | --- |
| [startIndex](#startIndex--)| number | Readonly. Gets the start index of the characters. |
| [length](#length--)| number | Readonly. Gets the length of the characters. |
| [font](#font--)| Font | Readonly. Returns the font of this object. |
| [textOptions](#textOptions--)| TextOptions | Readonly. Returns the text options. |

## Methods

| Method | Description |
| --- | --- |
| [getStartIndex()](#getStartIndex--)| <b>@deprecated.</b> Please use the 'startIndex' property instead. Gets the start index of the characters. |
| [getLength()](#getLength--)| <b>@deprecated.</b> Please use the 'length' property instead. Gets the length of the characters. |
| [getFont()](#getFont--)| <b>@deprecated.</b> Please use the 'font' property instead. Returns the font of this object. |
| [getTextOptions()](#getTextOptions--)| <b>@deprecated.</b> Please use the 'textOptions' property instead. Returns the text options. |
| [setWordArtStyle(PresetWordArtStyle)](#setWordArtStyle-presetwordartstyle-)| Sets the preset WordArt style. |
| [isNull()](#isNull--)| Checks whether the implementation object is null. |
| [getType()](#getType--)| Gets the type of text node. |


### constructor(number, number, WorksheetCollection) {#constructor-number-number-worksheetcollection-}



```javascript
constructor(startIndex: number, length: number, sheets: WorksheetCollection);
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startIndex | number |  |
| length | number |  |
| sheets | [WorksheetCollection](../worksheetcollection/) |  |

### startIndex {#startIndex--}

Readonly. Gets the start index of the characters.

```javascript
startIndex : number;
```


### length {#length--}

Readonly. Gets the length of the characters.

```javascript
length : number;
```


### font {#font--}

Readonly. Returns the font of this object.

```javascript
font : Font;
```


### textOptions {#textOptions--}

Readonly. Returns the text options.

```javascript
textOptions : TextOptions;
```


### getStartIndex() {#getStartIndex--}

<b>@deprecated.</b> Please use the 'startIndex' property instead. Gets the start index of the characters.

```javascript
getStartIndex() : number;
```


### getLength() {#getLength--}

<b>@deprecated.</b> Please use the 'length' property instead. Gets the length of the characters.

```javascript
getLength() : number;
```


### getFont() {#getFont--}

<b>@deprecated.</b> Please use the 'font' property instead. Returns the font of this object.

```javascript
getFont() : Font;
```


**Returns**

[Font](../font/)

### getTextOptions() {#getTextOptions--}

<b>@deprecated.</b> Please use the 'textOptions' property instead. Returns the text options.

```javascript
getTextOptions() : TextOptions;
```


**Returns**

[TextOptions](../textoptions/)

### setWordArtStyle(PresetWordArtStyle) {#setWordArtStyle-presetwordartstyle-}

Sets the preset WordArt style.

```javascript
setWordArtStyle(style: PresetWordArtStyle) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | [PresetWordArtStyle](../presetwordartstyle/) | The preset WordArt style. |

**Remarks**

Only for the text of shape/chart.

### isNull() {#isNull--}

Checks whether the implementation object is null.

```javascript
isNull() : boolean;
```


### getType() {#getType--}

Gets the type of text node.

```javascript
getType() : TextNodeType;
```


**Returns**

[TextNodeType](../textnodetype/)


