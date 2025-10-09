---
title: Dataset Class
type: docs
weight: 590
url: /python-net/aspose.gis/dataset/
---

**Summary:** A dataset is the collection of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) instances.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.Dataset

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| can_create_layers | bool | r | Gets a value indicating whether this dataset can create vector layers. |
| can_remove_layers | bool | r | Gets a value indicating whether this dataset can remove vector layers. |
| driver | [Driver](/psd/python-net/aspose.gis/driver) | r | Gets the [Dataset.driver](/psd/python-net/aspose.gis/dataset/) that instantiated this dataset. |
| layers_count | int | r | Gets the number of layers in this dataset. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [create(path, driver)](#create_path_driver_1) | Creates a dataset. |
| [create(path, driver)](#create_path_driver_2) | Creates a dataset. |
| [create(path, driver, options)](#create_path_driver_options_3) | Creates a dataset. |
| [create(path, driver, options)](#create_path_driver_options_4) | Creates a dataset. |
| [create_layer()](#create_layer__5) | Creates a new vector layer and opens it for appending. |
| [create_layer(name, options, spatial_reference_system)](#create_layer_name_options_spatial_reference_system_6) | Creates a new vector layer with specified name and opens it for appending. |
| [create_layer(name, spatial_reference_system)](#create_layer_name_spatial_reference_system_7) | Creates a new vector layer with specified name and opens it for appending. |
| [create_layer(options, spatial_reference_system)](#create_layer_options_spatial_reference_system_8) | Creates a new vector layer and opens it for appending. |
| [create_layer(spatial_reference_system)](#create_layer_spatial_reference_system_9) | Creates a new vector layer and opens it for appending. |
| [edit_layer(name, options, spatial_reference_system)](#edit_layer_name_options_spatial_reference_system_10) | Opens the layer with specified name for editing. |
| [edit_layer_at(index, options, spatial_reference_system)](#edit_layer_at_index_options_spatial_reference_system_11) | Opens the layer with specified name for editing. |
| [get_layer_name(index)](#get_layer_name_index_12) | Gets the name of the layer at specified index. |
| [has_layer_with_name(name)](#has_layer_with_name_name_13) | Check has current dataset a layer with specific name |
| [open(path, driver)](#open_path_driver_14) | Opens the dataset. |
| [open(path, driver)](#open_path_driver_15) | Opens the dataset. |
| [open(path, driver, options)](#open_path_driver_options_16) | Opens the dataset. |
| [open(path, driver, options)](#open_path_driver_options_17) | Opens the dataset. |
| [open_layer(name, options)](#open_layer_name_options_18) | Opens the layer with specified name for reading. |
| [open_layer_at(index, options)](#open_layer_at_index_options_19) | Opens the layer at specified index for reading. |
| [remove_layer(name)](#remove_layer_name_20) | Removes the vector layer with specified name. |
| [remove_layer_at(index)](#remove_layer_at_index_21) | Removes the vector layer at specified index. |
| [rename_layer(current_name, new_name)](#rename_layer_current_name_new_name_22) | Rename layer in dataset |


### Method: create(path, driver)  [static] {#create_path_driver_1}


```
 create(path, driver) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create(path, driver)  [static] {#create_path_driver_2}


```
 create(path, driver) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create(path, driver, options)  [static] {#create_path_driver_options_3}


```
 create(path, driver, options) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create(path, driver, options)  [static] {#create_path_driver_options_4}


```
 create(path, driver, options) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create_layer() {#create_layer__5}


```
 create_layer() 
```

Creates a new vector layer and opens it for appending.

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) opened for writing. |


### Method: create_layer(name, options, spatial_reference_system) {#create_layer_name_options_spatial_reference_system_6}


```
 create_layer(name, options, spatial_reference_system) 
```

Creates a new vector layer with specified name and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the layer. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Open options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system of the new layer. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) opened for writing. |


### Method: create_layer(name, spatial_reference_system) {#create_layer_name_spatial_reference_system_7}


```
 create_layer(name, spatial_reference_system) 
```

Creates a new vector layer with specified name and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the layer. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system of the new layer. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) opened for writing. |


### Method: create_layer(options, spatial_reference_system) {#create_layer_options_spatial_reference_system_8}


```
 create_layer(options, spatial_reference_system) 
```

Creates a new vector layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Open options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system of the new layer. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) opened for writing. |


### Method: create_layer(spatial_reference_system) {#create_layer_spatial_reference_system_9}


```
 create_layer(spatial_reference_system) 
```

Creates a new vector layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system of the new layer. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) opened for writing. |


### Method: edit_layer(name, options, spatial_reference_system) {#edit_layer_name_options_spatial_reference_system_10}


```
 edit_layer(name, options, spatial_reference_system) 
```

Opens the layer with specified name for editing.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the layer to edit. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Open options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system for new geometries. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | The layer opened for editing. |


### Method: edit_layer_at(index, options, spatial_reference_system) {#edit_layer_at_index_options_spatial_reference_system_11}


```
 edit_layer_at(index, options, spatial_reference_system) 
```

Opens the layer with specified name for editing.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Index of the layer to edit. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Open options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system for new geometries. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | The layer opened for editing. |


### Method: get_layer_name(index) {#get_layer_name_index_12}


```
 get_layer_name(index) 
```

Gets the name of the layer at specified index.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Index of the layer. |

**Returns**

| Type | Description |
| :- | :- |
| string | Name of the layer. |


### Method: has_layer_with_name(name) {#has_layer_with_name_name_13}


```
 has_layer_with_name(name) 
```

Check has current dataset a layer with specific name

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the layer |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" />, if dataset has layer with this name; otherwise, <see langword="false" /> |


### Method: open(path, driver)  [static] {#open_path_driver_14}


```
 open(path, driver) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open(path, driver)  [static] {#open_path_driver_15}


```
 open(path, driver) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open(path, driver, options)  [static] {#open_path_driver_options_16}


```
 open(path, driver, options) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open(path, driver, options)  [static] {#open_path_driver_options_17}


```
 open(path, driver, options) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| driver | [FileDriver](/psd/python-net/aspose.gis/filedriver) | Driver to use. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open_layer(name, options) {#open_layer_name_options_18}


```
 open_layer(name, options) 
```

Opens the layer with specified name for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the layer to open. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Open options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | The layer opened for reading. |


### Method: open_layer_at(index, options) {#open_layer_at_index_options_19}


```
 open_layer_at(index, options) 
```

Opens the layer at specified index for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Index of the layer to open. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Open options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | The layer opened for reading. |


### Method: remove_layer(name) {#remove_layer_name_20}


```
 remove_layer(name) 
```

Removes the vector layer with specified name.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the layer |

### Method: remove_layer_at(index) {#remove_layer_at_index_21}


```
 remove_layer_at(index) 
```

Removes the vector layer at specified index.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Index of the layer |

### Method: rename_layer(current_name, new_name) {#rename_layer_current_name_new_name_22}


```
 rename_layer(current_name, new_name) 
```

Rename layer in dataset

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| current_name | string | Current name of the layer |
| new_name | string | New name for the layer |

