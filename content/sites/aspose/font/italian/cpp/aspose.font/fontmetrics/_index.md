---
title: "Aspose::Font::FontMetrics classe"
linktitle: "FontMetrics"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::FontMetrics classe. Rappresenta le metriche del font in C++."
type: docs
weight: 800
url: /it/cpp/aspose.font/fontmetrics/
---
## FontMetrics class


Rappresenta le metriche del [Font](../font/).

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Restituisce il valore Ascender. |
| [get_Descender](./get_descender/)() override | Restituisce il valore Descender. |
| [get_FontBBox](./get_fontbbox/)() override | Ottiene il valore di [FontBBox](../fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | Restituisce il valore FontMatrix. |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | Ottiene il valore di IsFixedPitch. |
| [get_LineGap](./get_linegap/)() override | Restituisce il valore LineGap. |
| [get_TypoAscender](./get_typoascender/)() override | Restituisce il valore TypoAscender. |
| [get_TypoDescender](./get_typodescender/)() override | Restituisce il valore TypoDescender. |
| [get_TypoLineGap](./get_typolinegap/)() override | Restituisce il valore TypoLineGap. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Restituisce il valore UnitsPerEM. |
| [GetAscender](./getascender/)(double) override | Restituisce l'ascendente per una dimensione specifica del [Font](../font/). |
| [GetDescender](./getdescender/)(double) override | Restituisce il discendente per una dimensione specifica del [Font](../font/). |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Restituisce il BBox del glifo. Restituisce [FontBBox](../fontbbox/) se il BBox non è stato definito per il glifo. Può essere sovrascritto da eredi di codifica del font specifici. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Restituisce la larghezza del glifo. Può essere sovrascritto da eredi di codifica del font specifici. |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Restituisce il valore di kerning per la coppia di glifi. |
| [GetTypoAscender](./gettypoascender/)(double) override | Restituisce il discendente per una dimensione specifica del [Font](../font/). |
| [GetTypoDescender](./gettypodescender/)(double) override | Restituisce il discendente per una dimensione specifica del [Font](../font/). |
| [GetTypoLineGap](./gettypolinegap/)(double) override | Restituisce l'interlinea per una dimensione specifica del [Font](../font/). |
| virtual [MeasureString](./measurestring/)(System::String, double) | Misura la stringa e restituisce la larghezza della stringa. |
| [set_Ascender](./set_ascender/)(double) override | Restituisce il valore Ascender. |
| [set_Descender](./set_descender/)(double) override | Restituisce il valore Descender. |
| [set_TypoAscender](./set_typoascender/)(double) override | Restituisce il valore TypoAscender. |
| [set_TypoDescender](./set_typodescender/)(double) override | Restituisce il valore TypoDescender. |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | Restituisce il valore UnitsPerEM. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Imposta la larghezza del glifo. |
## Vedi anche

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
