---
title: FeaturesSequence.WhereLinq
second_title: Aspose.GIS for .NET API Reference
description: FeaturesSequence method. Combining selection criteria into a single query using linq
type: docs
weight: 110
url: /net/aspose.gis/featuressequence/wherelinq/
---
## FeaturesSequence.WhereLinq method

Combining selection criteria into a single query using linq.

```csharp
public virtual FeaturesSequence WhereLinq(Func<Feature, bool> filteringPredicate)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filteringPredicate | Func`2 | Lambda function for filtering. |

### Return Value

Features with attribute value satisfying the selection conditions.

### Exceptions

| exception | condition |
| --- | --- |
| NullReferenceException | If the base sequence is null or the predicate is null. |

### See Also

* class [Feature](../../feature/)
* class [FeaturesSequence](../)
* namespace [Aspose.Gis](../../featuressequence/)
* assembly [Aspose.GIS](../../../)


