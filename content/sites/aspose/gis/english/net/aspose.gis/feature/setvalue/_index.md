---
title: Feature.SetValue
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Sets a new value of an attribute.
type: docs
weight: 100
url: /net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

Sets a new value of an attribute.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| Parameter | Description |
| --- | --- |
| T | The type of the value. |
| attributeName | The name of the attribute. |
| value | The value of the attribute. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The attribute name is `null`. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| InvalidOperationException | The attribute is not locked. |
| InvalidCastException | The type of the value does not implement IConvertible. |
| FormatException | Conversion failed because the value is in incorrect format. |
| OverflowException | Conversion failed because of overflow. |

### Remarks

This method converts the value automatically to the type of the attribute.

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


