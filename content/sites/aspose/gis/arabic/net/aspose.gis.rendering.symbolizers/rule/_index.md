---
title: Class Rule
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Rendering.Symbolizers.Rule فصل. قاعدة معرّفة من قبل المستخدم لـRuleBasedSymbolizer .
type: docs
weight: 1920
url: /ar/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

قاعدة معرّفة من قبل المستخدم لـ[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | تحديد ما إذا كان يجب على "قاعدة عامل التصفية" تطبيق رمز الترميز على الميزة. إذا تم إرجاعها`true` يستخدم رمز خلاف ذلك ، يتم تخطي الميزة. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه القاعدة "قاعدة أخرى" . |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه القاعدة "قاعدة عامل التصفية" . |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Symbolizer ليتم تطبيقه على الميزة . |

## طُرق

| اسم | وصف |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | إنشاء قاعدة جديدة تطبق رمزًا على الميزة عندما لا تتطابق مع أي قاعدة تصفية . |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | ينشئ قاعدة جديدة تطبق رمزًا للميزة كلما اجتاز عامل التصفية . |

### أنظر أيضا

* مساحة الاسم [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* المجسم [Aspose.GIS](../../)


