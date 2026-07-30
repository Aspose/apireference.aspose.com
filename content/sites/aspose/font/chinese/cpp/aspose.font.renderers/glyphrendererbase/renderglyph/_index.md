---
title: "Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph 方法"
linktitle: "RenderGlyph"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph 方法。用于在 C++ 中渲染字形。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


渲染字形。

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | 包含该字形的 [Font](../../../aspose.font/font/)。 |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | 在 [Font](../../../aspose.font/font/) 中的物理字形索引。请注意，这不是 Unicode。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


渲染字形，此重载版本的目标是用于字形缓存。

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | System::SharedPtr\<IFont\> | 包含该字形的字体。 |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | 在 [Font](../../../aspose.font/font/) 中的物理字形索引。请注意，这不是 Unicode。 |
| 字形 | System::SharedPtr\<Glyphs::Glyph\> | 要渲染的字形。 |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | 应用于字形坐标的矩阵。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


渲染字形。

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | 包含该字形的 [Font](../../../aspose.font/font/)。 |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | 在 [Font](../../../aspose.font/font/) 中的物理字形索引。请注意，这不是 Unicode。 |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | 应用于字形坐标的矩阵。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


渲染字形。

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | 包含该字形的 [Font](../../../aspose.font/font/)。 |
| glyphIndex | uint32_t | 在 [Font](../../../aspose.font/font/) 中的物理字形索引。请注意，这不是 Unicode。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


渲染字形。

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | 包含该字形的 [Font](../../../aspose.font/font/)。 |
| glyphIndex | uint32_t | 在 [Font](../../../aspose.font/font/) 中的物理字形索引。请注意，这不是 Unicode。 |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | 应用于字形坐标的矩阵。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
