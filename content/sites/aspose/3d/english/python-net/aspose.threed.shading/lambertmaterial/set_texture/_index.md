---
title: set_texture method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.shading/lambertmaterial/set_texture/
is_root: false
---

## set_texture(self, slot_name, texture) {#str-aspose.threed.shading.TextureBase}

Sets the texture to specified slot



```python

def set_texture(self, slot_name, texture):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| slot_name | str | Slot name. |
| texture | [`TextureBase`](/3d/python-net/aspose.threed.shading/texturebase) | Texture. |

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
* class [`LambertMaterial`](/3d/python-net/aspose.threed.shading/lambertmaterial)
