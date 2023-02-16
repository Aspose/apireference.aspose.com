---
title: open method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed/scene/open/
is_root: false
---

## open(stream) {#io.RawIOBase}

Opens the scene from given stream



```python
def open(self, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Input stream, user is responsible for closing the stream. |

### Example 


The following code shows how to open a scene from stream

```python
from aspose.threed import Scene

scene = Scene()
with open("input.fbx", "rb") as stream:
    scene.open(stream)

```


## open(file_name) {#str}

Opens the scene from given path



```python
def open(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |

### Example 


The following code shows how to open a scene from file name

```python
from aspose.threed import Scene

scene = Scene()
scene.open("input.fbx")

```


## open(file_name, options) {#str-aspose.threed.formats.LoadOptions}

Opens the scene from given path using specified file format.



```python
def open(self, file_name, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name. |
| options | aspose.threed.formats.LoadOptions | More detailed configuration to open the stream. |

### Example 


The following code shows how to open a scene from file name with extra load options

```python
from aspose.threed import Scene
from aspose.threed.formats import FbxLoadOptions

scene = Scene()
opts = FbxLoadOptions()
opts.lookup_paths.append("textures")
scene.open("input.fbx", opts)

```



### See Also
* module [`aspose.threed`](../../)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
