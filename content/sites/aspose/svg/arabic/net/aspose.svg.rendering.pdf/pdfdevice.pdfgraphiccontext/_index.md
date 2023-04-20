---
title: Class PdfDevice.PdfGraphicContext
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext فصل. يحمل معلمات التحكم في الرسومات الحالية لـ PdfDevice. تحدد هذه المعلمات الإطار العام الذي ينفذ فيه مشغلو الرسومات.
type: docs
weight: 2960
url: /ar/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

يحمل معلمات التحكم في الرسومات الحالية لـ PdfDevice. تحدد هذه المعلمات الإطار العام الذي ينفذ فيه مشغلو الرسومات.

```csharp
public class PdfGraphicContext : GraphicContext
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | Default_Constructor |

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | تعيين تباعد الأحرف أو الحصول عليه. |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | تعيين كائن الفرشاة المستخدم لملء الأجزاء الداخلية من المسارات أو الحصول عليه. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | تعيين أو الحصول على كائن خط النوع الحقيقي المستخدم في عرض النص. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | تعيين حجم خط النص أو الحصول عليه. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | تعيين نمط خط النص أو الحصول عليه. |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | يضبط أو يحصل على الكود الذي يحدد شكل نقاط النهاية لأي مسار مفتوح يتم تحديده. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | يعين أو يحصل على إزاحة المرحلة لنمط شرطة الخط الحالي. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | تعيين أو الحصول على وصف لنمط الشرطة لاستخدامه عند تحديد المسارات. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | تحصل مجموعات من على نمط الخطوط المتقطعة لمسار محدد. |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | يضبط أو يحصل على الكود الذي يحدد شكل المفاصل بين الأجزاء المتصلة لمسار محدود. |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | يضبط أو يحصل على سماكة المسارات المراد رسمها. |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | تعيين أو الحصول على الحد الأقصى لطول وصلات الخط المتري للمسارات المحدودة. تحدد هذه المعلمة طول "المسامير" التي يتم إنتاجها عندما تنضم مقاطع الخط بزوايا حادة. |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | يضبط أو يحصل على كائن الفرشاة المستخدم للمسارات المحدودة. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | يحصل على أ[`TextInfo`](../../aspose.svg.rendering/textinfo/) الكائن الذي يحتوي على معلومات حول النص المقدم. |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | تعيين مصفوفة التحويل أو الحصول عليها. |

## طُرق

| اسم | وصف |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | إنشاء مثيل جديد لفئة بنفس قيم الخاصية كمثيل موجود. |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | تعديل مصفوفة التحويل الحالية بضرب المصفوفة المحددة. |

### أنظر أيضا

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* مساحة الاسم [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* المجسم [Aspose.SVG](../../)


