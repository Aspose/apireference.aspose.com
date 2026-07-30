---
title: "Aspose::Font::Renderers::GlyphRendererBase class"
linktitle: "GlyphRendererBase"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Renderers::GlyphRendererBase class. Представляет базовый класс для рендереров глифов в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


Представляет базовый класс для рендереров глифов.

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## Методы

| Метод | Описание |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | Отрисовывает глиф. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | Отрисовывает глиф. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Отрисовывает глиф. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | Отрисовывает глиф. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Отрисовывает глиф, цель этой перегруженной версии — использовать кэш для глифов. |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Отрисовывает глиф, используя независимый путь глифа. Семейство функций [RenderGlyph()](./renderglyph/) изменяет путь глифа при отрисовке. Это приводит к необходимости повторно загружать этот глиф. Эта функция использует копию пути глифа и не изменяет оригинальный путь глифа, поэтому один и тот же глиф может быть переиспользован многократно. Эта версия функции предназначена для использования с кэшем глифов. |
## См. также

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
