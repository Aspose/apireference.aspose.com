---
title: ColorTranslator
second_title: Aspose.Drawing for Java API Reference
description: Translates colors to and from GDI  structures.
type: docs
weight: 16
url: /java/com.aspose.drawing/colortranslator/
---
**Inheritance:**
java.lang.Object
```
public final class ColorTranslator
```

Translates colors to and from GDI+ [Color](../../com.aspose.drawing/color) structures. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [ColorTranslator()](#ColorTranslator--) |  |
## Methods

| Method | Description |
| --- | --- |
| [fromHtml(String htmlColor)](#fromHtml-java.lang.String-) | Translates an HTML color representation to a GDI+ [Color](../../com.aspose.drawing/color) structure. |
| [toHtml(Color c)](#toHtml-com.aspose.drawing.Color-) | Translates the specified [Color](../../com.aspose.drawing/color) structure to an HTML string color representation. |
| [fromWin32(int win32Color)](#fromWin32-int-) | Translates a Windows color value to a GDI+ [Color](../../com.aspose.drawing/color) structure. |
| [fromOle(int oleColor)](#fromOle-int-) | Translates an OLE color value to a GDI+ [Color](../../com.aspose.drawing/color) structure. |
| [toWin32(Color c)](#toWin32-com.aspose.drawing.Color-) | Converts [Color](../../com.aspose.drawing/color) structure to Win32 presentation of color. |
| [toOle(Color c)](#toOle-com.aspose.drawing.Color-) | Converts [Color](../../com.aspose.drawing/color) structure to OLE presentation of color. |
### ColorTranslator() {#ColorTranslator--}
```
public ColorTranslator()
```


### fromHtml(String htmlColor) {#fromHtml-java.lang.String-}
```
public static Color fromHtml(String htmlColor)
```


Translates an HTML color representation to a GDI+ [Color](../../com.aspose.drawing/color) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| htmlColor | java.lang.String | The string representation of the Html color to translate. |

**Returns:**
[Color](../../com.aspose.drawing/color) - The [Color](../../com.aspose.drawing/color) structure that represents the translated HTML color or `Empty` if htmlColor is null.
### toHtml(Color c) {#toHtml-com.aspose.drawing.Color-}
```
public static String toHtml(Color c)
```


Translates the specified [Color](../../com.aspose.drawing/color) structure to an HTML string color representation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| c | [Color](../../com.aspose.drawing/color) | The [Color](../../com.aspose.drawing/color) structure to translate. |

**Returns:**
java.lang.String - The string that represents the HTML color.
### fromWin32(int win32Color) {#fromWin32-int-}
```
public static Color fromWin32(int win32Color)
```


Translates a Windows color value to a GDI+ [Color](../../com.aspose.drawing/color) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| win32Color | int | The Windows color to translate. |

**Returns:**
[Color](../../com.aspose.drawing/color) - The [Color](../../com.aspose.drawing/color) structure that represents the translated Windows color.
### fromOle(int oleColor) {#fromOle-int-}
```
public static Color fromOle(int oleColor)
```


Translates an OLE color value to a GDI+ [Color](../../com.aspose.drawing/color) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| oleColor | int | The OLE color to translate. |

**Returns:**
[Color](../../com.aspose.drawing/color) - The [Color](../../com.aspose.drawing/color) structure that represents the translated OLE color.
### toWin32(Color c) {#toWin32-com.aspose.drawing.Color-}
```
public static int toWin32(Color c)
```


Converts [Color](../../com.aspose.drawing/color) structure to Win32 presentation of color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| c | [Color](../../com.aspose.drawing/color) | [Color](../../com.aspose.drawing/color) structure to convert. |

**Returns:**
int - Value that represent Win32 format of color.
### toOle(Color c) {#toOle-com.aspose.drawing.Color-}
```
public static int toOle(Color c)
```


Converts [Color](../../com.aspose.drawing/color) structure to OLE presentation of color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| c | [Color](../../com.aspose.drawing/color) | [Color](../../com.aspose.drawing/color) structure to convert. |

**Returns:**
int - Value that represent OLE format of color.
