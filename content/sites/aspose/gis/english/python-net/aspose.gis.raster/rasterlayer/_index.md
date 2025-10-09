---
title: RasterLayer Class
type: docs
weight: 70
url: /python-net/aspose.gis.raster/rasterlayer/
---

**Summary:** Represents a raster layer.

**Module:** [aspose.gis.raster](/psd/python-net/aspose.gis.raster/)

**Full Name:** aspose.gis.raster.RasterLayer

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| band_count | int | r | Gets the number of bands in the raster layer. |
| bounds | [RasterRect](/psd/python-net/aspose.gis.raster/rasterrect) | r | Gets the raster bounds. |
| cell_size | [IRasterCellSize](/psd/python-net/aspose.gis.raster/irastercellsize) | r | Gets cell or pixel size of the raster. |
| driver | [Driver](/psd/python-net/aspose.gis/driver) | r | Gets the [RasterLayer.driver](/psd/python-net/aspose.gis.raster/rasterlayer/) that instantiated this layer. |
| height | int | r | Gets the height of the raster in pixels. Also it is known as rows count. |
| no_data_values | [IRasterValues](/psd/python-net/aspose.gis.raster/irastervalues) | r | Gets the values that represents background or 'no data' of the raster. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r | Gets a spatial reference system of raster.<br/>            Can be <see langword="null" /> if it is unknown. |
| upper_left_x | double | r | Gets x-coordinate of the raster upper left corner. |
| upper_left_y | double | r | Gets y-coordinate of the raster upper left corner. |
| width | int | r | Gets the width of the raster in pixels. Also it is known as columns count. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [crop(geometry, masks)](#crop_geometry_masks_1) | Crops the raster layer using a shape form (and band mask). |
| [crop(masks)](#crop_masks_2) | Crops the raster layer using a band mask). |
| [get_band(index)](#get_band_index_3) | Gets a band by the specified index. |
| [get_extent()](#get_extent__4) | Calculates a spatial extent of this layer. |
| [get_spatial_point(cell_x, cell_y)](#get_spatial_point_cell_x_cell_y_5) | Converts the specified column and row to the spatial coordinate. |
| [get_statistics(band_index, exclude_nodata_value)](#get_statistics_band_index_exclude_nodata_value_6) | Calculate summary statistics consisting of count, sum, mean, min, max. |
| [get_values(cell_x, cell_y)](#get_values_cell_x_cell_y_7) | Reads the values in the specified cell. |
| [get_values_dump(rect)](#get_values_dump_rect_8) | Reads the values in the specified block as a 1-dimension array. |
| [warp(options)](#warp_options_9) | Warps the raster layer to another. |


### Method: crop(geometry, masks) {#crop_geometry_masks_1}


```
 crop(geometry, masks) 
```

Crops the raster layer using a shape form (and band mask).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | Geometry represented the shape form. |
| masks | double | Mask for crop layer |

**Returns**

| Type | Description |
| :- | :- |
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer) | The cropped raster layer. If no intersections found returns <see langword="null" />. |


### Method: crop(masks) {#crop_masks_2}


```
 crop(masks) 
```

Crops the raster layer using a band mask).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| masks | double | Mask for crop layer |

**Returns**

| Type | Description |
| :- | :- |
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer) | The cropped raster layer. If no intersections found returns <see langword="null" />. |


### Method: get_band(index) {#get_band_index_3}


```
 get_band(index) 
```

Gets a band by the specified index.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Band numbers start at 0 and band is assumed to be 0 if not specified. |

**Returns**

| Type | Description |
| :- | :- |
| [IRasterBand](/psd/python-net/aspose.gis.raster/irasterband) | Returns basic meta data about a raster band. |


### Method: get_extent() {#get_extent__4}


```
 get_extent() 
```

Calculates a spatial extent of this layer.

**Returns**

| Type | Description |
| :- | :- |
| [Extent](/psd/python-net/aspose.gis/extent) | A spatial extent of this layer. |


### Method: get_spatial_point(cell_x, cell_y) {#get_spatial_point_cell_x_cell_y_5}


```
 get_spatial_point(cell_x, cell_y) 
```

Converts the specified column and row to the spatial coordinate.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| cell_x | int | The value for column (x-coordinate). Numbering starts at 0. |
| cell_y | int | The value for row (y-coordinate). Numbering starts at 0. |

**Returns**

| Type | Description |
| :- | :- |
| [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) | Returns the x-coordinate of upper left corner given a column and row. |


### Method: get_statistics(band_index, exclude_nodata_value) {#get_statistics_band_index_exclude_nodata_value_6}


```
 get_statistics(band_index, exclude_nodata_value) 
```

Calculate summary statistics consisting of count, sum, mean, min, max.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |
| exclude_nodata_value | bool | Allows to exclude 'nodata' values. If 'excludeNodataValue' is set to false, then all pixels are considered. |

**Returns**

| Type | Description |
| :- | :- |
| [RasterStatistics](/psd/python-net/aspose.gis.raster/rasterstatistics) | The summary statistics. |


### Method: get_values(cell_x, cell_y) {#get_values_cell_x_cell_y_7}


```
 get_values(cell_x, cell_y) 
```

Reads the values in the specified cell.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| cell_x | int | The value for column (x-coordinate). Numbering starts at 0. |
| cell_y | int | The value for row (y-coordinate). Numbering starts at 0. |

**Returns**

| Type | Description |
| :- | :- |
| [IRasterValues](/psd/python-net/aspose.gis.raster/irastervalues) | The raster values. |


### Method: get_values_dump(rect) {#get_values_dump_rect_8}


```
 get_values_dump(rect) 
```

Reads the values in the specified block as a 1-dimension array.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| rect | [RasterRect](/psd/python-net/aspose.gis.raster/rasterrect) | Block of raster cells where dump is read. |

**Returns**

| Type | Description |
| :- | :- |
| [IRasterValues[]](/psd/python-net/aspose.gis.raster/irastervalues) | The dump of values. |


### Method: warp(options) {#warp_options_9}


```
 warp(options) 
```

Warps the raster layer to another.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| options | [WarpOptions](/psd/python-net/aspose.gis.raster/warpoptions) | Options for the reprojection procedure. |

**Returns**

| Type | Description |
| :- | :- |
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer) | The warp raster layer. |


