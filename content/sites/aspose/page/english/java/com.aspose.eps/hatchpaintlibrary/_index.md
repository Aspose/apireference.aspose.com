---
title: HatchPaintLibrary
second_title: Aspose.Page for Java API Reference
description: Converts GDI hatch brushes into images suitable for writing to XPS and PDF.
type: docs
weight: 11
url: /java/com.aspose.eps/hatchpaintlibrary/
---
**Inheritance:**
java.lang.Object
```
public class HatchPaintLibrary
```

Converts GDI+ hatch brushes into images suitable for writing to XPS and PDF.
## Fields

| Field | Description |
| --- | --- |
| [HatchSize](#HatchSize) |  |
## Methods

| Method | Description |
| --- | --- |
| [getHatchTexturePaint(HatchStyle style, Color foreColor, Color backColor)](#getHatchTexturePaint-com.aspose.eps.HatchStyle-java.awt.Color-java.awt.Color-) | Returns TexturePaint created that encapsulates hatch pattern in accordance to hatch style. |
### HatchSize {#HatchSize}
```
public static final int HatchSize
```


### getHatchTexturePaint(HatchStyle style, Color foreColor, Color backColor) {#getHatchTexturePaint-com.aspose.eps.HatchStyle-java.awt.Color-java.awt.Color-}
```
public static TexturePaint getHatchTexturePaint(HatchStyle style, Color foreColor, Color backColor)
```


Returns TexturePaint created that encapsulates hatch pattern in accordance to hatch style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | [HatchStyle](../../com.aspose.eps/hatchstyle) | The hatch style. |
| foreColor | java.awt.Color | Foreground color. |
| backColor | java.awt.Color | Background color. |

**Returns:**
java.awt.TexturePaint - Returns hatch texture pattern
