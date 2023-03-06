---
title: Feature.UnsetValue
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Removes the attribute value from this feature.
type: docs
weight: 130
url: /net/aspose.gis/feature/unsetvalue/
---
## Feature.UnsetValue method

Removes the attribute value from this feature.

```csharp
public void UnsetValue(string attributeName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | Name of the attribute. |

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The attribute is not locked. |
| InvalidOperationException | Value of this attribute cannot be unset. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| ArgumentNullException | The attribute name is `null`. |

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


