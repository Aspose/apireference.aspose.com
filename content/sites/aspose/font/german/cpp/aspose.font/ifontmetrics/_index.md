---
title: "Aspose::Font::IFontMetrics Klasse"
linktitle: "IFontMetrics"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::IFontMetrics Klasse. Definiert eine Schnittstelle für Font-Metrik-Tools in C++."
type: docs
weight: 1600
url: /de/cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


Definiert eine Schnittstelle für [Font](../font/) Metrik-Tools.

```cpp
class IFontMetrics : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | Ermittelt den Aufstiegswert der [Font](../font/) in Schrift-Einheiten. |
| virtual [get_Descender](./get_descender/)() | Ermittelt den Abstiegwert der [Font](../font/) in Schrift-Einheiten. |
| virtual [get_FontBBox](./get_fontbbox/)() | Ermittelt die Begrenzungsbox der [Font](../font/). |
| virtual [get_FontMatrix](./get_fontmatrix/)() | Ermittelt die Transformationsmatrix der [Font](../font/). |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | Wahr, wenn die [Font](../font/) monospaced ist. |
| virtual [get_LineGap](./get_linegap/)() | Ermittelt den LineGap-Wert der [Font](../font/) in [Font](../font/) Einheiten. |
| virtual [get_TypoAscender](./get_typoascender/)() | Ermittelt den typografischen Aufstiegswert der [Font](../font/) in Schrift-Einheiten. |
| virtual [get_TypoDescender](./get_typodescender/)() | Ermittelt den typografischen Abstiegwert der [Font](../font/) in [Font](../font/) Einheiten. |
| virtual [get_TypoLineGap](./get_typolinegap/)() | Ermittelt den typografischen LineGap-Wert der [Font](../font/) in [Font](../font/) Einheiten. |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | Ermittelt Einheiten pro Em. |
| virtual [GetAscender](./getascender/)(double) | Gibt den Aufstieg für eine bestimmte [Font](../font/) Größe zurück. |
| virtual [GetDescender](./getdescender/)(double) | Gibt den Abstieg für eine bestimmte [Font](../font/) Größe zurück. |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | Gibt die Glyphen-BBox zurück. |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | Gibt die Glyphenbreite zurück. |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | Gibt den Kerning-Wert für das Glyph-Paar zurück. |
| virtual [GetTypoAscender](./gettypoascender/)(double) | Gibt den typografischen Aufstieg für eine bestimmte [Font](../font/) Größe zurück. |
| virtual [GetTypoDescender](./gettypodescender/)(double) | Gibt den typografischen Abstieg für eine bestimmte [Font](../font/) Größe zurück. |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | Gibt den Zeilenabstand für eine bestimmte [Font](../font/) Größe zurück. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Misst die Zeichenkette und gibt die Zeichenkettenbreite zurück. |
| virtual [set_Ascender](./set_ascender/)(double) | Ermittelt den Aufstiegswert der [Font](../font/) in Schrift-Einheiten. |
| virtual [set_Descender](./set_descender/)(double) | Ermittelt den Abstiegwert der [Font](../font/) in Schrift-Einheiten. |
| virtual [set_TypoAscender](./set_typoascender/)(double) | Ermittelt den typografischen Aufstiegswert der [Font](../font/) in Schrift-Einheiten. |
| virtual [set_TypoDescender](./set_typodescender/)(double) | Ermittelt den typografischen Abstiegwert der [Font](../font/) in [Font](../font/) Einheiten. |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | Ermittelt Einheiten pro Em. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Setzt die Glyph-Breite. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
