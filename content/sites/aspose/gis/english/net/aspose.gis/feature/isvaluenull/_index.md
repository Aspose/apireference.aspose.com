---
title: Feature.IsValueNull
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Determines whether the specified attribute has been explicitly set to null value.
type: docs
weight: 80
url: /net/aspose.gis/feature/isvaluenull/
---
## Feature.IsValueNull method

Determines whether the specified attribute has been explicitly set to `null` value.

```csharp
public bool IsValueNull(string attributeName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | Name of the attribute. |

### Return Value

`true` if the attribute value is `null`; otherwise, `false`.

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


