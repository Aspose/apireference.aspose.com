---
title: TtfFont
second_title: Aspose.Font für .NET-API-Referenz
description: steht für TrueTypeSchriftarten TTF.
type: docs
weight: 630
url: /de/net/aspose.font.ttf/ttffont/
---
## TtfFont class

steht für TrueType-Schriftarten (TTF).

```csharp
public class TtfFont : Font
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | Ruft CFF-Schriftart ab, falls vorhanden. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | Ruft die Schriftartcodierung ab. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | Ruft die Schriftartdefinition ab. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | Ruft die Schriftfamilie ab oder legt sie fest. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | Ruft den Namen der Schriftart ab oder legt ihn fest. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | Ruft Schriftnamen ab. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Ruft die Funktion zum Speichern von Schriftarten ab. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | Ruft den Schriftstil ab. Dies ist ein Wert, der in verallgemeinertem Typ berechnet und dargestellt wird. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | Ruft den Schriftarttyp ab. Gibt den FontType.TTF-Wert zurück. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Font-Glyphen-Accessor. Ruft Glyphen und Glyphenkennungen ab. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | Ruft die Spezifikation des Glyphen-ID-Typs ab. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | Gibt wahr zurück, falls Font symbolisch ist. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | Ruft Schriftartmetriken ab. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | Ruft die Anzahl der Glyphen in der Schriftart ab. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | Ruft Postscript-Schriftartennamen ab. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | Ruft den Schriftstil ab oder legt ihn fest. Dies ist ein roher Zeichenfolgenwert, der von der Schriftdatei bereitgestellt wird. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | Ruft TTF-Tabellen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | Konvertiert die Schriftart in ein anderes Format. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | Gibt ein Array aller Glyphen-IDs zurück, die in der Schriftart verfügbar sind. Die Glyphen-ID ist eine eindeutige Nummer für eine Glyphe, die vom Schriftarttyp abhängig ist. Die TTF-Schriftart-Glyphen-ID kann eine Instanz von sein ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) Klasse oder ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) )-Klasse. Name (String)-Glyphenadressierung wird für TTF-Schriftarten über Post-Tabellenzuordnung unterstützt. Falls CFF-Schriftarten darin enthalten sind, werden die CFF-Strukturen verwendet, um Glyphen nach Namen zu adressieren. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | Gibt Glyphe nach Glyphen-ID zurück. Die Glyphen-ID ist eine eindeutige Nummer für eine Glyphe, die vom Schriftarttyp abhängig ist. Die TTF-Schriftart-Glyphen-ID kann eine Instanz von sein ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) Klasse oder ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) )-Klasse. Name (String)-Glyphenadressierung wird für TTF-Schriftarten über Post-Tabellenzuordnung unterstützt. Falls CFF-Schriftarten darin enthalten sind, werden die CFF-Strukturen verwendet, um Glyphen nach Namen zu adressieren. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | Gibt Glyphe nach Glyphnamen zurück. Name (String)-Glyphenadressierung wird für TTF-Schriftarten über Post-Tabellenzuordnung unterstützt. Falls CFF-Schriftarten darin enthalten sind, werden die CFF-Strukturen verwendet, um Glyphen nach Namen zu adressieren. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | Gibt Glyphe nach Glyphen-ID zurück. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Ruft eine Glyphe nach übergebener Glyphenkennung ab und füllt die übergebene Liste von Glyphenkennungen mit Komponenten dieser Glyphe. Glyphen-ID ist eine eindeutige Nummer für eine Glyphe, die vom Schriftarttyp abhängig ist. TTF Schriftart-Glyphen-ID kann Instanz von sein ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) Klasse oder ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) )-Klasse. Name (String)-Glyphenadressierung wird für TTF-Schriftarten über Post-Tabellenzuordnung unterstützt. Falls CFF-Schriftarten darin enthalten sind, werden die CFF-Strukturen verwendet, um Glyphen nach Namen zu adressieren. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | Ruft eine Glyphe anhand des übergebenen Glyphennamens ab und füllt die übergebene Liste der Glyphenkennungen mit Komponenten dieser Glyphe. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Ruft eine Glyphe nach Glyphenindex ab und füllt die übergebene Liste von Glyphenkennungen mit Komponenten dieser Glyphe. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | Glyphendarstellung für Text abrufen. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Speichert die Schriftart im Originalformat. |
| virtual [Save](../../aspose.font/font/save)(string) | Speichert die Schriftart im Originalformat. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Speichert die Schriftart im angegebenen Format. |

### Siehe auch

* class [Font](../../aspose.font/font)
* namensraum [Aspose.Font.Ttf](../../aspose.font.ttf)
* Montage [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
