---
title: Feature.IsValueSet
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Checks if the attribute value is set in this feature.
type: docs
weight: 90
url: /net/aspose.gis/feature/isvalueset/
---
## Feature.IsValueSet method

Checks if the attribute value is set in this feature.

```csharp
public bool IsValueSet(string attributeName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | Name of the attribute. |

### Return Value

`true` if value for the specified attribute is set; otherwise, `false`.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The attribute is not locked. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| ArgumentNullException | The attribute name is `null`. |

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


