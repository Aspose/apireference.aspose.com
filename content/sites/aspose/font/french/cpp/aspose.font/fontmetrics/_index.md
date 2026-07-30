---
title: "Aspose::Font::FontMetrics class"
linktitle: "FontMetrics"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::FontMetrics class. Représente les métriques de police en C++."
type: docs
weight: 800
url: /fr/cpp/aspose.font/fontmetrics/
---
## FontMetrics class


Représente les métriques de [Font](../font/).

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Obtient la valeur Ascender. |
| [get_Descender](./get_descender/)() override | Obtient la valeur Descender. |
| [get_FontBBox](./get_fontbbox/)() override | Obtient la valeur de [FontBBox](../fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | Obtient la valeur FontMatrix. |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | Obtient la valeur de IsFixedPitch. |
| [get_LineGap](./get_linegap/)() override | Obtient la valeur de LineGap. |
| [get_TypoAscender](./get_typoascender/)() override | Obtient la valeur de TypoAscender. |
| [get_TypoDescender](./get_typodescender/)() override | Obtient la valeur de TypoDescender. |
| [get_TypoLineGap](./get_typolinegap/)() override | Obtient la valeur de TypoLineGap. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Obtient la valeur de UnitsPerEM. |
| [GetAscender](./getascender/)(double) override | Renvoie l'ascendant pour une taille de [Font](../font/) spécifique. |
| [GetDescender](./getdescender/)(double) override | Renvoie le descendant pour une taille de [Font](../font/) spécifique. |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Renvoie le BBox du glyphe. Renvoie [FontBBox](../fontbbox/) si le BBox n'était pas défini pour le glyphe. Peut être remplacé par des implémenteurs d'encodage de police spécifiques. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Renvoie la largeur du glyphe. Peut être remplacé par des implémenteurs d'encodage de police spécifiques. |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Renvoie la valeur du crénage pour la paire de glyphes. |
| [GetTypoAscender](./gettypoascender/)(double) override | Renvoie le descendant pour une taille de [Font](../font/) spécifique. |
| [GetTypoDescender](./gettypodescender/)(double) override | Renvoie le descendant pour une taille de [Font](../font/) spécifique. |
| [GetTypoLineGap](./gettypolinegap/)(double) override | Renvoie l'écart de ligne pour une taille de [Font](../font/) spécifique. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Mesure la chaîne et renvoie la largeur de la chaîne. |
| [set_Ascender](./set_ascender/)(double) override | Obtient la valeur Ascender. |
| [set_Descender](./set_descender/)(double) override | Obtient la valeur Descender. |
| [set_TypoAscender](./set_typoascender/)(double) override | Obtient la valeur de TypoAscender. |
| [set_TypoDescender](./set_typodescender/)(double) override | Obtient la valeur de TypoDescender. |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | Obtient la valeur de UnitsPerEM. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Définit la largeur du glyphe. |
## Voir aussi

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
