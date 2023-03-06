---
title: PrecisionModel.Rounding
second_title: Aspose.GIS لمرجع .NET API
description: PrecisionModel طريقة. إرجاع نموذج دقة التقريب . وفقًا لنموذج التقريب الدقيق  يكون عدد الأرقام محدودًا فقط .
type: docs
weight: 20
url: /ar/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

إرجاع نموذج دقة التقريب . وفقًا لنموذج التقريب الدقيق ، يكون عدد الأرقام محدودًا فقط .

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| significantDigits | Int32 | عدد الخانات ذات الدلالة. |

### قيمة الإرجاع

نموذج التقريب الدقيق.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | عدد الأرقام المعنوية أقل من 0 أو أكثر من 15. |

### ملاحظات

عند تطبيقه على إحداثي ، يتم استخدام الكود التالي لتقليل الدقة:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### أنظر أيضا

* class [PrecisionModel](../)
* مساحة الاسم [Aspose.Gis](../../precisionmodel/)
* المجسم [Aspose.GIS](../../../)


