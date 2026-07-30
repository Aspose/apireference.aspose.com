---
title: "Aspose::Font::Renderers::GlyphRendererBase class"
linktitle: "GlyphRendererBase"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Renderers::GlyphRendererBase class. Stellt die Basisklasse für Glyph-Renderer in C++ dar."
type: docs
weight: 200
url: /de/cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


Stellt die Basisklasse für Glyph-Renderer dar.

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | Rendert Glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | Rendert Glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Rendert Glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | Rendert Glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Rendert Glyph, ein Ziel dieser überladenen Version – zur Verwendung mit einem Cache für Glyphs. |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Rendert Glyph mit einem unabhängigen Glyph-Pfad. Die Funktionsfamilie [RenderGlyph()](./renderglyph/) ändert den Glyph-Pfad beim Rendern. Das führt dazu, dass dieser Glyph erneut geladen werden muss. Diese Funktion verwendet eine Kopie des Glyph-Pfads und ändert den ursprünglichen Glyph-Pfad nicht, sodass derselbe Glyph mehrfach wiederverwendet werden kann. Diese Funktionsversion ist für die Verwendung mit einem Glyph-Cache vorgesehen. |
## Siehe auch

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
