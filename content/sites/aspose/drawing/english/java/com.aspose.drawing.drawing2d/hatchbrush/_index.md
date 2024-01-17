---
title: HatchBrush
second_title: Aspose.Drawing for Java API Reference
description: Defines a rectangular brush with a hatch style a foreground color and a background color.
type: docs
weight: 26
url: /java/com.aspose.drawing.drawing2d/hatchbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.drawing.Brush](../../com.aspose.drawing/brush)
```
public final class HatchBrush extends Brush
```

Defines a rectangular brush with a hatch style, a foreground color, and a background color. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [HatchBrush(int hatchstyle, Color foreColor)](#HatchBrush-int-com.aspose.drawing.Color-) | Initializes a new instance of the [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) class with the specified `HatchStyle`([.getHatchStyle](../../null/\#getHatchStyle)) enumeration and foreground color. |
| [HatchBrush(int hatchstyle, Color foreColor, Color backColor)](#HatchBrush-int-com.aspose.drawing.Color-com.aspose.drawing.Color-) | Initializes a new instance of the [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) class with the specified `HatchStyle`([.getHatchStyle](../../null/\#getHatchStyle)) enumeration, foreground color, and background color. |
## Methods

| Method | Description |
| --- | --- |
| [getHatchStyle()](#getHatchStyle--) | Gets the hatch style of this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object. |
| [getForegroundColor()](#getForegroundColor--) | Gets the color of hatch lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object. |
| [getBackgroundColor()](#getBackgroundColor--) | Gets the color of spaces between the hatch lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object. |
### HatchBrush(int hatchstyle, Color foreColor) {#HatchBrush-int-com.aspose.drawing.Color-}
```
public HatchBrush(int hatchstyle, Color foreColor)
```


Initializes a new instance of the [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) class with the specified `HatchStyle`([.getHatchStyle](../../null/\#getHatchStyle)) enumeration and foreground color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| hatchstyle | int | One of the `HatchStyle`([.getHatchStyle](../../null/\#getHatchStyle)) values that represents the pattern drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush). |
| foreColor | [Color](../../com.aspose.drawing/color) | The [Color](../../com.aspose.drawing/color) structure that represents the color of lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush). |

### HatchBrush(int hatchstyle, Color foreColor, Color backColor) {#HatchBrush-int-com.aspose.drawing.Color-com.aspose.drawing.Color-}
```
public HatchBrush(int hatchstyle, Color foreColor, Color backColor)
```


Initializes a new instance of the [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) class with the specified `HatchStyle`([.getHatchStyle](../../null/\#getHatchStyle)) enumeration, foreground color, and background color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| hatchstyle | int | One of the `HatchStyle`([.getHatchStyle](../../null/\#getHatchStyle)) values that represents the pattern drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush). |
| foreColor | [Color](../../com.aspose.drawing/color) | The [Color](../../com.aspose.drawing/color) structure that represents the color of lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush). |
| backColor | [Color](../../com.aspose.drawing/color) | The [Color](../../com.aspose.drawing/color) structure that represents the color of spaces between the lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush). |

### getHatchStyle() {#getHatchStyle--}
```
public int getHatchStyle()
```


Gets the hatch style of this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object.

**Returns:**
int - the hatch style of this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object.
### getForegroundColor() {#getForegroundColor--}
```
public Color getForegroundColor()
```


Gets the color of hatch lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object.

**Returns:**
[Color](../../com.aspose.drawing/color) - the color of hatch lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object.
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```


Gets the color of spaces between the hatch lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object.

**Returns:**
[Color](../../com.aspose.drawing/color) - the color of spaces between the hatch lines drawn by this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object.
### deepClone() {#deepClone--}
```
public Object deepClone()
```


Creates an exact copy of this [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) object.

**Returns:**
java.lang.Object - The [HatchBrush](../../com.aspose.drawing.drawing2d/hatchbrush) this method creates, cast as an object.
