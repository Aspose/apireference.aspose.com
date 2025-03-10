---
title: get_texture method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.shading/pbrspecularmaterial/get_texture/
is_root: false
---

## get_texture(self, slot_name) {#str}

Gets the texture from the specified slot, it can be material's property name or shader's parameter name


### Returns 


The texture.


```python

def get_texture(self, slot_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| slot_name | str | Slot name. |

### Example 


```python
from aspose import pycore
from aspose.threed.shading import LambertMaterial, Material, Texture

mat = LambertMaterial()
tex = Texture()
tex.file_name = "diffuse.png"
mat.set_texture(Material.MAP_DIFFUSE, tex)
tex = pycore.cast(Texture, mat.get_texture(Material.MAP_DIFFUSE))

```



### See Also
* module [`aspose.threed.shading`](../../)
* class [`PbrSpecularMaterial`](/3d/python-net/aspose.threed.shading/pbrspecularmaterial)
