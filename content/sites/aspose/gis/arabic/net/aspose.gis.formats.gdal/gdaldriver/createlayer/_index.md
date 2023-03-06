---
title: GdalDriver.CreateLayer
second_title: Aspose.GIS لمرجع .NET API
description: GdalDriver طريقة. ينشئ طبقة ويفتحها لإضافة معالم جديدة .
type: docs
weight: 40
url: /ar/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

ينشئ طبقة ويفتحها لإضافة معالم جديدة .

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| options | DriverOptions | خيارات خاصة بالسائق. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | الطبقة موجودة بالفعل. |
| NotSupportedException | لا يدعم السائق نظام الإسناد المكاني. |

### أنظر أيضا

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* مساحة الاسم [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* المجسم [Aspose.GIS](../../../)


