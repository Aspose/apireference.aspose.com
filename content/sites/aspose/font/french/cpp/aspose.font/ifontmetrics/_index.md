---
title: "Aspose::Font::IFontMetrics classe"
linktitle: "IFontMetrics"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::IFontMetrics classe. Définit une interface pour les outils de métriques de Font en C++."
type: docs
weight: 1600
url: /fr/cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


Définit une interface pour les outils de métriques du [Font](../font/).

```cpp
class IFontMetrics : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | Obtient la valeur d'ascendant du [Font](../font/) en unités de police. |
| virtual [get_Descender](./get_descender/)() | Obtient la valeur de descendant du [Font](../font/) en unités de police. |
| virtual [get_FontBBox](./get_fontbbox/)() | Obtient la boîte englobante du [Font](../font/). |
| virtual [get_FontMatrix](./get_fontmatrix/)() | Obtient la matrice de transformation du [Font](../font/). |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | Vrai, si le [Font](../font/) est à chasse fixe. |
| virtual [get_LineGap](./get_linegap/)() | Obtient la valeur LineGap du [Font](../font/) en unités de [Font](../font/). |
| virtual [get_TypoAscender](./get_typoascender/)() | Obtient la valeur d'ascendant typographique du [Font](../font/) en unités de police. |
| virtual [get_TypoDescender](./get_typodescender/)() | Obtient la valeur de descendant typographique du [Font](../font/) en unités de [Font](../font/). |
| virtual [get_TypoLineGap](./get_typolinegap/)() | Obtient la valeur typographique LineGap du [Font](../font/) en unités de [Font](../font/). |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | Obtient les unités par em. |
| virtual [GetAscender](./getascender/)(double) | Renvoie l'ascendant pour une taille de [Font](../font/) spécifique. |
| virtual [GetDescender](./getdescender/)(double) | Renvoie le descendant pour une taille de [Font](../font/) spécifique. |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | Renvoie le BBox du glyphe. |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | Renvoie la largeur du glyphe. |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | Renvoie la valeur du crénage pour la paire de glyphes. |
| virtual [GetTypoAscender](./gettypoascender/)(double) | Renvoie l'ascendant typographique pour une taille de [Font](../font/) spécifique. |
| virtual [GetTypoDescender](./gettypodescender/)(double) | Renvoie le descendant typographique pour une taille de [Font](../font/) spécifique. |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | Renvoie l'écart de ligne pour une taille de [Font](../font/) spécifique. |
| virtual [MeasureString](./measurestring/)(System::String, double) | Mesure la chaîne et renvoie la largeur de la chaîne. |
| virtual [set_Ascender](./set_ascender/)(double) | Obtient la valeur d'ascendant du [Font](../font/) en unités de police. |
| virtual [set_Descender](./set_descender/)(double) | Obtient la valeur de descendant du [Font](../font/) en unités de police. |
| virtual [set_TypoAscender](./set_typoascender/)(double) | Obtient la valeur d'ascendant typographique du [Font](../font/) en unités de police. |
| virtual [set_TypoDescender](./set_typodescender/)(double) | Obtient la valeur de descendant typographique du [Font](../font/) en unités de [Font](../font/). |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | Obtient les unités par em. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Définit la largeur du glyphe. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
