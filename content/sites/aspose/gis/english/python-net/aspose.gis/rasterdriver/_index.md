---
title: RasterDriver Class
type: docs
weight: 3410
url: /python-net/aspose.gis/rasterdriver/
---

**Summary:** A driver for a specific raster based format.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.RasterDriver

**Inheritance:** Driver

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| can_open_layers | bool | r | Gets a value indicating whether this driver can open raster layers. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [open_layer(path)](#open_layer_path_1) | Opens the layer for reading. |
| [open_layer(path)](#open_layer_path_2) | Opens the layer for reading. |
| [open_layer(path, options)](#open_layer_path_options_3) | Opens the layer for reading. |
| [open_layer(path, options)](#open_layer_path_options_4) | Opens the layer for reading. |


### Method: open_layer(path) {#open_layer_path_1}


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
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/) | An instance of [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/). |


### Method: open_layer(path) {#open_layer_path_2}


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
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/) | An instance of [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/). |


### Method: open_layer(path, options) {#open_layer_path_options_3}


```
 open_layer(path, options) 
```

Opens the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |
| options | [RasterDriverOptions](/psd/python-net/aspose.gis/rasterdriveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/) | An instance of [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/). |


### Method: open_layer(path, options) {#open_layer_path_options_4}


```
 open_layer(path, options) 
```

Opens the layer for reading.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the file. |
| options | [RasterDriverOptions](/psd/python-net/aspose.gis/rasterdriveroptions) | Driver-specific options. |

**Returns**

| Type | Description |
| :- | :- |
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/) | An instance of [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/). |


