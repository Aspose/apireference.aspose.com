---
title: GeoGenerator.ProduceLines
second_title: Aspose.GIS لمرجع .NET API
description: GeoGenerator طريقة. ينشئ ILineString Enumerator جديدًا بعدد معين من العناصر العشوائية  وكلها في نطاق معين.
type: docs
weight: 10
url: /ar/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

ينشئ ILineString Enumerator جديدًا بعدد معين من العناصر العشوائية ، وكلها في نطاق معين.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | Extent | منطقة محددة (انظر[`حد`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | خيارات إنشاء الخط (انظر[`LineGeneratorOptions`](../../linegeneratoroptions/)) |

### قيمة الإرجاع

صفيف من الخطوط (انظر تعداد[`سلسلة ILine`](../../../aspose.gis.geometries/ilinestring/))

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | يجب أن يكون عدد الخطوط مبشرة ثم واحد. |
| NullReferenceException | يجب أن يحتوي النطاق على قيمة (يجب ألا يكون NULL) |

### أنظر أيضا

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* مساحة الاسم [Aspose.Gis.GeoTools](../../geogenerator/)
* المجسم [Aspose.GIS](../../../)


