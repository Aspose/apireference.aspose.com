---
title: Class PdfDevice
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Rendering.Pdf.PdfDevice فصل. يمثل التقديم إلى مستند pdf .
type: docs
weight: 2950
url: /ar/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

يمثل التقديم إلى مستند pdf .

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(ICreateStreamProvider) | يقوم بتهيئة مثيل جديد لملف`PdfDevice` فئة . |
| [PdfDevice](pdfdevice/#constructor_4)(Stream) | يقوم بتهيئة مثيل جديد لملف`PdfDevice` فئة . |
| [PdfDevice](pdfdevice/#constructor_5)(string) | يقوم بتهيئة مثيل جديد لملف`PdfDevice` فئة . |
| [PdfDevice](pdfdevice/#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | يقوم بتهيئة مثيل جديد لملف`PdfDevice` class عن طريق تقديم الخيارات وموفر البث. |
| [PdfDevice](pdfdevice/#constructor_2)(PdfRenderingOptions, Stream) | يقوم بتهيئة مثيل جديد لملف`PdfDevice` class عن طريق تقديم الخيارات ودفق الإخراج. |
| [PdfDevice](pdfdevice/#constructor_3)(PdfRenderingOptions, string) | يقوم بتهيئة مثيل جديد لملف`PdfDevice` class عن طريق تقديم الخيارات واسم ملف الإخراج. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## طُرق

| اسم | وصف |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect/)(RectangleF) | إلحاق مستطيل بالمسار الحالي كمسار فرعي كامل. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument/)(Document) | يبدأ عرض المستند. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement/)(Element, RectangleF) | يبدأ عرض العنصر. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage/)(SizeF) | يبدأ عرض الصفحة الجديدة . |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip/)(FillMode) | يعدل مسار القطع الحالي عن طريق تقاطعه مع المسار الحالي ، باستخدام قاعدة FillMode لتحديد المنطقة المراد تعبئتها. تنهي هذه الطريقة المسار الحالي. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath/)() | لإغلاق المسار الفرعي الحالي بإلحاق مقطع بخط مستقيم من النقطة الحالية إلى نقطة بداية المسار الفرعي. إذا كان المسار الفرعي الحالي مغلقًا بالفعل ، فإن "ClosePath" لا يفعل شيئًا . ينهي عامل التشغيل هذا المسار الفرعي الحالي. يؤدي إلحاق مقطع آخر بالمسار الحالي إلى بدء مسار فرعي جديد ، حتى إذا بدأ المقطع الجديد عند نقطة النهاية التي تم الوصول إليها بواسطة طريقة "ClosePath" . |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto/)(PointF, PointF, PointF) | لإلحاق منحنى بيزير مكعب بالمسار الحالي. يمتد المنحنى من النقطة الحالية إلى النقطة pt2 ، باستخدام pt1 و pt2 كنقاط تحكم Bézier. النقطة الحالية الجديدة هي pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage/)(byte[], ImageType, RectangleF) | يرسم الصورة المحددة . |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument/)() | ينتهي عرض المستند. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement/)(Element) | ينتهي عرض العنصر. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage/)() | ينتهي عرض الصفحة الحالية. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill/)(FillMode) | يملأ المنطقة بأكملها المحاطة بالمسار الحالي. إذا كان المسار يتكون من عدة مسارات فرعية غير متصلة ، فإنه يملأ الدواخل لجميع المسارات الفرعية ، تعتبر معًا. تنهي هذه الطريقة المسار الحالي. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext/)(string, PointF) | يملأ السلسلة النصية المحددة في المكان المحدد. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush/)() | مسح جميع البيانات لإخراج التدفق. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto/)(PointF) | لإلحاق مقطع خط مستقيم من النقطة الحالية بالنقطة (نقطة). النقطة الحالية الجديدة هي pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto/)(PointF) | يبدأ مسارًا فرعيًا جديدًا عن طريق تحريك النقطة الحالية إلى إحداثيات المعلمة pt ، مع حذف أي مقطع خط متصل. إذا كانت طريقة إنشاء المسار السابقة في المسار الحالي هي أيضًا "MoveTo" ، فإن "MoveTo" الجديد يتجاوزها ؛ لا توجد آثار لعملية "MoveTo" السابقة في المسار. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext/)() | يعيد سياق الرسومات بالكامل إلى قيمته السابقة عن طريق إخراجه من المكدس. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext/)() | يدفع نسخة من سياق الرسوم بأكمله إلى المكدس. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke/)() | رسم خط بطول المسار الحالي. يتبع الخط المحدد كل مقطع مستقيم أو منحني في المسار ، متمركزًا على المقطع مع جوانب موازية له. يتم التعامل مع كل من المسارات الفرعية للمسار بشكل منفصل. تنهي هذه الطريقة المسار الحالي. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill/)(FillMode) | ضربات وملء المسار الحالي. تنهي هذه الطريقة المسار الحالي. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext/)(string, PointF) | ضربات السلسلة النصية المحددة في الموقع المحدد. |

## أعضاء آخرون

| اسم | وصف |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext/) | يحمل معلمات التحكم في الرسومات الحالية لـ PdfDevice. تحدد هذه المعلمات الإطار العام الذي ينفذ فيه مشغلو الرسومات. |

### أنظر أيضا

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext/)
* class [PdfRenderingOptions](../pdfrenderingoptions/)
* مساحة الاسم [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* المجسم [Aspose.SVG](../../)


