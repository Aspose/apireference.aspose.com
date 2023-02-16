---
title: decode method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.formats/plyformat/decode/
is_root: false
---

## decode(file_name) {#str}





```python
def decode(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str |  |


## decode(stream) {#io.RawIOBase}





```python
def decode(self, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase |  |


## decode(file_name, opt) {#str-PlyLoadOptions}

Decode a point cloud or mesh from the specified stream.


### Returns 


A [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) or [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud) instance


```python
def decode(self, file_name, opt):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | The input stream |
| opt | [`PlyLoadOptions`](/3d/python-net/aspose.threed.formats/plyloadoptions) | The load option of PLY format |


## decode(stream, opt) {#io.RawIOBase-PlyLoadOptions}

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
| opt | [`PlyLoadOptions`](/3d/python-net/aspose.threed.formats/plyloadoptions) | The load option of PLY format |



### See Also
* module [`aspose.threed.formats`](../../)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`PlyFormat`](/3d/python-net/aspose.threed.formats/plyformat)
* class [`PointCloud`](/3d/python-net/aspose.threed.entities/pointcloud)
