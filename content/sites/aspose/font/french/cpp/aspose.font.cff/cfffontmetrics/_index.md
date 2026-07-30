---
title: "Aspose::Font::Cff::CffFontMetrics classe"
linktitle: "CffFontMetrics"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Cff::CffFontMetrics classe. Représente les métriques de police CFF en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


Représente les métriques du [Font](../../aspose.font/font/) CFF.

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Obtient la valeur Ascender. |
| [get_Descender](./get_descender/)() override | Obtient la valeur Descender. |
| [get_FontBBox](./get_fontbbox/)() override | Obtient la valeur de [FontBBox](../../aspose.font/fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | Obtient la valeur FontMatrix. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Obtient la valeur de UnitsPerEM. |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | Calcule la matrice de transformation pour le glyphe spécifié par l'identifiant. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Renvoie la largeur du glyphe. Peut être remplacée par des héritiers d'encodage de [Font](../../aspose.font/font/) spécifiques. |
| [MeasureString](./measurestring/)(System::String, double) override | Mesure la chaîne et renvoie la largeur de la chaîne. |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | Définit la largeur du glyphe. |
## Voir aussi

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
