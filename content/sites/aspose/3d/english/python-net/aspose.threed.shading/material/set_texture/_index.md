---
title: set_texture method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.shading/material/set_texture/
is_root: false
---

## set_texture(self, slot_name, texture) {#System.String-aspose.threed.shading.TextureBase}

Sets the texture to specified slot



```python

def set_texture(self, slot_name, texture):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| slot_name | System.String | Slot name. |
| texture | aspose.threed.shading.TextureBase | Texture. |

### Example 


```python
from aspose.threed.shading import LambertMaterial, Material, Texture

mat = LambertMaterial()
tex = Texture()
tex.file_name = "diffuse.png"
mat.set_texture(Material.MAP_NORMAL, tex)

```



### See Also
* module [`aspose.threed.shading`](../../)
* class [`Material`](/3d/python-net/aspose.threed.shading/material)
