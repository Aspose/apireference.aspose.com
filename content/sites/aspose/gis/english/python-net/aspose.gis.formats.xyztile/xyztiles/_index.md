---
title: XyzTiles Class
type: docs
weight: 20
url: /python-net/aspose.gis.formats.xyztile/xyztiles/
---

**Summary:** A XyzTiles provide access to [XyzTile](/psd/python-net/aspose.gis.formats.xyztile/xyztile/) objects.

**Module:** [aspose.gis.formats.xyztile](/psd/python-net/aspose.gis.formats.xyztile/)

**Full Name:** aspose.gis.formats.xyztile.XyzTiles

**Inheritance:** WebTiles

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [XyzTiles(connection)](#XyzTiles_connection_1) | Create an instance of [XyzTiles](/psd/python-net/aspose.gis.formats.xyztile/xyztiles/). |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [get_tile(zoom, x, y)](#get_tile_zoom_x_y_1) | Loads the specified tile. |
| [get_tile(zoom, x, y, tile_size)](#get_tile_zoom_x_y_tile_size_2) | Loads the specified tile. |
| [get_tiles(zoom, extent)](#get_tiles_zoom_extent_3) | Loads tiles by the spatial bounding box and zoom level. |
| [get_tiles(zoom, extent, tile_size)](#get_tiles_zoom_extent_tile_size_4) | Loads tiles by the spatial bounding box and zoom level. |


### Constructor: XyzTiles(connection) {#XyzTiles_connection_1}


```
 XyzTiles(connection) 
```

Create an instance of [XyzTiles](/psd/python-net/aspose.gis.formats.xyztile/xyztiles/).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| connection | [XyzConnection](/psd/python-net/aspose.gis.formats.xyztile/xyzconnection) | A connection containing web options. |

### Method: get_tile(zoom, x, y) {#get_tile_zoom_x_y_1}


```
 get_tile(zoom, x, y) 
```

Loads the specified tile.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| zoom | int | The zoom level for loading tiles. The highest zoom level is 0. Most tile providers have about 22 maximum zoom levels. |
| x | int | An x-column of a tile. |
| y | int | A y-row of a tile. |

**Returns**

| Type | Description |
| :- | :- |
| [WebTile](/psd/python-net/aspose.gis.raster.web/webtile/) | The web tile. |


### Method: get_tile(zoom, x, y, tile_size) {#get_tile_zoom_x_y_tile_size_2}


```
 get_tile(zoom, x, y, tile_size) 
```

Loads the specified tile.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| zoom | int | The zoom level for loading tiles. The highest zoom level is 0. Most tile providers have about 22 maximum zoom levels. |
| x | int | An x-column of a tile. |
| y | int | A y-row of a tile. |
| tile_size | int | Size of tiles, by default is 256 (it is standard for tiles size) |

**Returns**

| Type | Description |
| :- | :- |
| [WebTile](/psd/python-net/aspose.gis.raster.web/webtile/) | The web tile. |


### Method: get_tiles(zoom, extent) {#get_tiles_zoom_extent_3}


```
 get_tiles(zoom, extent) 
```

Loads tiles by the spatial bounding box and zoom level.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| zoom | int | The zoom level for loading tiles. The highest zoom level is 0. Most tile providers have about 22 maximum zoom levels. |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | The bounding box to load tiles. The Wgs84 spatial reference will be used if it is missed. |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.IEnumerable<Aspose.Gis.Raster.Web.WebTile> | The web tiles. |


### Method: get_tiles(zoom, extent, tile_size) {#get_tiles_zoom_extent_tile_size_4}


```
 get_tiles(zoom, extent, tile_size) 
```

Loads tiles by the spatial bounding box and zoom level.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| zoom | int | The zoom level for loading tiles. The highest zoom level is 0. Most tile providers have about 22 maximum zoom levels. |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | The bounding box to load tiles. The Wgs84 spatial reference will be used if it is missed. |
| tile_size | int | Size of tiles, by default is 256 (it is standard for tiles size) |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.IEnumerable<Aspose.Gis.Raster.Web.WebTile> | The web tiles. |


