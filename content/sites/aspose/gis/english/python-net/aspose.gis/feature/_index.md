---
title: Feature Class
type: docs
weight: 830
url: /python-net/aspose.gis/feature/
---

**Summary:** A geographic feature composed of a geometry and user-defined attributes.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.Feature

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | r/w | Gets or sets geometry of the feature.<br/>            Cannot be <see langword="null" />, use [Geometry.null](/psd/python-net/aspose.gis.geometries/geometry/) to indicate missing geometry. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [copy_values(input_feature)](#copy_values_input_feature_1) | Copies values of attributes from another feature. |
| [get_value(attribute_name)](#get_value_attribute_name_2) | Gets the value of an attribute. |
| [get_value_or_default(attribute_name, default_value)](#get_value_or_default_attribute_name_default_value_3) | Gets the value of an attribute, or [FeatureAttribute.default_value](/psd/python-net/aspose.gis/featureattribute/) if the value is unset or <c>null</c>. |
| [get_values(values, default_value)](#get_values_values_default_value_4) | Returns the values for all the attributes in an array. |
| [get_values(values_count, default_value)](#get_values_values_count_default_value_5) | Returns the values for all the attributes in an array. |
| [get_values_dump(default_value)](#get_values_dump_default_value_6) | Returns the values for all the attributes in an array.<br/>            Consider to use Aspose.Gis.Feature.GetValues(int,System.Object) method to avoid additional memory allocation. |
| [get_values_list(attribute_name, separator, count)](#get_values_list_attribute_name_separator_count_7) | Gets the values list. Non-generic analog of List T GetValuesList |
| [is_value_null(attribute_name)](#is_value_null_attribute_name_8) | Determines whether the specified attribute has been explicitly set to <c>null</c> value. |
| [is_value_set(attribute_name)](#is_value_set_attribute_name_9) | Checks if the attribute value is set in this feature. |
| [set_value(attribute_name, value)](#set_value_attribute_name_value_10) | Sets the value. Non-generic analog of void SetValue (string attributeName, T value) |
| [set_value_null(attribute_name)](#set_value_null_attribute_name_11) | Sets value of the attribute to <c>null</c>. |
| [set_values(values)](#set_values_values_12) | Sets new values for all of the attributes.<br/>            Also consider to use [Feature.copy_values(input_feature)](/psd/python-net/aspose.gis/feature/) method to streamline setting values in one call. |
| [unset_value(attribute_name)](#unset_value_attribute_name_13) | Removes the attribute value from this feature. |


### Method: copy_values(input_feature) {#copy_values_input_feature_1}


```
 copy_values(input_feature) 
```

Copies values of attributes from another feature.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| input_feature | [Feature](/psd/python-net/aspose.gis/feature) | The feature to copy values from. |

### Method: get_value(attribute_name) {#get_value_attribute_name_2}


```
 get_value(attribute_name) 
```

Gets the value of an attribute.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Name of the attribute. |

**Returns**

| Type | Description |
| :- | :- |
| object | Value of the attribute. |


### Method: get_value_or_default(attribute_name, default_value) {#get_value_or_default_attribute_name_default_value_3}


```
 get_value_or_default(attribute_name, default_value) 
```

Gets the value of an attribute, or [FeatureAttribute.default_value](/psd/python-net/aspose.gis/featureattribute/) if the value is unset or <c>null</c>.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Name of the attribute. |
| default_value | object | The value to return if the attribute value is missing. Default value is <see langword="null" />. |

**Returns**

| Type | Description |
| :- | :- |
| object | Value of the attribute. |


### Method: get_values(values, default_value) {#get_values_values_default_value_4}


```
 get_values(values, default_value) 
```

Returns the values for all the attributes in an array.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| values | object |  |
| default_value | object | The value to return if the attribute value is missing (unset). Default value is <see langword="null" />.<br/>            Consider to use '.Value' for separating 'unset' and '<see langword="null" />' values. |

**Returns**

| Type | Description |
| :- | :- |
| int | A number of attributes copied. |


### Method: get_values(values_count, default_value) {#get_values_values_count_default_value_5}


```
 get_values(values_count, default_value) 
```

Returns the values for all the attributes in an array.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| values_count | int | The values count. |
| default_value | object | The value to return if the attribute value is missing (unset). Default value is <see langword="null" />.<br/>            Consider to use '.Value' for separating 'unset' and '<see langword="null" />' values. |

**Returns**

| Type | Description |
| :- | :- |
| object | A number of attributes copied. |


### Method: get_values_dump(default_value) {#get_values_dump_default_value_6}


```
 get_values_dump(default_value) 
```

Returns the values for all the attributes in an array.<br/>            Consider to use Aspose.Gis.Feature.GetValues(int,System.Object) method to avoid additional memory allocation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| default_value | object | The value to return if the attribute value is missing (unset). Default value is <see langword="null" />.<br/>            Consider to use '.Value' for separating 'unset' and '<see langword="null" />' values. |

**Returns**

| Type | Description |
| :- | :- |
| object | A new array into which to copy the attributes values. |


### Method: get_values_list(attribute_name, separator, count) {#get_values_list_attribute_name_separator_count_7}


```
 get_values_list(attribute_name, separator, count) 
```

Gets the values list. Non-generic analog of List T GetValuesList

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Name of the attribute. |
| separator | string | A string which is used to separate attribute name and index value of sequence. |
| count | int | Count of values to return (missed value fill as null) |

**Returns**

| Type | Description |
| :- | :- |
| object | List of values of the attributes which names different by sequence index value. |


### Method: is_value_null(attribute_name) {#is_value_null_attribute_name_8}


```
 is_value_null(attribute_name) 
```

Determines whether the specified attribute has been explicitly set to <c>null</c> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Name of the attribute. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if the attribute value is <c>null</c>; otherwise, <see langword="false" />. |


### Method: is_value_set(attribute_name) {#is_value_set_attribute_name_9}


```
 is_value_set(attribute_name) 
```

Checks if the attribute value is set in this feature.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Name of the attribute. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if value for the specified attribute is set; otherwise, <see langword="false" />. |


### Method: set_value(attribute_name, value) {#set_value_attribute_name_value_10}


```
 set_value(attribute_name, value) 
```

Sets the value. Non-generic analog of void SetValue (string attributeName, T value)

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | The name of the attribute. |
| value | object | The value of the attribute. |

### Method: set_value_null(attribute_name) {#set_value_null_attribute_name_11}


```
 set_value_null(attribute_name) 
```

Sets value of the attribute to <c>null</c>.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | The name of the attribute. |

### Method: set_values(values) {#set_values_values_12}


```
 set_values(values) 
```

Sets new values for all of the attributes.<br/>            Also consider to use [Feature.copy_values(input_feature)](/psd/python-net/aspose.gis/feature/) method to streamline setting values in one call.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| values | object | The array of new values. |

**Returns**

| Type | Description |
| :- | :- |
| int | The number of attribute values set. |


### Method: unset_value(attribute_name) {#unset_value_attribute_name_13}


```
 unset_value(attribute_name) 
```

Removes the attribute value from this feature.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Name of the attribute. |

