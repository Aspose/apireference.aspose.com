---
title: FileGdbDriver Class
type: docs
weight: 20
url: /python-net/aspose.gis.formats.filegdb/filegdbdriver/
---

**Summary:** A driver for the ESRI File Geodatabase format.

**Module:** [aspose.gis.formats.filegdb](/psd/python-net/aspose.gis.formats.filegdb/)

**Full Name:** aspose.gis.formats.filegdb.FileGdbDriver

**Inheritance:** FileDriver

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| can_create_datasets | bool | r | Gets a value indicating whether this driver can create datasets. |
| can_create_layers | bool | r | Gets a value indicating whether this driver can create vector layers. |
| can_open_datasets | bool | r | Gets a value indicating whether this driver can open datasets. |
| can_open_layers | bool | r | Gets a value indicating whether this driver can open vector layers. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [create_dataset(path)](#create_dataset_path_1) | Creates a dataset. |
| [create_dataset(path)](#create_dataset_path_2) | Creates a dataset. |
| [create_dataset(path, options)](#create_dataset_path_options_3) | Creates a dataset. |
| [create_dataset(path, options)](#create_dataset_path_options_4) | Creates a dataset. |
| [create_dataset(path, options)](#create_dataset_path_options_5) | Creates a dataset. |
| [create_dataset(path, options)](#create_dataset_path_options_6) | Creates a dataset. |
| [create_layer(path)](#create_layer_path_7) | Creates the layer and opens it for appending. |
| [create_layer(path)](#create_layer_path_8) | Creates the layer and opens it for appending. |
| [create_layer(path, options)](#create_layer_path_options_9) | Creates a layer and opens it for adding new features. |
| [create_layer(path, options)](#create_layer_path_options_10) | Creates a layer and opens it for adding new features. |
| [create_layer(path, options)](#create_layer_path_options_11) | Creates a layer and opens it for adding new features. |
| [create_layer(path, options, spatial_reference_system)](#create_layer_path_options_spatial_reference_system_12) | Creates a layer and opens it for appending. |
| [create_layer(path, options, spatial_reference_system)](#create_layer_path_options_spatial_reference_system_13) | Creates a layer and opens it for appending. |
| [create_layer(path, options, spatial_reference_system)](#create_layer_path_options_spatial_reference_system_14) | Creates a layer and opens it for appending. |
| [create_layer(path, options, spatial_reference_system)](#create_layer_path_options_spatial_reference_system_15) | Creates a layer and opens it for appending. |
| [create_layer(path, spatial_reference_system)](#create_layer_path_spatial_reference_system_16) | Creates the layer and opens it for appending. |
| [create_layer(path, spatial_reference_system)](#create_layer_path_spatial_reference_system_17) | Creates the layer and opens it for appending. |
| [edit_layer(path, options)](#edit_layer_path_options_18) | Opens a layer for editing. |
| [edit_layer(path, options)](#edit_layer_path_options_19) | Opens a layer for editing. |
| [open_dataset(path)](#open_dataset_path_20) | Opens the dataset. |
| [open_dataset(path)](#open_dataset_path_21) | Opens the dataset. |
| [open_dataset(path, options)](#open_dataset_path_options_22) | Opens the dataset. |
| [open_dataset(path, options)](#open_dataset_path_options_23) | Opens the dataset. |
| [open_dataset(path, options)](#open_dataset_path_options_24) | Opens the dataset. |
| [open_dataset(path, options)](#open_dataset_path_options_25) | Opens the dataset. |
| [open_layer(path)](#open_layer_path_26) | Opens the layer for reading. |
| [open_layer(path)](#open_layer_path_27) | Opens the layer for reading. |
| [open_layer(path, options)](#open_layer_path_options_28) | Opens a layer for reading. |
| [open_layer(path, options)](#open_layer_path_options_29) | Opens a layer for reading. |
| [open_layer(path, options)](#open_layer_path_options_30) | Opens a layer for reading. |
| [open_layer(path, options)](#open_layer_path_options_31) | Opens a layer for reading. |
| [supports_spatial_reference_system(spatial_reference_system)](#supports_spatial_reference_system_spatial_reference_system_32) | Determines, whether specified spatial reference system is supported by the driver. |


### Method: create_dataset(path) {#create_dataset_path_1}


```
 create_dataset(path) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create_dataset(path) {#create_dataset_path_2}


```
 create_dataset(path) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create_dataset(path, options) {#create_dataset_path_options_3}


```
 create_dataset(path, options) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create_dataset(path, options) {#create_dataset_path_options_4}


```
 create_dataset(path, options) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create_dataset(path, options) {#create_dataset_path_options_5}


```
 create_dataset(path, options) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create_dataset(path, options) {#create_dataset_path_options_6}


```
 create_dataset(path, options) 
```

Creates a dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: create_layer(path) {#create_layer_path_7}


```
 create_layer(path) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path) {#create_layer_path_8}


```
 create_layer(path) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, options) {#create_layer_path_options_9}


```
 create_layer(path, options) 
```

Creates a layer and opens it for adding new features.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, options) {#create_layer_path_options_10}


```
 create_layer(path, options) 
```

Creates a layer and opens it for adding new features.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, options) {#create_layer_path_options_11}


```
 create_layer(path, options) 
```

Creates a layer and opens it for adding new features.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, options, spatial_reference_system) {#create_layer_path_options_spatial_reference_system_12}


```
 create_layer(path, options, spatial_reference_system) 
```

Creates a layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, options, spatial_reference_system) {#create_layer_path_options_spatial_reference_system_13}


```
 create_layer(path, options, spatial_reference_system) 
```

Creates a layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, options, spatial_reference_system) {#create_layer_path_options_spatial_reference_system_14}


```
 create_layer(path, options, spatial_reference_system) 
```

Creates a layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, options, spatial_reference_system) {#create_layer_path_options_spatial_reference_system_15}


```
 create_layer(path, options, spatial_reference_system) 
```

Creates a layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, spatial_reference_system) {#create_layer_path_spatial_reference_system_16}


```
 create_layer(path, spatial_reference_system) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: create_layer(path, spatial_reference_system) {#create_layer_path_spatial_reference_system_17}


```
 create_layer(path, spatial_reference_system) 
```

Creates the layer and opens it for appending.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: edit_layer(path, options) {#edit_layer_path_options_18}


```
 edit_layer(path, options) 
```

Opens a layer for editing.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: edit_layer(path, options) {#edit_layer_path_options_19}


```
 edit_layer(path, options) 
```

Opens a layer for editing.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: open_dataset(path) {#open_dataset_path_20}


```
 open_dataset(path) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open_dataset(path) {#open_dataset_path_21}


```
 open_dataset(path) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open_dataset(path, options) {#open_dataset_path_options_22}


```
 open_dataset(path, options) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open_dataset(path, options) {#open_dataset_path_options_23}


```
 open_dataset(path, options) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open_dataset(path, options) {#open_dataset_path_options_24}


```
 open_dataset(path, options) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the dataset. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open_dataset(path, options) {#open_dataset_path_options_25}


```
 open_dataset(path, options) 
```

Opens the dataset.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the dataset. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [Dataset](/psd/python-net/aspose.gis/dataset) | An instance of [Dataset](/psd/python-net/aspose.gis/dataset/). |


### Method: open_layer(path) {#open_layer_path_26}


```
 open_layer(path) 
```

Opens the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: open_layer(path) {#open_layer_path_27}


```
 open_layer(path) 
```

Opens the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: open_layer(path, options) {#open_layer_path_options_28}


```
 open_layer(path, options) 
```

Opens a layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: open_layer(path, options) {#open_layer_path_options_29}


```
 open_layer(path, options) 
```

Opens a layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: open_layer(path, options) {#open_layer_path_options_30}


```
 open_layer(path, options) 
```

Opens a layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| options | [FileGdbOptions](/psd/python-net/aspose.gis.formats.filegdb/filegdboptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: open_layer(path, options) {#open_layer_path_options_31}


```
 open_layer(path, options) 
```

Opens a layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | An instance of [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/). |


### Method: supports_spatial_reference_system(spatial_reference_system) {#supports_spatial_reference_system_spatial_reference_system_32}


```
 supports_spatial_reference_system(spatial_reference_system) 
```

Determines, whether specified spatial reference system is supported by the driver.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial reference system. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Boolean value, indicating whether specified spatial reference system is supported by the driver. |


