---
title: RenderingUtils
second_title: Aspose.Font for Java API Reference
description: Provides utility methods for rendering.
type: docs
weight: 56
url: /java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

Provides utility methods for rendering.
## Methods

| Method | Description |
| --- | --- |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | Rendering text in BitMap. |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Rendering text in BitMap. |
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


Rendering text in BitMap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | The font. |
| text | java.lang.String | The text. |
| fontSize | double | The font size. |

**Returns:**
java.io.InputStream - The PNG image with the text as a stream of bytes.
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Rendering text in BitMap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | The font. |
| text | java.lang.String | The text. |
| fontSize | double | The font size. |
| lineSpacingType | [RenderingUtils.LineSpacingType](../../com.aspose.font/renderingutils.linespacingtype) | The type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | The value of line spacing. |
| maxWidth | int | The maximum width in pixels for the resulting image. |

**Returns:**
java.io.InputStream - The PNG image with the text as a stream of bytes.
