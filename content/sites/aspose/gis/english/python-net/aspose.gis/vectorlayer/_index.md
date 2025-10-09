---
title: VectorLayer Class
type: docs
weight: 4060
url: /python-net/aspose.gis/vectorlayer/
---

**Summary:** Represents a vector layer.<br/>            A vector layer is a collection of geographic features, stored in a file.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.VectorLayer

**Inheritance:** FeaturesSequence

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| attributes | [BaseFeatureAttributeCollection](/psd/python-net/aspose.gis/basefeatureattributecollection) | r | Gets the collection of custom attributes for features in this [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |
| count | int | r | Gets the number of features in this layer. |
| driver | [Driver](/psd/python-net/aspose.gis/driver) | r | Gets the [VectorLayer.driver](/psd/python-net/aspose.gis/vectorlayer/) that instantiated this layer. |
| geometry_type | [GeometryType](/psd/python-net/aspose.gis.geometries/geometrytype/) | r | Gets the type of the geometry for the layer. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r | Gets spatial reference system of this features sequence. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add(feature)](#add_feature_1) | Adds a new feature to the layer, if supported by the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/)'s [VectorLayer.driver](/psd/python-net/aspose.gis/vectorlayer/). |
| [add(feature, style)](#add_feature_style_2) | Adds a new feature with the specified style to the layer, if supported by the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/)'s [VectorLayer.driver](/psd/python-net/aspose.gis/vectorlayer/). |
| [as_in_memory()](#as_in_memory__3) | Create a layer clon as the InMemory format. |
| [construct_feature()](#construct_feature__4) | Creates (but does not add to the layer) a new feature with attributes matching the collection of attributes of this layer.<br/>            When done with setting data for the feature, use [VectorLayer.add(feature)](/psd/python-net/aspose.gis/vectorlayer/) to add the feature to the layer. |
| [convert(source_path, source_driver, destination_path, destination_driver)](#convert_source_path_source_driver_destination_path_destination_driver_5) | Convert a layer to a different format. |
| [convert(source_path, source_driver, destination_path, destination_driver)](#convert_source_path_source_driver_destination_path_destination_driver_6) | Convert a layer to a different format. |
| [convert(source_path, source_driver, destination_path, destination_driver, options)](#convert_source_path_source_driver_destination_path_destination_driver_options_7) | Convert a layer to a different format. |
| [convert(source_path, source_driver, destination_path, destination_driver, options)](#convert_source_path_source_driver_destination_path_destination_driver_options_8) | Convert a layer to a different format. |
| [copy_attributes(features_sequence)](#copy_attributes_features_sequence_9) | Copies attributes of other [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) to this one. |
| [copy_attributes(features_sequence, converter)](#copy_attributes_features_sequence_converter_10) | Copies attributes of other [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) to this one. |
| [create(path, driver)](#create_path_driver_11) | Creates the layer and opens it for adding new features. |
| [create(path, driver)](#create_path_driver_12) | Creates the layer and opens it for adding new features. |
| [create(path, driver, options)](#create_path_driver_options_13) | Creates the layer and opens it for adding new features. |
| [create(path, driver, options)](#create_path_driver_options_14) | Creates the layer and opens it for adding new features. |
| [create(path, driver, options, spatial_reference_system)](#create_path_driver_options_spatial_reference_system_15) | Creates the layer and opens it for appending. |
| [create(path, driver, options, spatial_reference_system)](#create_path_driver_options_spatial_reference_system_16) | Creates the layer and opens it for appending. |
| [create(path, driver, spatial_reference_system)](#create_path_driver_spatial_reference_system_17) | Creates the layer and opens it for appending. |
| [create(path, driver, spatial_reference_system)](#create_path_driver_spatial_reference_system_18) | Creates the layer and opens it for appending. |
| [get_extent()](#get_extent__19) | Gets a spatial extent of this layer. |
| [intersection_by_geometry(layer)](#intersection_by_geometry_layer_20) | Intersect a layer to the current layer by geometry. |
| [join(layer, options)](#join_layer_options_21) | Joins a layer to the current layer. |
| [join_by_geometry(layer, options)](#join_by_geometry_layer_options_22) | Joins a layer to the current layer by geometry. |
| [nearest_to(point)](#nearest_to_point_23) | Gets the nearest feature to the provided point. |
| [nearest_to(x, y)](#nearest_to_x_y_24) | Gets the nearest feature to the provided coordinate. |
| [open(path, driver)](#open_path_driver_25) | Open the layer for reading. |
| [open(path, driver)](#open_path_driver_26) | Open the layer for reading. |
| [open(path, driver, options)](#open_path_driver_options_27) | Open the layer for reading. |
| [open(path, driver, options)](#open_path_driver_options_28) | Open the layer for reading. |
| [remove_at(index)](#remove_at_index_29) | Remove the [Feature](/psd/python-net/aspose.gis/feature/) at the specified index. |
| [replace_at(index, feature)](#replace_at_index_feature_30) | Replace the [Feature](/psd/python-net/aspose.gis/feature/) at the specified index. |
| [save_to(destination_path, destination_driver)](#save_to_destination_path_destination_driver_31) | Saves features sequence to layer. |
| [save_to(destination_path, destination_driver)](#save_to_destination_path_destination_driver_32) | Saves features sequence to layer. |
| [save_to(destination_path, destination_driver, options)](#save_to_destination_path_destination_driver_options_33) | Saves features sequence to layer. |
| [save_to(destination_path, destination_driver, options)](#save_to_destination_path_destination_driver_options_34) | Saves features sequence to layer. |
| [split_to()](#split_to__35) | Split features by geometry type. |
| [use_attributes_index(index_path, attribute_name, force_rebuild)](#use_attributes_index_index_path_attribute_name_force_rebuild_36) | Loads attribute index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereGreater``1(string,``0).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation. |
| [use_attributes_index(index_path, attribute_name, force_rebuild)](#use_attributes_index_index_path_attribute_name_force_rebuild_37) | Loads attribute index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereGreater``1(string,``0).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation. |
| [use_spatial_index(index_path, force_rebuild)](#use_spatial_index_index_path_force_rebuild_38) | Loads spatial index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereIntersects(Aspose.Gis.Geometries.IGeometry)<br/>            and Aspose.Gis.VectorLayer.NearestTo(float,float).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation. |
| [use_spatial_index(index_path, force_rebuild)](#use_spatial_index_index_path_force_rebuild_39) | Loads spatial index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereIntersects(Aspose.Gis.Geometries.IGeometry)<br/>            and Aspose.Gis.VectorLayer.NearestTo(float,float).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation. |
| [where_equal(attribute_name, value)](#where_equal_attribute_name_value_40) | Selects features with attribute value equal to the provided value. |
| [where_greater(attribute_name, value)](#where_greater_attribute_name_value_41) | Selects features with attribute value greater than the provided value. |
| [where_greater_or_equal(attribute_name, value)](#where_greater_or_equal_attribute_name_value_42) | Selects features with attribute value greater or equal to the provided value. |
| [where_intersects(extent)](#where_intersects_extent_43) | Filters features based on the extent. |
| [where_intersects(geometry)](#where_intersects_geometry_44) | Filters features based on the provided geometry. |
| [where_intersects(sequence)](#where_intersects_sequence_45) | Filters features based on the union of all geometries in other features sequence. |
| [where_not_equal(attribute_name, value)](#where_not_equal_attribute_name_value_46) | Selects features with attribute value not equal to the provided value. |
| [where_not_null(attribute_name)](#where_not_null_attribute_name_47) | Selects features with attribute not equal to null. |
| [where_null(attribute_name)](#where_null_attribute_name_48) | Selects features with attribute equal to null. |
| [where_set(attribute_name)](#where_set_attribute_name_49) | Selects features with attribute set. |
| [where_smaller(attribute_name, value)](#where_smaller_attribute_name_value_50) | Selects features with attribute value smaller than the provided value. |
| [where_smaller_or_equal(attribute_name, value)](#where_smaller_or_equal_attribute_name_value_51) | Selects features with attribute value smaller or equal to the provided value. |
| [where_unset(attribute_name)](#where_unset_attribute_name_52) | Selects features where specified attribute is not set. |


### Method: add(feature) {#add_feature_1}


```
 add(feature) 
```

Adds a new feature to the layer, if supported by the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/)'s [VectorLayer.driver](/psd/python-net/aspose.gis/vectorlayer/).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| feature | [Feature](/psd/python-net/aspose.gis/feature) | The feature to add. |

### Method: add(feature, style) {#add_feature_style_2}


```
 add(feature, style) 
```

Adds a new feature with the specified style to the layer, if supported by the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/)'s [VectorLayer.driver](/psd/python-net/aspose.gis/vectorlayer/).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| feature | [Feature](/psd/python-net/aspose.gis/feature) | The feature to add. |
| style | [IFeatureStyle](/psd/python-net/aspose.gis/ifeaturestyle) | The feature style. Use <see langword="null" /> to indicate missing style. |

### Method: as_in_memory() {#as_in_memory__3}


```
 as_in_memory() 
```

Create a layer clon as the InMemory format.

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | The InMemory Layer. |


### Method: construct_feature() {#construct_feature__4}


```
 construct_feature() 
```

Creates (but does not add to the layer) a new feature with attributes matching the collection of attributes of this layer.<br/>            When done with setting data for the feature, use [VectorLayer.add(feature)](/psd/python-net/aspose.gis/vectorlayer/) to add the feature to the layer.

**Returns**

| Type | Description |
| :- | :- |
| [Feature](/psd/python-net/aspose.gis/feature) | A new feature. |


### Method: convert(source_path, source_driver, destination_path, destination_driver)  [static] {#convert_source_path_source_driver_destination_path_destination_driver_5}


```
 convert(source_path, source_driver, destination_path, destination_driver) 
```

Convert a layer to a different format.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| source_path | string | Path to the layer that will be converted. |
| source_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the source layer. |
| destination_path | string | Path to the layer that will created as a result of conversion. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the destination layer. |

### Method: convert(source_path, source_driver, destination_path, destination_driver)  [static] {#convert_source_path_source_driver_destination_path_destination_driver_6}


```
 convert(source_path, source_driver, destination_path, destination_driver) 
```

Convert a layer to a different format.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| source_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the layer that will be converted. |
| source_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the source layer. |
| destination_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the layer that will created as a result of conversion. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the destination layer. |

### Method: convert(source_path, source_driver, destination_path, destination_driver, options)  [static] {#convert_source_path_source_driver_destination_path_destination_driver_options_7}


```
 convert(source_path, source_driver, destination_path, destination_driver, options) 
```

Convert a layer to a different format.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| source_path | string | Path to the layer that will be converted. |
| source_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the source layer. |
| destination_path | string | Path to the layer that will created as a result of conversion. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the destination layer. |
| options | [ConversionOptions](/psd/python-net/aspose.gis/conversionoptions) | Options for the conversion procedure. |

### Method: convert(source_path, source_driver, destination_path, destination_driver, options)  [static] {#convert_source_path_source_driver_destination_path_destination_driver_options_8}


```
 convert(source_path, source_driver, destination_path, destination_driver, options) 
```

Convert a layer to a different format.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| source_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the layer that will be converted. |
| source_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the source layer. |
| destination_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the layer that will created as a result of conversion. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the destination layer. |
| options | [ConversionOptions](/psd/python-net/aspose.gis/conversionoptions) | Options for the conversion procedure. |

### Method: copy_attributes(features_sequence) {#copy_attributes_features_sequence_9}


```
 copy_attributes(features_sequence) 
```

Copies attributes of other [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) to this one.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | The features sequence to copy attributes from. |

### Method: copy_attributes(features_sequence, converter) {#copy_attributes_features_sequence_converter_10}


```
 copy_attributes(features_sequence, converter) 
```

Copies attributes of other [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) to this one.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | The features sequence to copy attributes from. |
| converter | [IAttributesConverter](/psd/python-net/aspose.gis/iattributesconverter) | An instance of custom [IAttributesConverter](/psd/python-net/aspose.gis/iattributesconverter/) that will process the attributes one by one. |

### Method: create(path, driver)  [static] {#create_path_driver_11}


```
 create(path, driver) 
```

Creates the layer and opens it for adding new features.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A write-only layer. |


### Method: create(path, driver)  [static] {#create_path_driver_12}


```
 create(path, driver) 
```

Creates the layer and opens it for adding new features.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A write-only layer. |


### Method: create(path, driver, options)  [static] {#create_path_driver_options_13}


```
 create(path, driver, options) 
```

Creates the layer and opens it for adding new features.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A write-only layer. |


### Method: create(path, driver, options)  [static] {#create_path_driver_options_14}


```
 create(path, driver, options) 
```

Creates the layer and opens it for adding new features.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A write-only layer. |


### Method: create(path, driver, options, spatial_reference_system)  [static] {#create_path_driver_options_spatial_reference_system_15}


```
 create(path, driver, options, spatial_reference_system) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create(path, driver, options, spatial_reference_system)  [static] {#create_path_driver_options_spatial_reference_system_16}


```
 create(path, driver, options, spatial_reference_system) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create(path, driver, spatial_reference_system)  [static] {#create_path_driver_spatial_reference_system_17}


```
 create(path, driver, spatial_reference_system) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create(path, driver, spatial_reference_system)  [static] {#create_path_driver_spatial_reference_system_18}


```
 create(path, driver, spatial_reference_system) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: get_extent() {#get_extent__19}


```
 get_extent() 
```

Gets a spatial extent of this layer.

**Returns**

| Type | Description |
| :- | :- |
| [Extent](/psd/python-net/aspose.gis/extent) | A spatial extent of this layer. |


### Method: intersection_by_geometry(layer) {#intersection_by_geometry_layer_20}


```
 intersection_by_geometry(layer) 
```

Intersect a layer to the current layer by geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A layer to intersect. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A new layer as a result of intersection two layers. |


### Method: join(layer, options) {#join_layer_options_21}


```
 join(layer, options) 
```

Joins a layer to the current layer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A layer to join. |
| options | [JoinOptions](/psd/python-net/aspose.gis.relationship.joins/joinoptions/) | Join parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A new layer as a result of join two layers. |


### Method: join_by_geometry(layer, options) {#join_by_geometry_layer_options_22}


```
 join_by_geometry(layer, options) 
```

Joins a layer to the current layer by geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A layer to join. |
| options | [JoinByGeometryOptions](/psd/python-net/aspose.gis.relationship.joins/joinbygeometryoptions/) | Join parameters. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A new layer as a result of join two layers. |


### Method: nearest_to(point) {#nearest_to_point_23}


```
 nearest_to(point) 
```

Gets the nearest feature to the provided point.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| point | [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) | The point. |

**Returns**

| Type | Description |
| :- | :- |
| [Feature](/psd/python-net/aspose.gis/feature) | The nearest feature to the provided point. |


### Method: nearest_to(x, y) {#nearest_to_x_y_24}


```
 nearest_to(x, y) 
```

Gets the nearest feature to the provided coordinate.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | double | X of the coordinate. |
| y | double | Y of the coordinate. |

**Returns**

| Type | Description |
| :- | :- |
| [Feature](/psd/python-net/aspose.gis/feature) | The nearest feature to the provided coordinate. |


### Method: open(path, driver)  [static] {#open_path_driver_25}


```
 open(path, driver) 
```

Open the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A read-only layer. |


### Method: open(path, driver)  [static] {#open_path_driver_26}


```
 open(path, driver) 
```

Open the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A read-only layer. |


### Method: open(path, driver, options)  [static] {#open_path_driver_options_27}


```
 open(path, driver, options) 
```

Open the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A read-only layer. |


### Method: open(path, driver, options)  [static] {#open_path_driver_options_28}


```
 open(path, driver, options) 
```

Open the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A read-only layer. |


### Method: remove_at(index) {#remove_at_index_29}


```
 remove_at(index) 
```

Remove the [Feature](/psd/python-net/aspose.gis/feature/) at the specified index.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | The index of the feature. |

### Method: replace_at(index, feature) {#replace_at_index_feature_30}


```
 replace_at(index, feature) 
```

Replace the [Feature](/psd/python-net/aspose.gis/feature/) at the specified index.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | The index of the feature. |
| feature | [Feature](/psd/python-net/aspose.gis/feature) | The feature to set. |

### Method: save_to(destination_path, destination_driver) {#save_to_destination_path_destination_driver_31}


```
 save_to(destination_path, destination_driver) 
```

Saves features sequence to layer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| destination_path | string | Path to the output layer. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the output layer. |

### Method: save_to(destination_path, destination_driver) {#save_to_destination_path_destination_driver_32}


```
 save_to(destination_path, destination_driver) 
```

Saves features sequence to layer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| destination_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the output layer. |
| destination_driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | The format driver for the output layer. |

### Method: save_to(destination_path, destination_driver, options) {#save_to_destination_path_destination_driver_options_33}


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

### Method: save_to(destination_path, destination_driver, options) {#save_to_destination_path_destination_driver_options_34}


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

### Method: split_to() {#split_to__35}


```
 split_to() 
```

Split features by geometry type.

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer[]](/psd/python-net/aspose.gis/vectorlayer) | Layers with the same type of geometry. |


### Method: use_attributes_index(index_path, attribute_name, force_rebuild) {#use_attributes_index_index_path_attribute_name_force_rebuild_36}


```
 use_attributes_index(index_path, attribute_name, force_rebuild) 
```

Loads attribute index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereGreater``1(string,``0).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index_path | string | Path to the index file. |
| attribute_name | string | Name of the attribute to build index on. |
| force_rebuild | bool | Whether to recreate index even if it already exists. |

### Method: use_attributes_index(index_path, attribute_name, force_rebuild) {#use_attributes_index_index_path_attribute_name_force_rebuild_37}


```
 use_attributes_index(index_path, attribute_name, force_rebuild) 
```

Loads attribute index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereGreater``1(string,``0).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the index file. |
| attribute_name | string | Name of the attribute to build index on. |
| force_rebuild | bool | Whether to recreate index even if it already exists. |

### Method: use_spatial_index(index_path, force_rebuild) {#use_spatial_index_index_path_force_rebuild_38}


```
 use_spatial_index(index_path, force_rebuild) 
```

Loads spatial index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereIntersects(Aspose.Gis.Geometries.IGeometry)<br/>            and Aspose.Gis.VectorLayer.NearestTo(float,float).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index_path | string | Path to the index file. |
| force_rebuild | bool | Whether to recreate index even if it already exists. |

### Method: use_spatial_index(index_path, force_rebuild) {#use_spatial_index_index_path_force_rebuild_39}


```
 use_spatial_index(index_path, force_rebuild) 
```

Loads spatial index to speed up filtering by attributes value in filter methods like Aspose.Gis.FeaturesSequence.WhereIntersects(Aspose.Gis.Geometries.IGeometry)<br/>            and Aspose.Gis.VectorLayer.NearestTo(float,float).<br/>            If index does not exist creates it first. Use <paramref name="forceRebuild" /> to force index recreation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the index file. |
| force_rebuild | bool | Whether to recreate index even if it already exists. |

### Method: where_equal(attribute_name, value) {#where_equal_attribute_name_value_40}


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


### Method: where_greater(attribute_name, value) {#where_greater_attribute_name_value_41}


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


### Method: where_greater_or_equal(attribute_name, value) {#where_greater_or_equal_attribute_name_value_42}


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


### Method: where_intersects(extent) {#where_intersects_extent_43}


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


### Method: where_intersects(geometry) {#where_intersects_geometry_44}


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


### Method: where_intersects(sequence) {#where_intersects_sequence_45}


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


### Method: where_not_equal(attribute_name, value) {#where_not_equal_attribute_name_value_46}


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


### Method: where_not_null(attribute_name) {#where_not_null_attribute_name_47}


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


### Method: where_null(attribute_name) {#where_null_attribute_name_48}


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


### Method: where_set(attribute_name) {#where_set_attribute_name_49}


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


### Method: where_smaller(attribute_name, value) {#where_smaller_attribute_name_value_50}


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


### Method: where_smaller_or_equal(attribute_name, value) {#where_smaller_or_equal_attribute_name_value_51}


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


### Method: where_unset(attribute_name) {#where_unset_attribute_name_52}


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


