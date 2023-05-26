---
title: on_image_resource_ready method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.cad.imageoptions.svgoptionsparameters/isvgresourcekeepercallback/on_image_resource_ready/
is_root: false
---

## on_image_resource_ready {#bytes-aspose.cad.imageoptions.svgoptionsparameters.SvgImageType-str-any}

Called for each raster image in SVG. Use it to specify how to store the raster image.


### Returns 


Should return path to saved resource. Path will be used in SVG image to refer to raster content. Path should be relative to target SVG document.


```python
def on_image_resource_ready(self, image_data, image_type, suggested_file_name, use_embedded_image):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| image_data | bytes | The bytes of the raster image content |
| image_type | [`SvgImageType`](/cad/python-net/aspose.cad.imageoptions.svgoptionsparameters/svgimagetype) | Type of the image. |
| suggested_file_name | str | Name of the suggested file. |
| use_embedded_image | any | if set to `true` then image will be embedded into SVG. |



### See Also
* module [`aspose.cad.imageoptions.svgoptionsparameters`](../../)
* class [`ISvgResourceKeeperCallback`](/cad/python-net/aspose.cad.imageoptions.svgoptionsparameters/isvgresourcekeepercallback)
