---
title: Class LabelingRule
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Labelings.LabelingRule class. A userdefined rule for RuleBasedLabeling
type: docs
weight: 4080
url: /net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

A user-defined rule for [`RuleBasedLabeling`](../rulebasedlabeling/).

```csharp
public class LabelingRule
```

## Properties

| Name | Description |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Determines if "filter-rule" should apply labeling to the feature. If returns `true` labeling is used; otherwise, feature is skipped. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Gets a value indicating whether this rule is "else-rule". |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Gets a value indicating whether this rule is "filter-rule". |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Labeling to apply to the feature. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Creates new rule that applies a labeling to feature whenever it doesn't match any filter rule. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Creates new rule that applies a labeling to feature whenever it passes filter. |

### See Also

* namespace [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* assembly [Aspose.GIS](../../)


