---
title: Class Extent
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Extent فصل. مربع إحاطة مكانية ثنائية الأبعاد.
type: docs
weight: 120
url: /ar/net/aspose.gis/extent/
---
## Extent class

مربع إحاطة مكانية ثنائية الأبعاد.

```csharp
public class Extent : IEquatable<Extent>
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Extent](extent/#constructor)() | إنشاء مثيل جديد . |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | إنشاء مثيل جديد . |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | مركز المدى. |
| [Height](../../aspose.gis/extent/height/) { get; } | ارتفاع المدى. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | تحديد ما إذا كان هذا`Extent` صالح . |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) المرتبطة بهذا المدى. يمكن أن يكون`null` لو[`SpatialReferenceSystem`](./spatialreferencesystem/) غير معروف. استخدام[`GetTransformed`](./gettransformed/) من أجل تحويل المدى بين أنظمة الإسناد المكاني. |
| [Width](../../aspose.gis/extent/width/) { get; } | عرض المدى. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | الحد الأقصى لقيمة إحداثي س. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | الحد الأدنى لقيمة إحداثي X. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | الحد الأقصى لقيمة الإحداثي ص. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | الحد الأدنى لقيمة الإحداثي ص. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | استنساخ هذا المثال . |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | لتحديد ما إذا كان هذا النطاق يحتوي على الوسيطة. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | لتحديد ما إذا كان هذا النطاق يحتوي على الوسيطة. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | لتحديد ما إذا كان هذا النطاق يحتوي على إحداثي محدد بواسطة الوسيطات. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | يشير إلى ما إذا كان الكائن الحالي يساوي كائنًا آخر من نفس النوع. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | يحدد ما إذا كان الكائن المحدد مساويًا للكائن الحالي. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | بمثابة وظيفة التجزئة الافتراضية. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | إرجاع مدى جديد في المحدد[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) الذي يحتوي على هذا المدى. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | ينمو هذا النطاق بحيث يتضمن الوسيطة. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | ينمو هذا المدى بحيث يشمل النقطة المحددة. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | ينمو هذا المدى بطول المحور X بحيث يتضمن القيمة المحددة. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | ينمو هذا المدى بطول المحور ص بحيث يتضمن القيمة المحددة. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | لتحديد ما إذا كان هذا الحد يتقاطع مع الوسيطة. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | لتحديد ما إذا كان هذا الحد يتقاطع مع الوسيطة. |
| [Normalize](../../aspose.gis/extent/normalize/)() | المقايضات[`XMin`](./xmin/) مع[`XMax`](./xmax/) لو[`Width`](./width/) سلبي و [`YMin`](./ymin/) مع[`YMax`](./ymax/) لو[`Height`](./height/) سلبي . |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | تحويل هذا المدى إلى مضلع مستطيل يمثله. |
| override [ToString](../../aspose.gis/extent/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [operator ==](../../aspose.gis/extent/op_equality/) | يطبق عامل التشغيل '==' . |
| [operator !=](../../aspose.gis/extent/op_inequality/) | تنفذ عامل التشغيل "! =" . |

### أنظر أيضا

* مساحة الاسم [Aspose.Gis](../../aspose.gis/)
* المجسم [Aspose.GIS](../../)


