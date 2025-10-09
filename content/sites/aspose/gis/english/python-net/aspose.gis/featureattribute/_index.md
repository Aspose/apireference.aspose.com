---
title: FeatureAttribute Class
type: docs
weight: 840
url: /python-net/aspose.gis/featureattribute/
---

**Summary:** An attribute of a [Feature](/psd/python-net/aspose.gis/feature/).

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.FeatureAttribute

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [FeatureAttribute(name, data_type)](#FeatureAttribute_name_data_type_1) | Initializes a new instance of the [FeatureAttribute](/psd/python-net/aspose.gis/featureattribute/) class. |
| [FeatureAttribute(name, data_type, can_be_null)](#FeatureAttribute_name_data_type_can_be_null_2) | Initializes a new instance of the [FeatureAttribute](/psd/python-net/aspose.gis/featureattribute/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| can_be_null | bool | r/w | Gets a value indicating whether this instance can be null. |
| can_be_unset | bool | r/w | Gets or sets a value indicating whether value for this attribute can be omitted. |
| data_type | [AttributeDataType](/psd/python-net/aspose.gis/attributedatatype) | r/w | Gets the data type of the attribute. |
| default_value | object | r/w | Gets or sets a value for the attribute, that indicates missing data. |
| has_custom_default_value | bool | r | Gets a value indicating whether the pre-defined default value for this attribute was overridden with a custom value. |
| is_locked | bool | r | Gets a value indicating whether this attribute is locked. |
| name | string | r/w | Gets the name of the attribute. |
| precision | Nullable<int> | r/w | Gets or sets maximum number of decimal digits to store. |
| type_name | string | r/w | The type name of the attribute. |
| width | Nullable<int> | r/w | Gets or sets maximum allowed width of character representation of the attribute. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| lock() | Locks this attribute. |


### Constructor: FeatureAttribute(name, data_type) {#FeatureAttribute_name_data_type_1}


```
 FeatureAttribute(name, data_type) 
```

Initializes a new instance of the [FeatureAttribute](/psd/python-net/aspose.gis/featureattribute/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | The name of the attribute. |
| data_type | [AttributeDataType](/psd/python-net/aspose.gis/attributedatatype) | The data type of the attribute. |

### Constructor: FeatureAttribute(name, data_type, can_be_null) {#FeatureAttribute_name_data_type_can_be_null_2}


```
 FeatureAttribute(name, data_type, can_be_null) 
```

Initializes a new instance of the [FeatureAttribute](/psd/python-net/aspose.gis/featureattribute/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | The name of the attribute. |
| data_type | [AttributeDataType](/psd/python-net/aspose.gis/attributedatatype) | The data type of the attribute. |
| can_be_null | bool | <see langword="true" /> if this instance can be null; otherwise, <see langword="false" />. |

