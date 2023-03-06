---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS لمرجع .NET API
description: Dataset طريقة. يفتح الطبقة في الفهرس المحدد للقراءة.
type: docs
weight: 120
url: /ar/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

يفتح الطبقة في الفهرس المحدد للقراءة.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| index | Int32 | فهرس الطبقة المراد فتحها. |
| options | DriverOptions | افتح الخيارات. |

### قيمة الإرجاع

تم فتح الطبقة للقراءة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentException | كائن الخيارات له نوع غير صحيح لمجموعة البيانات هذه. |
| ArgumentOutOfRangeException | الفهرس خارج النطاق |
| ArgumentException | كائن الخيارات له نوع غير صحيح لمجموعة البيانات هذه. |
| [GisException](../../gisexception/) | خطأ في قراءة المعلم من الطبقة. |
| IOException | حدث خطأ في الإدخال / الإخراج. |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* مساحة الاسم [Aspose.Gis](../../dataset/)
* المجسم [Aspose.GIS](../../../)


