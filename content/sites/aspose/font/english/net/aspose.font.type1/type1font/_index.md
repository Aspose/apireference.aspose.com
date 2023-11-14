---
title: Class Type1Font
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Type1.Type1Font class. Represents Type1 Font
type: docs
weight: 1250
url: /net/aspose.font.type1/type1font/
---
## Type1Font class

Represents Type1 Font.

```csharp
public class Type1Font : Font
```

## Properties

| Name | Description |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1font/encoding/) { get; } | Gets Font encoding. |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition/) { get; } | Gets Font definition. |
| override [FontFamily](../../aspose.font.type1/type1font/fontfamily/) { get; set; } | Gets Font family. The Font family setter is not implemented yet. |
| override [FontName](../../aspose.font.type1/type1font/fontname/) { get; set; } | Gets Font face name. The Font face name setter is not implemented yet. |
| override [FontNames](../../aspose.font.type1/type1font/fontnames/) { get; } | Gets Font names. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | Gets Font save functionality. |
| override [FontStyle](../../aspose.font.type1/type1font/fontstyle/) { get; } | Gets Font style. This is a value computed and represented in generalized type. |
| override [FontType](../../aspose.font.type1/type1font/fonttype/) { get; } | Gets Font type. Returns FontType.Type1 value. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | Font glyph accessor. Retrieves glyphs and glyph identifiers. |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype/) { get; } | Glyph id type specification. |
| override [Metrics](../../aspose.font.type1/type1font/metrics/) { get; } | Gets Font metrics. |
| override [NumGlyphs](../../aspose.font.type1/type1font/numglyphs/) { get; } | Gets number of glyphs in the Font. |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames/) { get; } | Gets postscript Font names. |
| override [Style](../../aspose.font.type1/type1font/style/) { get; set; } | Gets Font style. This is a raw string value provided by Font file. The Style setter is not implemented yet. |

## Methods

| Name | Description |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert/)(FontType) | Converts the Font into another format. |
| override [GetAllGlyphIds](../../aspose.font.type1/type1font/getallglyphids/)() | Returns array of all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. Type1 Font glyph id can be instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| override [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid)(GlyphId) | Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. Type1 Font glyph id can be instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| virtual [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid_1)(string) | Returns glyph by glyph id. |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid_2)(uint) | Returns glyph by glyph id. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | Gets glyphs representation for text. |
| virtual [Save](../../aspose.font/font/save/)(Stream) | Saves the Font into original format. |
| virtual [Save](../../aspose.font/font/save/)(string) | Saves the Font into original format. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | Saves the Font into format specified. |

### See Also

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


