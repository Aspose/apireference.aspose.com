---
title: Light
second_title: Aspose.3D لمرجع .NET API
description: يضيء الضوء المشهد .
type: docs
weight: 400
url: /ar/net/aspose.threed.entities/light/
---
## Light class

يضيء الضوء المشهد .

معادلة حساب التوهين الكلي للضوء هي: `A = التوهين المستمر + (Dist * LinearAttenuation) + ((Dist ^ 2) * QuadraticAttenuation)`

```csharp
public class Light : Frustum
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Light](light#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Light`](../light) فئة . |
| [Light](light#constructor_1)(string) | يقوم بتهيئة مثيل جديد لملف[`Light`](../light) فئة . |
| [Light](light#constructor_2)(string, LightType) | يقوم بتهيئة مثيل جديد لملف[`Light`](../light) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | الحصول على أو تحديد نسبة العرض إلى الارتفاع لـ frustum |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | يحصل أو يحدد إذا كان مثيل الضوء الحالي يمكنه إضاءة كائنات أخرى. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | يحصل أو يحدد إذا كان الضوء يمكن أن يلقي بظلال على كائنات أخرى. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | الحصول على أو ضبط لون الضوء |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | الحصول على التوهين المستمر أو تعيينه لحساب التوهين الإجمالي للضوء |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | الحصول على الاتجاه الذي تنظر إليه الكاميرا أو تحديده. ستؤثر التغييرات في هذه الخاصية أيضًا على[`LookAt`](../frustum/lookat) و[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | الحصول على أو تعيين ما إذا كان سيتم استبعاد هذا الكيان أثناء التصدير. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | الحصول على أو تعيين زاوية المخروط السقوط (بالدرجات) . |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | الحصول على أو تحديد مسافة الطائرة البعيدة لـ frustum . |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | الحصول على أو ضبط زاوية مخروط النقطة الفعالة (بالدرجات) . |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | الحصول على شدة الضوء أو ضبطها ، القيمة الافتراضية هي 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | الحصول على أو تعيين نوع المصباح |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | الحصول على التوهين الخطي أو تعيينه لحساب التوهين الكلي للضوء |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | الحصول على أو تحديد الموضع المهتم الذي تنظر إليه الكاميرا. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | الحصول على أو تعيين مسافة الطائرة القريبة من frustum . |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | الحصول على الارتفاع أو تحديده عند frustum في الإسقاط الهجائي. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | الحصول على العقدة الأصلية الأولى أو تعيينها ، إذا تم تعيين العقدة الأصلية الأولى ، فسيتم فصل هذا الكيان عن العقد الأصلية الأخرى. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | للحصول على جميع العقد الأصلية ، يمكن إرفاق كيان بالعقد الأصلية المتعددة من أجل هندسة instancing |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | الحصول على أو تعيين التوهين التربيعي لحساب التوهين الكلي للضوء |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | الحصول على أو تعيين اتجاه frustum mode تعمل هذه الخاصية فقط عندما[`Target`](../frustum/target) هي null. إذا كانت القيمةFixedTarget ، يتم دائمًا حساب الاتجاه بواسطة الخاصية[`LookAt`](../frustum/lookat) وإلا فإن ملف[`LookAt`](../frustum/lookat)يتم حسابه دائمًا بواسطة[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | الحصول على لون الظل أو تعيينه . |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | الحصول على أو تحديد الهدف الذي تنظر إليه الكاميرا. إذا كان المستخدم يدعم هذه الخاصية ، فيجب أن يكون قبل[`LookAt`](../frustum/lookat) الملكية . |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | الحصول على أو تحديد اتجاه الكاميرا لأعلى |

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

### أنظر أيضا

* class [Frustum](../frustum)
* مساحة الاسم [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
