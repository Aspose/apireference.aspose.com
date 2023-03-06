---
title: IGeometry.GetDistanceTo
second_title: Aspose.GIS لمرجع .NET API
description: IGeometry طريقة. حساب الحد الأدنى للمسافة بين هذه الهندسة والهندسة المحددة.
type: docs
weight: 230
url: /ar/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### أنظر أيضا

* interface [IGeometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../igeometry/)
* المجسم [Aspose.GIS](../../../)


