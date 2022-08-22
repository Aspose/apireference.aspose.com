---
title: Geometry
second_title: Aspose.3D لمرجع .NET API
description: الفئة الأساسية لجميع الكائنات الهندسية القابلة للعرض مثلMesh./mesh وNurbsSurface./nurbssurface وPatch./patch وما إلى ذلك .
type: docs
weight: 360
url: /ar/net/aspose.threed.entities/geometry/
---
## Geometry class

الفئة الأساسية لجميع الكائنات الهندسية القابلة للعرض (مثل[`Mesh`](../mesh) و[`NurbsSurface`](../nurbssurface) و[`Patch`](../patch) وما إلى ذلك) .

ملف[`Geometry`](../geometry) تدعم الفئة الأساسية:  **إدارة نقطة التحكم** ، تحدد نقاط التحكم الهيكل المكاني ثلاثي الأبعاد الأساسي للهندسة ، والأنواع الهندسية المختلفة لها طريقة مختلفة لتحديد النماذج ثلاثية الأبعاد الملموسة. **تعريف عنصر الرأس** ، تطبق عناصر قمة الرأس معلومات إضافية مثل الأعراف / إحداثيات الأشعة فوق البنفسجية / ألوان الرأس على الهندسة ، انظر[`VertexElement`](../vertexelement) لمزيد من التفاصيل. **تشوه الكائن** و[`Deformer`](../../aspose.threed.deformers/deformer) يمكن ربطها بتحريك شكل الهندسة.

```csharp
public class Geometry : Entity
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Geometry](geometry)(string) | يقوم بتهيئة مثيل جديد لملف[`Geometry`](../geometry) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | الحصول على أو تحديد ما إذا كانت هذه الهندسة يمكن أن تلقي بظلالها |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | يحصل على جميع نقاط التحكم |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | يحصل على جميع أدوات التشوه المرتبطة بهذه الهندسة. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | الحصول على أو تعيين ما إذا كان سيتم استبعاد هذا الكيان أثناء التصدير. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | الحصول على العقدة الأصلية الأولى أو تعيينها ، إذا تم تعيين العقدة الأصلية الأولى ، فسيتم فصل هذا الكيان عن العقد الأصلية الأخرى. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | للحصول على جميع العقد الأصلية ، يمكن إرفاق كيان بالعقد الأصلية المتعددة من أجل هندسة instancing |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | الحصول على أو تحديد ما إذا كانت هذه الهندسة يمكن أن تتلقى الظل. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | يحصل على جميع عناصر الرأس |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | يحصل أو يحدد إذا كانت الهندسة مرئية |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | إضافة عنصر قمة موجود إلى الهندسة الحالية |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement)(VertexElementType) | إنشاء عنصر قمة من النوع المحدد وإضافته إلى الشكل الهندسي. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement#createelement_1)(VertexElementType, MappingMode, ReferenceMode) | إنشاء عنصر قمة من النوع المحدد وإضافته إلى الشكل الهندسي. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv)(TextureMapping) | ينشئ ملف[`VertexElementUV`](../vertexelementuv) بنوع معين لتعيين النسيج. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv#createelementuv_1)(TextureMapping, MappingMode, ReferenceMode) | ينشئ ملف[`VertexElementUV`](../vertexelementuv) بنوع معين لتعيين النسيج. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | الحصول على المربع المحيط للكيان الحالي في نظام إحداثيات مساحة الكائن. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | الحصول على عنصر قمة بالنوع المحدد |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | الحصول على مفتاح عارض الكيان المسجل في العارض |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | يحصل على أ[`VertexElementUV`](../vertexelementuv) المثال مع نوع معين لتعيين النسيج type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |

### أنظر أيضا

* class [Entity](../../aspose.threed/entity)
* مساحة الاسم [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
