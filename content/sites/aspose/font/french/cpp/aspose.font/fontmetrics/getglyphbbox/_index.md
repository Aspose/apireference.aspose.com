---
title: "Méthode Aspose::Font::FontMetrics::GetGlyphBBox"
linktitle: "GetGlyphBBox"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::FontMetrics::GetGlyphBBox. Retourne le BBox du glyphe. Retourne le FontBBox si le BBox n'était pas défini pour le glyphe. Peut être remplacé par des héritiers d'encodage de police spécifiques en C++."
type: docs
weight: 1300
url: /fr/cpp/aspose.font/fontmetrics/getglyphbbox/
---
## FontMetrics::GetGlyphBBox method


Renvoie le BBox du glyphe. Renvoie [FontBBox](../../fontbbox/) si le BBox n'était pas défini pour le glyphe. Peut être remplacé par des héritiers d'encodage de police spécifiques.

```cpp
System::SharedPtr<Aspose::Font::FontBBox> Aspose::Font::FontMetrics::GetGlyphBBox(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| idGlyph | System::SharedPtr\<Glyphs::GlyphId\> | Identifiant du glyphe. |

### ReturnValue

BBox du glyphe.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontBBox](../../fontbbox/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [FontMetrics](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
