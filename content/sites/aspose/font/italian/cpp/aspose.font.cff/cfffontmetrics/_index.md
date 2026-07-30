---
title: "Aspose::Font::Cff::CffFontMetrics class"
linktitle: "CffFontMetrics"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffFontMetrics class. Rappresenta le metriche del Font CFF in C++."
type: docs
weight: 300
url: /it/cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


Rappresenta le metriche del CFF [Font](../../aspose.font/font/).

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Restituisce il valore Ascender. |
| [get_Descender](./get_descender/)() override | Restituisce il valore Descender. |
| [get_FontBBox](./get_fontbbox/)() override | Restituisce il valore di [FontBBox](../../aspose.font/fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | Restituisce il valore FontMatrix. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Restituisce il valore UnitsPerEM. |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | Calcola la matrice di trasformazione per il glifo specificato dall'ID. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Restituisce la larghezza del glifo. Può essere sovrascritta da eredi di codifica specifici del [Font](../../aspose.font/font/). |
| [MeasureString](./measurestring/)(System::String, double) override | Misura la stringa e restituisce la larghezza della stringa. |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | Imposta la larghezza del glifo. |
## Vedi anche

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
