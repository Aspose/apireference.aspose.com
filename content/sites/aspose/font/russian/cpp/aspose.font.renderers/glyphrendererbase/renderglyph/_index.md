---
title: "Метод Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph"
linktitle: "RenderGlyph"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph. Рендерит глиф в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Отрисовывает глиф.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Шрифт [Font](../../../aspose.font/font/), содержащий глиф. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Физический индекс глифа внутри [Font](../../../aspose.font/font/). Обратите внимание, что это не юникод. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Отрисовывает глиф, цель этой перегруженной версии — использовать кэш для глифов.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| шрифт | System::SharedPtr\<IFont\> | Шрифт, содержащий глиф. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Физический индекс глифа внутри [Font](../../../aspose.font/font/). Обратите внимание, что это не юникод. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | Глиф для рендеринга. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Матрица, применяемая к координатам глифа. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Отрисовывает глиф.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Шрифт [Font](../../../aspose.font/font/), содержащий глиф. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Физический индекс глифа внутри [Font](../../../aspose.font/font/). Обратите внимание, что это не юникод. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Матрица, применяемая к координатам глифа. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Отрисовывает глиф.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Шрифт [Font](../../../aspose.font/font/), содержащий глиф. |
| glyphIndex | uint32_t | Физический индекс глифа внутри [Font](../../../aspose.font/font/). Обратите внимание, что это не юникод. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Отрисовывает глиф.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Шрифт [Font](../../../aspose.font/font/), содержащий глиф. |
| glyphIndex | uint32_t | Физический индекс глифа внутри [Font](../../../aspose.font/font/). Обратите внимание, что это не юникод. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Матрица, применяемая к координатам глифа. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
