---
title: GeoConvert.ParsePointText
second_title: Aspose.GIS لمرجع .NET API
description: GeoConvert طريقة. تحويل السلسلة التي تحتوي على إحداثيات إلى كائن IPoint.
type: docs
weight: 20
url: /ar/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

تحويل السلسلة التي تحتوي على إحداثيات إلى كائن IPoint.

```csharp
public static IPoint ParsePointText(string text)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة تحتوي على إحداثيات للتحويل. يجب أن تحتوي السلسلة على إحداثيات خط الطول وخط العرض. يجب فصل الإحداثيات بمسافة بيضاء أو بفاصلة أو بفاصلة منقوطة. |

### قيمة الإرجاع

كائن IPoint بإحداثيات مكافئة لسلسلة الإدخال.

### استثناءات

| استثناء | حالة |
| --- | --- |
| [GisException](../../gisexception/) |  |

### ملاحظات

أمثلة: "80 ° 151 °" ، "74 ° 50.82 '، 172 ° 08.21'" ، "80 ° ؛ 151 °" ، "2CMB" ، "2CMB6682893142" ، "2C MB 66828 93142" ، "WMAQ12405535" .

### أنظر أيضا

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* مساحة الاسم [Aspose.Gis](../../geoconvert/)
* المجسم [Aspose.GIS](../../../)


