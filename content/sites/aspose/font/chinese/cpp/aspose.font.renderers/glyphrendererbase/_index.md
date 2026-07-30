---
title: "Aspose::Font::Renderers::GlyphRendererBase 类"
linktitle: "GlyphRendererBase"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Renderers::GlyphRendererBase 类。表示 C++ 中字形渲染器的基类。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


表示字形渲染器的基类。

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | 渲染字形。 |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | 渲染字形。 |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | 渲染字形。 |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | 渲染字形。 |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | 渲染字形，此重载版本的目标是用于字形缓存。 |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | 使用独立的字形路径渲染字形。[RenderGlyph()](./renderglyph/) 函数族在渲染时会更改字形路径。这导致需要再次重新加载该字形。该函数使用字形路径的副本，不会更改原始字形路径，因此同一字形可以多次复用。此函数版本旨在与字形缓存一起使用。 |
## 另见

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
