---
title: Region
second_title: Aspose.Drawing لمرجع NET API
description: يصف الجزء الداخلي لشكل رسومي مكون من مستطيلات ومسارات. لا يمكن توريث هذه الفئة.
type: docs
weight: 1060
url: /ar/net/system.drawing/region/
---
## Region class

يصف الجزء الداخلي لشكل رسومي مكون من مستطيلات ومسارات. لا يمكن توريث هذه الفئة.

```csharp
public sealed class Region : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Region](region#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Region`](../region) فئة . |
| [Region](region#constructor_1)(GraphicsPath) | يقوم بتهيئة مثيل جديد لملف[`Region`](../region) فئة مع المحددGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | يقوم بتهيئة مثيل جديد لملف[`Region`](../region) فئة من المحددRectangle هيكل . |
| [Region](region#constructor_4)(RectangleF) | يقوم بتهيئة مثيل جديد لملف[`Region`](../region) فئة من المحددRectangleF هيكل . |
| [Region](region#constructor_2)(RegionData) | يقوم بتهيئة مثيل جديد لملف[`Region`](../region) فئة من البيانات المحددة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | لإنشاء نسخة طبق الأصل من هذاRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | يقوم بتحديث هذاRegion لاحتواء الجزء المحددGraphicsPath التي لا تتقاطع مع هذا Region . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | يقوم بتحديث هذاRegion لاحتواء الجزء المحددRectangle هيكل لا يتقاطع مع هذاRegion . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | يقوم بتحديث هذاRegion لاحتواء الجزء المحددRectangleF هيكل لا يتقاطع مع هذاRegion . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | يقوم بتحديث هذاRegion لاحتواء الجزء المحددRegion هذا لا يتقاطع مع هذا Region . |
| [Dispose](../../system.drawing/region/dispose)() | يقوم بإصدار كافة الموارد التي يستخدمها هذاRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | تختبر ما إذا كان الملف المحددRegion مطابق لهذاRegion على سطح الرسم المحدد . |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | يقوم بتحديث هذاRegion لتحتوي فقط على جزء من الجزء الداخلي لا يتقاطع مع المحددGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | يقوم بتحديث هذاRegion لاحتواء فقط الجزء الداخلي الخاص به الذي لا يتقاطع مع المحددRectangle هيكل . |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | يقوم بتحديث هذاRegion لتحتوي فقط على جزء من الجزء الداخلي لا يتقاطع مع المحددRectangleF هيكل . |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | يقوم بتحديث هذاRegion لاحتواء فقط الجزء الداخلي الخاص به الذي لا يتقاطع مع المحددRegion . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | يحصل على أRectangleFالهيكل الذي يمثل المستطيل الذي يحد هذاRegion على سطح الرسم أGraphics الكائن . |
| [GetRegionData](../../system.drawing/region/getregiondata)() | إرجاع أRegionData التي تمثل المعلومات التي تصف هذاRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | تُرجع مصفوفة منRectangleF الهياكل التي تقارب هذاRegion بعد تطبيق تحويل المصفوفة المحدد. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | يقوم بتحديث هذاRegion إلى تقاطع نفسه مع المحددGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | يقوم بتحديث هذاRegion إلى تقاطع نفسه مع المحددRectangle هيكل . |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | يقوم بتحديث هذاRegion إلى تقاطع نفسه مع المحدد RectangleF هيكل . |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | يقوم بتحديث هذاRegion إلى تقاطع نفسه مع المحددRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | اختبارات ما إذا كان هذاRegion يحتوي على مساحة داخلية فارغة على سطح الرسم المحدد. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | اختبارات ما إذا كان هذاRegion له مساحة داخلية لا نهائية على سطح الرسم المحدد. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | تختبر ما إذا كان الملف المحددPoint هيكل وارد في هذاRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | تختبر ما إذا كان الملف المحددPointF هيكل وارد في هذاRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | اختبارات ما إذا كان أي جزء من المحددRectangle هيكل موجود في this Region . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | اختبارات ما إذا كان أي جزء من المحددRectangleF هيكل وارد within هذاRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | يختبر ما إذا كانت النقطة المحددة متضمنة في هذاRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | تختبر ما إذا كان الملف المحددPoint هيكل وارد في هذاRegion عند الرسم باستخدام المحددGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | تختبر ما إذا كان الملف المحددPointF هيكل وارد في هذاRegion عند الرسم باستخدام المحددGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | اختبارات ما إذا كان أي جزء من المحددRectangle هيكل وارد within هذاRegion عند رسمها باستخدام المحددGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | اختبارات ما إذا كان أي جزء من المحددRectangleF هيكل وارد within هذاRegion عند رسمها باستخدام المحددGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | يختبر ما إذا كانت النقطة المحددة متضمنة في هذاRegion عند رسمها باستخدام المحددGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | يختبر ما إذا كانت النقطة المحددة متضمنة في هذاRegion الكائن عند رسمها باستخدام المحددGraphics الكائن . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion عند الرسم باستخدام المحددGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion عند draw باستخدام المحددGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | يقوم بتهيئة هذاRegion إلى مساحة داخلية فارغة. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | يقوم بتهيئة هذاRegion كائن داخلي لانهائي . |
| [Transform](../../system.drawing/region/transform)(Matrix) | يحول هذاRegion حسب المحددMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | يزيح إحداثيات هذاRegion بالمبلغ المحدد. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | يزيح إحداثيات هذاRegion بالمبلغ المحدد. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | يقوم بتحديث هذاRegion لاتحاد نفسه والمحددةGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | يقوم بتحديث هذاRegion لاتحاد نفسه والمحددةRectangle هيكل . |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | يقوم بتحديث هذاRegion لاتحاد نفسه والمحددةRectangleF هيكل . |
| [Union](../../system.drawing/region/union#union_3)(Region) | يقوم بتحديث هذاRegion لاتحاد نفسه والمحددةRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | يقوم بتحديث هذاRegionإلى الاتحاد مطروحًا منه تقاطع نفسه مع المحددGraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | يقوم بتحديث هذاRegionإلى الاتحاد مطروحًا منه تقاطع نفسه مع المحددRectangle هيكل . |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | يقوم بتحديث هذاRegion إلى الاتحاد مطروحًا منه تقاطع نفسه مع المحددRectangleF هيكل . |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | يقوم بتحديث هذاRegionإلى الاتحاد مطروحًا منه تقاطع نفسه مع المحددRegion . |

### أنظر أيضا

* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
