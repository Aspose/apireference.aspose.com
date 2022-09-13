---
title: TtfFont
second_title: Aspose.Font för .NET API-referens
description: Representerar TrueType Font TTF.
type: docs
weight: 630
url: /sv/net/aspose.font.ttf/ttffont/
---
## TtfFont class

Representerar TrueType Font (TTF).

```csharp
public class TtfFont : Font
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | Hämtar CFF-teckensnitt om det finns. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | Får teckensnittskodning. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | Hämtar teckensnittsdefinition. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | Hämtar eller ställer in teckensnittsfamilj. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | Hämtar eller ställer in teckensnittsnamn. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | Hämtar teckensnittsnamn. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Får Font Save-funktionalitet. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | Gets Font style. Detta är ett värde som beräknas och representeras i generaliserad typ. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | Hämtar teckensnittstyp. Returnerar FontType.TTF-värde. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Font glyph accessor. Hämtar glyfer och glyph-identifierare. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | Hämtar glyph id-typspecifikation. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | Returnerar sant om teckensnittet är symboliskt. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | Får teckensnittsstatistik. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | Hämtar antal tecken i teckensnittet. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | Får Postscript-teckensnittsnamn. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | Hämtar eller ställer in teckensnittsstil. Detta är ett råsträngsvärde som tillhandahålls av Font file. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | Hämtar TTF-tabeller. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | Konverterar teckensnittet till ett annat format. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | Returnerar array av alla glyph id, tillgängliga i Font. Glyph id är ett unikt nummer för en glyph, vilket är teckensnittsberoende. TTF Font glyph id kan vara en instans av ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) klass eller ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. Namn (sträng) glyph-adressering stöds för TTF-teckensnitt via Post-tabellmappning. Om CFF-teckensnittet är inuti, används CFF-strukturerna för att adressera glyfer efter namn. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | Returnerar glyph efter glyph id. Glyph id är ett unikt nummer för en glyph, vilket är teckensnittsberoende. TTF Font glyph id kan vara en instans av ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) klass eller ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. Namn (sträng) glyph-adressering stöds för TTF-teckensnitt via Post-tabellmappning. Om CFF-teckensnittet är inuti, används CFF-strukturerna för att adressera glyfer efter namn. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | Returnerar glyf efter glyfnamn. Namn (sträng) Glyfadressering stöds för TTF-teckensnitt via Post-tabellmappning. Om CFF-teckensnitt inuti används CFF-strukturerna för att adressera glyf efter namn. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | Returnerar glyph för glyph id. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Får en glyf efter glyfidentifierare godkänd och fyller godkänd lista med glyfidentifierare med komponenterna av denna glyph. Glyf-id är ett unikt nummer för en glyf, vilket är teckensnittsberoende. TTF Teckensnittsglyph-id[`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) klass eller ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. Namn (sträng) glyph-adressering stöds för TTF-teckensnitt via Post-tabellmappning. Om CFF-teckensnittet är inuti, används CFF-strukturerna för att adressera glyfer efter namn. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | Får en glyf efter glyfnamn skickad och fyller godkänd lista med glyfidentifierare med komponenterna av denna glyf. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Får en glyf efter glyfindex godkänd och fyller godkänd lista med glyfidentifierare med komponenterna av denna glyf. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | Få glyferrepresentation för text. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Sparar teckensnittet i originalformat. |
| virtual [Save](../../aspose.font/font/save)(string) | Sparar teckensnittet i originalformat. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Sparar teckensnittet i det angivna formatet. |

### Se även

* class [Font](../../aspose.font/font)
* namnutrymme [Aspose.Font.Ttf](../../aspose.font.ttf)
* hopsättning [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
