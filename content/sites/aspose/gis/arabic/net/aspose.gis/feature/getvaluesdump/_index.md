---
title: Feature.GetValuesDump
second_title: Aspose.GIS لمرجع .NET API
description: Feature طريقة. إرجاع قيم كافة السمات في مصفوفة. ضع في اعتبارك استخدامGetValues طريقة لتجنب تخصيص الذاكرة الإضافية.
type: docs
weight: 60
url: /ar/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

إرجاع قيم كافة السمات في مصفوفة. ضع في اعتبارك استخدام[`GetValues`](../getvalues/) طريقة لتجنب تخصيص الذاكرة الإضافية.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| defaultValue | Object | القيمة المطلوب عرضها إذا كانت قيمة السمة مفقودة (غير محددة). القيمة الافتراضية هي`null`. جرب استخدام "DBNull.Value "لفصل" unset "و"`null` القيم . |

### قيمة الإرجاع

مصفوفة جديدة لنسخ قيم السمات إليها.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| InvalidOperationException | السمة غير مؤمنة. |

### ملاحظات

يتم نسخ سمات قيم الميزة في مصفوفة القيم التي تم تمريرها كمعامل . بالنسبة للسمات ذات القيمة غير المحددة ، يتم إرجاع معلمة "unsetValue" المحددة.

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)


