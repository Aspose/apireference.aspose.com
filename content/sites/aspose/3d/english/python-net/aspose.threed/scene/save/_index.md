---
title: save method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.threed/scene/save/
is_root: false
---

## save(file_name) {#str}

Saves the scene to specified path using specified file format.



```python
def save(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |

### Example 


The following code shows how to save scene

```python
from aspose.threed import Scene

scene = Scene.from_file("input.fbx")
scene.save("output.usdz")

```


## save(stream, format) {#io.RawIOBase-FileFormat}

Saves the scene to stream using specified file format.



```python
def save(self, stream, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Input stream, user is responsible for closing the stream. |
| format | [`FileFormat`](/3d/python-net/aspose.threed/fileformat) | Format. |

### Example 


The following code shows how to save scene

```python
from aspose.threed import FileFormat, Scene
from io import BytesIO

scene = Scene.from_file("input.fbx")
with BytesIO() as ms:
    scene.save(ms, FileFormat.USDZ)

```


## save(stream, options) {#io.RawIOBase-aspose.threed.formats.SaveOptions}

Saves the scene to stream using specified file format.



```python
def save(self, stream, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Input stream, user is responsible for closing the stream. |
| options | aspose.threed.formats.SaveOptions | More detailed configuration to save the stream. |

### Example 


The following code shows how to save scene

```python
from aspose.threed import Scene
from aspose.threed.formats import UsdSaveOptions
from io import BytesIO

scene = Scene.from_file("input.fbx")
opt = UsdSaveOptions()
opt.primitive_to_mesh = True
with BytesIO() as ms:
    scene.save(ms, opt)

```


## save(file_name, format) {#str-FileFormat}

Saves the scene to specified path using specified file format.



```python
def save(self, file_name, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |
| format | [`FileFormat`](/3d/python-net/aspose.threed/fileformat) | Format. |

### Example 


The following code shows how to save scene

```python
from aspose.threed import FileFormat, Scene

scene = Scene.from_file("input.fbx")
scene.save("output.usdz", FileFormat.USDZ)

```


## save(file_name, options) {#str-aspose.threed.formats.SaveOptions}

Saves the scene to specified path using specified file format.



```python
def save(self, file_name, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |
| options | aspose.threed.formats.SaveOptions | More detailed configuration to save the stream. |

### Example 


The following code shows how to save scene

```python
from aspose.threed import Scene
from aspose.threed.formats import UsdSaveOptions

scene = Scene.from_file("input.fbx")
opts = UsdSaveOptions()
opts.primitive_to_mesh = True
scene.save("output.usdz", opts)

```



### See Also
* module [`aspose.threed`](../../)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
