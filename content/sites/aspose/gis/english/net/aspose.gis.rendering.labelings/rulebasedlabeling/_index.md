---
title: Class RuleBasedLabeling
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Labelings.RuleBasedLabeling class. Applies a labeling to feature according to userdefined rules
type: docs
weight: 4140
url: /net/aspose.gis.rendering.labelings/rulebasedlabeling/
---
## RuleBasedLabeling class

Applies a labeling to feature according to user-defined rules.

```csharp
public class RuleBasedLabeling : Labeling, IReadOnlyList<LabelingRule>
```

## Constructors

| Name | Description |
| --- | --- |
| [RuleBasedLabeling](rulebasedlabeling/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.gis.rendering.labelings/rulebasedlabeling/count/) { get; } | Gets the number of rules. |
| [Item](../../aspose.gis.rendering.labelings/rulebasedlabeling/item/) { get; } | Gets the rule at the specified index . |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add)(LabelingRule) | Adds a rule. |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add_1)(Func&lt;Feature, bool&gt;, Labeling) | Adds new [`LabelingRule`](../labelingrule/). |
| [AddElseRule](../../aspose.gis.rendering.labelings/rulebasedlabeling/addelserule/)(Labeling) | Adds a labeling that will be applied to features that don't match any filtering rule. |
| [GetEnumerator](../../aspose.gis.rendering.labelings/rulebasedlabeling/getenumerator/)() | Returns an enumerator that iterates through rules. |

### See Also

* class [Labeling](../labeling/)
* class [LabelingRule](../labelingrule/)
* namespace [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* assembly [Aspose.GIS](../../)


