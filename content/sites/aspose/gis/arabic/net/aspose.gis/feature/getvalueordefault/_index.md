---
title: Feature.GetValueOrDefault
second_title: Aspose.GIS لمرجع .NET API
description: Feature طريقة. يحصل على قيمة سمة  أوDefaultValue إذا كانت القيمة غير محددة أوباطل .
type: docs
weight: 40
url: /ar/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

يحصل على قيمة سمة ، أو[`DefaultValue`](../../featureattribute/defaultvalue/) إذا كانت القيمة غير محددة أو`باطل` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

تقوم هذه الطريقة بتحويل القيمة تلقائيًا إلى النوع المطلوب في معلمة النوع العام.

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

يحصل على قيمة سمة ، أو[`DefaultValue`](../../featureattribute/defaultvalue/) إذا كانت القيمة غير محددة أو`باطل` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| attributeName | String | اسم السمة. |
| defaultValue | Object | القيمة المراد إرجاعها إذا كانت قيمة السمة مفقودة. القيمة الافتراضية هي`null` . |

### قيمة الإرجاع

قيمة السمة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | اسم السمة هو`null`. |
| ArgumentException | السمة بهذا الاسم غير موجودة في هذه الطبقة. |
| InvalidOperationException | السمة غير مؤمنة. |
| InvalidOperationException | لم يتم تعيين قيمة هذه السمة لهذه الميزة. |

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

يحصل على قيمة سمة ، أو[`DefaultValue`](../../featureattribute/defaultvalue/) إذا كانت القيمة غير محددة أو`باطل` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| معامل | وصف |
| --- | --- |
| T | النوع المطلوب للقيمة. |
| attributeName | اسم السمة. |
| defaultValue | القيمة المراد إرجاعها إذا كانت قيمة السمة مفقودة. |

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

تقوم هذه الطريقة بتحويل القيمة تلقائيًا إلى النوع المطلوب في معلمة النوع العام.

### أنظر أيضا

* class [Feature](../)
* مساحة الاسم [Aspose.Gis](../../feature/)
* المجسم [Aspose.GIS](../../../)


