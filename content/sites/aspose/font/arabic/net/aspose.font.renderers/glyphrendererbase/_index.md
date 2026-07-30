---
title: "الفئة GlyphRendererBase"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.Renderers.GlyphRendererBase. تمثّل الفئة الأساسية لمعالجات الحروف."
type: docs
weight: 580
url: /ar/net/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class

يمثل الفئة الأساسية لمُصيري الحروف.

```csharp
public abstract class GlyphRendererBase : IGlyphRenderer
```

## الطرق

| الاسم | الوصف |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph)(IFont, GlyphId) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_3)(IFont, uint) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_2)(IFont, GlyphId, TransformationMatrix) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_4)(IFont, uint, TransformationMatrix) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_1)(IFont, GlyphId, Glyph, TransformationMatrix) | يقوم برسم الحرف، وهو هدف هذا الإصدار المحمَّل - لاستخدامه مع ذاكرة التخزين المؤقتة للحروف. |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | يقوم برسم الحرف باستخدام مسار حرف مستقل. عائلة الدالة RenderGlyph() تغير مسار الحرف أثناء الرسم. يؤدي ذلك إلى ضرورة إعادة تحميل هذا الحرف مرة أخرى. تستخدم هذه الدالة نسخة من مسار الحرف ولا تغير مسار الحرف الأصلي، لذا يمكن إعادة استخدام نفس الحرف عدة مرات. يُقصد بهذا الإصدار من الدالة الاستخدام مع ذاكرة التخزين المؤقتة للحروف. |

### انظر أيضاً

* interface [IGlyphRenderer](../iglyphrenderer/)
* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


