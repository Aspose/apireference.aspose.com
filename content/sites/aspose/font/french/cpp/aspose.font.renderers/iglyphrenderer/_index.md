---
title: "classe Aspose::Font::Renderers::IGlyphRenderer"
linktitle: "IGlyphRenderer"
second_title: "Aspose.Font pour C++"
description: "classe Aspose::Font::Renderers::IGlyphRenderer. Interface utilisée pour rendre les glyphes en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


Interface utilisée pour rendre les glyphes.

```cpp
class IGlyphRenderer : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | Rend le glyphe. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | Rend le glyphe. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | Rend le glyphe. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | Rend le glyphe. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Rend le glyphe, un objectif de cette version surchargée - à utiliser avec le cache des glyphes. |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Rend le glyphe en utilisant un chemin de glyphe indépendant. La famille de fonctions [RenderGlyph()](./renderglyph/) modifie le chemin du glyphe lors du rendu. Cela entraîne la nécessité de recharger ce glyphe à nouveau. Cette fonction utilise une copie du chemin du glyphe et ne modifie pas le chemin original, de sorte que le même glyphe puisse être réutilisé plusieurs fois. Cette version de la fonction est destinée à être utilisée avec un cache de glyphes. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
