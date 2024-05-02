---
title: gpu_mesh_instancing_min_count property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/gpu_mesh_instancing_min_count/
is_root: false
---

## gpu_mesh_instancing_min_count property


determines the mínimum number mesh instances required to enable Gpu mesh instancing.

### Remarks 


Set to MaxValue to disable gpu instancing.




If set to a small value like 10, any mesh instance collection smaller than this will be instantiated
using individual nodes, otherwise it will use Gpu Instancing extension.
### Definition:
```python
@property
def gpu_mesh_instancing_min_count(self):
    ...
@gpu_mesh_instancing_min_count.setter
def gpu_mesh_instancing_min_count(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.glb.scenes`](../../)
* class [`SceneBuilderSchema2Settings`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings)
