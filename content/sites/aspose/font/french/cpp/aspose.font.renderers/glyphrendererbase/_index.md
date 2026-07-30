---
title: "Aspose::Font::Renderers::GlyphRendererBase classe"
linktitle: "GlyphRendererBase"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Renderers::GlyphRendererBase class. Représente la classe de base pour les rendus de glyphes en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


Représente la classe de base pour les rendus de glyphes.

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | Rend le glyphe. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | Rend le glyphe. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Rend le glyphe. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | Rend le glyphe. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Rend le glyphe, un objectif de cette version surchargée - à utiliser avec le cache des glyphes. |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Rend le glyphe en utilisant un chemin de glyphe indépendant. La famille de fonctions [RenderGlyph()](./renderglyph/) modifie le chemin du glyphe lors du rendu. Cela entraîne la nécessité de recharger ce glyphe à nouveau. Cette fonction utilise une copie du chemin du glyphe et ne modifie pas le chemin original, de sorte que le même glyphe puisse être réutilisé plusieurs fois. Cette version de la fonction est destinée à être utilisée avec un cache de glyphes. |
## Voir aussi

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
