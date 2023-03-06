---
title: NumericFormat.General
second_title: Aspose.GIS لمرجع .NET API
description: NumericFormat طريقة. تحويل رقم إلى رقم مضغوط بدرجة أكبر إما للنقطة الثابتة أو الترميز العلمي  اعتمادًا على نوع الرقم وما إذا كان محدد الدقة موجودًا أم لا. يوصى باستخدامه.
type: docs
weight: 30
url: /ar/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

تحويل رقم إلى رقم مضغوط بدرجة أكبر إما للنقطة الثابتة أو الترميز العلمي ، اعتمادًا على نوع الرقم وما إذا كان محدد الدقة موجودًا أم لا. يوصى باستخدامه.

```csharp
public static NumericFormat General(int precision = 0)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| precision | Int32 | تحدد الدقة الحد الأقصى لعدد الأرقام المعنوية التي يمكن أن تظهر في سلسلة النتيجة . إذا كانت الدقة صفرًا ، يتم استخدام القيمة "15". الحد الأقصى للدقة المتاحة هو "17" . |

### قيمة الإرجاع

محدد التنسيق العام.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | عدد الأرقام المعنوية أقل من 0 أو أكثر من 17. |

### ملاحظات

يقوم الكود الداخلي بإنشاء سلاسل رقمية لـ WKT عبر: إحداثيات. toString ("G"، CultureInfo.InvariantCulture) .

### أنظر أيضا

* class [NumericFormat](../)
* مساحة الاسم [Aspose.Gis](../../numericformat/)
* المجسم [Aspose.GIS](../../../)


