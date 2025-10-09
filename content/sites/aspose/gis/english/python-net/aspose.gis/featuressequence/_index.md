---
title: FeaturesSequence Class
type: docs
weight: 870
url: /python-net/aspose.gis/featuressequence/
---

**Summary:** [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence/) represents a set of vector features.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.FeaturesSequence

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| attributes | [BaseFeatureAttributeCollection](/psd/python-net/aspose.gis/basefeatureattributecollection) | r | Gets the collection of custom attributes for features in this [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r | Gets spatial reference system of this features sequence. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [get_extent()](#get_extent__1) | Gets a spatial extent of this layer. |
| [save_to(destination_path, destination_driver)](#save_to_destination_path_destination_driver_2) | Saves features sequence to layer. |
| [save_to(destination_path, destination_driver)](#save_to_destination_path_destination_driver_3) | Saves features sequence to layer. |
| [save_to(destination_path, destination_driver, options)](#save_to_destination_path_destination_driver_options_4) | Saves features sequence to layer. |
| [save_to(destination_path, destination_driver, options)](#save_to_destination_path_destination_driver_options_5) | Saves features sequence to layer. |
| [split_to()](#split_to__6) | Split features by geometry type. |
| [where_equal(attribute_name, value)](#where_equal_attribute_name_value_7) | Selects features with attribute value equal to the provided value. |
| [where_greater(attribute_name, value)](#where_greater_attribute_name_value_8) | Selects features with attribute value greater than the provided value. |
| [where_greater_or_equal(attribute_name, value)](#where_greater_or_equal_attribute_name_value_9) | Selects features with attribute value greater or equal to the provided value. |
| [where_intersects(extent)](#where_intersects_extent_10) | Filters features based on the extent. |
| [where_intersects(geometry)](#where_intersects_geometry_11) | Filters features based on the provided geometry. |
| [where_intersects(sequence)](#where_intersects_sequence_12) | Filters features based on the union of all geometries in other features sequence. |
| [where_not_equal(attribute_name, value)](#where_not_equal_attribute_name_value_13) | Selects features with attribute value not equal to the provided value. |
| [where_not_null(attribute_name)](#where_not_null_attribute_name_14) | Selects features with attribute not equal to null. |
| [where_null(attribute_name)](#where_null_attribute_name_15) | Selects features with attribute equal to null. |
| [where_set(attribute_name)](#where_set_attribute_name_16) | Selects features with attribute set. |
| [where_smaller(attribute_name, value)](#where_smaller_attribute_name_value_17) | Selects features with attribute value smaller than the provided value. |
| [where_smaller_or_equal(attribute_name, value)](#where_smaller_or_equal_attribute_name_value_18) | Selects features with attribute value smaller or equal to the provided value. |
| [where_unset(attribute_name)](#where_unset_attribute_name_19) | Selects features where specified attribute is not set. |


### Method: get_extent() {#get_extent__1}


```
 get_extent() 
```

Gets a spatial extent of this layer.

**Returns**

| Type | Description |
| :- | :- |
| [Extent](/psd/python-net/aspose.gis/extent) | A spatial extent of this layer. |


### Method: save_to(destination_path, destination_driver) {#save_to_destination_path_destination_driver_2}


```
 save_to(destination_path, destination_driver) 
```

Saves features sequence to layer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| destination_path | string | Path to the output layer. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the output layer. |

### Method: save_to(destination_path, destination_driver) {#save_to_destination_path_destination_driver_3}


```
 save_to(destination_path, destination_driver) 
```

Saves features sequence to layer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| destination_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the output layer. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the output layer. |

### Method: save_to(destination_path, destination_driver, options) {#save_to_destination_path_destination_driver_options_4}


```
 save_to(destination_path, destination_driver, options) 
```

Saves features sequence to layer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| destination_path | string | Path to the output layer. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the output layer. |
| options | [SavingOptions](/psd/python-net/aspose.gis/savingoptions) | Options for the saving procedure. |

### Method: save_to(destination_path, destination_driver, options) {#save_to_destination_path_destination_driver_options_5}


```
 save_to(destination_path, destination_driver, options) 
```

Saves features sequence to layer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| destination_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the output layer. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the output layer. |
| options | [SavingOptions](/psd/python-net/aspose.gis/savingoptions) | Options for the saving procedure. |

### Method: split_to() {#split_to__6}


```
 split_to() 
```

Split features by geometry type.

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer[]](/psd/python-net/aspose.gis/vectorlayer) | Layers with the same type of geometry. |


### Method: where_equal(attribute_name, value) {#where_equal_attribute_name_value_7}


```
 where_equal(attribute_name, value) 
```

Selects features with attribute value equal to the provided value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |
| value | object | Value to compare against. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value equal to the provided value. |


### Method: where_greater(attribute_name, value) {#where_greater_attribute_name_value_8}


```
 where_greater(attribute_name, value) 
```

Selects features with attribute value greater than the provided value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |
| value | object | Value to compare against. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value greater than the provided value. |


### Method: where_greater_or_equal(attribute_name, value) {#where_greater_or_equal_attribute_name_value_9}


```
 where_greater_or_equal(attribute_name, value) 
```

Selects features with attribute value greater or equal to the provided value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |
| value | object | Value to compare against. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value greater or equal to the provided value. |


### Method: where_intersects(extent) {#where_intersects_extent_10}


```
 where_intersects(extent) 
```

Filters features based on the extent.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | Filter extent. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features that intersect with the provided geometry. |


### Method: where_intersects(geometry) {#where_intersects_geometry_11}


```
 where_intersects(geometry) 
```

Filters features based on the provided geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | Filter geometry. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features that intersect with the provided geometry. |


### Method: where_intersects(sequence) {#where_intersects_sequence_12}


```
 where_intersects(sequence) 
```

Filters features based on the union of all geometries in other features sequence.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Other features sequence. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features that intersect with the union of all geometries in other features sequence. |


### Method: where_not_equal(attribute_name, value) {#where_not_equal_attribute_name_value_13}


```
 where_not_equal(attribute_name, value) 
```

Selects features with attribute value not equal to the provided value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |
| value | object | Value to compare against. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value not equal to the provided value. |


### Method: where_not_null(attribute_name) {#where_not_null_attribute_name_14}


```
 where_not_null(attribute_name) 
```

Selects features with attribute not equal to null.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value not equal to null. |


### Method: where_null(attribute_name) {#where_null_attribute_name_15}


```
 where_null(attribute_name) 
```

Selects features with attribute equal to null.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value equal to null. |


### Method: where_set(attribute_name) {#where_set_attribute_name_16}


```
 where_set(attribute_name) 
```

Selects features with attribute set.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with set attribute value. |


### Method: where_smaller(attribute_name, value) {#where_smaller_attribute_name_value_17}


```
 where_smaller(attribute_name, value) 
```

Selects features with attribute value smaller than the provided value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |
| value | object | Value to compare against. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value smaller than the provided value. |


### Method: where_smaller_or_equal(attribute_name, value) {#where_smaller_or_equal_attribute_name_value_18}


```
 where_smaller_or_equal(attribute_name, value) 
```

Selects features with attribute value smaller or equal to the provided value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |
| value | object | Value to compare against. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with attribute value smaller or equal to the provided value. |


### Method: where_unset(attribute_name) {#where_unset_attribute_name_19}


```
 where_unset(attribute_name) 
```

Selects features where specified attribute is not set.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| attribute_name | string | Attribute to filter by. |

**Returns**

| Type | Description |
| :- | :- |
| [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features with unset attribute value. |


