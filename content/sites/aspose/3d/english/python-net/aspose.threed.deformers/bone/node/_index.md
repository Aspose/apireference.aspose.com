---
title: node property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 120
url: /python-net/aspose.threed.deformers/bone/node/
is_root: false
---

## node property


Gets or sets the node. The bone node is the bone which skin attached to, the [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) will use bone node to influence the displacement of the control points.
Bone node usually has a [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) attached, but it's not required.
Attached [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) is usually used by DCC software to show skeleton to user.
### Definition:
```python
@property
def node(self):
    ...
@node.setter
def node(self, value):
    ...
```

### See Also
* module [`aspose.threed.deformers`](../../)
* class [`Bone`](/3d/python-net/aspose.threed.deformers/bone)
* class [`Node`](/3d/python-net/aspose.threed/node)
* class [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton)
* class [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer)
