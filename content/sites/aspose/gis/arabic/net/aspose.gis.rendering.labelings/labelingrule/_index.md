---
title: Class LabelingRule
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Rendering.Labelings.LabelingRule فصل. قاعدة معرّفة من قبل المستخدم لـRuleBasedLabeling .
type: docs
weight: 1630
url: /ar/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

قاعدة معرّفة من قبل المستخدم لـ[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | تحديد ما إذا كان يجب على "قاعدة عامل التصفية" تطبيق وضع العلامات على الميزة. إذا تم إرجاعها`true` يتم استخدام العلامات ؛ خلاف ذلك ، يتم تخطي الميزة. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه القاعدة "قاعدة أخرى" . |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه القاعدة "قاعدة عامل التصفية" . |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | وضع العلامات للتطبيق على الميزة. |

## طُرق

| اسم | وصف |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | إنشاء قاعدة جديدة تطبق تصنيفًا على الميزة عندما لا تتطابق مع أي قاعدة تصفية . |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | إنشاء قاعدة جديدة تطبق تصنيفًا على الميزة كلما اجتاز عامل التصفية . |

### أنظر أيضا

* مساحة الاسم [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* المجسم [Aspose.GIS](../../)


