---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS لمرجع .NET API
description: GeoGenerator طريقة. ينشئ مصفوفة من النقاط تنتمي إلى المنطقة المحددة.
type: docs
weight: 20
url: /ar/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

ينشئ مصفوفة من النقاط تنتمي إلى المنطقة المحددة.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | Extent | منطقة محددة (انظر[`حد`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | خيارات إنشاء النقاط (انظر[`PointGeneratorOptions`](../../pointgeneratoroptions/)). |

### قيمة الإرجاع

مجموعة من النقاط (انظر تعداد[`IGeometry`](../../../aspose.gis.geometries/igeometry/)).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | يجب أن يكون عدد النقاط مبشرة ثم واحدة. |
| NullReferenceException | يجب أن يكون للمدى قيمة (لا تكون فارغة). |

### أنظر أيضا

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* مساحة الاسم [Aspose.Gis.GeoTools](../../geogenerator/)
* المجسم [Aspose.GIS](../../../)


