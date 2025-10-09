---
title: MapLayersGenerator Class
type: docs
weight: 20
url: /python-net/aspose.gis.geotools.mapbuilder/maplayersgenerator/
---

**Summary:** Map layers generator

**Module:** [aspose.gis.geotools.mapbuilder](/psd/python-net/aspose.gis.geotools.mapbuilder/)

**Full Name:** aspose.gis.geotools.mapbuilder.MapLayersGenerator

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [MapLayersGenerator()](#MapLayersGenerator__1) | Initializes a new instance of the MapLayersGenerator class |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [get_list_of_layers(options)](#get_list_of_layers_options_1) | Get list of layers: roadLayer, buildingLayer, parkLayer, parkRoadLayer, industrialLayer. |
| [produce_map(options)](#produce_map_options_2) | Produce map. |


### Constructor: MapLayersGenerator() {#MapLayersGenerator__1}


```
 MapLayersGenerator() 
```

Initializes a new instance of the MapLayersGenerator class

### Method: get_list_of_layers(options)  [static] {#get_list_of_layers_options_1}


```
 get_list_of_layers(options) 
```

Get list of layers: roadLayer, buildingLayer, parkLayer, parkRoadLayer, industrialLayer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| options | [MapGeneratorOptions](/psd/python-net/aspose.gis.geotools.mapbuilder/mapgeneratoroptions) | Map generator options. |

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.List<VectorLayer> | The list of layers with generated geometry. |


### Method: produce_map(options)  [static] {#produce_map_options_2}


```
 produce_map(options) 
```

Produce map.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| options | [MapGeneratorOptions](/psd/python-net/aspose.gis.geotools.mapbuilder/mapgeneratoroptions) | Map generator options. |

**Returns**

| Type | Description |
| :- | :- |
| [Map](/psd/python-net/aspose.gis.rendering/map/) | The completed map. |


