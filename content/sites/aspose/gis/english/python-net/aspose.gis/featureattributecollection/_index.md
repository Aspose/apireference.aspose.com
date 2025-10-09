---
title: FeatureAttributeCollection Class
type: docs
weight: 850
url: /python-net/aspose.gis/featureattributecollection/
---

**Summary:** A [FeatureAttributeCollection](/psd/python-net/aspose.gis/featureattributecollection/) defines what attributes are available for a [Feature](/psd/python-net/aspose.gis/feature/).

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.FeatureAttributeCollection

**Inheritance:** BaseFeatureAttributeCollection

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| count | int | r | Gets the number of attributes in a [Feature](/psd/python-net/aspose.gis/feature/). |
| is_locked | bool | r | Gets a value indicating whether this attribute collection is locked. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add(attribute)](#add_attribute_1) | Adds an attribute to the collection. |
| [contains(name)](#contains_name_2) | Determines whether the attribute collection contains an attribute with the specified name. |
| [index_of(name)](#index_of_name_3) | Searches for the attribute and returns the its zero-based index. |
| lock() | Locks this attribute collection to prevent further modifications. |
| [remove(index)](#remove_index_4) | Removes the attribute from the collection. |
| [remove(name)](#remove_name_5) | Removes the attribute from the collection. |


### Method: add(attribute) {#add_attribute_1}


```
 add(attribute) 
```

Adds an attribute to the collection.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute | [FeatureAttribute](/psd/python-net/aspose.gis/featureattribute) | The attribute to add. |

### Method: contains(name) {#contains_name_2}


```
 contains(name) 
```

Determines whether the attribute collection contains an attribute with the specified name.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the attribute. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if the attribute collection contains and attribute with the specified name; otherwise, <see langword="false" />. |


### Method: index_of(name) {#index_of_name_3}


```
 index_of(name) 
```

Searches for the attribute and returns the its zero-based index.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the attribute. |

**Returns**

| Type | Description |
| :- | :- |
| int | The zero-based index of the attribute within the collection, if found; otherwise, –1. |


### Method: remove(index) {#remove_index_4}


```
 remove(index) 
```

Removes the attribute from the collection.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Index of the attribute. |

### Method: remove(name) {#remove_name_5}


```
 remove(name) 
```

Removes the attribute from the collection.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the attribute. |

