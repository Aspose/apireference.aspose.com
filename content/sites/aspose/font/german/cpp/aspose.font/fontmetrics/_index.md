---
title: "Aspose::Font::FontMetrics Klasse"
linktitle: "FontMetrics"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::FontMetrics Klasse. Stellt Schriftmetriken in C++ dar."
type: docs
weight: 800
url: /de/cpp/aspose.font/fontmetrics/
---
## FontMetrics class


Stellt [Font](../font/) Metriken dar.

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Liefert Ascender-Wert. |
| [get_Descender](./get_descender/)() override | Liefert Descender-Wert. |
| [get_FontBBox](./get_fontbbox/)() override | Liest den Wert von [FontBBox](../fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | Liefert FontMatrix-Wert. |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | Liest den Wert von IsFixedPitch. |
| [get_LineGap](./get_linegap/)() override | Gibt den LineGap-Wert zurück. |
| [get_TypoAscender](./get_typoascender/)() override | Gibt den TypoAscender-Wert zurück. |
| [get_TypoDescender](./get_typodescender/)() override | Gibt den TypoDescender-Wert zurück. |
| [get_TypoLineGap](./get_typolinegap/)() override | Gibt den TypoLineGap-Wert zurück. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Gibt den UnitsPerEM-Wert zurück. |
| [GetAscender](./getascender/)(double) override | Gibt den Aufstieg für eine bestimmte [Font](../font/) Größe zurück. |
| [GetDescender](./getdescender/)(double) override | Gibt den Abstieg für eine bestimmte [Font](../font/) Größe zurück. |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gibt das Glyph-BBox zurück. Gibt [FontBBox](../fontbbox/) zurück, falls das BBox für das Glyph nicht definiert wurde. Kann von spezifischen Schriftkodierungs-Erben überschrieben werden. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gibt die Glyph-Breite zurück. Kann von spezifischen Schriftkodierungs-Erben überschrieben werden. |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Gibt den Kerning-Wert für das Glyph-Paar zurück. |
| [GetTypoAscender](./gettypoascender/)(double) override | Gibt den Abstieg für eine bestimmte [Font](../font/) Größe zurück. |
| [GetTypoDescender](./gettypodescender/)(double) override | Gibt den Abstieg für eine bestimmte [Font](../font/) Größe zurück. |
| [GetTypoLineGap](./gettypolinegap/)(double) override | Gibt den Zeilenabstand für eine bestimmte [Font](../font/) Größe zurück. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Misst die Zeichenkette und gibt die Zeichenkettenbreite zurück. |
| [set_Ascender](./set_ascender/)(double) override | Liefert Ascender-Wert. |
| [set_Descender](./set_descender/)(double) override | Liefert Descender-Wert. |
| [set_TypoAscender](./set_typoascender/)(double) override | Gibt den TypoAscender-Wert zurück. |
| [set_TypoDescender](./set_typodescender/)(double) override | Gibt den TypoDescender-Wert zurück. |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | Gibt den UnitsPerEM-Wert zurück. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Setzt die Glyph-Breite. |
## Siehe auch

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
