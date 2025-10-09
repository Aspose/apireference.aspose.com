---
title: WayLayerGenerator Class
type: docs
weight: 10
url: /python-net/aspose.gis.geotools.wayanalyzer/waylayergenerator/
---

**Summary:** Way layers generator

**Module:** [aspose.gis.geotools.wayanalyzer](/psd/python-net/aspose.gis.geotools.wayanalyzer/)

**Full Name:** aspose.gis.geotools.wayanalyzer.WayLayerGenerator

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [WayLayerGenerator(options)](#WayLayerGenerator_options_1) | Create an instance of [WayLayerGenerator](/psd/python-net/aspose.gis.geotools.wayanalyzer/waylayergenerator/) |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add_block(x, y, size_x, size_y, velocity)](#add_block_x_y_size_x_size_y_velocity_1) | Add block to the cell |
| [add_road(start_point, end_point, velocity)](#add_road_start_point_end_point_velocity_2) | Add road to the cell |
| [find_the_way(start_point, goal_point, radius)](#find_the_way_start_point_goal_point_radius_3) | Find the way from start point to goal |


### Constructor: WayLayerGenerator(options) {#WayLayerGenerator_options_1}


```
 WayLayerGenerator(options) 
```

Create an instance of [WayLayerGenerator](/psd/python-net/aspose.gis.geotools.wayanalyzer/waylayergenerator/)

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| options | [WayOptions](/psd/python-net/aspose.gis.geotools.wayanalyzer/wayoptions) | the options of generator. |

### Method: add_block(x, y, size_x, size_y, velocity) {#add_block_x_y_size_x_size_y_velocity_1}


```
 add_block(x, y, size_x, size_y, velocity) 
```

Add block to the cell

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | int | the x of block |
| y | int | the y of block |
| size_x | int | the sizeX of block |
| size_y | int | the sizeY of block |
| velocity | double | the velocity of block |

### Method: add_road(start_point, end_point, velocity) {#add_road_start_point_end_point_velocity_2}


```
 add_road(start_point, end_point, velocity) 
```

Add road to the cell

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| start_point | [Point](/psd/python-net/aspose.gis.geometries/point/) | the start point. |
| end_point | [Point](/psd/python-net/aspose.gis.geometries/point/) | the end point. |
| velocity | double | the velocity. |

### Method: find_the_way(start_point, goal_point, radius) {#find_the_way_start_point_goal_point_radius_3}


```
 find_the_way(start_point, goal_point, radius) 
```

Find the way from start point to goal

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| start_point | [Point](/psd/python-net/aspose.gis.geometries/point/) | the start Point |
| goal_point | [Point](/psd/python-net/aspose.gis.geometries/point/) | the goa lPoint |
| radius | double | the radius to look for |

**Returns**

| Type | Description |
| :- | :- |
| [LineString](/psd/python-net/aspose.gis.geometries/linestring/) | The Found Way. |


