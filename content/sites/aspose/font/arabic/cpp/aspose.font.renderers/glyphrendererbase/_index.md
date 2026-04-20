---
title: "Aspose::Font::Renderers::GlyphRendererBase class"
linktitle: "GlyphRendererBase"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Renderers::GlyphRendererBase class. يمثل الفئة الأساسية لمُعالجات الرموز في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


يمثل الفئة الأساسية لمعالجات الحروف.

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | يرسم الرمز. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | يرسم الرمز. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | يرسم الرمز. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | يرسم الرمز. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | يرسم الرمز، وهو هدف هذه النسخة المحملة الزائدة - لاستخدامها مع ذاكرة التخزين المؤقت للرموز. |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | يرسم الرمز باستخدام مسار رمز مستقل. عائلة الدوال [RenderGlyph()](./renderglyph/) تغير مسار الرمز عند العرض. يؤدي ذلك إلى ضرورة إعادة تحميل هذا الرمز مرة أخرى. تستخدم هذه الدالة نسخة من مسار الرمز ولا تغير مسار الرمز الأصلي، لذا يمكن إعادة استخدام نفس الرمز عدة مرات. تم تصميم هذه النسخة من الدالة للاستخدام مع ذاكرة التخزين المؤقت للرموز. |
## انظر أيضًا

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
