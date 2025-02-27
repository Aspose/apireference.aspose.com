---
title: Class TtfFont
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Ttf.TtfFont class. Represents TrueType Font TTF
type: docs
weight: 830
url: /net/aspose.font.ttf/ttffont/
---
## TtfFont class

Represents TrueType Font (TTF).

```csharp
public class TtfFont : Font
```

## Properties

| Name | Description |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont/) { get; } | Gets CFF Font if present. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding/) { get; } | Gets Font encoding. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition/) { get; } | Gets Font definition. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily/) { get; set; } | Gets or Sets Font family. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname/) { get; set; } | Gets or Sets Font face name. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames/) { get; } | Gets Font names. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | Gets Font save functionality. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle/) { get; } | Gets Font style. This is a value computed and represented in generalized type. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype/) { get; } | Gets Font type. Returns FontType.TTF value. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | Font glyph accessor. Retrieves glyphs and glyph identifiers. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype/) { get; } | Gets glyph id type specification. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic/) { get; } | Returns true in case Font is symbolic. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics/) { get; } | Gets Font metrics. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs/) { get; } | Gets number of glyphs in the Font. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames/) { get; } | Gets Postscript Font names. |
| override [Style](../../aspose.font.ttf/ttffont/style/) { get; set; } | Gets or Sets Font style. This is a raw string value provided by Font file. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables/) { get; } | Gets TTF tables. |

## Methods

| Name | Description |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert/#convert)(FontType) | Converts the Font into another format. |
| [Convert](../../aspose.font.ttf/ttffont/convert/#convert_1)(FontType, ICollection&lt;uint&gt;) | Converts the Font into another format with limiting character set |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids/)() | Returns array of all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid)(GlyphId) | Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid_1)(string) | Returns glyph by glyph name. Name (string) glyph addressing is supported for TTF fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid_2)(uint) | Returns glyph by glyph id. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid_1)(string, GlyphIdList) | Gets a glyph by glyph name passed and fills passed list of glyph identifiers with components of this glyph. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Gets a glyph by glyph index passed and fills passed list of glyph identifiers with components of this glyph. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext/)(string) | Get glyphs representation for text. |
| virtual [Save](../../aspose.font/font/save/)(Stream) | Saves the Font into original format. |
| virtual [Save](../../aspose.font/font/save/)(string) | Saves the Font into original format. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | Saves the Font into format specified. |

### See Also

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


