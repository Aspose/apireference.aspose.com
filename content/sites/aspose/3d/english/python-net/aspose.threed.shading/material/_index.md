---
title: Material class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.shading/material/
is_root: false
---

## Material class

Material defines the parameters necessary for visual appearance of geometry.
Aspose.3D provides shading model for [`LambertMaterial`](/3d/python-net/aspose.threed.shading/lambertmaterial), [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial) and [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial)



**Inheritance:** [`Material`](/3d/python-net/aspose.threed.shading/material) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Material type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/material/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/material/properties) | Gets the collection of all properties. |
| [MAP_SPECULAR](/3d/python-net/aspose.threed.shading/material/map_specular) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a specular texture mapping. |
| [MAP_DIFFUSE](/3d/python-net/aspose.threed.shading/material/map_diffuse) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](/3d/python-net/aspose.threed.shading/material/map_emissive) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a emissive texture mapping. |
| [MAP_AMBIENT](/3d/python-net/aspose.threed.shading/material/map_ambient) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a ambient texture mapping. |
| [MAP_NORMAL](/3d/python-net/aspose.threed.shading/material/map_normal) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a normal texture mapping. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.shading/material/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.shading/material/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.shading/material/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.shading/material/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.shading/material/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_texture(self, slot_name)`](/3d/python-net/aspose.threed.shading/material/get_texture/#system.string) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [`set_texture(self, slot_name, texture)`](/3d/python-net/aspose.threed.shading/material/set_texture/#system.string-aspose.threed.shading.texturebase) | Sets the texture to specified slot |



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
* module [`aspose.threed.shading`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`LambertMaterial`](/3d/python-net/aspose.threed.shading/lambertmaterial)
* class [`Material`](/3d/python-net/aspose.threed.shading/material)
* class [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial)
* class [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial)
