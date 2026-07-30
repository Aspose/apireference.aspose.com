---
title: "Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath méthode"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath méthode. Rend le glyphe en utilisant un chemin de glyphe indépendant. La famille de fonctions RenderGlyph() modifie le chemin du glyphe lors du rendu. Cela entraîne la nécessité de recharger ce glyphe à nouveau. Cette fonction utilise une copie du chemin du glyphe et ne modifie pas le chemin original, de sorte que le même glyphe puisse être réutilisé plusieurs fois. Cette version de la fonction est destinée à être utilisée avec un cache de glyphes en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/
---
## IGlyphRenderer::RenderIndependentGlyphPath method


Rend le glyphe en utilisant un chemin de glyphe indépendant. La famille de fonctions [RenderGlyph()](../renderglyph/) modifie le chemin du glyphe lors du rendu. Cela entraîne la nécessité de recharger ce glyphe à nouveau. Cette fonction utilise une copie du chemin du glyphe et ne modifie pas le chemin original du glyphe, de sorte que le même glyphe puisse être réutilisé plusieurs fois. Cette version de la fonction est destinée à être utilisée avec un cache de glyphes.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| idGlyph | System::SharedPtr\<Glyphs::GlyphId\> | Indice de glyphe physique dans la police. Notez que ce n'est pas un Unicode. |
| glyphe | System::SharedPtr\<Glyphs::Glyph\> | Glyphe à rendre. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
