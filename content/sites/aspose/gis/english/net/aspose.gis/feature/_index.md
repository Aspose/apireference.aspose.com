---
title: Class Feature
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Feature class. A geographic feature composed of a geometry and userdefined attributes
type: docs
weight: 1620
url: /net/aspose.gis/feature/
---
## Feature class

A geographic feature composed of a geometry and user-defined attributes.

```csharp
public class Feature
```

## Properties

| Name | Description |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Gets or sets geometry of the feature. Cannot be `null`, use [`Null`](../../aspose.gis.geometries/geometry/null/) to indicate missing geometry. |

## Methods

| Name | Description |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Copies values of attributes from another feature. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Gets the value of an attribute. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Gets the value of an attribute. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Gets the value of an attribute, or [`DefaultValue`](../featureattribute/defaultvalue/) if the value is unset or `null`. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Gets the value of an attribute, or [`DefaultValue`](../featureattribute/defaultvalue/) if the value is unset or `null`. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Gets the value of an attribute, or [`DefaultValue`](../featureattribute/defaultvalue/) if the value is unset or `null`. |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Returns the values for all the attributes in an array. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Returns the values for all the attributes in an array. Consider to use [`GetValues`](./getvalues/) method to avoid additional memory allocation. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string, int) | Gets the values of an attributes sequence as a list. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Determines whether the specified attribute has been explicitly set to `null` value. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Checks if the attribute value is set in this feature. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Sets a new value of an attribute. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Sets value of the attribute to `null`. |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Sets new values for all of the attributes. Also consider to use [`CopyValues`](./copyvalues/) method to streamline setting values in one call. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Removes the attribute value from this feature. |

### See Also

* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


