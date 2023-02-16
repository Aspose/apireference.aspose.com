---
title: asset_info property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 150
url: /python-net/aspose.threed/scene/asset_info/
is_root: false
---

## asset_info property


Gets or sets the top-level asset information

### Example 


The following code shows how to read the application information from a FBX file:

```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
print(f"The FBX file is created by {scene.asset_info.application_name} {scene.asset_info.application_version}")

```
### Definition:
```python
@property
def asset_info(self):
    ...
@asset_info.setter
def asset_info(self, value):
    ...
```

### See Also
* module [`aspose.threed`](../../)
* class [`AssetInfo`](/3d/python-net/aspose.threed/assetinfo)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
