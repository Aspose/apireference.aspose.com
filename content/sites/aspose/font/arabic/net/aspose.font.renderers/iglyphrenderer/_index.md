---
title: "الواجهة IGlyphRenderer"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "واجهة Aspose.Font.Renderers.IGlyphRenderer. تُستخدم الواجهة لتصوير الحروف."
type: docs
weight: 590
url: /ar/net/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer interface

واجهة تُستخدم لتصيير الحروف.

```csharp
public interface IGlyphRenderer
```

## الطرق

| الاسم | الوصف |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph)(IFont, GlyphId) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_3)(IFont, uint) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_2)(IFont, GlyphId, TransformationMatrix) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_4)(IFont, uint, TransformationMatrix) | يقوم برسم الحرف. |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_1)(IFont, GlyphId, Glyph, TransformationMatrix) | يقوم برسم الحرف، وهو هدف هذا الإصدار المحمَّل - لاستخدامه مع ذاكرة التخزين المؤقتة للحروف. |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | يقوم برسم الحرف باستخدام مسار حرف مستقل. عائلة الدالة RenderGlyph() تغير مسار الحرف أثناء الرسم. يؤدي ذلك إلى ضرورة إعادة تحميل هذا الحرف مرة أخرى. تستخدم هذه الدالة نسخة من مسار الحرف ولا تغير مسار الحرف الأصلي، لذا يمكن إعادة استخدام نفس الحرف عدة مرات. يُقصد بهذا الإصدار من الدالة الاستخدام مع ذاكرة التخزين المؤقتة للحروف. |

### انظر أيضاً

* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


