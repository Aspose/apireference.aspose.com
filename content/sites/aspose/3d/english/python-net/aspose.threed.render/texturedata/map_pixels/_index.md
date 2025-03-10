---
title: map_pixels method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.render/texturedata/map_pixels/
is_root: false
---

## map_pixels(self, map_mode) {#aspose.threed.render.PixelMapMode}

Map all pixels for read/write


### Returns 





```python

def map_pixels(self, map_mode):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| map_mode | [`PixelMapMode`](/3d/python-net/aspose.threed.render/pixelmapmode) | Map mode |


## map_pixels(self, map_mode, format) {#aspose.threed.render.PixelMapMode-aspose.threed.render.PixelFormat}

Map all pixels for read/write in given pixel format


### Returns 





```python

def map_pixels(self, map_mode, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| map_mode | [`PixelMapMode`](/3d/python-net/aspose.threed.render/pixelmapmode) | Map mode |
| format | [`PixelFormat`](/3d/python-net/aspose.threed.render/pixelformat) | Pixel format |


## map_pixels(self, rect, map_mode, format) {#aspose.threed.utilities.Rect-aspose.threed.render.PixelMapMode-aspose.threed.render.PixelFormat}

Map pixels addressed by rect for reading/writing in given pixel format


### Returns 


Returns a mapping object, it should be disposed when no longer needed.


```python

def map_pixels(self, rect, map_mode, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rect | aspose.threed.utilities.Rect | The area of pixels to be accessed |
| map_mode | [`PixelMapMode`](/3d/python-net/aspose.threed.render/pixelmapmode) | Map mode |
| format | [`PixelFormat`](/3d/python-net/aspose.threed.render/pixelformat) | Pixel format |
### Exceptions
| Exception | Description |
| :- | :- |
| NotSupportedException |  |





### See Also
* module [`aspose.threed.render`](../../)
* class [`TextureData`](/3d/python-net/aspose.threed.render/texturedata)
