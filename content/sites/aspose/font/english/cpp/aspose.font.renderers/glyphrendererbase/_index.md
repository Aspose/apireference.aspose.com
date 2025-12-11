---
title: Aspose::Font::Renderers::GlyphRendererBase class
linktitle: GlyphRendererBase
second_title: Aspose.Font for C++
description: 'Aspose::Font::Renderers::GlyphRendererBase class. Represents base class for glyph renderers in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


Represents base class for glyph renderers.

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## Methods

| Method | Description |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | Renders glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | Renders glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Renders glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | Renders glyph. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Renders glyph, an objective of this overloaded version - to be used with cache for glyphs. |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Renders glyph using independent glyph path. [RenderGlyph()](./renderglyph/) function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn't changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs. |
## See Also

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
