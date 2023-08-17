---
title: Font
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 500
url: /net/system.drawing/font/
---
## Font class

Defines a particular format for text, including font face, size, and style attributes. This class cannot be inherited.

```csharp
public sealed class Font : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Font](font)(Font, FontStyle) | Initializes a new instance of the [`Font`](../font) class uses the specified existing Font and FontStyle enumeration.. |
| [Font](font)(FontFamily, float) | Initializes a new instance of the [`Font`](../font) class. |
| [Font](font)(string, float) | Initializes a new instance of the [`Font`](../font) class using a specified size. |
| [Font](font)(FontFamily, float, FontStyle) | Initializes a new instance of the [`Font`](../font) class using a specified size and style.. |
| [Font](font)(FontFamily, float, GraphicsUnit) | Initializes a new instance of the [`Font`](../font) class using a specified size and unit. Sets the style to Regular. |
| [Font](font)(string, float, FontStyle) | Initializes a new instance of the [`Font`](../font) class using a specified size and style. |
| [Font](font)(string, float, GraphicsUnit) | Initializes a new instance of the [`Font`](../font) class using a specified size and unit. The style is set to Regular. |
| [Font](font)(FontFamily, float, FontStyle, GraphicsUnit) | Initializes a new instance of the [`Font`](../font) class using a specified size, style, and unit. |
| [Font](font)(string, float, FontStyle, GraphicsUnit) | Initializes a new instance of the [`Font`](../font) class using a specified size, style, and unit. |
| [Font](font)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Initializes a new instance of the [`Font`](../font) class using a specified size, style, unit, and character set.. |
| [Font](font)(string, float, FontStyle, GraphicsUnit, byte) | Initializes a new instance of the [`Font`](../font) class using a specified size, style, unit, and character set. |
| [Font](font)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Initializes a new instance of the [`Font`](../font) class using a specified size, style, unit, and character set.. |
| [Font](font)(string, float, FontStyle, GraphicsUnit, byte, bool) | Initializes a new instance of the [`Font`](../font) class using the specified size, style, unit, and character set. |

## Properties

| Name | Description |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Gets a value indicating whether this Font is bold. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | Gets the FontFamily associated with this Font. |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Gets a byte value that specifies the GDI character set that this Font uses. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Gets a value indicating whether this Font is derived from a GDI vertical font.. |
| [Height](../../system.drawing/font/height) { get; } | Gets the line spacing of this font. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Gets a value indicating whether the font is a member of SystemFonts. |
| [Italic](../../system.drawing/font/italic) { get; } | Gets a value indicating whether this Font is italic. |
| [Name](../../system.drawing/font/name) { get; } | Gets the face name of this Font. |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Gets the name of the font originally specified. |
| [Size](../../system.drawing/font/size) { get; } | Gets the em-size of this Font measured in the units specified by the Unit property. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Gets the em-size, in points, of this Font. |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Gets a value indicating whether this Font specifies a horizontal line through the font. |
| [Style](../../system.drawing/font/style) { get; } | Gets style information for this Font. |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | Gets the name of the system font if the IsSystemFont property returns true. |
| [Underline](../../system.drawing/font/underline) { get; } | Gets a value indicating whether this Font is underlined. |
| [Unit](../../system.drawing/font/unit) { get; } | Gets the unit of measure for this Font. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Creates an exact copy of this Font. |
| [Dispose](../../system.drawing/font/dispose)() | Releases all resources used by this Font. |
| override [Equals](../../system.drawing/font/equals)(object) | Indicates whether the specified object is a Font and has the same FontFamily, GdiVerticalFont, GdiCharSet, Style, Size, and Unit property values as this Font. |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Gets the hash code for this Font. |
| [GetHeight](../../system.drawing/font/getheight)() | Returns the line spacing, in pixels, of this font. |
| [GetHeight](../../system.drawing/font/getheight)(float) | Returns the height, in pixels, of this Font when drawn to a device with the specified vertical resolution. |
| [GetHeight](../../system.drawing/font/getheight)(Graphics) | Returns the line spacing, in the current unit of a specified Graphics, of this font. |
| override [ToString](../../system.drawing/font/tostring)() | Returns a human-readable string representation of this Font. |

### See Also

* namespace [System.Drawing](../../system.drawing)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
