---
title: TriMeshT
second_title: Aspose.3D لمرجع .NET API
description: نسخة عامة منTriMesh./trimesh لنوع قمة الرأس المحددة الثابتة للمستخدم
type: docs
weight: 740
url: /ar/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

نسخة عامة من[`TriMesh`](../trimesh) لنوع قمة الرأس المحددة الثابتة للمستخدم

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| معامل | وصف |
| --- | --- |
| T |  |

## المنشئون

| اسم | وصف |
| --- | --- |
| [TriMesh](trimesh)(string) | تهيئة مثيل[`TriMesh`](../trimesh) |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | سعة الرؤوس المخصصة مسبقًا . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | الحصول على أو تعيين ما إذا كان سيتم استبعاد هذا الكيان أثناء التصدير. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | عدد المؤشرات في هذا[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | الحصول على الاسم أو تعيينه . |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | الحصول على العقدة الأصلية الأولى أو تعيينها ، إذا تم تعيين العقدة الأصلية الأولى ، فسيتم فصل هذا الكيان عن العقد الأصلية الأخرى. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | للحصول على جميع العقد الأصلية ، يمكن إرفاق كيان بالعقد الأصلية المتعددة من أجل هندسة instancing |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | الحصول على مجموعة من كافة الخصائص . |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | يحصل على المشهد الذي ينتمي إليه هذا الكائن |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | عدد الرؤوس غير المدمجة التي مرت بها[`BeginVertex`](../trimesh/beginvertex) و[`EndVertex`](../trimesh/endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | التخطيط الرأسي لملف[`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | عدد الرؤوس في هذا[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | الحجم الإجمالي لجميع الرؤوس بالبايت |

## طُرق

| اسم | وصف |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh`1/frommesh)(Mesh) | قم بإنشاء TriMesh من كائن شبكة محدد بتخطيط قمة تم إنشاؤه تلقائيًا. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | ابدأ في إضافة vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | نهاية إضافة vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | البحث عن الخاصية. يمكن أن تكون خاصية ديناميكية (تم إنشاؤها بواسطة CreateDynamicProperty / SetProperty) أو خاصية أصلية (محددة باسمها) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | الحصول على المربع المحيط للكيان الحالي في نظام إحداثيات مساحة الكائن. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | الحصول على مفتاح عارض الكيان المسجل في العارض |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | احصل على العداد للعدد[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | الحصول على قيمة الخاصية المحددة |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | تحميل الرؤوس من البايت ، يجب أن يكون طول البايت عددًا صحيحًا مضاعفًا لحجم الرأس. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | اقرأ الحقل المزدوج |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | اقرأ حقل الطفو |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | اقرأ vector2 field |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | اقرأ vector3 field |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | اقرأ vector4 field |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | اقرأ vector2 field |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | اقرأ vector3 field |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | اقرأ vector4 field |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | يزيل خاصية ديناميكية . |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | إزالة الخاصية المحددة المحددة بالاسم |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | يحدد قيمة الخاصية المحددة |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | يحصل على تمثيل سلسلة[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | تحويل بيانات الرؤوس إلى مصفوفة بايت |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh`1/verticestotypedarray)() | قم بتحويل بيانات الرؤوس إلى صفيف مكتوب |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | اكتب بيانات المؤشرات كعدد صحيح 16 بت إلى stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | اكتب بيانات المؤشرات كعدد صحيح 32 بت إلى stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | كتابة بيانات الرؤوس إلى التدفق المحدد |

### أنظر أيضا

* class [TriMesh](../trimesh)
* مساحة الاسم [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
