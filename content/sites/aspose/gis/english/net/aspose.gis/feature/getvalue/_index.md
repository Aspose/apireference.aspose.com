---
title: Feature.GetValue
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Gets the value of an attribute
type: docs
weight: 30
url: /net/aspose.gis/feature/getvalue/
---
## GetValue(string) {#getvalue}

Gets the value of an attribute.

```csharp
public object GetValue(string attributeName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | Name of the attribute. |

### Return Value

Value of the attribute.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The attribute name is `null`. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| InvalidOperationException | The attribute is not locked. |
| InvalidOperationException | The value of this attribute is not set for this feature. |

## Remarks

If the layer does not require its features to have values for all attributes defined for the layer, this method may fail with InvalidOperationException when a missing value is requested. When working with such layers, consider using [`GetValueOrDefault`](../getvalueordefault/).

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)

---

## GetValue&lt;T&gt;(string) {#getvalue_1}

Gets the value of an attribute.

```csharp
public T GetValue<T>(string attributeName)
```

| Parameter | Description |
| --- | --- |
| T | Desired type for the value. |
| attributeName | Name of the attribute. |

### Return Value

Value of the attribute.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The attribute name is `null`. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| InvalidOperationException | The attribute is not locked. |
| InvalidOperationException | The value of this attribute is not set for this feature. |
| InvalidCastException | The requested type does not implement IConvertible. |
| InvalidCastException | Value of the attribute is `null`, but the requested type is a value type. |
| FormatException | Conversion failed because the value is in incorrect format. |
| OverflowException | Conversion failed because of overflow. |

## Remarks

This method converts the value automatically to the type requested in the generic type parameter.  If the layer does not require its features to have values for all attributes defined for the layer, this method may fail with InvalidOperationException when a missing value is requested. When working with such layers, consider using [`GetValueOrDefault`](../getvalueordefault/).

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


