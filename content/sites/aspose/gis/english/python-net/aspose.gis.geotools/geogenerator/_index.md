---
title: GeoGenerator Class
type: docs
weight: 30
url: /python-net/aspose.gis.geotools/geogenerator/
---

**Summary:** Generator of random points, lines and polygons on given planes.

**Module:** [aspose.gis.geotools](/psd/python-net/aspose.gis.geotools/)

**Full Name:** aspose.gis.geotools.GeoGenerator

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [produce_lines(rect, options)](#produce_lines_rect_options_1) | Creates a new ILineString Enumerator with a given number of random items, all of them within a given extent. |
| [produce_points(rect, options)](#produce_points_rect_options_2) | Creates an array of points belonging to the specified area. |
| [produce_polygons(rect, options)](#produce_polygons_rect_options_3) | Creates a new IPolygon Enumerator with a given number of random items, all of them within a given extent. |
| [produce_stars(rect, options)](#produce_stars_rect_options_4) | Creates an array of stars, all of them within a given extent. |


### Method: produce_lines(rect, options)  [static] {#produce_lines_rect_options_1}


```
 produce_lines(rect, options) 
```

Creates a new ILineString Enumerator with a given number of random items, all of them within a given extent.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| rect | [Extent](/psd/python-net/aspose.gis/extent) | Specified area (see <see cref="T:Aspose.Gis.Extent">Extent</see>) |
| options | [LineGeneratorOptions](/psd/python-net/aspose.gis.geotools/linegeneratoroptions) | Line creation options (see <see cref="T:Aspose.Gis.GeoTools.LineGeneratorOptions">LineGeneratorOptions</see>) |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.IEnumerable<Aspose.Gis.Geometries.ILineString> | Array of lines (see enumeration of <see cref="T:Aspose.Gis.Geometries.ILineString">ILineString</see>) |


### Method: produce_points(rect, options)  [static] {#produce_points_rect_options_2}


```
 produce_points(rect, options) 
```

Creates an array of points belonging to the specified area.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| rect | [Extent](/psd/python-net/aspose.gis/extent) | Specified area (see <see cref="T:Aspose.Gis.Extent">Extent</see>). |
| options | [PointGeneratorOptions](/psd/python-net/aspose.gis.geotools/pointgeneratoroptions) | Point creation options (see <see cref="T:Aspose.Gis.GeoTools.PointGeneratorOptions">PointGeneratorOptions</see>). |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.IEnumerable<Aspose.Gis.Geometries.IGeometry> | Array of points (see enumeration of <see cref="T:Aspose.Gis.Geometries.IGeometry">IGeometry</see>). |


### Method: produce_polygons(rect, options)  [static] {#produce_polygons_rect_options_3}


```
 produce_polygons(rect, options) 
```

Creates a new IPolygon Enumerator with a given number of random items, all of them within a given extent.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| rect | [Extent](/psd/python-net/aspose.gis/extent) | Specified area (see <see cref="T:Aspose.Gis.Extent">Extent</see>) |
| options | [PolygonGeneratorOptions](/psd/python-net/aspose.gis.geotools/polygongeneratoroptions) | Polygon creation options (see <see cref="T:Aspose.Gis.GeoTools.PolygonGeneratorOptions">PolygonGeneratorOptions</see>) |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.IEnumerable<Aspose.Gis.Geometries.IPolygon> | Array of polygons (see enumeration of <see cref="T:Aspose.Gis.Geometries.IPolygon">IPolygon</see>) |


### Method: produce_stars(rect, options)  [static] {#produce_stars_rect_options_4}


```
 produce_stars(rect, options) 
```

Creates an array of stars, all of them within a given extent.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| rect | [Extent](/psd/python-net/aspose.gis/extent) | Specified area (see <see cref="T:Aspose.Gis.Extent">Extent</see>) |
| options | [StarGeneratorOptions](/psd/python-net/aspose.gis.geotools/stargeneratoroptions) | Polygon creation options (see <see cref="T:Aspose.Gis.GeoTools.StarGeneratorOptions">StarGeneratorOptions</see>) |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.IEnumerable<Aspose.Gis.Geometries.IPolygon> | Array of stars (see enumeration of <see cref="T:Aspose.Gis.Geometries.IPolygon">IPolygon</see>) |


