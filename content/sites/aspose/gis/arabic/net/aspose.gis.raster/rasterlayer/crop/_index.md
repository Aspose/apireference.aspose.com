---
title: RasterLayer.Crop
second_title: Aspose.GIS لمرجع .NET API
description: RasterLayer طريقة. يقطع طبقة البيانات النقطية باستخدام نموذج الشكل وقناع النطاق .
type: docs
weight: 110
url: /ar/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

يقطع طبقة البيانات النقطية باستخدام نموذج الشكل (وقناع النطاق) .

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| geometry | IGeometry | تمثل الهندسة شكل الشكل. |
| masks | Double[] | قناع لطبقة المحاصيل |

### قيمة الإرجاع

الطبقة النقطية المقطوعة. إذا لم يتم العثور على تقاطعات العودة`null`.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | لا يمكن أن تكون الوسيطة فارغة. اسم المعلمة: الهندسة. |
| NotSupportedException | لا يمكن أن تختلف الوسيطة عن المضلع أو السطح. اسم المعلمة: الهندسة. |
| InvalidOperationException | لا يمكن أن تكون الطبقة الأصلية CropRasterLayer آخر. |
| [GisException](../../../aspose.gis/gisexception/) | خطأ أثناء اقتصاص الطبقة. |

### أنظر أيضا

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* مساحة الاسم [Aspose.Gis.Raster](../../rasterlayer/)
* المجسم [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

يقطع الطبقة النقطية باستخدام قناع النطاق) .

```csharp
public RasterLayer Crop(double[] masks)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| masks | Double[] | قناع لطبقة المحاصيل |

### قيمة الإرجاع

الطبقة النقطية المقطوعة. إذا لم يتم العثور على تقاطعات العودة`null`.

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException |  |

### أنظر أيضا

* class [RasterLayer](../)
* مساحة الاسم [Aspose.Gis.Raster](../../rasterlayer/)
* المجسم [Aspose.GIS](../../../)


