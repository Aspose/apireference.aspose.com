---
title: "Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath 方法"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath 方法。 使用独立的字形路径渲染字形。 RenderGlyph() 函数族在渲染时会更改字形路径，这导致需要再次重新加载该字形。 此函数使用字形路径的副本且不会更改原始字形路径，因此同一字形可以多次重复使用。 此函数版本旨在与 C++ 中的字形缓存一起使用。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/
---
## IGlyphRenderer::RenderIndependentGlyphPath method


使用独立的字形路径渲染字形。[RenderGlyph()](../renderglyph/) 函数族在渲染时会更改字形路径，导致需要再次重新加载该字形。此函数使用字形路径的副本且不更改原始字形路径，因此同一字形可以多次重复使用。此函数版本旨在用于字形缓存。

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | System::SharedPtr\<IFont\> | 包含该字形的字体。 |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | 字体内部的物理字形索引。 请注意，这不是 Unicode。 |
| 字形 | System::SharedPtr\<Glyphs::Glyph\> | 要渲染的字形。 |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | 应用于字形坐标的矩阵。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
