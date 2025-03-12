---
title: Class Font
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Font class. Represents base Font class
type: docs
weight: 240
url: /net/aspose.font/font/
---
## Font class

Represents base Font class.

```csharp
public abstract class Font : IFont, IFontSaver, IGlyphAccessor
```

## Properties

| Name | Description |
| --- | --- |
| abstract [Encoding](../../aspose.font/font/encoding/) { get; } | Gets Font encoding. |
| abstract [FontDefinition](../../aspose.font/font/fontdefinition/) { get; } | Gets Font definition. |
| abstract [FontFamily](../../aspose.font/font/fontfamily/) { get; set; } | Gets or Sets Font family. |
| abstract [FontName](../../aspose.font/font/fontname/) { get; set; } | Gets or Sets Font face name. |
| abstract [FontNames](../../aspose.font/font/fontnames/) { get; } | Gets Font names. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | Gets Font save functionality. |
| abstract [FontStyle](../../aspose.font/font/fontstyle/) { get; } | Gets Font style. This is a value computed and represented in generalized type. |
| abstract [FontType](../../aspose.font/font/fonttype/) { get; } | Gets Font type. Type1, TrueType etc. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | Font glyph accessor. Retrieves glyphs and glyph identifiers. |
| abstract [GlyphIdType](../../aspose.font/font/glyphidtype/) { get; } | Glyph id type specification. For consumers who needs to know the 'bytes[]' real type. |
| abstract [Metrics](../../aspose.font/font/metrics/) { get; } | Gets Font metrics. |
| abstract [NumGlyphs](../../aspose.font/font/numglyphs/) { get; } | Gets number of glyphs in the Font. |
| abstract [PostscriptNames](../../aspose.font/font/postscriptnames/) { get; } | Gets postscript Font names. |
| abstract [Style](../../aspose.font/font/style/) { get; set; } | Gets or Sets Font style. This is a raw string value provided by Font file. |

## Methods

| Name | Description |
| --- | --- |
| static [Open](../../aspose.font/font/open/#open_3)(FontDefinition) | Opens a font, using FontDefinition object. |
| static [Open](../../aspose.font/font/open/#open_1)(FontType, byte[]) | Opens a font, using font type and font data byte array. |
| static [Open](../../aspose.font/font/open/#open)(FontType, StreamSource) | Opens a font, using font type and stream source. |
| static [Open](../../aspose.font/font/open/#open_2)(FontType, string) | Opens a font, using font type and font file name. |
| abstract [Convert](../../aspose.font/font/convert/)(FontType) | Converts the Font into another format. |
| abstract [GetAllGlyphIds](../../aspose.font/font/getallglyphids/)() | Returns all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| abstract [GetGlyphById](../../aspose.font/font/getglyphbyid/)(GlyphId) | Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | Gets glyphs representation for text. |
| virtual [Save](../../aspose.font/font/save/#save)(Stream) | Saves the Font into original format. |
| virtual [Save](../../aspose.font/font/save/#save_1)(string) | Saves the Font into original format. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | Saves the Font into format specified. |

### See Also

* interface [IFont](../ifont/)
* interface [IFontSaver](../ifontsaver/)
* interface [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


