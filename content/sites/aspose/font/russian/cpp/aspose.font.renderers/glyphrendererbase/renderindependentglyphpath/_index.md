---
title: "Метод Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath. Рендерит глиф, используя независимый путь глифа. Семейство функций RenderGlyph() изменяет путь глифа при рендеринге. Это приводит к необходимости повторно загрузить этот глиф. Эта функция использует копию пути глифа и не изменяет оригинальный путь глифа, поэтому один и тот же глиф может быть использован многократно. Эта версия функции предназначена для использования с кэшем глифов в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase::RenderIndependentGlyphPath method


Рендерит глиф, используя независимый путь глифа. Функция семейства [RenderGlyph()](../renderglyph/) изменяет путь глифа при рендеринге. Это приводит к необходимости повторно загрузить этот глиф. Эта функция использует копию пути глифа и не изменяет оригинальный путь глифа, поэтому один и тот же глиф может быть использован многократно. Эта версия функции предназначена для использования с кэшем глифов.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
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
