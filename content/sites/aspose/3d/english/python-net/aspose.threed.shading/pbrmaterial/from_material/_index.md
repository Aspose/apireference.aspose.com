---
title: from_material method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.shading/pbrmaterial/from_material/
is_root: false
---

## from_material(material) {#Material}

Allow convert other material to PbrMaterial


### Returns 





```python
def from_material(self, material):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| material | [Material](/3d/python-net/aspose.threed.shading/material) |  |

### Example 


```python
from aspose.threed.shading import LambertMaterial, Material, PbrMaterial, Texture
from aspose.threed.utilities import Vector3

mat = LambertMaterial()
tex = Texture()
tex.file_name = "diffuse.png"
mat.set_texture(Material.MAP_DIFFUSE, tex)
mat.diffuse_color = Vector3(0.3, 0.9, 0.4)
pbr = PbrMaterial.from_material(mat)

```



### See Also
* module [aspose.threed.shading](../../)
* class [PbrMaterial](/3d/python-net/aspose.threed.shading/pbrmaterial)
