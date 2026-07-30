---
title: "méthode Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font pour C++"
description: "méthode Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath. Rend le glyphe en utilisant un chemin de glyphe indépendant. La famille de fonctions `RenderGlyph()` modifie le chemin du glyphe lors du rendu. Cela entraîne la nécessité de recharger ce glyphe à nouveau. Cette fonction utilise une copie du chemin du glyphe et ne modifie pas le chemin original du glyphe, de sorte que le même glyphe puisse être réutilisé plusieurs fois. Cette version de la fonction est destinée à être utilisée avec un cache de glyphes en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase::RenderIndependentGlyphPath method


Rend le glyphe en utilisant un chemin de glyphe indépendant. La famille de fonctions [RenderGlyph()](../renderglyph/) modifie le chemin du glyphe lors du rendu. Cela entraîne la nécessité de recharger ce glyphe à nouveau. Cette fonction utilise une copie du chemin du glyphe et ne modifie pas le chemin original du glyphe, de sorte que le même glyphe puisse être réutilisé plusieurs fois. Cette version de la fonction est destinée à être utilisée avec un cache de glyphes.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice physique du glyphe à l'intérieur du [Font](../../../aspose.font/font/). Notez que ce n'est pas un unicode. |
| glyphe | System::SharedPtr\<Glyphs::Glyph\> | Glyphe à rendre. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
