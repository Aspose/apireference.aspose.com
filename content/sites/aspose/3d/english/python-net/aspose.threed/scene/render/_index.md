---
title: render method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /aspose.threed/scene/render/
is_root: false
---

## render {#aspose.threed.entities.Camera-str}

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


## render {#aspose.threed.entities.Camera-aspose.threed.render.TextureData}

Render the scene into bitmap from given camera's perspective.



```python
def render(self, camera, bitmap):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| bitmap | aspose.threed.render.TextureData | Target of the rendered result |


## render {#aspose.threed.entities.Camera-aspose.threed.render.TextureData-aspose.threed.ImageRenderOptions}

Render the scene into bitmap from given camera's perspective.



```python
def render(self, camera, bitmap, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| bitmap | aspose.threed.render.TextureData | Target of the rendered result |
| options | [`ImageRenderOptions`](/3d/python-net/aspose.threed/imagerenderoptions) | The option to customize some internal settings. |


## render {#aspose.threed.entities.Camera-str-aspose.threed.utilities.Vector2-str}

Render the scene into external file from given camera's perspective.



```python
def render(self, camera, file_name, size, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| file_name | str | The file name of output file |
| size | aspose.threed.utilities.Vector2 | The size of final rendered image |
| format | str | The image format of the output file |


## render {#aspose.threed.entities.Camera-str-aspose.threed.utilities.Vector2-str-aspose.threed.ImageRenderOptions}

Render the scene into external file from given camera's perspective.



```python
def render(self, camera, file_name, size, format, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| camera | aspose.threed.entities.Camera | From which camera's perspective to render the scene |
| file_name | str | The file name of output file |
| size | aspose.threed.utilities.Vector2 | The size of final rendered image |
| format | str | The image format of the output file |
| options | [`ImageRenderOptions`](/3d/python-net/aspose.threed/imagerenderoptions) | The option to customize some internal settings. |



### See Also
* module [`aspose.threed`](../../)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
