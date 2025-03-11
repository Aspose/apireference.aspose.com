---
title: save method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.threed/scene/save/
is_root: false
---

## save(self, file_name) {#str}

Saves the scene to specified path using specified file format.



```python

def save(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed at reading input |
| [`ExportException`](/3d/python-net/aspose.threed/exportexception) | Thrown when failed to export the scene to specified 3D format |



### Example 


The following code shows how to save scene

```python
from aspose.threed import Scene

scene = Scene.from_file("input.fbx")
scene.save("output.usdz")

```


## save(self, stream, format) {#io.RawIOBase-aspose.threed.FileFormat}

Saves the scene to stream using specified file format.



```python

def save(self, stream, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Input stream, user is responsible for closing the stream. |
| format | [`FileFormat`](/3d/python-net/aspose.threed/fileformat) | Format. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed at reading input |
| [`ExportException`](/3d/python-net/aspose.threed/exportexception) | Thrown when failed to export the scene to specified 3D format |



### Example 


The following code shows how to save scene

```python
from aspose.threed import FileFormat, Scene
from io import BytesIO

scene = Scene.from_file("input.fbx")
with BytesIO() as ms:
    scene.save(ms, FileFormat.USDZ)

```


## save(self, stream, options) {#io.RawIOBase-aspose.threed.formats.SaveOptions}

Saves the scene to stream using specified file format.



```python

def save(self, stream, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Input stream, user is responsible for closing the stream. |
| options | aspose.threed.formats.SaveOptions | More detailed configuration to save the stream. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed at reading input |
| [`ExportException`](/3d/python-net/aspose.threed/exportexception) | Thrown when failed to export the scene to specified 3D format |



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


## save(self, file_name, format) {#str-aspose.threed.FileFormat}

Saves the scene to specified path using specified file format.



```python

def save(self, file_name, format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |
| format | [`FileFormat`](/3d/python-net/aspose.threed/fileformat) | Format. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed at reading input |
| [`ExportException`](/3d/python-net/aspose.threed/exportexception) | Thrown when failed to export the scene to specified 3D format |



### Example 


The following code shows how to save scene

```python
from aspose.threed import FileFormat, Scene

scene = Scene.from_file("input.fbx")
scene.save("output.usdz", FileFormat.USDZ)

```


## save(self, file_name, options) {#str-aspose.threed.formats.SaveOptions}

Saves the scene to specified path using specified file format.



```python

def save(self, file_name, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |
| options | aspose.threed.formats.SaveOptions | More detailed configuration to save the stream. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed at reading input |
| [`ExportException`](/3d/python-net/aspose.threed/exportexception) | Thrown when failed to export the scene to specified 3D format |



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
* class [`ExportException`](/3d/python-net/aspose.threed/exportexception)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
