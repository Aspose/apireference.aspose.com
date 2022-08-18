---
title: Mesh
second_title: Aspose.3D لمرجع .NET API
description: شبكة مكونة من العديد من المضلعات n-sided .
type: docs
weight: 450
url: /ar/net/aspose.threed.entities/mesh/
---
## Mesh class

شبكة مكونة من العديد من المضلعات n-sided .

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Mesh](mesh#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Mesh`](../mesh) فئة . |
| [Mesh](mesh#constructor_1)(Bitmap) | أنشئ شبكة باستخدام خريطة ارتفاع محددة ، إذا كان تنسيق بكسل خريطة الارتفاع يحتوي على مكونات متعددة ، فسيتم استخدام المكون الأول (عادةً الأحمر) كقيمة ارتفاع (z) مكونات x و y لنقطة التحكم هي إحداثيات بكسل طبيعية . |
| [Mesh](mesh#constructor_4)(string) | يقوم بتهيئة مثيل جديد لملف[`Mesh`](../mesh) فئة . |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | أنشئ شبكة باستخدام خريطة ارتفاع محددة ، إذا كان تنسيق بكسل خريطة الارتفاع يحتوي على مكونات متعددة ، فسيتم استخدام المكون الأول (عادةً الأحمر) كقيمة ارتفاع (z) مكونات x و y لنقطة التحكم هي إحداثيات بكسل طبيعية . |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | أنشئ شبكة باستخدام خريطة ارتفاع محددة ، إذا كان تنسيق بكسل خريطة الارتفاع يحتوي على مكونات متعددة ، فسيتم استخدام المكون الأول (عادةً الأحمر) كقيمة ارتفاع (z) مكونات x و y لنقطة التحكم هي إحداثيات بكسل طبيعية . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | الحصول على أو تحديد ما إذا كانت هذه الهندسة يمكن أن تلقي بظلالها |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | يحصل على جميع نقاط التحكم |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | يحصل على جميع أدوات التشوه المرتبطة بهذه الهندسة. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | يحصل على حواف الشبكة. الحافة اختيارية في الشبكة ، لذا يمكن أن تكون فارغة. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | الحصول على أو تعيين ما إذا كان سيتم استبعاد هذا الكيان أثناء التصدير. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | الحصول على العقدة الأصلية الأولى أو تعيينها ، إذا تم تعيين العقدة الأصلية الأولى ، فسيتم فصل هذا الكيان عن العقد الأصلية الأخرى. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | للحصول على جميع العقد الأصلية ، يمكن إرفاق كيان بالعقد الأصلية المتعددة من أجل هندسة instancing |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | الحصول على عدد المضلعات |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | الحصول على تعريف المضلعات للشبكة |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | الحصول على أو تحديد ما إذا كانت هذه الهندسة يمكن أن تتلقى الظل. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | يحصل على جميع عناصر الرأس |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | يحصل أو يحدد إذا كانت الهندسة مرئية |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | إضافة عنصر قمة موجود إلى الهندسة الحالية |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | إنشاء عنصر قمة من النوع المحدد وإضافته إلى الشكل الهندسي. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | إنشاء عنصر قمة من النوع المحدد وإضافته إلى الشكل الهندسي. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | ينشئ ملف[`VertexElementUV`](../vertexelementuv) بنوع معين لتعيين النسيج. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | ينشئ ملف[`VertexElementUV`](../vertexelementuv) بنوع معين لتعيين النسيج. |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | لإنشاء مضلع جديد مع تحديد جميع الرؤوس فيه*indices* . لإنشاء رأس مضلع برأس ، يرجى استخدام[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | قم بإنشاء مضلع من 3 رؤوس (مثلث) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | لإنشاء مضلع جديد مع تحديد جميع الرؤوس فيه*indices* . لإنشاء رأس مضلع برأس ، يرجى استخدام[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | قم بإنشاء مضلع به 4 رؤوس (رباعي) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | الحصول على المربع المحيط للكيان الحالي في نظام إحداثيات مساحة الكائن. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | الحصول على عنصر قمة بالنوع المحدد |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | الحصول على مفتاح عارض الكيان المسجل في العارض |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | الحصول على العداد لكل مضلعات داخلية. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | الحصول على عدد الرؤوس للمضلع المحدد. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | يحصل على أ[`VertexElementUV`](../vertexelementuv) المثال مع نوع معين لتعيين النسيج type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | الحصول على مثيل الشبكة من الكيان الحالي. |

### أمثلة

لإضافة مضلع في الشبكة: السفر عبر جميع المضلعات في شبكة:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    // التعامل مع المضلع
}
```

### أنظر أيضا

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* مساحة الاسم [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
