---
title: WebTile Class
type: docs
weight: 10
url: /python-net/aspose.gis.raster.web/webtile/
---

**Summary:** Abstract Web Tile Model.

**Module:** [aspose.gis.raster.web](/psd/python-net/aspose.gis.raster.web/)

**Full Name:** aspose.gis.raster.web.WebTile

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| cell_x | int | r | The X-Column of a tile. |
| cell_y | int | r | The Y-Row of a tile. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [as_binary()](#as_binary__1) | Returns the image byte sequence |
| [as_path()](#as_path__2) | Presents the tile content as a Url or Path to a file. |
| [as_raster()](#as_raster__3) | Presents the tile content as a Raster layer. |
| [get_extent()](#get_extent__4) | Presents a spatial extent of this layer. |


### Method: as_binary() {#as_binary__1}


```
 as_binary() 
```

Returns the image byte sequence

**Returns**

| Type | Description |
| :- | :- |
| byte | Byte sequence |


### Method: as_path() {#as_path__2}


```
 as_path() 
```

Presents the tile content as a Url or Path to a file.

**Returns**

| Type | Description |
| :- | :- |
| string | Url or Path to a file |


### Method: as_raster() {#as_raster__3}


```
 as_raster() 
```

Presents the tile content as a Raster layer.

**Returns**

| Type | Description |
| :- | :- |
| [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer) | The Raster. |


### Method: get_extent() {#get_extent__4}


```
 get_extent() 
```

Presents a spatial extent of this layer.

**Returns**

| Type | Description |
| :- | :- |
| [Extent](/psd/python-net/aspose.gis/extent) | A spatial extent of this layer. |


