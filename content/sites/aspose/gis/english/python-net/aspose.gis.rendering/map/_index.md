---
title: Map Class
type: docs
weight: 100
url: /python-net/aspose.gis.rendering/map/
---

**Summary:** Map is a collection of layers that can be rendered on top of each other via [Renderer](/psd/python-net/aspose.gis.rendering/renderer/).

**Module:** [aspose.gis.rendering](/psd/python-net/aspose.gis.rendering/)

**Full Name:** aspose.gis.rendering.Map

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [Map()](#Map__1) | Creates new instance of the <c>Map</c> class. |
| [Map(width, height)](#Map_width_height_2) | Creates new instance of the <c>Map</c> class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| background_color | System.Drawing.Color | r/w | Background color of the map. Defaults to . |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | r/w | Specifies bounds of map to render.<br/>            If set to <see langword="null" />, extent is calculated during rendering to include all geometries in all layers. |
| height | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Visual height of the map. |
| padding | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies padding to add to the extent. |
| resolution | double | r/w | Resolution to be used to render this map and to convert between [Measurement](/psd/python-net/aspose.gis.rendering/measurement/). Defaults to 96. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r/w | [Map.spatial_reference_system](/psd/python-net/aspose.gis.rendering/map/) of the map. |
| width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Visual width of the map. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add(features_sequence)](#add_features_sequence_1) | Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order. |
| [add(features_sequence, symbolizer)](#add_features_sequence_symbolizer_2) | Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order. |
| [add(features_sequence, symbolizer, labeling)](#add_features_sequence_symbolizer_labeling_3) | Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order. |
| [add(layer, colorizer, keep_open)](#add_layer_colorizer_keep_open_4) | Creates a [RasterMapLayer](/psd/python-net/aspose.gis.rendering/rastermaplayer/) with default colorizer and adds it to the map. |
| [add(layer, keep_open)](#add_layer_keep_open_5) | Creates a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) with default symbolizer and adds it to the map. Layers are rendered in addition order. |
| [add(layer, symbolizer, keep_open)](#add_layer_symbolizer_keep_open_6) | Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order. |
| [add(layer, symbolizer, labeling, default_reference_system, keep_open)](#add_layer_symbolizer_labeling_default_reference_system_keep_open_7) | Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order. |
| [add(layer, symbolizer, labeling, keep_open)](#add_layer_symbolizer_labeling_keep_open_8) | Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order. |
| [add(map_layer)](#add_map_layer_9) | Adds a layer to the map. Layers are rendered in addition order. |
| [render(output_path, renderer)](#render_output_path_renderer_10) | Renders map into a file. |
| [render(output_path, renderer)](#render_output_path_renderer_11) | Renders map into a file. |


### Constructor: Map() {#Map__1}


```
 Map() 
```

Creates new instance of the <c>Map</c> class.

### Constructor: Map(width, height) {#Map_width_height_2}


```
 Map(width, height) 
```

Creates new instance of the <c>Map</c> class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | Width of the map. |
| height | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | Height of the map. |

### Method: add(features_sequence) {#add_features_sequence_1}


```
 add(features_sequence) 
```

Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | A features sequence to represent by [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/). |

### Method: add(features_sequence, symbolizer) {#add_features_sequence_symbolizer_2}


```
 add(features_sequence, symbolizer) 
```

Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | A features sequence to represent by [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/). |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. If <see langword="null" />, default symbolizer is used. |

### Method: add(features_sequence, symbolizer, labeling) {#add_features_sequence_symbolizer_labeling_3}


```
 add(features_sequence, symbolizer, labeling) 
```

Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | A features sequence to represent by [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/). |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling/) | Labeling to use to label features in layer. If <see langword="null" />, [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling/) will be used. |

### Method: add(layer, colorizer, keep_open) {#add_layer_colorizer_keep_open_4}


```
 add(layer, colorizer, keep_open) 
```

Creates a [RasterMapLayer](/psd/python-net/aspose.gis.rendering/rastermaplayer/) with default colorizer and adds it to the map.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/) | A vector layer to represent by [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/). |
| colorizer | [RasterColorizer](/psd/python-net/aspose.gis.rendering.colorizers/rastercolorizer/) | A colorizer to use for rendering. If <see langword="null" />, default colorizer is used. |
| keep_open | bool | <see langword="true" /> to leave the raster layer open after the [Map](/psd/python-net/aspose.gis.rendering/map/) object is disposed;<br/>            <see langword="false" /> to dispose the layer. |

### Method: add(layer, keep_open) {#add_layer_keep_open_5}


```
 add(layer, keep_open) 
```

Creates a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) with default symbolizer and adds it to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A vector layer to represent by [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/). |
| keep_open | bool | <see langword="true" /> to leave the vector layer open after the [Map](/psd/python-net/aspose.gis.rendering/map/) object is disposed;<br/>            <see langword="false" /> to dispose the layer. |

### Method: add(layer, symbolizer, keep_open) {#add_layer_symbolizer_keep_open_6}


```
 add(layer, symbolizer, keep_open) 
```

Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A vector layer to represent by [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/). |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. If <see langword="null" />, default symbolizer is used. |
| keep_open | bool | <see langword="true" /> to leave the vector layer open after the [Map](/psd/python-net/aspose.gis.rendering/map/) object is disposed;<br/>            <see langword="false" /> to dispose the layer. |

### Method: add(layer, symbolizer, labeling, default_reference_system, keep_open) {#add_layer_symbolizer_labeling_default_reference_system_keep_open_7}


```
 add(layer, symbolizer, labeling, default_reference_system, keep_open) 
```

Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A vector layer to represent by [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/). |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. If <see langword="null" />, default symbolizer is used. |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling/) | Labeling to use to label features in layer. If <see langword="null" />, default [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| default_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Specifies a value for a source spatial reference (layer\sequence) if that is missing. Default null will be used. |
| keep_open | bool | <see langword="true" /> to leave the layer open after the [Map](/psd/python-net/aspose.gis.rendering/map/) object is disposed; otherwise, <see langword="false" />. |

### Method: add(layer, symbolizer, labeling, keep_open) {#add_layer_symbolizer_labeling_keep_open_8}


```
 add(layer, symbolizer, labeling, keep_open) 
```

Creates and adds a [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | A vector layer to represent by [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/). |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. If <see langword="null" />, default symbolizer is used. |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling/) | Labeling to use to label features in layer. If <see langword="null" />, default [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| keep_open | bool | <see langword="true" /> to leave the layer open after the [Map](/psd/python-net/aspose.gis.rendering/map/) object is disposed; otherwise, <see langword="false" />. |

### Method: add(map_layer) {#add_map_layer_9}


```
 add(map_layer) 
```

Adds a layer to the map. Layers are rendered in addition order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| map_layer | [MapLayer](/psd/python-net/aspose.gis.rendering/maplayer) | The layer to be added. |

### Method: render(output_path, renderer) {#render_output_path_renderer_10}


```
 render(output_path, renderer) 
```

Renders map into a file.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| output_path | string | Path to the output file. |
| renderer | [Renderer](/psd/python-net/aspose.gis.rendering/renderer) | Renderer to use. |

### Method: render(output_path, renderer) {#render_output_path_renderer_11}


```
 render(output_path, renderer) 
```

Renders map into a file.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| output_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the output file. |
| renderer | [Renderer](/psd/python-net/aspose.gis.rendering/renderer) | Renderer to use. |

