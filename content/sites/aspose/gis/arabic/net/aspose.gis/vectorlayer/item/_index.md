---
title: VectorLayer.Item
second_title: Aspose.GIS لمرجع .NET API
description: VectorLayer ملكية. يحصل على ملفFeature في الفهرس المحدد.
type: docs
weight: 70
url: /ar/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

يحصل على ملف[`Feature`](../../feature/) في الفهرس المحدد.

```csharp
public virtual Feature this[int index] { get; }
```

| معامل | وصف |
| --- | --- |
| index | فهرس الميزة. |

### Property_Value

ملف[`Feature`](../../feature/) .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | يتم طرحها إذا تم فتح الطبقة للكتابة فقط. |
| ArgumentOutOfRangeException | الفهرس خارج النطاق. |
| [GisException](../../gisexception/) | خطأ في قراءة الميزة من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |

### أنظر أيضا

* class [Feature](../../feature/)
* class [VectorLayer](../)
* مساحة الاسم [Aspose.Gis](../../vectorlayer/)
* المجسم [Aspose.GIS](../../../)


