---
title: TextureSlot class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.threed.shading/textureslot/
is_root: false
---

## TextureSlot class

Texture slot in [Material](/3d/python-net/aspose.threed.shading/material), can be enumerated through material instance.



The TextureSlot type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [slot_name](/3d/python-net/aspose.threed.shading/textureslot/slot_name) | The slot name that indicates where this texture will be bounded to. |
| [texture](/3d/python-net/aspose.threed.shading/textureslot/texture) | The texture that will be bounded to the material. |



### Example 


```python
from aspose.threed.shading import LambertMaterial, Material, Texture

mat = LambertMaterial()
tex = Texture()
tex.file_name = "diffuse.png"
mat.set_texture(Material.MAP_DIFFUSE, tex)
for slot in mat:
    print(f"Texture slot {slot.slot_name} = {slot.texture}")



```
### See Also

* module [aspose.threed.shading](../)
