---
title: ColorPalette
second_title: Aspose.Drawing for Java API Reference
description: Defines an array of colors that make up a color palette.
type: docs
weight: 16
url: /java/com.aspose.drawing.imaging/colorpalette/
---
**Inheritance:**
java.lang.Object
```
public final class ColorPalette
```

Defines an array of colors that make up a color palette. The colors are 32-bit ARGB colors. Not inheritable.
## Constructors

| Constructor | Description |
| --- | --- |
| [ColorPalette(int count)](#ColorPalette-int-) | Initializes a new instance of the `ColorPalette` class and IsCompactPalette is false. |
## Methods

| Method | Description |
| --- | --- |
| [getEntries()](#getEntries--) | Gets an array of `com.aspose.drawing.Color` structures. |
| [isCompactPalette()](#isCompactPalette--) | Gets or sets a value indicating whether compact palette is used. |
| [getFlags()](#getFlags--) |  |
| [setFlags(int flags)](#setFlags-int-) |  |
| [setEntries(int i, Color color)](#setEntries-int-com.aspose.drawing.Color-) |  |
### ColorPalette(int count) {#ColorPalette-int-}
```
public ColorPalette(int count)
```


Initializes a new instance of the `ColorPalette` class and IsCompactPalette is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| count | int | The color palette entries. |

### getEntries() {#getEntries--}
```
public Color[] getEntries()
```


Gets an array of `com.aspose.drawing.Color` structures.

**Returns:**
com.aspose.drawing.Color[] - The entries. The array of `com.aspose.drawing.Color` structure that make up this `Aspose.Imaging.ColorPalette`.
### isCompactPalette() {#isCompactPalette--}
```
public boolean isCompactPalette()
```


Gets or sets a value indicating whether compact palette is used.

**Returns:**
boolean - `true` if compact palette is used; otherwise, `false`.

Compact palette means that image will contain only the specified palette entries if possible or in other words the image will be more compact and occupy less space; otherwise there will be 2^BitsPerPixel entries and image will reserve more space for all possible palette entries. Setting this value to true and changing palette entries may cause performance penalty since data movement may occur so use it carefully.
### getFlags() {#getFlags--}
```
public int getFlags()
```




**Returns:**
int
### setFlags(int flags) {#setFlags-int-}
```
public void setFlags(int flags)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flags | int |  |

### setEntries(int i, Color color) {#setEntries-int-com.aspose.drawing.Color-}
```
public void setEntries(int i, Color color)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| i | int |  |
| color | [Color](../../com.aspose.drawing/color) |  |

