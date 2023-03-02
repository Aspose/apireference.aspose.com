---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS لمرجع .NET API
description: GeoGenerator طريقة. ينشئ مصفوفة من النجوم  كلهم ضمن نطاق معين.
type: docs
weight: 40
url: /ar/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

ينشئ مصفوفة من النجوم ، كلهم ضمن نطاق معين.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | Extent | منطقة محددة (انظر[`حد`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | خيارات إنشاء المضلع (انظر[`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### قيمة الإرجاع

مصفوفة من النجوم (انظر تعداد[`مضلع`](../../../aspose.gis.geometries/ipolygon/))

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | يجب أن يكون عدد النجوم مبشورًا ثم واحدًا. |
| NullReferenceException | يجب أن يحتوي النطاق على قيمة (يجب ألا يكون NULL) |
| ArgumentException | يجب أن يكون الحد الأدنى والحد الأقصى للطول غير متساوي وأكبر من 3 |
| ArgumentException | يجب أن يكون الحد الأقصى للطول أكبر من الحد الأدنى |

### أنظر أيضا

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* مساحة الاسم [Aspose.Gis.GeoTools](../../geogenerator/)
* المجسم [Aspose.GIS](../../../)


