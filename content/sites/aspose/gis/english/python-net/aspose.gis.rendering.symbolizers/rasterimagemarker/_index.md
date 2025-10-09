---
title: RasterImageMarker Class
type: docs
weight: 80
url: /python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/
---

**Summary:** This symbolizer renders a provided raster image.

**Module:** [aspose.gis.rendering.symbolizers](/psd/python-net/aspose.gis.rendering.symbolizers/)

**Full Name:** aspose.gis.rendering.symbolizers.RasterImageMarker

**Inheritance:** VectorSymbolizer

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [RasterImageMarker(image_path)](#RasterImageMarker_image_path_1) | Initializes a new instance of the [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/) class. |
| [RasterImageMarker(image_path)](#RasterImageMarker_image_path_2) | Initializes a new instance of the [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/) class. |
| [RasterImageMarker(other)](#RasterImageMarker_other_3) | Initializes a new instance of the [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| height | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies the height of the marker. |
| horizontal_anchor_point | [HorizontalAnchor](/psd/python-net/aspose.gis.rendering.symbolizers/horizontalanchor) | r/w | specifies which side of a marker shape will be aligned horizontally with the point location. |
| horizontal_offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies horizontal offset from a point location to the shape anchor point. |
| null [static] | [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer) | r | The [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer/) draws nothing and effectively skips rendering of a geometry it is applied to. |
| opacity | double | r/w | Opacity of the layer. Default value is 1.0. |
| rotation | double | r/w | Specifies the rotation of the symbol about its center point, in decimal degrees.<br/>            Positive values indicate rotation in the clockwise direction, negative values indicate counter-clockwise rotation. |
| vertical_anchor_point | [VerticalAnchor](/psd/python-net/aspose.gis.rendering.symbolizers/verticalanchor) | r/w | Specifies which side of a marker shape will be aligned vertically with the point location. |
| vertical_offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies vertical offset from a point location to the shape anchor point. |
| width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies the width of the marker. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [clone()](#clone__1) | Clones this instance. |


### Constructor: RasterImageMarker(image_path) {#RasterImageMarker_image_path_1}


```
 RasterImageMarker(image_path) 
```

Initializes a new instance of the [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| image_path | string | Path to the file. |

### Constructor: RasterImageMarker(image_path) {#RasterImageMarker_image_path_2}


```
 RasterImageMarker(image_path) 
```

Initializes a new instance of the [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| image_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the file. |

### Constructor: RasterImageMarker(other) {#RasterImageMarker_other_3}


```
 RasterImageMarker(other) 
```

Initializes a new instance of the [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker) | The other [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker/) to copy data from. |

### Method: clone() {#clone__1}


```
 clone() 
```

Clones this instance.

**Returns**

| Type | Description |
| :- | :- |
| [RasterImageMarker](/psd/python-net/aspose.gis.rendering.symbolizers/rasterimagemarker) | A clone of this instance. |


