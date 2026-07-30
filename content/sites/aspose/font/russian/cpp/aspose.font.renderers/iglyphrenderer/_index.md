---
title: "Класс Aspose::Font::Renderers::IGlyphRenderer"
linktitle: "IGlyphRenderer"
second_title: "Aspose.Font для C++"
description: "Класс Aspose::Font::Renderers::IGlyphRenderer. Интерфейс, используемый для рендеринга глифов в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


Интерфейс, используемый для рендеринга глифов.

```cpp
class IGlyphRenderer : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | Отрисовывает глиф. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | Отрисовывает глиф. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | Отрисовывает глиф. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | Отрисовывает глиф. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Отрисовывает глиф, цель этой перегруженной версии — использовать кэш для глифов. |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Отрисовывает глиф, используя независимый путь глифа. Семейство функций [RenderGlyph()](./renderglyph/) изменяет путь глифа при отрисовке. Это приводит к необходимости повторно загружать этот глиф. Эта функция использует копию пути глифа и не изменяет оригинальный путь глифа, поэтому один и тот же глиф может быть переиспользован многократно. Эта версия функции предназначена для использования с кэшем глифов. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
