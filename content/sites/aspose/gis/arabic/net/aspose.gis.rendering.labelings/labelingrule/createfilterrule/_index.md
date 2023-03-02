---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS لمرجع .NET API
description: LabelingRule طريقة. إنشاء قاعدة جديدة تطبق تصنيفًا على الميزة كلما اجتاز عامل التصفية .
type: docs
weight: 20
url: /ar/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

إنشاء قاعدة جديدة تطبق تصنيفًا على الميزة كلما اجتاز عامل التصفية .

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| filter | Func`2 | يحدد متى يجب استخدام الملصقات. |
| labeling | Labeling | وضع العلامات للتطبيق. |

### قيمة الإرجاع

كائن جديد LabelingRule.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الفلتر هو`null`. |

### أنظر أيضا

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* مساحة الاسم [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* المجسم [Aspose.GIS](../../../)


