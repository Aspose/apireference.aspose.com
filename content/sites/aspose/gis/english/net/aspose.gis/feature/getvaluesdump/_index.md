---
title: Feature.GetValuesDump
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Returns the values for all the attributes in an array. Consider to use GetValues method to avoid additional memory allocation.
type: docs
weight: 60
url: /net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

Returns the values for all the attributes in an array. Consider to use [`GetValues`](../getvalues/) method to avoid additional memory allocation.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| defaultValue | Object | The value to return if the attribute value is missing (unset). Default value is `null`. Consider to use 'DBNull.Value' for separating 'unset' and '`null`' values. |

### Return Value

A new array into which to copy the attributes values.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The argument is `null`. |
| InvalidOperationException | The attribute is not locked. |

### Remarks

The values attributes of the feature are copied into the values array that is passed as a parameter. For attributes with unset value, the specified 'unsetValue' parameter is returned.

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


