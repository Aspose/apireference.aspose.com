---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS لمرجع .NET API
description: RasterLayer طريقة. تحويل العمود والصف المحددين إلى الإحداثي المكاني.
type: docs
weight: 150
url: /ar/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

تحويل العمود والصف المحددين إلى الإحداثي المكاني.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| cellX | Int32 | قيمة العمود (إحداثيات س). يبدأ الترقيم من 0. |
| cellY | Int32 | قيمة الصف (إحداثيات ص). يبدأ الترقيم من 0. |

### قيمة الإرجاع

لعرض إحداثي x للركن الأيسر العلوي بعمود وصف.

### ملاحظات

إذا تم تمرير أي من المعلمتين خارج نطاق البعد الخاص بالمؤشر النقطي ، فإنه سيعيد الإحداثيات خارج نطاق البيانات النقطية على افتراض أن شبكة البيانات النقطية قابلة للتطبيق خارج حدود البيانات النقطية.

### أنظر أيضا

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* مساحة الاسم [Aspose.Gis.Raster](../../rasterlayer/)
* المجسم [Aspose.GIS](../../../)


