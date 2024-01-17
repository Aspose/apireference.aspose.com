---
title: ColorMap
second_title: Aspose.Drawing for Java API Reference
description: Defines a map for converting colors.
type: docs
weight: 13
url: /java/com.aspose.drawing.imaging/colormap/
---
**Inheritance:**
java.lang.Object
```
public final class ColorMap
```

Defines a map for converting colors. Several methods of the [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) class adjust image colors by using a color-remap table, which is an array of [ColorMap](../../com.aspose.drawing.imaging/colormap) structures. Not inheritable.
## Constructors

| Constructor | Description |
| --- | --- |
| [ColorMap()](#ColorMap--) | Initializes a new instance of the [ColorMap](../../com.aspose.drawing.imaging/colormap) class. |
## Methods

| Method | Description |
| --- | --- |
| [getOldColor()](#getOldColor--) | Gets the existing [Color](../../com.aspose.drawing/color) structure to be converted. |
| [setOldColor(Color value)](#setOldColor-com.aspose.drawing.Color-) | Sets the existing [Color](../../com.aspose.drawing/color) structure to be converted. |
| [getNewColor()](#getNewColor--) | Gets the new [Color](../../com.aspose.drawing/color) structure to which to convert. |
| [setNewColor(Color value)](#setNewColor-com.aspose.drawing.Color-) | Sets the new [Color](../../com.aspose.drawing/color) structure to which to convert. |
### ColorMap() {#ColorMap--}
```
public ColorMap()
```


Initializes a new instance of the [ColorMap](../../com.aspose.drawing.imaging/colormap) class.

### getOldColor() {#getOldColor--}
```
public Color getOldColor()
```


Gets the existing [Color](../../com.aspose.drawing/color) structure to be converted.

**Returns:**
[Color](../../com.aspose.drawing/color) - The existing [Color](../../com.aspose.drawing/color) structure to be converted.
### setOldColor(Color value) {#setOldColor-com.aspose.drawing.Color-}
```
public void setOldColor(Color value)
```


Sets the existing [Color](../../com.aspose.drawing/color) structure to be converted.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Color](../../com.aspose.drawing/color) | the existing [Color](../../com.aspose.drawing/color) structure to be converted. |

### getNewColor() {#getNewColor--}
```
public Color getNewColor()
```


Gets the new [Color](../../com.aspose.drawing/color) structure to which to convert.

**Returns:**
[Color](../../com.aspose.drawing/color) - The new [Color](../../com.aspose.drawing/color) structure to which to convert.
### setNewColor(Color value) {#setNewColor-com.aspose.drawing.Color-}
```
public void setNewColor(Color value)
```


Sets the new [Color](../../com.aspose.drawing/color) structure to which to convert.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Color](../../com.aspose.drawing/color) | the new [Color](../../com.aspose.drawing/color) structure to which to convert. |

