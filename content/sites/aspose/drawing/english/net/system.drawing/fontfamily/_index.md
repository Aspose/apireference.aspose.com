---
title: Class FontFamily
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.FontFamily class. Defines a group of type faces having a similar basic design and certain variations in styles. This class cannot be inherited
type: docs
weight: 500
url: /net/system.drawing/fontfamily/
---
## FontFamily class

Defines a group of type faces having a similar basic design and certain variations in styles. This class cannot be inherited.

```csharp
public sealed class FontFamily : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [FontFamily](fontfamily/#constructor)(string) | Initializes a new instance of the `FontFamily` class with the specified name. |
| [FontFamily](fontfamily/#constructor_1)(string, FontCollection) | Initializes a new instance of the `FontFamily` class. |

## Properties

| Name | Description |
| --- | --- |
| static [GenericMonospace](../../system.drawing/fontfamily/genericmonospace/) { get; } | Gets a generic monospace FontFamily. |
| static [GenericSansSerif](../../system.drawing/fontfamily/genericsansserif/) { get; } | Gets a generic sans serif FontFamily object. |
| static [GenericSerif](../../system.drawing/fontfamily/genericserif/) { get; } | Gets a generic serif FontFamily. |
| [Name](../../system.drawing/fontfamily/name/) { get; } | Gets the name of this FontFamily. |
| static [Families](../../system.drawing/fontfamily/families/) { get; } | Gets an array that contains all the FontFamily objects associated with the current graphics context. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../system.drawing/fontfamily/dispose/)() | Releases all resources used by this FontFamily. |
| override [Equals](../../system.drawing/fontfamily/equals/)(object) | Indicates whether the specified object is a FontFamily and is identical to this FontFamily. |
| [GetCellAscent](../../system.drawing/fontfamily/getcellascent/)(FontStyle) | Returns the cell ascent, in design units, of the FontFamily of the specified style. |
| [GetCellDescent](../../system.drawing/fontfamily/getcelldescent/)(FontStyle) | Returns the cell descent, in design units, of the FontFamily of the specified style. |
| [GetEmHeight](../../system.drawing/fontfamily/getemheight/)(FontStyle) | Gets the height, in font design units, of the EM square for the specified style. |
| override [GetHashCode](../../system.drawing/fontfamily/gethashcode/)() | Gets a hash code for this FontFamily. |
| [GetLineSpacing](../../system.drawing/fontfamily/getlinespacing/)(FontStyle) | Returns the line spacing, in design units, of the FontFamily of the specified style. The line spacing is the vertical distance between the base lines of two consecutive lines of text. |
| [GetName](../../system.drawing/fontfamily/getname/)(int) | Returns the name, in the specified language, of this FontFamily. |
| [IsStyleAvailable](../../system.drawing/fontfamily/isstyleavailable/)(FontStyle) | Indicates whether the specified FontStyle enumeration is available. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


