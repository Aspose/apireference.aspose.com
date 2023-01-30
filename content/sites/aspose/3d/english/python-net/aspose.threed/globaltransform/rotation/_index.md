---
title: rotation property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed/globaltransform/rotation/
is_root: false
---

## rotation property


Gets the rotation represented in quaternion.

### Example 


```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
tr = scene.root_node.global_transform
print(f"Rotation = {tr.rotation}")

```

### See Also
* module [aspose.threed](../../)
* class [GlobalTransform](/3d/python-net/aspose.threed/globaltransform)
