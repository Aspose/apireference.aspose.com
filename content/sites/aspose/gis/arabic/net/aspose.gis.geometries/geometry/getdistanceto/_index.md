---
title: Geometry.GetDistanceTo
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. حساب الحد الأدنى للمسافة بين هذه الهندسة والهندسة المحددة.
type: docs
weight: 240
url: /ar/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

حساب الحد الأدنى للمسافة بين هذه الهندسة والهندسة المحددة.

```csharp
public double GetDistanceTo(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة لإيجاد المسافة. |

### قيمة الإرجاع

إذا لم يكن كلا الشكلين الهندسيين كذلك[`IsEmpty`](../isempty/) - المسافة بين أقرب النقاط من الأشكال الهندسية . إذا كانت هناك هندسة واحدة على الأقل فارغة ، يتم إرجاع -1 .

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


