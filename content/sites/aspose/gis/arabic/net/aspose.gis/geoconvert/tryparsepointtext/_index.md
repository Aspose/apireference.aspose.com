---
title: GeoConvert.TryParsePointText
second_title: Aspose.GIS لمرجع .NET API
description: GeoConvert طريقة. تحويل السلسلة التي تحتوي على إحداثيات إلى كائن IPoint. تشير القيمة المرجعة إلى ما إذا كان التحويل قد نجح أو فشل.
type: docs
weight: 30
url: /ar/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

تحويل السلسلة التي تحتوي على إحداثيات إلى كائن IPoint. تشير القيمة المرجعة إلى ما إذا كان التحويل قد نجح أو فشل.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة تحتوي على إحداثيات للتحويل. يجب أن تحتوي السلسلة على إحداثيات خط الطول وخط العرض. يجب فصل الإحداثيات بمسافة بيضاء أو بفاصلة أو بفاصلة منقوطة. |
| point | IPoint& | عند إرجاع هذا الأسلوب ، يحتوي على كائن IPoint بالإحداثيات الموزعة ، إذا نجح التحويل ، أو فارغًا إذا فشل التحويل. |

### قيمة الإرجاع

صواب إذا تم تحليل النص بنجاح ، وإلا فهو خطأ.

### ملاحظات

أمثلة: "80 ° 151 °" ، "74 ° 50.82 '، 172 ° 08.21'" ، "80 ° ؛ 151 °" ، "2CMB" ، "2CMB6682893142" ، "2C MB 66828 93142" ، "WMAQ12405535" .

### أنظر أيضا

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* مساحة الاسم [Aspose.Gis](../../geoconvert/)
* المجسم [Aspose.GIS](../../../)


