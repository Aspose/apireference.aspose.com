---
title: transform_matrix property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed/globaltransform/transform_matrix/
is_root: false
---

## transform_matrix property


Gets the transform matrix.

### Example 


```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
tr = scene.root_node.global_transform
print(f"Matrix = {tr.transform_matrix}")

```

### See Also
* module [aspose.threed](../../)
* class [GlobalTransform](/3d/python-net/aspose.threed/globaltransform)
