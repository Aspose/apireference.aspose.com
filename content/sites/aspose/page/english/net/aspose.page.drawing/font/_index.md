---
title: Class Font
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Font class. Defines a particular format for text including font face size and style attributes. This class cannot be inherited
type: docs
weight: 280
url: /net/aspose.page.drawing/font/
---
## Font class

Defines a particular format for text, including font face, size, and style attributes. This class cannot be inherited.

```csharp
public sealed class Font : ICloneable, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Font](font/#constructor)(Font, FontStyle) | Initializes a new `Font` that uses the specified existing `Font` and [`FontStyle`](../fontstyle/) enumeration. |
| [Font](font/#constructor_1)(string, float) | Initializes a new `Font` using a specified size. |
| [Font](font/#constructor_2)(string, float, FontStyle) | Initializes a new `Font` using a specified size and style. |

## Properties

| Name | Description |
| --- | --- |
| [Bold](../../aspose.page.drawing/font/bold/) { get; } | Gets a value that indicates whether this `Font` is bold. |
| [Height](../../aspose.page.drawing/font/height/) { get; } | Gets the line spacing of this font. |
| [IsSystemFont](../../aspose.page.drawing/font/issystemfont/) { get; } | Gets a value indicating whether the font is a member of SystemFonts. |
| [Italic](../../aspose.page.drawing/font/italic/) { get; } | Gets a value that indicates whether this `Font` is italic. |
| [Name](../../aspose.page.drawing/font/name/) { get; } | Gets the face name of this `Font`. |
| [OriginalFontName](../../aspose.page.drawing/font/originalfontname/) { get; } | Gets the name of the font originally specified. |
| [Size](../../aspose.page.drawing/font/size/) { get; } | Gets the em-size of this `Font` measured in the units specified by the Unit property. |
| [SizeInPoints](../../aspose.page.drawing/font/sizeinpoints/) { get; } | Gets the em-size, in points, of this `Font`. |
| [Strikeout](../../aspose.page.drawing/font/strikeout/) { get; } | Gets a value that indicates whether this `Font` specifies a horizontal line through the font. |
| [Style](../../aspose.page.drawing/font/style/) { get; } | Gets style information for this `Font`. |
| [SystemFontName](../../aspose.page.drawing/font/systemfontname/) { get; } | Gets the name of the system font if the [`IsSystemFont`](./issystemfont/) property returns true. |
| [Underline](../../aspose.page.drawing/font/underline/) { get; } | Gets a value that indicates whether this `Font` is underlined. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.drawing/font/clone/)() | Creates an exact copy of this `Font`. |
| [Dispose](../../aspose.page.drawing/font/dispose/)() | Releases all resources used by this `Font`. |
| override [Equals](../../aspose.page.drawing/font/equals/)(object) | Indicates whether the specified object is a `Font` and has the same FontFamily, GdiVerticalFont, GdiCharSet, [`Style`](./style/), [`Size`](./size/), and Unit property values as this `Font`. |
| override [GetHashCode](../../aspose.page.drawing/font/gethashcode/)() | Gets the hash code for this `Font`. |
| [GetHeight](../../aspose.page.drawing/font/getheight/#getheight)() | Returns the line spacing, in pixels, of this font. |
| [GetHeight](../../aspose.page.drawing/font/getheight/#getheight_1)(float) | Returns the height, in pixels, of this `Font` when drawn to a device with the specified vertical resolution. |
| override [ToString](../../aspose.page.drawing/font/tostring/)() | Returns a string representation of this `Font`. |

### See Also

* namespace [Aspose.Page.Drawing](../../aspose.page.drawing/)
* assembly [Aspose.Page](../../)


