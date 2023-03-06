---
title: Feature.GetValue
second_title: Aspose.GIS لمرجع .NET API
description: Feature طريقة. الحصول على قيمة سمة .
type: docs
weight: 30
url: /ar/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

الحصول على قيمة سمة .

```csharp
public T GetValue<T>(string attributeName)
```

| معامل | وصف |
| --- | --- |
| T | النوع المطلوب للقيمة. |
| attributeName | اسم السمة. |

### قيمة الإرجاع

قيمة السمة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | اسم السمة هو`null`. |
| ArgumentException | السمة بهذا الاسم غير موجودة في هذه الطبقة. |
| InvalidOperationException | السمة غير مؤمنة. |
| InvalidOperationException | لم يتم تعيين قيمة هذه السمة لهذه الميزة. |
| InvalidCastException | النوع المطلوب لا يتم تنفيذهIConvertible. |
| InvalidCastException | قيمة السمة هي`null`، ولكن النوع المطلوب هو نوع القيمة. |
| FormatException | فشل التحويل لأن القيمة بتنسيق غير صحيح. |
| OverflowException | فشل التحويل بسبب تجاوز السعة. |

### ملاحظات

تقوم هذه الطريقة بتحويل القيمة تلقائيًا إلى النوع المطلوب في معلمة النوع العام. إذا لم تتطلب الطبقة أن تحتوي معالمها على قيم لجميع السمات المحددة للطبقة ، قد تفشل هذه الطريقة معInvalidOperationException عند طلب قيمة مفقودة . عند العمل مع هذه الطبقات ، ضع في اعتبارك استخدام[`GetValueOrDefault`](../getvalueordefault/) .

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

الحصول على قيمة سمة .

```csharp
public object GetValue(string attributeName)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| attributeName | String | اسم السمة. |

### قيمة الإرجاع

قيمة السمة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | اسم السمة هو`null`. |
| ArgumentException | السمة بهذا الاسم غير موجودة في هذه الطبقة. |
| InvalidOperationException | السمة غير مؤمنة. |
| InvalidOperationException | لم يتم تعيين قيمة هذه السمة لهذه الميزة. |

### ملاحظات

إذا لم تتطلب الطبقة أن تحتوي معالمها على قيم لجميع السمات المحددة للطبقة ، قد تفشل هذه الطريقة معInvalidOperationException عند طلب قيمة مفقودة . عند العمل مع هذه الطبقات ، ضع في اعتبارك استخدام[`GetValueOrDefault`](../getvalueordefault/) .

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)


