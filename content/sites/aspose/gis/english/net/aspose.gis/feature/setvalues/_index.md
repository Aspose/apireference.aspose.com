---
title: Feature.SetValues
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Sets new values for all of the attributes. Also consider to use CopyValues method to streamline setting values in one call
type: docs
weight: 120
url: /net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

Sets new values for all of the attributes. Also consider to use [`CopyValues`](../copyvalues/) method to streamline setting values in one call.

```csharp
public int SetValues(object[] values)
```

| Parameter | Type | Description |
| --- | --- | --- |
| values | Object[] | The array of new values. |

### Return Value

The number of attribute values set.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument cannot be `null`. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| InvalidOperationException | The attribute is not locked. |
| InvalidCastException | The type of the value does not implement IConvertible. |
| FormatException | Conversion failed because the value is in incorrect format. |
| OverflowException | Conversion failed because of overflow. |

## Remarks

This method converts the each value automatically to the type of the attribute.  The length of the values array does not need to match the number of attributes in the feature. If the array length is greater than the number of attributes, all of the array values are copied into the attributes; if it is less, only the array length number of values is copied into the attributes, starting at the attribute value with ordinal 0.

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


