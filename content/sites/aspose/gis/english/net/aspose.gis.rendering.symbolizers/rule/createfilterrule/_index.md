---
title: Rule.CreateFilterRule
second_title: Aspose.GIS for .NET API Reference
description: Rule method. Creates new rule that applies a symbolizer to feature whenever it passes filter
type: docs
weight: 20
url: /net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Creates new rule that applies a symbolizer to feature whenever it passes filter.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filter | Func`2 | Determines when symbolizer should be used. |
| symbolizer | VectorSymbolizer | Symbolizer to apply. |

### Return Value

The New Rule object.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Filter is `null`. |

### See Also

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* namespace [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* assembly [Aspose.GIS](../../../)


