---
title: Cylinder
second_title: Aspose.3D لمرجع .NET API
description: أسطوانة ذات معلمة . يمكن استخدامها أيضًا لتمثيل المخروط عندما يكون أحد نصف القطر أعلى / نصف قطر أسفل صفر .
type: docs
weight: 310
url: /ar/net/aspose.threed.entities/cylinder/
---
## Cylinder class

أسطوانة ذات معلمة . يمكن استخدامها أيضًا لتمثيل المخروط عندما يكون أحد نصف القطر أعلى / نصف قطر أسفل صفر .

```csharp
public class Cylinder : Primitive
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Cylinder](cylinder#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Cylinder`](../cylinder) فئة . |
| [Cylinder](cylinder#constructor_1)(double, double) | يقوم بتهيئة مثيل جديد لملف[`Cylinder`](../cylinder) فئة . |
| [Cylinder](cylinder#constructor_2)(double, double, double) | يقوم بتهيئة مثيل جديد لملف[`Cylinder`](../cylinder) فئة . |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | يقوم بتهيئة مثيل جديد لملف[`Cylinder`](../cylinder) فئة . |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | يقوم بتهيئة مثيل جديد لملف[`Cylinder`](../cylinder) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | الحصول على أو تحديد ما إذا كانت هذه الهندسة يمكن أن تلقي بظلالها |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | الحصول على أو تعيين ما إذا كان سيتم استبعاد هذا الكيان أثناء التصدير. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | الحصول على أو تحديد ما إذا كان سيتم إنشاء أسطوانة من نمط المروحة عندما يكون ThetaLength أقل من 2 * PI ، وإلا فلن يتم قطع النموذج. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | الحصول على أو تحديد ارتفاع الأسطوانة . |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | الحصول على شرائح الارتفاع أو تعيينها . |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | الحصول على أو تعيين إزاحة تحويل الرؤوس للجانب السفلي. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | الحصول على أو تعيين إزاحة تحويل الرؤوس للجانب العلوي. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | الحصول على أو تعيين قيمة تشير إلى ما إذا كان هذا[`Cylinder`](../cylinder) نهاية مفتوحة. القيمة الافتراضية هي false . |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | الحصول على العقدة الأصلية الأولى أو تعيينها ، إذا تم تعيين العقدة الأصلية الأولى ، فسيتم فصل هذا الكيان عن العقد الأصلية الأخرى. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | للحصول على جميع العقد الأصلية ، يمكن إرفاق كيان بالعقد الأصلية المتعددة من أجل هندسة instancing |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | الحصول على المقاطع الشعاعية أو تعيينها. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | الحصول على أو تحديد نصف قطر الغطاء السفلي للأسطوانة. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | الحصول على أو تحديد نصف قطر الغطاء العلوي للأسطوانة. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | الحصول على أو تحديد ما إذا كانت هذه الهندسة يمكن أن تتلقى الظل. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | الحصول على أو مجموعات من تحويل القص للجانب السفلي ، يخزن المتجه قيمة القص (المحور x ، المحور z) التي يتم قياسها بالراديان ، والقيمة الافتراضية هي (0 ، 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | الحصول على أو مجموعات من تحويل القص للجانب العلوي ، يخزن المتجه قيمة القص (المحور x ، المحور z) التي يتم قياسها بالراديان ، والقيمة الافتراضية هي (0 ، 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | الحصول على أو تحديد طول theta . القيمة الافتراضية هي 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | الحصول على أو تعيين بداية ثيتا. القيمة الافتراضية هي 0. |

## طُرق

| اسم | وصف |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | الحصول على المربع المحيط للكيان الحالي في نظام إحداثيات مساحة الكائن. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | الحصول على مفتاح عارض الكيان المسجل في العارض |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | تحويل الكائن الحالي إلى mesh |

### أنظر أيضا

* class [Primitive](../primitive)
* مساحة الاسم [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
