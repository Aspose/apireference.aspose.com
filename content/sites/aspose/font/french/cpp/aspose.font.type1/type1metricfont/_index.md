---
title: "Aspose::Font::Type1::Type1MetricFont classe"
linktitle: "Type1MetricFont"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Type1::Type1MetricFont classe. Implémentation de police métrique Type1. Cette police type1 est créée uniquement à partir des métriques. Les fonctions de récupération des glyphes et d'autres qui nécessitent une vraie police ne sont pas autorisées, les fonctions non autorisées lèvent l'exception Type1NotSupportedException. Les autres propriétés (FontName, Weight, Metrics et Encoding) sont utilisées à partir du fichier de métriques en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | L'encodage est défini dans le fichier de métriques. StandardAdobeEncoding: l'encodage est rempli automatiquement. |
| [get_FontFamily](./get_fontfamily/)() override | Obtient la famille du [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | Obtient le nom du [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Obtient le style de la [Font](../../aspose.font/font/). Il s'agit d'une valeur calculée et représentée sous forme de type généralisé. |
| [get_NumGlyphs](./get_numglyphs/)() override | Obtient le nombre de glyphes dans la [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Obtient le style du [Font](../../aspose.font/font/). |
| [GetAllGlyphIds](./getallglyphids/)() override | Renvoie tous les identifiants de glyphes, disponibles dans le [Font](../../aspose.font/font/). Non pris en charge pour le type [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::String) override | Renvoie le glyphe par identifiant de glyphe. Non pris en charge pour le type [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Renvoie le glyphe par identifiant de glyphe. Non pris en charge pour le type [Type1MetricFont](./). |
## Voir aussi

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
