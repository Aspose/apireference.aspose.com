---
title: Class ImageDevice
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Rendering.Image.ImageDevice فصل. يمثل التقديم إلى التنسيقات النقطية jpeg  png  bmp  gif  tiff .
type: docs
weight: 2830
url: /ar/net/aspose.svg.rendering.image/imagedevice/
---
## ImageDevice class

يمثل التقديم إلى التنسيقات النقطية: jpeg ، png ، bmp ، gif ، tiff .

```csharp
public class ImageDevice : Device<ImageGraphicContext, ImageRenderingOptions>
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)(ICreateStreamProvider) | يقوم بتهيئة مثيل جديد لملف`ImageDevice` فئة . |
| [ImageDevice](imagedevice/#constructor_4)(Stream) | يقوم بتهيئة مثيل جديد لملف`ImageDevice` فئة . |
| [ImageDevice](imagedevice/#constructor_5)(string) | يقوم بتهيئة مثيل جديد لملف`ImageDevice` فئة . |
| [ImageDevice](imagedevice/#constructor_1)(ImageRenderingOptions, ICreateStreamProvider) | يقوم بتهيئة مثيل جديد لملف`ImageDevice` class عن طريق تقديم الخيارات وموفر البث. |
| [ImageDevice](imagedevice/#constructor_2)(ImageRenderingOptions, Stream) | يقوم بتهيئة مثيل جديد لملف`ImageDevice` class عن طريق تقديم الخيارات ودفق الإخراج. |
| [ImageDevice](imagedevice/#constructor_3)(ImageRenderingOptions, string) | يقوم بتهيئة مثيل جديد لملف`ImageDevice` class عن طريق تقديم الخيارات واسم ملف الإخراج. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| virtual [Graphics](../../aspose.svg.rendering.image/imagedevice/graphics/) { get; } | الحصول على مثيل Graphics. |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## طُرق

| اسم | وصف |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.image/imagedevice/addrect/)(RectangleF) | إلحاق مستطيل بالمسار الحالي كمسار فرعي كامل. |
| override [BeginDocument](../../aspose.svg.rendering.image/imagedevice/begindocument/)(Document) | يبدأ عرض المستند. |
| override [BeginElement](../../aspose.svg.rendering.image/imagedevice/beginelement/)(Element, RectangleF) | يبدأ عرض العنصر. |
| override [BeginPage](../../aspose.svg.rendering.image/imagedevice/beginpage/)(SizeF) | يبدأ عرض الصفحة الجديدة . |
| override [Clip](../../aspose.svg.rendering.image/imagedevice/clip/)(FillMode) | يعدل مسار القطع الحالي عن طريق تقاطعه مع المسار الحالي ، باستخدام قاعدة FillMode لتحديد المنطقة المراد تعبئتها. تنهي هذه الطريقة المسار الحالي. |
| override [ClosePath](../../aspose.svg.rendering.image/imagedevice/closepath/)() | لإغلاق المسار الفرعي الحالي بإلحاق مقطع بخط مستقيم من النقطة الحالية إلى نقطة بداية المسار الفرعي. إذا كان المسار الفرعي الحالي مغلقًا بالفعل ، فإن "ClosePath" لا يفعل شيئًا . ينهي عامل التشغيل هذا المسار الفرعي الحالي. يؤدي إلحاق مقطع آخر بالمسار الحالي إلى بدء مسار فرعي جديد ، حتى إذا بدأ المقطع الجديد عند نقطة النهاية التي تم الوصول إليها بواسطة طريقة "ClosePath" . |
| override [CubicBezierTo](../../aspose.svg.rendering.image/imagedevice/cubicbezierto/)(PointF, PointF, PointF) | لإلحاق منحنى بيزير مكعب بالمسار الحالي. يمتد المنحنى من النقطة الحالية إلى النقطة pt2 ، باستخدام pt1 و pt2 كنقاط تحكم Bézier. النقطة الحالية الجديدة هي pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.image/imagedevice/drawimage/)(byte[], ImageType, RectangleF) | يرسم الصورة المحددة . |
| override [EndDocument](../../aspose.svg.rendering.image/imagedevice/enddocument/)() | ينتهي عرض المستند. |
| override [EndElement](../../aspose.svg.rendering.image/imagedevice/endelement/)(Element) | ينتهي عرض العنصر. |
| override [EndPage](../../aspose.svg.rendering.image/imagedevice/endpage/)() | ينتهي عرض الصفحة الحالية. |
| override [Fill](../../aspose.svg.rendering.image/imagedevice/fill/)(FillMode) | يملأ المنطقة بأكملها المحاطة بالمسار الحالي. إذا كان المسار يتكون من عدة مسارات فرعية غير متصلة ، فإنه يملأ الدواخل لجميع المسارات الفرعية ، تعتبر معًا. تنهي هذه الطريقة المسار الحالي. |
| override [FillText](../../aspose.svg.rendering.image/imagedevice/filltext/)(string, PointF) | يملأ السلسلة النصية المحددة في المكان المحدد. |
| override [Flush](../../aspose.svg.rendering.image/imagedevice/flush/)() | مسح جميع البيانات لإخراج التدفق. |
| override [LineTo](../../aspose.svg.rendering.image/imagedevice/lineto/)(PointF) | لإلحاق مقطع خط مستقيم من النقطة الحالية بالنقطة (نقطة). النقطة الحالية الجديدة هي pt. |
| override [MoveTo](../../aspose.svg.rendering.image/imagedevice/moveto/)(PointF) | يبدأ مسارًا فرعيًا جديدًا عن طريق تحريك النقطة الحالية إلى إحداثيات المعلمة pt ، مع حذف أي مقطع خط متصل. إذا كانت طريقة إنشاء المسار السابقة في المسار الحالي هي أيضًا "MoveTo" ، فإن "MoveTo" الجديد يتجاوزها ؛ لا توجد آثار لعملية "MoveTo" السابقة في المسار. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.image/imagedevice/restoregraphiccontext/)() | يعيد سياق الرسومات بالكامل إلى قيمته السابقة عن طريق إخراجه من المكدس. |
| override [SaveGraphicContext](../../aspose.svg.rendering.image/imagedevice/savegraphiccontext/)() | يدفع نسخة من سياق الرسوم بأكمله إلى المكدس. |
| override [Stroke](../../aspose.svg.rendering.image/imagedevice/stroke/)() | رسم خط بطول المسار الحالي. يتبع الخط المحدد كل مقطع مستقيم أو منحني في المسار ، متمركزًا على المقطع مع جوانب موازية له. يتم التعامل مع كل من المسارات الفرعية للمسار بشكل منفصل. تنهي هذه الطريقة المسار الحالي. |
| override [StrokeAndFill](../../aspose.svg.rendering.image/imagedevice/strokeandfill/)(FillMode) | ضربات وملء المسار الحالي. تنهي هذه الطريقة المسار الحالي. |
| override [StrokeText](../../aspose.svg.rendering.image/imagedevice/stroketext/)(string, PointF) | ضربات السلسلة النصية المحددة في الموقع المحدد. |

## أعضاء آخرون

| اسم | وصف |
| --- | --- |
| class [ImageGraphicContext](imagedevice.imagegraphiccontext/) | يحمل معلمات التحكم في الرسومات الحالية لملف`ImageDevice`. تحدد هذه المعلمات الإطار العام الذي يتم من خلاله تنفيذ مشغلي الرسومات. |

### أنظر أيضا

* class [ImageGraphicContext](../imagedevice.imagegraphiccontext/)
* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [ImageRenderingOptions](../imagerenderingoptions/)
* مساحة الاسم [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* المجسم [Aspose.SVG](../../)


