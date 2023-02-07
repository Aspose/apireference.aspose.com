---
title: scale property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed/globaltransform/scale/
is_root: false
---

## scale property


Gets the scale

### Example 


```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
tr = scene.root_node.global_transform
print(f"Scale = {tr.scale}")

```
### Definition:
```python
@property
def scale(self):
    ...
```

### See Also
* module [aspose.threed](../../)
* class [GlobalTransform](/3d/python-net/aspose.threed/globaltransform)
* class [Vector3](/3d/python-net/aspose.threed.utilities/vector3)
