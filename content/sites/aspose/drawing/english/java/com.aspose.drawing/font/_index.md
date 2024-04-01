---
title: Font
second_title: Aspose.Drawing for Java API Reference
description: Defines a particular format for text including font face size and style attributes.
type: docs
weight: 21
url: /java/com.aspose.drawing/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public final class Font implements System.IDisposable
```

Defines a particular format for text, including font face, size, and style attributes. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [Font(Font prototype, int newStyle)](#Font-com.aspose.drawing.Font-int-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class uses the specified existing [Font](../../com.aspose.drawing/font) and [FontStyle](../../com.aspose.drawing/fontstyle) enumeration.. |
| [Font(FontFamily family, float emSize)](#Font-com.aspose.drawing.FontFamily-float-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class. |
| [Font(FontFamily family, float emSize, int style)](#Font-com.aspose.drawing.FontFamily-float-int-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size and style.. |
| [Font(FontFamily family, float emSize, int style, int unit)](#Font-com.aspose.drawing.FontFamily-float-int-int-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, and unit. |
| [Font(FontFamily family, float emSize, int style, int unit, byte gdiCharSet)](#Font-com.aspose.drawing.FontFamily-float-int-int-byte-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, unit, and character set.. |
| [Font(FontFamily family, float emSize, int style, int unit, byte gdiCharSet, boolean gdiVerticalFont)](#Font-com.aspose.drawing.FontFamily-float-int-int-byte-boolean-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, unit, and character set.. |
| [Font(String familyName, float emSize)](#Font-java.lang.String-float-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size. |
| [Font(String familyName, float emSize, int style)](#Font-java.lang.String-float-int-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size and style. |
| [Font(String familyName, float emSize, int style, int unit)](#Font-java.lang.String-float-int-int-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, and unit. |
| [Font(String familyName, float emSize, int style, int unit, byte gdiCharSet)](#Font-java.lang.String-float-int-int-byte-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, unit, and character set. |
| [Font(String familyName, float emSize, int style, int unit, byte gdiCharSet, boolean gdiVerticalFont)](#Font-java.lang.String-float-int-int-byte-boolean-) | Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using the specified size, style, unit, and character set. |
## Methods

| Method | Description |
| --- | --- |
| [getFontFamily()](#getFontFamily--) | Gets the `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) associated with this [Font](../../com.aspose.drawing/font). |
| [getBold()](#getBold--) | Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is bold. |
| [getGdiCharSet()](#getGdiCharSet--) | Gets a byte value that specifies the GDI character set that this [Font](../../com.aspose.drawing/font) uses. |
| [getGdiVerticalFont()](#getGdiVerticalFont--) | Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is derived from a GDI vertical font.. |
| [getItalic()](#getItalic--) | Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is italic. |
| [getName()](#getName--) | Gets the face name of this [Font](../../com.aspose.drawing/font). |
| [getStrikeout()](#getStrikeout--) | Gets a value indicating whether this [Font](../../com.aspose.drawing/font) specifies a horizontal line through the font. |
| [getUnderline()](#getUnderline--) | Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is underlined. |
| [getStyle()](#getStyle--) | Gets style information for this [Font](../../com.aspose.drawing/font). |
| [getSize()](#getSize--) | Gets the em-size of this [Font](../../com.aspose.drawing/font) measured in the units specified by the `Font.Unit` property. |
| [getSizeInPoints()](#getSizeInPoints--) | Gets the em-size, in points, of this [Font](../../com.aspose.drawing/font). |
| [getUnit()](#getUnit--) | Gets the unit of measure for this [Font](../../com.aspose.drawing/font). |
| [getHeight_Rename_Namesake()](#getHeight-Rename-Namesake--) | Gets the line spacing of this font. |
| [isSystemFont()](#isSystemFont--) | Gets a value indicating whether the font is a member of [SystemFonts](../../com.aspose.drawing/systemfonts). |
| [getSystemFontName()](#getSystemFontName--) | Gets the name of the system font if the IsSystemFont property returns true. |
| [getOriginalFontName()](#getOriginalFontName--) | Gets the name of the font originally specified. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [Font](../../com.aspose.drawing/font). |
| [equals(Object obj)](#equals-java.lang.Object-) | Indicates whether the specified object is a [Font](../../com.aspose.drawing/font) and has the same `FontFamily`([.getFontFamily](../../null/\#getFontFamily)), `M:GdiVerticalFont`, `M:GdiCharSet`, `M:Style`, `M:Size`, and `M:Unit` property values as this [Font](../../com.aspose.drawing/font). |
| [hashCode()](#hashCode--) | Gets the hash code for this [Font](../../com.aspose.drawing/font). |
| [getHeight()](#getHeight--) | Returns the line spacing, in pixels, of this font. |
| [getHeight(Graphics graphics)](#getHeight-com.aspose.drawing.Graphics-) | Returns the line spacing, in the current unit of a specified [Graphics](../../com.aspose.drawing/graphics), of this font. |
| [getHeight(float dpi)](#getHeight-float-) | Returns the height, in pixels, of this [Font](../../com.aspose.drawing/font) when drawn to a device with the specified vertical resolution. |
| [dispose()](#dispose--) | Releases all resources used by this [Font](../../com.aspose.drawing/font). |
| [toString()](#toString--) | Returns a human-readable string representation of this [Font](../../com.aspose.drawing/font). |
| [getCharacterSet()](#getCharacterSet--) | Gets a byte value that specifies the character set that this `Font` uses. |
### Font(Font prototype, int newStyle) {#Font-com.aspose.drawing.Font-int-}
```
public Font(Font prototype, int newStyle)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class uses the specified existing [Font](../../com.aspose.drawing/font) and [FontStyle](../../com.aspose.drawing/fontstyle) enumeration..

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| prototype | [Font](../../com.aspose.drawing/font) | The existing [Font](../../com.aspose.drawing/font) from which to create the new [Font](../../com.aspose.drawing/font). |
| newStyle | int | The [FontStyle](../../com.aspose.drawing/fontstyle) to apply to the new [Font](../../com.aspose.drawing/font). Multiple values of the [FontStyle](../../com.aspose.drawing/fontstyle) enumeration can be combined with the OR operator. |

### Font(FontFamily family, float emSize) {#Font-com.aspose.drawing.FontFamily-float-}
```
public Font(FontFamily family, float emSize)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | The `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) of the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size, in points, of the new font. |

### Font(FontFamily family, float emSize, int style) {#Font-com.aspose.drawing.FontFamily-float-int-}
```
public Font(FontFamily family, float emSize, int style)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size and style..

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | The `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) of the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size, in points, of the new font. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |

### Font(FontFamily family, float emSize, int style, int unit) {#Font-com.aspose.drawing.FontFamily-float-int-int-}
```
public Font(FontFamily family, float emSize, int style, int unit)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, and unit.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | The `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) of the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size of the new font in the units specified by the `unit` parameter. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |
| unit | int | The [GraphicsUnit](../../com.aspose.drawing/graphicsunit) of the new font. |

### Font(FontFamily family, float emSize, int style, int unit, byte gdiCharSet) {#Font-com.aspose.drawing.FontFamily-float-int-int-byte-}
```
public Font(FontFamily family, float emSize, int style, int unit, byte gdiCharSet)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, unit, and character set..

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | The `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) of the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size of the new font in the units specified by the `unit` parameter. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |
| unit | int | The [GraphicsUnit](../../com.aspose.drawing/graphicsunit) of the new font. |
| gdiCharSet | byte | GDI character set to use for the new font. |

### Font(FontFamily family, float emSize, int style, int unit, byte gdiCharSet, boolean gdiVerticalFont) {#Font-com.aspose.drawing.FontFamily-float-int-int-byte-boolean-}
```
public Font(FontFamily family, float emSize, int style, int unit, byte gdiCharSet, boolean gdiVerticalFont)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, unit, and character set..

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | The `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) of the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size of the new font in the units specified by the `unit` parameter. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |
| unit | int | The [GraphicsUnit](../../com.aspose.drawing/graphicsunit) of the new font. |
| gdiCharSet | byte | GDI character set to use for the new font. |
| gdiVerticalFont | boolean | A Boolean value indicating whether the new font is derived from a GDI vertical font. |

### Font(String familyName, float emSize) {#Font-java.lang.String-float-}
```
public Font(String familyName, float emSize)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | A string representation of the FontFamily for the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size, in points, of the new font. |

### Font(String familyName, float emSize, int style) {#Font-java.lang.String-float-int-}
```
public Font(String familyName, float emSize, int style)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size and style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | A string representation of the FontFamily for the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size, in points, of the new font. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |

### Font(String familyName, float emSize, int style, int unit) {#Font-java.lang.String-float-int-int-}
```
public Font(String familyName, float emSize, int style, int unit)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, and unit.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | A string representation of the `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) for the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size of the new font in the units specified by the `unit` parameter. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |
| unit | int | The [GraphicsUnit](../../com.aspose.drawing/graphicsunit) of the new font. |

### Font(String familyName, float emSize, int style, int unit, byte gdiCharSet) {#Font-java.lang.String-float-int-int-byte-}
```
public Font(String familyName, float emSize, int style, int unit, byte gdiCharSet)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using a specified size, style, unit, and character set.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | A string representation of the FontFamily for the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size of the new font in the units specified by the `unit` parameter. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |
| unit | int | The [GraphicsUnit](../../com.aspose.drawing/graphicsunit) of the new font. |
| gdiCharSet | byte | A byte that specifies a GDI character set to use for this font. |

### Font(String familyName, float emSize, int style, int unit, byte gdiCharSet, boolean gdiVerticalFont) {#Font-java.lang.String-float-int-int-byte-boolean-}
```
public Font(String familyName, float emSize, int style, int unit, byte gdiCharSet, boolean gdiVerticalFont)
```


Initializes a new instance of the [Font](../../com.aspose.drawing/font) class using the specified size, style, unit, and character set.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | A string representation of the FontFamily for the new [Font](../../com.aspose.drawing/font). |
| emSize | float | The em-size of the new font in the units specified by the `unit` parameter. |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) of the new font. |
| unit | int | The [GraphicsUnit](../../com.aspose.drawing/graphicsunit) of the new font. |
| gdiCharSet | byte | A byte that specifies a GDI character set to use for this font. |
| gdiVerticalFont | boolean | A Boolean value indicating whether the new [Font](../../com.aspose.drawing/font) is derived from a GDI vertical font. |

### getFontFamily() {#getFontFamily--}
```
public FontFamily getFontFamily()
```


Gets the `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) associated with this [Font](../../com.aspose.drawing/font).

**Returns:**
[FontFamily](../../com.aspose.drawing/fontfamily) - The `FontFamily`([.getFontFamily](../../null/\#getFontFamily)) associated with this [Font](../../com.aspose.drawing/font).
### getBold() {#getBold--}
```
public boolean getBold()
```


Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is bold.

**Returns:**
boolean - a value indicating whether this [Font](../../com.aspose.drawing/font) is bold.
### getGdiCharSet() {#getGdiCharSet--}
```
public byte getGdiCharSet()
```


Gets a byte value that specifies the GDI character set that this [Font](../../com.aspose.drawing/font) uses.

**Returns:**
byte - A byte value that specifies the GDI character set that this [Font](../../com.aspose.drawing/font) uses.
### getGdiVerticalFont() {#getGdiVerticalFont--}
```
public boolean getGdiVerticalFont()
```


Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is derived from a GDI vertical font..

Value: `true` if this [Font](../../com.aspose.drawing/font) is derived from a GDI vertical font; otherwise, `false`.

**Returns:**
boolean - a value indicating whether this [Font](../../com.aspose.drawing/font) is derived from a GDI vertical font.
### getItalic() {#getItalic--}
```
public boolean getItalic()
```


Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is italic.

**Returns:**
boolean - a value indicating whether this [Font](../../com.aspose.drawing/font) is italic.
### getName() {#getName--}
```
public String getName()
```


Gets the face name of this [Font](../../com.aspose.drawing/font).

**Returns:**
java.lang.String - the face name of this [Font](../../com.aspose.drawing/font).
### getStrikeout() {#getStrikeout--}
```
public boolean getStrikeout()
```


Gets a value indicating whether this [Font](../../com.aspose.drawing/font) specifies a horizontal line through the font.

**Returns:**
boolean - a value indicating whether this [Font](../../com.aspose.drawing/font) specifies a horizontal line through the font.
### getUnderline() {#getUnderline--}
```
public boolean getUnderline()
```


Gets a value indicating whether this [Font](../../com.aspose.drawing/font) is underlined.

**Returns:**
boolean - a value indicating whether this [Font](../../com.aspose.drawing/font) is underlined.
### getStyle() {#getStyle--}
```
public int getStyle()
```


Gets style information for this [Font](../../com.aspose.drawing/font).

**Returns:**
int - style information for this [Font](../../com.aspose.drawing/font).
### getSize() {#getSize--}
```
public float getSize()
```


Gets the em-size of this [Font](../../com.aspose.drawing/font) measured in the units specified by the `Font.Unit` property.

**Returns:**
float - the em-size of this [Font](../../com.aspose.drawing/font) measured in the units specified by the \{@code Font.
### getSizeInPoints() {#getSizeInPoints--}
```
public float getSizeInPoints()
```


Gets the em-size, in points, of this [Font](../../com.aspose.drawing/font).

**Returns:**
float - The em-size, in points, of this [Font](../../com.aspose.drawing/font).
### getUnit() {#getUnit--}
```
public int getUnit()
```


Gets the unit of measure for this [Font](../../com.aspose.drawing/font).

**Returns:**
int - the unit of measure for this [Font](../../com.aspose.drawing/font).
### getHeight_Rename_Namesake() {#getHeight-Rename-Namesake--}
```
public int getHeight_Rename_Namesake()
```


Gets the line spacing of this font.

Value: The line spacing, in pixels, of this font.

**Returns:**
int - the line spacing of this font.
### isSystemFont() {#isSystemFont--}
```
public boolean isSystemFont()
```


Gets a value indicating whether the font is a member of [SystemFonts](../../com.aspose.drawing/systemfonts).

Value: `true` if the font is a member of [SystemFonts](../../com.aspose.drawing/systemfonts); otherwise, `false`.

**Returns:**
boolean - a value indicating whether the font is a member of [SystemFonts](../../com.aspose.drawing/systemfonts).
### getSystemFontName() {#getSystemFontName--}
```
public String getSystemFontName()
```


Gets the name of the system font if the IsSystemFont property returns true.

Value: The name of the system font, if IsSystemFont returns true; otherwise, an empty string ("").

**Returns:**
java.lang.String - the name of the system font if the IsSystemFont property returns true.
### getOriginalFontName() {#getOriginalFontName--}
```
public String getOriginalFontName()
```


Gets the name of the font originally specified.

Value: The string representing the name of the font originally specified.

**Returns:**
java.lang.String - the name of the font originally specified.
### deepClone() {#deepClone--}
```
public Font deepClone()
```


Creates an exact copy of this [Font](../../com.aspose.drawing/font).

**Returns:**
[Font](../../com.aspose.drawing/font) - The [Font](../../com.aspose.drawing/font) this method creates, cast as an Object.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Indicates whether the specified object is a [Font](../../com.aspose.drawing/font) and has the same `FontFamily`([.getFontFamily](../../null/\#getFontFamily)), `M:GdiVerticalFont`, `M:GdiCharSet`, `M:Style`, `M:Size`, and `M:Unit` property values as this [Font](../../com.aspose.drawing/font).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The object to test. |

**Returns:**
boolean - `true` if the obj parameter is a [Font](../../com.aspose.drawing/font) and has the same `FontFamily`([.getFontFamily](../../null/\#getFontFamily)), `M:GdiVerticalFont`, `M:GdiCharSet`, `M:Style`, `M:Size`, and `M:Unit` property values as this [Font](../../com.aspose.drawing/font); otherwise, `false`.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gets the hash code for this [Font](../../com.aspose.drawing/font).

**Returns:**
int - The hash code for this [Font](../../com.aspose.drawing/font).
### getHeight() {#getHeight--}
```
public int getHeight()
```


Returns the line spacing, in pixels, of this font.

**Returns:**
int - The line spacing, in pixels, of this font.
### getHeight(Graphics graphics) {#getHeight-com.aspose.drawing.Graphics-}
```
public float getHeight(Graphics graphics)
```


Returns the line spacing, in the current unit of a specified [Graphics](../../com.aspose.drawing/graphics), of this font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| graphics | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that holds the vertical resolution, in dots per inch, of the display device as well as settings for page unit and page scale. |

**Returns:**
float - The line spacing, in pixels, of this font.
### getHeight(float dpi) {#getHeight-float-}
```
public int getHeight(float dpi)
```


Returns the height, in pixels, of this [Font](../../com.aspose.drawing/font) when drawn to a device with the specified vertical resolution.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dpi | float | The vertical resolution, in dots per inch, used to calculate the height of the font. |

**Returns:**
int - The height, in pixels, of this [Font](../../com.aspose.drawing/font).
### dispose() {#dispose--}
```
public void dispose()
```


Releases all resources used by this [Font](../../com.aspose.drawing/font).

### toString() {#toString--}
```
public String toString()
```


Returns a human-readable string representation of this [Font](../../com.aspose.drawing/font).

**Returns:**
java.lang.String - A string that represents this [Font](../../com.aspose.drawing/font).
### getCharacterSet() {#getCharacterSet--}
```
public int getCharacterSet()
```


Gets a byte value that specifies the character set that this `Font` uses.

**Returns:**
int - A character set that this `Font` uses.
