---
title: "Classe Aspose::Font::IFontMetrics"
linktitle: "IFontMetrics"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::IFontMetrics. Definisce un'interfaccia per gli strumenti di metriche del Font in C++."
type: docs
weight: 1600
url: /it/cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


Definisce un'interfaccia per gli strumenti di metriche del [Font](../font/).

```cpp
class IFontMetrics : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | Ottiene il valore ascendente del [Font](../font/) in unità del font. |
| virtual [get_Descender](./get_descender/)() | Ottiene il valore discendente del [Font](../font/) in unità del font. |
| virtual [get_FontBBox](./get_fontbbox/)() | Ottiene il riquadro di delimitazione del [Font](../font/). |
| virtual [get_FontMatrix](./get_fontmatrix/)() | Ottiene la matrice di trasformazione del [Font](../font/). |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | Vero, se il [Font](../font/) è monospazio. |
| virtual [get_LineGap](./get_linegap/)() | Ottiene il valore LineGap del [Font](../font/) in unità del [Font](../font/). |
| virtual [get_TypoAscender](./get_typoascender/)() | Ottiene il valore ascendente tipografico del [Font](../font/) in unità del font. |
| virtual [get_TypoDescender](./get_typodescender/)() | Ottiene il valore discendente tipografico del [Font](../font/) in unità del [Font](../font/). |
| virtual [get_TypoLineGap](./get_typolinegap/)() | Ottiene il valore tipografico LineGap del [Font](../font/) in unità del [Font](../font/). |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | Ottiene le unità per em. |
| virtual [GetAscender](./getascender/)(double) | Restituisce l'ascendente per una dimensione specifica del [Font](../font/). |
| virtual [GetDescender](./getdescender/)(double) | Restituisce il discendente per una dimensione specifica del [Font](../font/). |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | Restituisce il BBox del glifo. |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | Restituisce la larghezza del glifo. |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | Restituisce il valore di kerning per la coppia di glifi. |
| virtual [GetTypoAscender](./gettypoascender/)(double) | Restituisce l'ascendente tipografico per una dimensione specifica del [Font](../font/). |
| virtual [GetTypoDescender](./gettypodescender/)(double) | Restituisce il discendente tipografico per una dimensione specifica del [Font](../font/). |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | Restituisce l'interlinea per una dimensione specifica del [Font](../font/). |
| virtual [MeasureString](./measurestring/)(System::String, double) | Misura la stringa e restituisce la larghezza della stringa. |
| virtual [set_Ascender](./set_ascender/)(double) | Ottiene il valore ascendente del [Font](../font/) in unità del font. |
| virtual [set_Descender](./set_descender/)(double) | Ottiene il valore discendente del [Font](../font/) in unità del font. |
| virtual [set_TypoAscender](./set_typoascender/)(double) | Ottiene il valore ascendente tipografico del [Font](../font/) in unità del font. |
| virtual [set_TypoDescender](./set_typodescender/)(double) | Ottiene il valore discendente tipografico del [Font](../font/) in unità del [Font](../font/). |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | Ottiene le unità per em. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Imposta la larghezza del glifo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
