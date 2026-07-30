---
title: "طريقة Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath. تصيّر الحرف باستخدام مسار حرف مستقل. عائلة الدالة [RenderGlyph()](../renderglyph/) تُغيّر مسار الحرف أثناء التصيير، مما يؤدي إلى ضرورة إعادة تحميل هذا الحرف مرة أخرى. تستخدم هذه الدالة نسخة من مسار الحرف ولا تُغيّر مسار الحرف الأصلي، لذا يمكن إعادة استخدام نفس الحرف عدة مرات. تم تصميم هذا الإصدار للاستخدام مع ذاكرة تخزين مؤقتة للحروف في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase::RenderIndependentGlyphPath method


يصّير الحرف باستخدام مسار حرف مستقل. عائلة الدالة [RenderGlyph()](../renderglyph/) تُغيّر مسار الحرف أثناء التصيير، مما يؤدي إلى ضرورة إعادة تحميل هذا الحرف مرة أخرى. تستخدم هذه الدالة نسخة من مسار الحرف ولا تُغيّر مسار الحرف الأصلي، لذا يمكن إعادة استخدام نفس الحرف عدة مرات. تم تصميم هذا الإصدار للاستخدام مع ذاكرة تخزين مؤقتة للحروف.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الخط الذي يحتوي على الحرف. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | فهرس الحرف الفعلي داخل [Font](../../../aspose.font/font/). لاحظ أن هذا ليس يونيكود. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | الحرف لتصييره. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | المصفوفة التي تُطبق على إحداثيات الحرف. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
