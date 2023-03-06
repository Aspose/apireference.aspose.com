---
title: Feature.CopyValues
second_title: Aspose.GIS لمرجع .NET API
description: Feature طريقة. ينسخ قيم السمات من ميزة أخرى .
type: docs
weight: 20
url: /ar/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

ينسخ قيم السمات من ميزة أخرى .

```csharp
public void CopyValues(Feature inputFeature)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| inputFeature | Feature | الميزة لنسخ القيم من. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | السمة بهذا الاسم غير موجودة في هذه الطبقة. |
| InvalidOperationException | السمة غير مؤمنة. |
| InvalidOperationException | قيمة الإدخال خالية ولا يمكن أن تكون السمة في هذه الميزة خالية. |
| [GisException](../../gisexception/) | السمة لها نفس الاسم لكن أنواع بيانات مختلفة في المعالم. |

### ملاحظات

هذه الطريقة تنسخ السمات ذات الأسماء المطابقة فقط.

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)


