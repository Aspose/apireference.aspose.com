---
title: encode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.formats/plyformat/encode/
is_root: false
---

## encode(self, entity, stream) {#aspose.threed.Entity-io.RawIOBase}

Encode the entity and save the result into the stream.



```python

def encode(self, entity, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | The entity to encode |
| stream | io.RawIOBase | The stream to write to, this method will not close this stream |

### Example 


The following code shows how to encode a mesh into PLY file:
		
```python
from aspose.threed import FileFormat
from aspose.threed.entities import Sphere

mesh = Sphere().to_mesh()
# encode mesh into PLY format
FileFormat.PLY.encode(mesh, "sphere.ply")

```


## encode(self, entity, file_name) {#aspose.threed.Entity-System.String}

Encode the entity and save the result into an external file.



```python

def encode(self, entity, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | The entity to encode |
| file_name | System.String | The file to write to |

### Example 


The following code shows how to encode a mesh into PLY file:
		
```python
from aspose.threed import FileFormat
from aspose.threed.entities import Sphere

mesh = Sphere().to_mesh()
# encode mesh into PLY format
FileFormat.PLY.encode(mesh, "sphere.ply")

```


## encode(self, entity, stream, opt) {#aspose.threed.Entity-io.RawIOBase-aspose.threed.formats.PlySaveOptions}

Encode the entity and save the result into the stream.



```python

def encode(self, entity, stream, opt):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | The entity to encode |
| stream | io.RawIOBase | The stream to write to, this method will not close this stream |
| opt | aspose.threed.formats.PlySaveOptions | Save options |

### Example 


The following code shows how to encode a mesh into PLY file:
		
```python
from aspose.threed import FileFormat
from aspose.threed.entities import Sphere

mesh = Sphere().to_mesh()
# encode mesh into PLY format
FileFormat.PLY.encode(mesh, "sphere.ply")

```


## encode(self, entity, file_name, opt) {#aspose.threed.Entity-System.String-aspose.threed.formats.PlySaveOptions}

Encode the entity and save the result into an external file.



```python

def encode(self, entity, file_name, opt):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | The entity to encode |
| file_name | System.String | The file to write to |
| opt | aspose.threed.formats.PlySaveOptions | Save options |

### Example 


The following code shows how to encode a mesh into PLY file:
		
```python
from aspose.threed import FileFormat
from aspose.threed.entities import Sphere

mesh = Sphere().to_mesh()
# encode mesh into PLY format
FileFormat.PLY.encode(mesh, "sphere.ply")

```



### See Also
* module [`aspose.threed.formats`](../../)
* class [`PlyFormat`](/3d/python-net/aspose.threed.formats/plyformat)
