---
title: euler_angles property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed/globaltransform/euler_angles/
is_root: false
---

## euler_angles property


Gets the rotation represented in Euler angles, measured in degree

### Example 


```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
tr = scene.root_node.global_transform
print(f"EulerAngles = {tr.euler_angles}")

```
### Definition:
```python
@property
def euler_angles(self):
    ...
```

### See Also
* module [aspose.threed](../../)
* class [GlobalTransform](/3d/python-net/aspose.threed/globaltransform)
* class [Vector3](/3d/python-net/aspose.threed.utilities/vector3)
