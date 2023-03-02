---
title: NumericFormat.Flat
second_title: Aspose.GIS لمرجع .NET API
description: NumericFormat طريقة. تحويل رقم إلى نص ذي نقطة ثابتة بدون تدوين علمي.
type: docs
weight: 20
url: /ar/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

تحويل رقم إلى نص ذي نقطة ثابتة بدون تدوين علمي.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| significantDigits | Int32 | عدد الخانات ذات الدلالة. أقصى دقة متوفرة هي "308" |

### قيمة الإرجاع

محدد دقة التقريب.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | عدد الأرقام المعنوية أقل من 0 أو أكثر من 308. |

### ملاحظات

يقوم الكود الداخلي بإنشاء سلاسل رقمية لـ WKT عبر: قرار التنسيق. toString ("0. ## .."، CultureInfo.InvariantCulture).

### أنظر أيضا

* class [NumericFormat](../)
* مساحة الاسم [Aspose.Gis](../../numericformat/)
* المجسم [Aspose.GIS](../../../)


