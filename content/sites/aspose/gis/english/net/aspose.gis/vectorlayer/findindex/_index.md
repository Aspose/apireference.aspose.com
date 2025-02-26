---
title: VectorLayer.FindIndex
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Searching for a Feature index according to the condition
type: docs
weight: 140
url: /net/aspose.gis/vectorlayer/findindex/
---
## VectorLayer.FindIndex method

Searching for a [`Feature`](../../feature/) index according to the condition.

```csharp
public virtual int FindIndex(Func<Feature, bool> match)
```

| Parameter | Type | Description |
| --- | --- | --- |
| match | Func`2 | Predicate for search. |

### Return Value

The zero-based index of the first occurrence of an [`Feature`](../../feature/) that matches the conditions defined by *match*, if found; otherwise, -1.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | If predicate is null. |

### See Also

* class [Feature](../../feature/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


