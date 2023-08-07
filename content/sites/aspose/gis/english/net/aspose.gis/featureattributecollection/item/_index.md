---
title: FeatureAttributeCollection.Item
second_title: Aspose.GIS for .NET API Reference
description: FeatureAttributeCollection property. Gets or sets the FeatureAttribute at the specified index
type: docs
weight: 30
url: /net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

Gets or sets the [`FeatureAttribute`](../../featureattribute/) at the specified index.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| Parameter | Description |
| --- | --- |
| index | The zero-based index of the attribute to get or set. |

### Return Value

The attribute at the specified index.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | The index is out of range. |
| InvalidOperationException | Attempt to modify a locked collection. |

### See Also

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* namespace [Aspose.Gis](../../featureattributecollection/)
* assembly [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

Gets or sets the [`FeatureAttribute`](../../featureattribute/) with a specified name.

```csharp
public FeatureAttribute this[string name] { get; }
```

| Parameter | Description |
| --- | --- |
| name | Name of the attributes. |

### Return Value

The attribute with the specified name, or `null` if it's not found.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The attribute name is `null`. |

### See Also

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* namespace [Aspose.Gis](../../featureattributecollection/)
* assembly [Aspose.GIS](../../../)


