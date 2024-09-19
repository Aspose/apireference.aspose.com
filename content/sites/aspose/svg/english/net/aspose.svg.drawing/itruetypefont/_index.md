---
title: ITrueTypeFont Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Drawing.ITrueTypeFont interface. Declares methods for working with TrueType fonts
type: docs
weight: 2230
url: /net/aspose.svg.drawing/itruetypefont/
---
## ITrueTypeFont interface

Declares methods for working with TrueType fonts.

```csharp
public interface ITrueTypeFont
```

## Properties

| Name | Description |
| --- | --- |
| [DataSize](../../aspose.svg.drawing/itruetypefont/datasize/) { get; } | Gets the size of the font data in bytes. |
| [FamilyName](../../aspose.svg.drawing/itruetypefont/familyname/) { get; } | Gets the name of the font family. |
| [FontData](../../aspose.svg.drawing/itruetypefont/fontdata/) { get; } | Gets the font data associated with the TrueType font. See IFontData. |
| [FullFontName](../../aspose.svg.drawing/itruetypefont/fullfontname/) { get; } | Full font name is generally represented as combination of Family and Subfamily names. |
| [Style](../../aspose.svg.drawing/itruetypefont/style/) { get; } | Gets the style of the font. |
| [SubFamilyName](../../aspose.svg.drawing/itruetypefont/subfamilyname/) { get; } | The Subfamily name distinguishes the font in a group with the same Family name. This is assumed to address style (italic, oblique) and weight (light, bold, black, etc.). A font with no particular differences in weight or style should have the string "Regular". |

## Methods

| Name | Description |
| --- | --- |
| [GetAscent](../../aspose.svg.drawing/itruetypefont/getascent/)(float) | Gets the ascent of the font in points using the specified font size. |
| [GetData](../../aspose.svg.drawing/itruetypefont/getdata/)() | Opens the stream with the font data. The caller is responsible for disposing the stream. |
| [GetDescent](../../aspose.svg.drawing/itruetypefont/getdescent/)(float) | Gets the descent of the font in points using the specified font size. |

### See Also

* namespace [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../)
