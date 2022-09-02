---
title: TextRenderingHint
second_title: Aspose.Page for Java API Reference
description: Specifies the quality of text rendering.
type: docs
weight: 25
url: /java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Specifies the quality of text rendering.
## Fields

| Field | Description |
| --- | --- |
| [SystemDefault](#SystemDefault) | Each character is drawn using its glyph bitmap, with the system default rendering hint. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Each character is drawn using its glyph bitmap. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Each character is drawn using its glyph bitmap. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Each character is drawn using its antialiased glyph bitmap with hinting. |
| [AntiAlias](#AntiAlias) | Each character is drawn using its antialiased glyph bitmap without hinting. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Each character is drawn using its glyph ClearType bitmap with hinting. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Each character is drawn using its glyph bitmap, with the system default rendering hint. The text will be drawn using whatever font-smoothing settings the user has selected for the system.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Each character is drawn using its glyph bitmap. Hinting is used to improve character appearance on stems and curvature.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Each character is drawn using its glyph bitmap. Hinting is not used.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Each character is drawn using its antialiased glyph bitmap with hinting. Much better quality due to antialiasing, but at a higher performance cost.

### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Each character is drawn using its antialiased glyph bitmap without hinting. Better quality due to antialiasing. Stem width differences may be noticeable because hinting is turned off.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Each character is drawn using its glyph ClearType bitmap with hinting. The highest quality setting. Used to take advantage of ClearType font features.

### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
