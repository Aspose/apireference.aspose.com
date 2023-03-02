---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS لمرجع .NET API
description: SpatialReferenceSystemTransformation طريقة. يحول الهندسة من نظام الإسناد المكاني المصدر إلى نظام الإسناد المكاني المستهدف.
type: docs
weight: 40
url: /ar/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

يحول الهندسة من نظام الإسناد المكاني المصدر إلى نظام الإسناد المكاني المستهدف.

```csharp
public Geometry Transform(IGeometry geometry)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| geometry | IGeometry | الهندسة للتحول. |

### قيمة الإرجاع

هندسة جديدة في نظام الإسناد المكاني المستهدف.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الهندسة`null` . |
| ArgumentException | الهندسة[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) ليس`null` ولا تكافئ to [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | فشل التحول. |

### أنظر أيضا

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* المجسم [Aspose.GIS](../../../)


