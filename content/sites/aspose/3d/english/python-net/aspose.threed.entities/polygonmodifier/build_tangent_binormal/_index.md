---
title: build_tangent_binormal method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.entities/polygonmodifier/build_tangent_binormal/
is_root: false
---

## build_tangent_binormal(, scene) {#aspose.threed.Scene}

This will create tangent and binormal on all meshes of the scene
Normal is required, if normal is not existing on the mesh, it will also create the normal data from position.
UV is also required, the mesh will be ignored if no UV is defined.



```python

@staticmethod
def build_tangent_binormal(scene):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | aspose.threed.Scene |  |


## build_tangent_binormal(, mesh) {#aspose.threed.entities.Mesh}

This will create tangent and binormal on the mesh
Normal is required, if normal is not existing on the mesh, it will also create the normal data from position.
UV is also required, an exception will be raised if no UV found.



```python

@staticmethod
def build_tangent_binormal(mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | aspose.threed.entities.Mesh |  |



### See Also
* module [`aspose.threed.entities`](../../)
* class [`PolygonModifier`](/3d/python-net/aspose.threed.entities/polygonmodifier)
