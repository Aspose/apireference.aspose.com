---
title: decode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.formats/plyformat/decode/
is_root: false
---

## decode(self, file_name) {#System.String}

Decode a point cloud or mesh from the specified stream.


### Returns 


A [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) or [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) instance


```python

def decode(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | System.String | The input stream |

### Example 


The following code shows how to decode a mesh from a PLY file:
		
```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh, Sphere

# Generate a test file for decoding
FileFormat.PLY.encode(Sphere(), "sphere.ply")
# Decode the file
mesh = pycore.cast(Mesh, FileFormat.PLY.decode("sphere.ply"))

```


## decode(self, stream) {#io.RawIOBase}

Decode a point cloud or mesh from the specified stream.


### Returns 


A [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) or [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) instance


```python

def decode(self, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The input stream |

### Example 


The following code shows how to decode a mesh from a PLY file:
		
```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh, Sphere

# Generate a test file for decoding
FileFormat.PLY.encode(Sphere(), "sphere.ply")
# Decode the file
mesh = pycore.cast(Mesh, FileFormat.PLY.decode("sphere.ply"))

```


## decode(self, file_name, opt) {#System.String-aspose.threed.formats.PlyLoadOptions}

Decode a point cloud or mesh from the specified stream.


### Returns 


A [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) or [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) instance


```python

def decode(self, file_name, opt):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | System.String | The input stream |
| opt | aspose.threed.formats.PlyLoadOptions | The load option of PLY format |

### Example 


The following code shows how to decode a mesh from a PLY file:
		
```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh, Sphere

# Generate a test file for decoding
FileFormat.PLY.encode(Sphere(), "sphere.ply")
# Decode the file
mesh = pycore.cast(Mesh, FileFormat.PLY.decode("sphere.ply"))

```


## decode(self, stream, opt) {#io.RawIOBase-aspose.threed.formats.PlyLoadOptions}

Decode a point cloud or mesh from the specified stream.


### Returns 


A [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) or [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) instance


```python

def decode(self, stream, opt):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The input stream |
| opt | aspose.threed.formats.PlyLoadOptions | The load option of PLY format |

### Example 


The following code shows how to decode a mesh from a PLY file:
		
```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh, Sphere

# Generate a test file for decoding
FileFormat.PLY.encode(Sphere(), "sphere.ply")
# Decode the file
mesh = pycore.cast(Mesh, FileFormat.PLY.decode("sphere.ply"))

```



### See Also
* module [`aspose.threed.formats`](../../)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`PlyFormat`](/3d/python-net/aspose.threed.formats/plyformat)
* class [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud)
