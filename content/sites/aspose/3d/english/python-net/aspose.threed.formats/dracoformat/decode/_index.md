---
title: decode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.formats/dracoformat/decode/
is_root: false
---

## decode(self, file_name) {#str}

Decode the point cloud or mesh from specified file name


### Returns 


A [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) or [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) instance depends on the file content


```python

def decode(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | The file name contains the drc file |
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


## decode(self, data) {#bytes}

Decode the point cloud or mesh from memory data


### Returns 


A [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) or [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) instance depends on the content


```python

def decode(self, data):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| data | bytes | The raw drc bytes |
### Exceptions
| Exception | Description |
| :- | :- |
| [`ImportException`](/3d/python-net/aspose.threed/importexception) | Thrown when data is malformed. |



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
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`ImportException`](/3d/python-net/aspose.threed/importexception)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud)
