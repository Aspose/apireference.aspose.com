---
title: set_palette method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 390
url: /aspose.cad/rasterimage/set_palette/
is_root: false
---

## set_palette {#aspose.cad.IColorPalette-bool}

Sets the image palette.



```python
def set_palette(self, palette, update_colors):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| palette | [`IColorPalette`](/cad/python-net/aspose.cad/icolorpalette) | The palette to set. |
| update_colors | bool | if set to `true` colors will be updated according to the new palette; otherwise color indexes remain unchanged. Note that unchanged indexes may crash the image on loading if some indexes have no corresponding palette entries. |



### See Also
* module [`aspose.cad`](../../)
* class [`RasterImage`](/cad/python-net/aspose.cad/rasterimage)
