---
title: Feature.GetValueOrDefault
second_title: Aspose.GIS for .NET API Reference
description: Feature method. Gets the value of an attribute or DefaultValue if the value is unset or null
type: docs
weight: 40
url: /net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

Gets the value of an attribute, or [`DefaultValue`](../../featureattribute/defaultvalue/) if the value is unset or `null`.

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

This method converts the value automatically to the type requested in the generic type parameter.

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

Gets the value of an attribute, or [`DefaultValue`](../../featureattribute/defaultvalue/) if the value is unset or `null`.

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| attributeName | String | Name of the attribute. |
| defaultValue | Object | The value to return if the attribute value is missing. Default value is `null`. |

### Return Value

Value of the attribute.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The attribute name is `null`. |
| ArgumentException | The attribute with this name does not exist in this layer. |
| InvalidOperationException | The attribute is not locked. |
| InvalidOperationException | The value of this attribute is not set for this feature. |

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

Gets the value of an attribute, or [`DefaultValue`](../../featureattribute/defaultvalue/) if the value is unset or `null`.

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| Parameter | Description |
| --- | --- |
| T | Desired type for the value. |
| attributeName | Name of the attribute. |
| defaultValue | The value to return if the attribute value is missing. |

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

This method converts the value automatically to the type requested in the generic type parameter.

### See Also

* class [Feature](../)
* namespace [Aspose.Gis](../../feature/)
* assembly [Aspose.GIS](../../../)


