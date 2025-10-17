---
title: encode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.formats/dracoformat/encode/
is_root: false
---

## encode(self, entity, options) {#aspose.threed.Entity-aspose.threed.formats.DracoSaveOptions}

Encode the entity to Draco raw data


### Returns 


The encoded draco data represented in bytes


```python

def encode(self, entity, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | The entity to be encoded |
| options | aspose.threed.formats.DracoSaveOptions | Extra options for encoding the point cloud |

### Example 


The following code shows how to encode and decode a Mesh to/from byte array:
		
```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh, Sphere

mesh = Sphere().to_mesh()
# encode mesh into Draco format
draco = FileFormat.DRACO.encode(mesh)
# decode mesh from Draco format
decodedMesh = pycore.cast(Mesh, FileFormat.DRACO.decode(draco))

```


## encode(self, entity, stream, options) {#aspose.threed.Entity-io.RawIOBase-aspose.threed.formats.DracoSaveOptions}

Encode the entity to specified stream



```python

def encode(self, entity, stream, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | The entity to be encoded |
| stream | io.RawIOBase | The stream that encoded data will be written to |
| options | aspose.threed.formats.DracoSaveOptions | Extra options for encoding the point cloud |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed to read from stream |



### Example 


The following code shows how to encode and decode a Mesh to/from byte array:
		
```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh, Sphere

mesh = Sphere().to_mesh()
# encode mesh into Draco format
draco = FileFormat.DRACO.encode(mesh)
# decode mesh from Draco format
decodedMesh = pycore.cast(Mesh, FileFormat.DRACO.decode(draco))

```


## encode(self, entity, file_name, options) {#aspose.threed.Entity-System.String-aspose.threed.formats.DracoSaveOptions}

Encode the entity to specified file



```python

def encode(self, entity, file_name, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | aspose.threed.Entity | The entity to be encoded |
| file_name | System.String | The file name to be written |
| options | aspose.threed.formats.DracoSaveOptions | Extra options for encoding the point cloud |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed to read from file |



### Example 


The following code shows how to encode and decode a Mesh to/from byte array:
		
```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh, Sphere

mesh = Sphere().to_mesh()
# encode mesh into Draco format
draco = FileFormat.DRACO.encode(mesh)
# decode mesh from Draco format
decodedMesh = pycore.cast(Mesh, FileFormat.DRACO.decode(draco))

```



### See Also
* module [`aspose.threed.formats`](../../)
* class [`DracoFormat`](/3d/python-net/aspose.threed.formats/dracoformat)
