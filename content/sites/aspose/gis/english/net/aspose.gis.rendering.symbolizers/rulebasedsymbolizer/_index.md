---
title: Class RuleBasedSymbolizer
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer class. Applies a symbolizer to feature geometries according to userdefined rules
type: docs
weight: 4380
url: /net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

Applies a symbolizer to feature geometries according to user-defined rules.

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## Constructors

| Name | Description |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | Gets the number of rules. |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | Gets the rule at the specified index . |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | Adds a rule. |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Adds new [`Rule`](../rule/). |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | Adds a symbolizer that will be applied to features that don't match any filtering rule. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | Returns an enumerator that iterates through rules. |

### See Also

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* namespace [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* assembly [Aspose.GIS](../../)


