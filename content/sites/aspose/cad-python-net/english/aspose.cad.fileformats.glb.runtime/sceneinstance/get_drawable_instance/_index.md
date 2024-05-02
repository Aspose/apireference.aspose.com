---
title: get_drawable_instance method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.cad.fileformats.glb.runtime/sceneinstance/get_drawable_instance/
is_root: false
---

## get_drawable_instance {#int}

Gets a [`DrawableInstance`](/cad/python-net/aspose.cad.fileformats.glb.runtime/drawableinstance) object, where:
- Name is the name of this drawable instance. Originally, it was the name of [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node).
- MeshIndex is the logical Index of a [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh) in [`GlbData.logical_meshes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_meshes).
- Transform is an [`IGeometryTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/igeometrytransform) that can be used to transform the [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh) into world space.


### Returns 


[`DrawableInstance`](/cad/python-net/aspose.cad.fileformats.glb.runtime/drawableinstance) object.


```python
def get_drawable_instance(self, index):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | The index of the drawable reference, from 0 to [`SceneInstance.DrawableInstancesCount`](/cad/python-net/aspose.cad.fileformats.glb.runtime/sceneinstance) |



### See Also
* module [`aspose.cad.fileformats.glb.runtime`](../../)
* class [`DrawableInstance`](/cad/python-net/aspose.cad.fileformats.glb.runtime/drawableinstance)
* class [`IGeometryTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/igeometrytransform)
* class [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh)
* class [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node)
* class [`SceneInstance`](/cad/python-net/aspose.cad.fileformats.glb.runtime/sceneinstance)
