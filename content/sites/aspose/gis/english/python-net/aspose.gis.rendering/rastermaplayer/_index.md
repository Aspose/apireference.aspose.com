---
title: RasterMapLayer Class
type: docs
weight: 250
url: /python-net/aspose.gis.rendering/rastermaplayer/
---

**Summary:** A layer inside [Map](/psd/python-net/aspose.gis.rendering/map/) that represents a raster layer data.

**Module:** [aspose.gis.rendering](/psd/python-net/aspose.gis.rendering/)

**Full Name:** aspose.gis.rendering.RasterMapLayer

**Inheritance:** MapLayer

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [RasterMapLayer(layer, colorizer, keep_open)](#RasterMapLayer_layer_colorizer_keep_open_1) | Creates new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| colorizer | [RasterColorizer](/psd/python-net/aspose.gis.rendering.colorizers/rastercolorizer/) | r/w | Colorizer to use to render cells of the raster. |
| opacity | double | r/w | Opacity of the layer. |
| resampling | [RasterMapResampling](/psd/python-net/aspose.gis.rendering/rastermapresampling) | r/w | Specifies warp options of the layer on a map. |


### Constructor: RasterMapLayer(layer, colorizer, keep_open) {#RasterMapLayer_layer_colorizer_keep_open_1}


```
 RasterMapLayer(layer, colorizer, keep_open) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| layer | [RasterLayer](/psd/python-net/aspose.gis.raster/rasterlayer/) | Raster layer. |
| colorizer | [RasterColorizer](/psd/python-net/aspose.gis.rendering.colorizers/rastercolorizer/) | Symbolizer to use to render layer. If <see langword="null" />, default colorizer will be used. |
| keep_open | bool | <see langword="true" /> to leave the layer open after the [VectorMapLayer](/psd/python-net/aspose.gis.rendering/vectormaplayer/) object is disposed; otherwise, <see langword="false" />. |

