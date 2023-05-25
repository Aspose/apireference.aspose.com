---
title: get_close_image_palette method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /aspose.cad/colorpalettehelper/get_close_image_palette/
is_root: false
---

## get_close_image_palette {#aspose.cad.RasterImage-int}

Gets color palette from raster image (palletizes image) in case the image does not have one. In case palette exists it will be used instead performing calculations.


### Returns 


The color palette which starts with the most frequent colors from the `image` and contains `entries_count` entries.


```python
def get_close_image_palette(self, image, entries_count):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| image | [`RasterImage`](/cad/python-net/aspose.cad/rasterimage) | The raster image. |
| entries_count | int | The desired entries count. |



### See Also
* module [`aspose.cad`](../../)
* class [`ColorPaletteHelper`](/cad/python-net/aspose.cad/colorpalettehelper)
