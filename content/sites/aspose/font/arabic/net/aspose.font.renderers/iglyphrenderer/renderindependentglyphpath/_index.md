---
title: "IGlyphRenderer.RenderIndependentGlyphPath"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IGlyphRenderer. تقوم برسم الحرف باستخدام مسار حرف مستقل. عائلة الدالة RenderGlyph تغير مسار الحرف عند الرسم. يؤدي ذلك إلى ضرورة إعادة تحميل هذا الحرف مرة أخرى. تستخدم هذه الدالة نسخة من مسار الحرف ولا تغير مسار الحرف الأصلي بحيث يمكن إعادة استخدام نفس الحرف عدة مرات. تم تصميم هذا الإصدار من الدالة للاستخدام مع ذاكرة تخزين مؤقت للحروف."
type: docs
weight: 20
url: /ar/net/aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/
---
## IGlyphRenderer.RenderIndependentGlyphPath method

يقوم برسم الحرف باستخدام مسار حرف مستقل. عائلة الدالة RenderGlyph() تغير مسار الحرف أثناء الرسم. يؤدي ذلك إلى ضرورة إعادة تحميل هذا الحرف مرة أخرى. تستخدم هذه الدالة نسخة من مسار الحرف ولا تغير مسار الحرف الأصلي، لذا يمكن إعادة استخدام نفس الحرف عدة مرات. يُقصد بهذا الإصدار من الدالة الاستخدام مع ذاكرة التخزين المؤقتة للحروف.

```csharp
public void RenderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, 
    TransformationMatrix glyphPlacementMatrix)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| الخط | IFont | الخط الذي يحتوي على الحرف. |
| glyphId | GlyphId | فهرس الحرف الفيزيائي داخل الخط. لاحظ أن هذا ليس يونيكود. |
| الحرف | حرف | الحرف للتصوير. |
| glyphPlacementMatrix | TransformationMatrix | المصفوفة التي تُطبق على إحداثيات الحرف. |

### انظر أيضاً

* interface [IFont](../../../aspose.font/ifont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* interface [IGlyphRenderer](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)


