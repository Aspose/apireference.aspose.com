---
title: VectorMapLayer Class
type: docs
weight: 390
url: /python-net/aspose.gis.rendering/vectormaplayer/
---

**Summary:** A layer inside [Map](/psd/python-net/aspose.gis.rendering/map/) that represents a vector layer data.

**Module:** [aspose.gis.rendering](/psd/python-net/aspose.gis.rendering/)

**Full Name:** aspose.gis.rendering.VectorMapLayer

**Inheritance:** MapLayer

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [VectorMapLayer(features_sequence)](#VectorMapLayer_features_sequence_1) | Creates new instance with default symbolizer. |
| [VectorMapLayer(features_sequence, symbolizer)](#VectorMapLayer_features_sequence_symbolizer_2) | Creates new instance with default symbolizer. |
| [VectorMapLayer(features_sequence, symbolizer, labeling, default_reference_system)](#VectorMapLayer_features_sequence_symbolizer_labeling_default_reference_system_3) | Creates new instance with default symbolizer. |
| [VectorMapLayer(layer, keep_open)](#VectorMapLayer_layer_keep_open_4) | Creates new instance with default symbolizer. |
| [VectorMapLayer(layer, symbolizer, keep_open)](#VectorMapLayer_layer_symbolizer_keep_open_5) | Creates new instance. |
| [VectorMapLayer(layer, symbolizer, labeling, default_reference_system, keep_open)](#VectorMapLayer_layer_symbolizer_labeling_default_reference_system_keep_open_6) | Creates new instance. |
| [VectorMapLayer(layer, symbolizer, labeling, keep_open)](#VectorMapLayer_layer_symbolizer_labeling_keep_open_7) | Creates new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | r | The features sequence represented by this <c>VectorMapLayer</c>. |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling/) | r/w | Specifies warp options of the map layer. |
| opacity | double | r/w | Opacity of the layer. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | r/w | Symbolizer to use to render features of the layer. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [import_sld(path, options)](#import_sld_path_options_1) | Imports style from Styled Layer Descriptor file located at the specified path. |
| [import_sld(path, options)](#import_sld_path_options_2) | Imports style from Styled Layer Descriptor file located at the specified path. |
| [import_sld_from_string(sld, options)](#import_sld_from_string_sld_options_3) | Imports style from the specified Styled Layer Descriptor string. |


### Constructor: VectorMapLayer(features_sequence) {#VectorMapLayer_features_sequence_1}


```
 VectorMapLayer(features_sequence) 
```

Creates new instance with default symbolizer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features sequence. |

### Constructor: VectorMapLayer(features_sequence, symbolizer) {#VectorMapLayer_features_sequence_symbolizer_2}


```
 VectorMapLayer(features_sequence, symbolizer) 
```

Creates new instance with default symbolizer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features sequence. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | Symbolizer to use to render layer. If <see langword="null" />, default symbolizer will be used. |

### Constructor: VectorMapLayer(features_sequence, symbolizer, labeling, default_reference_system) {#VectorMapLayer_features_sequence_symbolizer_labeling_default_reference_system_3}


```
 VectorMapLayer(features_sequence, symbolizer, labeling, default_reference_system) 
```

Creates new instance with default symbolizer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| features_sequence | [FeaturesSequence](/psd/python-net/aspose.gis/featuressequence) | Features sequence. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | Symbolizer to use to render layer. If <see langword="null" />, default symbolizer will be used. |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling/) | Labeling to use to label features in layer. If <see langword="null" />, default [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| default_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Specifies a value for a source spatial reference (layer\sequence) if that is missing. Default null will be used. |

### Constructor: VectorMapLayer(layer, keep_open) {#VectorMapLayer_layer_keep_open_4}


```
 VectorMapLayer(layer, keep_open) 
```

Creates new instance with default symbolizer.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | Vector layer. |
| keep_open | bool | <see langword="true" /> to leave the layer open after the [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) object is disposed; otherwise, <see langword="false" />. |

### Constructor: VectorMapLayer(layer, symbolizer, keep_open) {#VectorMapLayer_layer_symbolizer_keep_open_5}


```
 VectorMapLayer(layer, symbolizer, keep_open) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | Vector layer. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | Symbolizer to use to render layer. If <see langword="null" />, default symbolizer will be used. |
| keep_open | bool | <see langword="true" /> to leave the layer open after the [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) object is disposed; otherwise, <see langword="false" />. |

### Constructor: VectorMapLayer(layer, symbolizer, labeling, default_reference_system, keep_open) {#VectorMapLayer_layer_symbolizer_labeling_default_reference_system_keep_open_6}


```
 VectorMapLayer(layer, symbolizer, labeling, default_reference_system, keep_open) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | Vector layer. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | Symbolizer to use to render layer. If <see langword="null" />, default symbolizer will be used. |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling/) | Labeling to use to label features in layer. If <see langword="null" />, default [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| default_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Specifies a value for a source spatial reference (layer\sequence) if that is missing. Default null will be used. |
| keep_open | bool | <see langword="true" /> to leave the layer open after the [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) object is disposed; otherwise, <see langword="false" />. |

### Constructor: VectorMapLayer(layer, symbolizer, labeling, keep_open) {#VectorMapLayer_layer_symbolizer_labeling_keep_open_7}


```
 VectorMapLayer(layer, symbolizer, labeling, keep_open) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [VectorLayer](/psd/python-net/aspose.gis/vectorlayer) | Vector layer. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | Symbolizer to use to render layer. If <see langword="null" />, default symbolizer will be used. |
| labeling | [Labeling](/psd/python-net/aspose.gis.rendering.labelings/labeling/) | Labeling to use to label features in layer. If <see langword="null" />, default [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| keep_open | bool | <see langword="true" /> to leave the layer open after the [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) object is disposed; otherwise, <see langword="false" />. |

### Method: import_sld(path, options) {#import_sld_path_options_1}


```
 import_sld(path, options) 
```

Imports style from Styled Layer Descriptor file located at the specified path.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | Path to the Styled Layer Descriptor file. |
| options | [SldImportOptions](/psd/python-net/aspose.gis.rendering.sld/sldimportoptions/) | Import options. |

### Method: import_sld(path, options) {#import_sld_path_options_2}


```
 import_sld(path, options) 
```

Imports style from Styled Layer Descriptor file located at the specified path.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the Styled Layer Descriptor file. |
| options | [SldImportOptions](/psd/python-net/aspose.gis.rendering.sld/sldimportoptions/) | Import options. |

### Method: import_sld_from_string(sld, options) {#import_sld_from_string_sld_options_3}


```
 import_sld_from_string(sld, options) 
```

Imports style from the specified Styled Layer Descriptor string.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| sld | string | Styled Layer Descriptor. |
| options | [SldImportOptions](/psd/python-net/aspose.gis.rendering.sld/sldimportoptions/) | Import options. |

