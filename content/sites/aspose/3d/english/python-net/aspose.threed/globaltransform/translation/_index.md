---
title: translation property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed/globaltransform/translation/
is_root: false
---

## translation property


Gets the translation

### Example 


```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
tr = scene.root_node.global_transform
print(f"Translation = {tr.translation}")

```
### Definition:
```python
@property
def translation(self):
    ...
```

### See Also
* module [aspose.threed](../../)
* class [GlobalTransform](/3d/python-net/aspose.threed/globaltransform)
* class [Vector3](/3d/python-net/aspose.threed.utilities/vector3)
