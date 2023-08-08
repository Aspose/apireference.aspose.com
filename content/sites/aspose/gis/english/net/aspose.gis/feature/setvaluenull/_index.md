---
title: Feature.SetValueNull
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Sets value of the attribute to null
type: docs
weight: 110
url: /net/aspose.gis/feature/setvaluenull/
---
## Feature.SetValueNull method

Sets value of the attribute to `null`.

```csharp
public void SetValueNull(string attributeName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | The name of the attribute. |

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The attribute is not locked. |
| InvalidOperationException | Value of this attribute cannot be Null. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| ArgumentNullException | The attribute name is `null`. |

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


