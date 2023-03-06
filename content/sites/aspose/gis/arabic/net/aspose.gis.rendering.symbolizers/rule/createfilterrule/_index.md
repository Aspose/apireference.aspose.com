---
title: Rule.CreateFilterRule
second_title: Aspose.GIS لمرجع .NET API
description: Rule طريقة. ينشئ قاعدة جديدة تطبق رمزًا للميزة كلما اجتاز عامل التصفية .
type: docs
weight: 20
url: /ar/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

ينشئ قاعدة جديدة تطبق رمزًا للميزة كلما اجتاز عامل التصفية .

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| filter | Func`2 | يحدد متى يجب استخدام المرمز. |
| symbolizer | VectorSymbolizer | Symbolizer للتطبيق. |

### قيمة الإرجاع

كائن قاعدة جديدة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الفلتر هو`null`. |

### أنظر أيضا

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* مساحة الاسم [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* المجسم [Aspose.GIS](../../../)


