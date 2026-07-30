---
title: "الفئة GlyphOutlineRenderer"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.Renderers.GlyphOutlineRenderer. تمثّل مُعالج مخطط الحرف."
type: docs
weight: 570
url: /ar/net/aspose.font.renderers/glyphoutlinerenderer/
---
## GlyphOutlineRenderer class

يمثل مُصيّر مخطط الحرف.

```csharp
public class GlyphOutlineRenderer : GlyphRendererBase
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [GlyphOutlineRenderer](glyphoutlinerenderer/)(IGlyphOutlinePainter) | يُهيئ كائنًا جديدًا `GlyphOutlineRenderer`. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, uint) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId, TransformationMatrix) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, uint, TransformationMatrix) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId, Glyph, TransformationMatrix) | يقوم برسم الحرف، وهو هدف هذا الإصدار المحمَّل - لاستخدامه مع ذاكرة التخزين المؤقتة للحروف. |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | يقوم برسم الحرف باستخدام مسار حرف مستقل. عائلة الدالة RenderGlyph() تغير مسار الحرف أثناء الرسم. يؤدي ذلك إلى ضرورة إعادة تحميل هذا الحرف مرة أخرى. تستخدم هذه الدالة نسخة من مسار الحرف ولا تغير مسار الحرف الأصلي، لذا يمكن إعادة استخدام نفس الحرف عدة مرات. يُقصد بهذا الإصدار من الدالة الاستخدام مع ذاكرة التخزين المؤقتة للحروف. |

### انظر أيضاً

* class [GlyphRendererBase](../glyphrendererbase/)
* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


