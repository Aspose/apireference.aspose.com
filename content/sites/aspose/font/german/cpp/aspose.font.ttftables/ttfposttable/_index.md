---
title: "Aspose::Font::TtfTables::TtfPostTable Klasse"
linktitle: "TtfPostTable"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfPostTable Klasse. Stellt die \"post\"‑Tabelle der TTF‑Schriftdatei in C++ dar."
type: docs
weight: 1500
url: /de/cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


Stellt die "post"‑Tabelle der TTF [Font](../../aspose.font/font/) Datei dar.

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Format](./get_format/)() | Liefert das feste Format (Version) dieser Tabelle. Veraltet, verwenden Sie die Eigenschaft [TableFormat](../). |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | Gibt an, dass keine PostScript‑Namensinformationen für die Glyphen in dieser Schriftdatei bereitgestellt werden. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | Liefert uint32 isFixedPitch. 0, wenn die Schrift proportional proportioniert ist, ungleich 0, wenn die Schrift nicht proportional proportioniert ist (d. h. monospaced). |
| [get_ItalicAngle](./get_italicangle/)() | Liefert den festen italicAngle. Italic-Winkel in Grad. |
| [get_MaxMemType1](./get_maxmemtype1/)() | Liefert uint32 maxMemType1. Maximale Speichernutzung, wenn eine TrueType-Schrift als Type‑1 [Font](../../aspose.font/font/) heruntergeladen wird. |
| [get_MaxMemType42](./get_maxmemtype42/)() | Liefert uint32 maxMemType42. Maximale Speichernutzung, wenn eine TrueType-Schrift als Type‑42 [Font](../../aspose.font/font/) heruntergeladen wird. |
| [get_MinMemType1](./get_minmemtype1/)() | Liefert uint32 minMemType1. Minimale Speichernutzung, wenn eine TrueType-Schrift als Type‑1 [Font](../../aspose.font/font/) heruntergeladen wird. |
| [get_MinMemType42](./get_minmemtype42/)() | Liefert uint32 minMemType42. Minimale Speichernutzung, wenn eine TrueType-Schrift als Type‑42 [Font](../../aspose.font/font/) heruntergeladen wird. |
| [get_TableFormat](./get_tableformat/)() | Liefert das feste Format (Version) dieser Tabelle. Verwenden Sie die Eigenschaften MajorNumber und MinorNUmber des Objekts [Version16Dot16](../) in hexadezimaler Schreibweise, um die verwendete Version zu ermitteln. |
| static [get_Tag](./get_tag/)() | Liefert das Tabellentag. |
| [get_UnderlinePosition](./get_underlineposition/)() | Liefert den FWord underlinePosition‑Wert. |
| [get_UnderlineThickness](./get_underlinethickness/)() | Liefert den FWord underlineThickness‑Wert. |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | Liefert ein Array von Glyphen‑Indizes nach Glyphen‑Name. |
| [GetGlyphIndex](./getglyphindex/)(System::String) | Liefert den Glyphen‑Index nach Glyphen‑Name. |
| [GetGlyphName](./getglyphname/)(uint32_t) | Liefert den Glyphen‑Namen nach Glyphen‑Index. |
## Siehe auch

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
