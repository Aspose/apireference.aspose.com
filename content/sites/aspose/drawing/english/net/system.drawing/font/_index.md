---
title: Font
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 490
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
| [Bold](bold) { get; } | Gets a value indicating whether this Font is bold. |
| [FontFamily](fontfamily) { get; } | Gets the FontFamily associated with this Font. |
| [GdiCharSet](gdicharset) { get; } | Gets a byte value that specifies the GDI character set that this Font uses. |
| [GdiVerticalFont](gdiverticalfont) { get; } | Gets a value indicating whether this Font is derived from a GDI vertical font.. |
| [Height](height) { get; } | Gets the line spacing of this font. |
| [IsSystemFont](issystemfont) { get; } | Gets a value indicating whether the font is a member of SystemFonts. |
| [Italic](italic) { get; } | Gets a value indicating whether this Font is italic. |
| [Name](name) { get; } | Gets the face name of this Font. |
| [OriginalFontName](originalfontname) { get; } | Gets the name of the font originally specified. |
| [Size](size) { get; } | Gets the em-size of this Font measured in the units specified by the Unit property. |
| [SizeInPoints](sizeinpoints) { get; } | Gets the em-size, in points, of this Font. |
| [Strikeout](strikeout) { get; } | Gets a value indicating whether this Font specifies a horizontal line through the font. |
| [Style](style) { get; } | Gets style information for this Font. |
| [SystemFontName](systemfontname) { get; } | Gets the name of the system font if the IsSystemFont property returns true. |
| [Underline](underline) { get; } | Gets a value indicating whether this Font is underlined. |
| [Unit](unit) { get; } | Gets the unit of measure for this Font. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](clone)() | Creates an exact copy of this Font. |
| [Dispose](dispose)() | Releases all resources used by this Font. |
| override [Equals](equals)(object) | Indicates whether the specified object is a Font and has the same FontFamily, GdiVerticalFont, GdiCharSet, Style, Size, and Unit property values as this Font. |
| override [GetHashCode](gethashcode)() | Gets the hash code for this Font. |
| [GetHeight](getheight)() | Returns the line spacing, in pixels, of this font. |
| [GetHeight](getheight)(float) | Returns the height, in pixels, of this Font when drawn to a device with the specified vertical resolution. |
| [GetHeight](getheight)(Graphics) | Returns the line spacing, in the current unit of a specified Graphics, of this font. |
| override [ToString](tostring)() | Returns a human-readable string representation of this Font. |

### See Also

* namespace [System.Drawing](../../system.drawing)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
