---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS لمرجع .NET API
description: GeoGenerator طريقة. إنشاء عدّاد IPolygon جديد مع عدد معين من العناصر العشوائية  وكلها ضمن نطاق معين.
type: docs
weight: 30
url: /ar/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

إنشاء عدّاد IPolygon جديد مع عدد معين من العناصر العشوائية ، وكلها ضمن نطاق معين.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | Extent | منطقة محددة (انظر[`حد`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | خيارات إنشاء المضلع (انظر[`PolygonGeneratorOptions`](../../polygongeneratoroptions/)) |

### قيمة الإرجاع

صفيف من المضلعات (انظر تعداد[`مضلع`](../../../aspose.gis.geometries/ipolygon/))

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | يجب أن يكون عدد المضلعات مبشورًا ثم واحدًا. |
| NullReferenceException | يجب أن يحتوي النطاق على قيمة (يجب ألا يكون NULL) |
| ArgumentException | يجب أن يكون الحد الأدنى والحد الأقصى للطولين غير متساويين وأكبر من 0 |
| ArgumentException | يجب أن يكون الحد الأقصى للطول أكبر من الحد الأدنى |

### أنظر أيضا

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* مساحة الاسم [Aspose.Gis.GeoTools](../../geogenerator/)
* المجسم [Aspose.GIS](../../../)


