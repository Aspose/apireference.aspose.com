---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: FileDriver طريقة. تحديد ما إذا كان نظام الإسناد المكاني المحدد مدعومًا من قبل برنامج التشغيل.
type: docs
weight: 100
url: /ar/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

تحديد ما إذا كان نظام الإسناد المكاني المحدد مدعومًا من قبل برنامج التشغيل.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

قيمة منطقية ، تشير إلى ما إذا كان نظام الإسناد المكاني المحدد مدعومًا من قبل السائق.`null` يعتبر مدعومًا من قبل أي سائق.

### ملاحظات

إذا كان نظام الإسناد المكاني غير مدعوم ، وقمت بتمريره إلى[`CreateLayer`](../createlayer/) الطريقة ، أNotSupportedException سيتم طرحه.

### أنظر أيضا

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)


