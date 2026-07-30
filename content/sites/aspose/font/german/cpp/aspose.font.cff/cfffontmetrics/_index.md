---
title: "Aspose::Font::Cff::CffFontMetrics Klasse"
linktitle: "CffFontMetrics"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffFontMetrics Klasse. Stellt CFF-Schriftmetriken in C++ dar."
type: docs
weight: 300
url: /de/cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


Stellt CFF [Font](../../aspose.font/font/) Metriken dar.

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Liefert Ascender-Wert. |
| [get_Descender](./get_descender/)() override | Liefert Descender-Wert. |
| [get_FontBBox](./get_fontbbox/)() override | Gibt den Wert von [FontBBox](../../aspose.font/fontbbox/) zurück. |
| [get_FontMatrix](./get_fontmatrix/)() override | Liefert FontMatrix-Wert. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Gibt den UnitsPerEM-Wert zurück. |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | Berechnet die Transformationsmatrix für das Glyph, das durch die ID angegeben ist. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gibt die Glyph-Breite zurück. Kann von spezifischen [Font](../../aspose.font/font/) Kodierungsableitungen überschrieben werden. |
| [MeasureString](./measurestring/)(System::String, double) override | Misst die Zeichenkette und gibt die Zeichenkettenbreite zurück. |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | Setzt die Glyph-Breite. |
## Siehe auch

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
