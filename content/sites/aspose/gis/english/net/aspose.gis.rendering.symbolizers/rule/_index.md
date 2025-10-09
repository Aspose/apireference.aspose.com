---
title: Class Rule
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Symbolizers.Rule class. A userdefined rule for RuleBasedSymbolizer
type: docs
weight: 4370
url: /net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

A user-defined rule for [`RuleBasedSymbolizer`](../rulebasedsymbolizer/).

```csharp
public class Rule
```

## Properties

| Name | Description |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | Determines if "filter-rule" should apply symbolizer to the feature. If returns `true` symbolizer is used; otherwise, feature is skipped. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Gets a value indicating whether this rule is "else-rule". |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Gets a value indicating whether this rule is "filter-rule". |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Symbolizer to apply to the feature. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Creates new rule that applies a symbolizer to feature whenever it doesn't match any filter rule. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Creates new rule that applies a symbolizer to feature whenever it passes filter. |

### See Also

* namespace [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* assembly [Aspose.GIS](../../)


