---
title: Feature.GetValues
second_title: Aspose.GIS لمرجع .NET API
description: Feature طريقة. إرجاع قيم كافة السمات في مصفوفة.
type: docs
weight: 50
url: /ar/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

إرجاع قيم كافة السمات في مصفوفة.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| values | Object[] | المصفوفة المراد نسخ قيم السمات إليها. |
| defaultValue | Object | القيمة المطلوب عرضها إذا كانت قيمة السمة مفقودة (غير محددة). القيمة الافتراضية هي`null`. جرب استخدام "DBNull.Value "لفصل" unset "و"`null` القيم . |

### قيمة الإرجاع

تم نسخ عدد من السمات.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| InvalidOperationException | السمة غير مؤمنة. |

### ملاحظات

يتم نسخ سمات قيم الميزة في مصفوفة القيم التي تم تمريرها كمعامل . بالنسبة للسمات ذات القيمة غير المحددة ، يتم إرجاع معلمة "unsetValue" المحددة. لا يلزم أن يتطابق طول مصفوفة القيم مع عدد السمات في الميزة. إذا كان طول المصفوفة أكبر من عدد السمات ، يتم نسخ جميع قيم السمات في المصفوفة ؛ إذا كانت أقل ، يتم نسخ عدد طول المصفوفة لقيم السمة فقط في المصفوفة ، بدءًا من قيمة السمة بالترتيب 0.

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)


