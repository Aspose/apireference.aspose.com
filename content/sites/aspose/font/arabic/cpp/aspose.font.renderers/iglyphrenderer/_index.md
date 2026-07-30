---
title: "فئة Aspose::Font::Renderers::IGlyphRenderer"
linktitle: "IGlyphRenderer"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::Renderers::IGlyphRenderer. واجهة تُستخدم لتصيير الحروف في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


واجهة تُستخدم لتصيير الحروف.

```cpp
class IGlyphRenderer : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | يرسم الرمز. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | يرسم الرمز. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | يرسم الرمز. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | يرسم الرمز. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | يرسم الرمز، وهو هدف هذه النسخة المحملة الزائدة - لاستخدامها مع ذاكرة التخزين المؤقت للرموز. |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | يرسم الرمز باستخدام مسار رمز مستقل. عائلة الدوال [RenderGlyph()](./renderglyph/) تغير مسار الرمز عند العرض. يؤدي ذلك إلى ضرورة إعادة تحميل هذا الرمز مرة أخرى. تستخدم هذه الدالة نسخة من مسار الرمز ولا تغير مسار الرمز الأصلي، لذا يمكن إعادة استخدام نفس الرمز عدة مرات. تم تصميم هذه النسخة من الدالة للاستخدام مع ذاكرة التخزين المؤقت للرموز. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
