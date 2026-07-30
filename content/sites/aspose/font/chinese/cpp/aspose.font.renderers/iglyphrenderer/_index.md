---
title: "Aspose::Font::Renderers::IGlyphRenderer 类"
linktitle: "IGlyphRenderer"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Renderers::IGlyphRenderer 类。用于在 C++ 中渲染字形的接口。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


用于渲染字形的接口。

```cpp
class IGlyphRenderer : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | 渲染字形。 |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | 渲染字形。 |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | 渲染字形。 |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | 渲染字形。 |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | 渲染字形，此重载版本的目标是用于字形缓存。 |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | 使用独立的字形路径渲染字形。[RenderGlyph()](./renderglyph/) 函数族在渲染时会更改字形路径。这导致需要再次重新加载该字形。该函数使用字形路径的副本，不会更改原始字形路径，因此同一字形可以多次复用。此函数版本旨在与字形缓存一起使用。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
