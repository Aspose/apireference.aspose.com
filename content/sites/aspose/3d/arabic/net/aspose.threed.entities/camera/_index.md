---
title: Camera
second_title: Aspose.3D لمرجع .NET API
description: تصف الكاميرا نقطة عين المشاهد عند النظر إلى المشهد.
type: docs
weight: 250
url: /ar/net/aspose.threed.entities/camera/
---
## Camera class

تصف الكاميرا نقطة عين المشاهد عند النظر إلى المشهد.

```csharp
public class Camera : Frustum
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Camera](camera#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Camera`](../camera) فئة . |
| [Camera](camera#constructor_1)(ProjectionType) | يقوم بتهيئة مثيل جديد لملف[`Camera`](../camera) فئة . |
| [Camera](camera#constructor_2)(string) | يقوم بتهيئة مثيل جديد لملف[`Camera`](../camera) فئة . |
| [Camera](camera#constructor_3)(string, ProjectionType) | يقوم بتهيئة مثيل جديد لملف[`Camera`](../camera) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | الحصول على أو ضبط وضع فتحة الكاميرا |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | الحصول على أو تحديد نسبة العرض إلى الارتفاع لـ frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | الحصول على أو تحديد نسبة العرض إلى الارتفاع لمستوى العرض . |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | الحصول على الاتجاه الذي تنظر إليه الكاميرا أو تحديده. ستؤثر التغييرات في هذه الخاصية أيضًا على[`LookAt`](../frustum/lookat) و[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | الحصول على أو تعيين ما إذا كان سيتم استبعاد هذا الكيان أثناء التصدير. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | الحصول على أو تحديد مسافة الطائرة البعيدة لـ frustum . |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | الحصول على مجال رؤية الكاميرا أو تعيينه بالدرجات ، ولا يتم استخدام هذه الخاصية إلا عندما تكون ApertureModeHorizontal أوVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | الحصول على أو تعيين مجال الرؤية الأفقي للكاميرا بالدرجات ، ولا يتم استخدام هذه الخاصية إلا عندما تكون ApertureModeHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | الحصول على أو تعيين مجال الرؤية الرأسي للكاميرا بالدرجات ، ولا يتم استخدام هذه الخاصية إلا عندما تكون ApertureModeHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | الحصول على أو تحديد ارتفاع مستوى العرض المقاس بالبوصة |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | الحصول على أو تحديد الموضع المهتم الذي تنظر إليه الكاميرا. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | الحصول على أو ضبط التكبير المستخدم في الكاميرا المتعامدة |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | الحصول على أو تعيين مسافة الطائرة القريبة من frustum . |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | الحصول على الارتفاع أو تحديده عند frustum في الإسقاط الهجائي. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | الحصول على العقدة الأصلية الأولى أو تعيينها ، إذا تم تعيين العقدة الأصلية الأولى ، فسيتم فصل هذا الكيان عن العقد الأصلية الأخرى. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | للحصول على جميع العقد الأصلية ، يمكن إرفاق كيان بالعقد الأصلية المتعددة من أجل هندسة instancing |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | الحصول على نوع عرض الكاميرا أو تحديده. يتم استخدام إسقاط المنظور افتراضيًا . |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | الحصول على أو تعيين اتجاه frustum mode تعمل هذه الخاصية فقط عندما[`Target`](../frustum/target) هي null. إذا كانت القيمةFixedTarget ، يتم دائمًا حساب الاتجاه بواسطة الخاصية[`LookAt`](../frustum/lookat) وإلا فإن ملف[`LookAt`](../frustum/lookat)يتم حسابه دائمًا بواسطة[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | الحصول على أو تحديد الهدف الذي تنظر إليه الكاميرا. إذا كان المستخدم يدعم هذه الخاصية ، فيجب أن يكون قبل[`LookAt`](../frustum/lookat) الملكية . |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | الحصول على أو تحديد اتجاه الكاميرا لأعلى |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | الحصول على أو تعيين عرض مستوى العرض المقاس بالبوصة |

## طُرق

| اسم | وصف |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | الحصول على المربع المحيط للكيان الحالي في نظام إحداثيات مساحة الكائن. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | الحصول على مفتاح عارض الكيان المسجل في العارض |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | حرك الكاميرا للأمام نحو اتجاهها أو هدفها . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |

### أنظر أيضا

* class [Frustum](../frustum)
* مساحة الاسم [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
