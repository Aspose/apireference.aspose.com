---
title: "Метод Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph"
linktitle: "RenderGlyph"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph. Отрисовывает глиф в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.renderers/iglyphrenderer/renderglyph/
---
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Отрисовывает глиф.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| шрифт | System::SharedPtr\<IFont\> | Шрифт, содержащий глиф. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Отрисовывает глиф, цель этой перегруженной версии — использовать кэш для глифов.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| шрифт | System::SharedPtr\<IFont\> | Шрифт, содержащий глиф. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | Глиф для рендеринга. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Матрица, применяемая к координатам глифа. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Отрисовывает глиф.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| шрифт | System::SharedPtr\<IFont\> | Шрифт, содержащий глиф. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Матрица, применяемая к координатам глифа. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Отрисовывает глиф.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| шрифт | System::SharedPtr\<IFont\> | Шрифт, содержащий глиф. |
| glyphIndex | uint32_t | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Отрисовывает глиф.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| шрифт | System::SharedPtr\<IFont\> | Шрифт, содержащий глиф. |
| glyphIndex | uint32_t | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Матрица, применяемая к координатам глифа. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
