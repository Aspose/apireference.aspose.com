---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS for .NET API Reference
description: LabelingRule method. Creates new rule that applies a labeling to feature whenever it passes filter.
type: docs
weight: 20
url: /net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Creates new rule that applies a labeling to feature whenever it passes filter.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filter | Func`2 | Determines when labeling should be used. |
| labeling | Labeling | Labeling to apply. |

### Return Value

New LabelingRule object.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Filter is `null`. |

### See Also

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* namespace [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* assembly [Aspose.GIS](../../../)


