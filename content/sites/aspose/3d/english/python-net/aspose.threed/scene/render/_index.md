---
title: render method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.threed/scene/render/
is_root: false
---

## render(camera, file_name) {#aspose.threed.entities.Camera-str}

Render the scene into external file from given camera's perspective.
The default output size is 1024x768 and output format is png



```python
def render(self, camera, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| file_name | str | The file name of output file |


## render(camera, bitmap) {#aspose.threed.entities.Camera-System.Drawing.Bitmap}

Render the scene into bitmap from given camera's perspective.



```python
def render(self, camera, bitmap):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| bitmap | System.Drawing.Bitmap | Target of the rendered result |


## render(camera, bitmap, options) {#aspose.threed.entities.Camera-System.Drawing.Bitmap-ImageRenderOptions}

Render the scene into bitmap from given camera's perspective.



```python
def render(self, camera, bitmap, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| bitmap | System.Drawing.Bitmap | Target of the rendered result |
| options | [ImageRenderOptions](/3d/python-net/aspose.threed/imagerenderoptions) | The option to customize some internal settings. |


## render(camera, file_name, size, format) {#aspose.threed.entities.Camera-str-System.Drawing.Size-System.Drawing.Imaging.ImageFormat}

Render the scene into external file from given camera's perspective.



```python
def render(self, camera, file_name, size, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| file_name | str | The file name of output file |
| size | System.Drawing.Size | The size of final rendered image |
| format | System.Drawing.Imaging.ImageFormat | The image format of the output file |


## render(camera, file_name, size, format, options) {#aspose.threed.entities.Camera-str-System.Drawing.Size-System.Drawing.Imaging.ImageFormat-ImageRenderOptions}

Render the scene into external file from given camera's perspective.



```python
def render(self, camera, file_name, size, format, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| file_name | str | The file name of output file |
| size | System.Drawing.Size | The size of final rendered image |
| format | System.Drawing.Imaging.ImageFormat | The image format of the output file |
| options | [ImageRenderOptions](/3d/python-net/aspose.threed/imagerenderoptions) | The option to customize some internal settings. |



### See Also
* module [aspose.threed](../../)
* class [Scene](/3d/python-net/aspose.threed/scene)
