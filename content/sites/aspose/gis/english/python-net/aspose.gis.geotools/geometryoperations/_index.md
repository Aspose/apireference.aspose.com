---
title: GeometryOperations Class
type: docs
weight: 40
url: /python-net/aspose.gis.geotools/geometryoperations/
---

**Summary:** The geometry operations class provides additional geoprocessing algorithms for geometries.

**Module:** [aspose.gis.geotools](/psd/python-net/aspose.gis.geotools/)

**Full Name:** aspose.gis.geotools.GeometryOperations

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [build_centerline(polygon)](#build_centerline_polygon_1) | Build centerline diagram for polygon |
| [build_centerline(sites)](#build_centerline_sites_2) | Build centerline diagram for collection of points (sites) |
| [close_linear_ring(geometry)](#close_linear_ring_geometry_3) | Closes geometric segments in rings if it needs. |
| [create_midpoints(geometry)](#create_midpoints_geometry_4) | Create midpoints by adding a new point in the middle to each segment. |
| [delete_near_points(geometry, options)](#delete_near_points_geometry_options_5) | Delete points that are too close to each other. |
| [extract_geometry_collection(layer)](#extract_geometry_collection_layer_6) | Extract geometry collection from layer |
| [get_centerline_length(polygon)](#get_centerline_length_polygon_7) | Get centerline Length |
| [get_centerline_length(sites)](#get_centerline_length_sites_8) | Get centerline Length |
| [make_voronoi_graph(sites)](#make_voronoi_graph_sites_9) | Build "Voronoi" diagram for collection of points (sites) |
| [order_geometry_collection(geometry)](#order_geometry_collection_geometry_10) | Order geometry collection by type to four collection (point, line, polygon and other type) |
| [simplify_segments(geometry, options)](#simplify_segments_geometry_options_11) | Delete points lying on the same segment. |


### Method: build_centerline(polygon)  [static] {#build_centerline_polygon_1}


```
 build_centerline(polygon) 
```

Build centerline diagram for polygon

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| polygon | [Polygon](/psd/python-net/aspose.gis.geometries/polygon/) | Polygon for centerline diagram |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.List<Aspose.Gis.Geometries.LineString> | Collection of centerline edges |


### Method: build_centerline(sites)  [static] {#build_centerline_sites_2}


```
 build_centerline(sites) 
```

Build centerline diagram for collection of points (sites)

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| sites | System.Collections.Generic.IEnumerable<Aspose.Gis.Geometries.Point> | Collection of points (sites) |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.List<Aspose.Gis.Geometries.LineString> | Collection of centerline edges |


### Method: close_linear_ring(geometry)  [static] {#close_linear_ring_geometry_3}


```
 close_linear_ring(geometry) 
```

Closes geometric segments in rings if it needs.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | Geometry for closing. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | The geometry after closing. |


### Method: create_midpoints(geometry)  [static] {#create_midpoints_geometry_4}


```
 create_midpoints(geometry) 
```

Create midpoints by adding a new point in the middle to each segment.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | Geometry for processing. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | The geometry after processing. |


### Method: delete_near_points(geometry, options)  [static] {#delete_near_points_geometry_options_5}


```
 delete_near_points(geometry, options) 
```

Delete points that are too close to each other.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | Geometry for deleting the nearest points. |
| options | [NearPointsCleanerOptions](/psd/python-net/aspose.gis.geotools/nearpointscleaneroptions) | Options for deleting the nearest points. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | The geometry after deleting nearest point. |


### Method: extract_geometry_collection(layer)  [static] {#extract_geometry_collection_layer_6}


```
 extract_geometry_collection(layer) 
```

Extract geometry collection from layer

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | Input layer |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | The collection contains all geometries of input layer |


### Method: get_centerline_length(polygon)  [static] {#get_centerline_length_polygon_7}


```
 get_centerline_length(polygon) 
```

Get centerline Length

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| polygon | [Polygon](/psd/python-net/aspose.gis.geometries/polygon/) | Polygon for centerline diagram |

**Returns**

| Type | Description |
| :- | :- |
| double | Length of centerline edges |


### Method: get_centerline_length(sites)  [static] {#get_centerline_length_sites_8}


```
 get_centerline_length(sites) 
```

Get centerline Length

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| sites | System.Collections.Generic.IEnumerable<Aspose.Gis.Geometries.Point> | Collection of points (sites) |

**Returns**

| Type | Description |
| :- | :- |
| double | Length of centerline edges |


### Method: make_voronoi_graph(sites)  [static] {#make_voronoi_graph_sites_9}


```
 make_voronoi_graph(sites) 
```

Build "Voronoi" diagram for collection of points (sites)

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| sites | System.Collections.Generic.IEnumerable<Aspose.Gis.Geometries.IPoint> | Collection of points (sites) |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.List<Aspose.Gis.Geometries.LineString> | Collection of edges voronoi's diagram |


### Method: order_geometry_collection(geometry)  [static] {#order_geometry_collection_geometry_10}


```
 order_geometry_collection(geometry) 
```

Order geometry collection by type to four collection (point, line, polygon and other type)

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | Geometry collection for order |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | The collection contains four collections (point, line, polygon and other type) |


### Method: simplify_segments(geometry, options)  [static] {#simplify_segments_geometry_options_11}


```
 simplify_segments(geometry, options) 
```

Delete points lying on the same segment.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geometry | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | Geometry for deleting extra point |
| options | [SimplifySegmentsOptions](/psd/python-net/aspose.gis.geotools/simplifysegmentsoptions) | Options for deleting extra point |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry/) | The geometry after deleting extra point |


