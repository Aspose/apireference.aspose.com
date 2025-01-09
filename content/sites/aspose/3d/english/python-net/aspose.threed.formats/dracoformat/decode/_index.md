---
title: decode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /aspose.threed.formats/dracoformat/decode/
is_root: false
---

## decode {#str}

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




## decode {#bytes}

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





### See Also
* module [`aspose.threed.formats`](../../)
* class [`DracoFormat`](/3d/python-net/aspose.threed.formats/dracoformat)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`ImportException`](/3d/python-net/aspose.threed/importexception)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud)
