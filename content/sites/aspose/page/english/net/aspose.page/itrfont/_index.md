---
title: Interface ITrFont
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.ITrFont interface. This interface gives access to main parameters of font
type: docs
weight: 660
url: /net/aspose.page/itrfont/
---
## ITrFont interface

This interface gives access to main parameters of font.

```csharp
public interface ITrFont
```

## Properties

| Name | Description |
| --- | --- |
| [CharStrings](../../aspose.page/itrfont/charstrings/) { get; } | Returns mapping between character name and glyph. |
| [Encoding](../../aspose.page/itrfont/encoding/) { get; } | Returns enbcoding array. |
| [EncodingTable](../../aspose.page/itrfont/encodingtable/) { get; } | Returns the name of the encoding. |
| [FID](../../aspose.page/itrfont/fid/) { get; } | Returns font identificator. |
| [FontName](../../aspose.page/itrfont/fontname/) { get; } | Returns font name. |
| [FontType](../../aspose.page/itrfont/fonttype/) { get; } | Returns a type of font in Adobe classification. |
| [NativeFont](../../aspose.page/itrfont/nativefont/) { get; } | Returns System.Drawing.Font corresponding to this font. |
| [Size](../../aspose.page/itrfont/size/) { get; } | Returns font size. |
| [Style](../../aspose.page/itrfont/style/) { get; } | Returns font style. |
| [Transform](../../aspose.page/itrfont/transform/) { get; } | Returns font transform. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page/itrfont/clone/)() | Clones the font. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont)(float) | Creates equivalent of this font with new size. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_3)(FontStyle) | Creates equivalent of this font with new style. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_2)(Matrix) | f character Creates equivalent of this font with new transform. |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_1)(float, FontStyle) | Creates equivalent of this font with new size and style. |
| [GetCharWidth](../../aspose.page/itrfont/getcharwidth/)(char) | Returns a width of character. |
| [GetOutline](../../aspose.page/itrfont/getoutline/)(char, float, float) | Returns an outline of glyph in specified location. |

### See Also

* namespace [Aspose.Page](../../aspose.page/)
* assembly [Aspose.Page](../../)


