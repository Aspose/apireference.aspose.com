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
Aspose.3D provides shading model for [LambertMaterial](/3d/python-net/aspose.threed.shading/lambertmaterial), [PhongMaterial](/3d/python-net/aspose.threed.shading/phongmaterial) and [ShaderMaterial](/3d/python-net/aspose.threed.shading/shadermaterial)



**Inheritance:** [Material](/3d/python-net/aspose.threed.shading/material) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The Material type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/material/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/material/properties) | Gets the collection of all properties. |
| [MAP_SPECULAR](/3d/python-net/aspose.threed.shading/material/map_specular) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a specular texture mapping. |
| [MAP_DIFFUSE](/3d/python-net/aspose.threed.shading/material/map_diffuse) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](/3d/python-net/aspose.threed.shading/material/map_emissive) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a emissive texture mapping. |
| [MAP_AMBIENT](/3d/python-net/aspose.threed.shading/material/map_ambient) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a ambient texture mapping. |
| [MAP_NORMAL](/3d/python-net/aspose.threed.shading/material/map_normal) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a normal texture mapping. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.shading/material/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.shading/material/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.shading/material/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.shading/material/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.shading/material/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_texture(slot_name)](/3d/python-net/aspose.threed.shading/material/get_texture/#str) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture/#str-TextureBase) | Sets the texture to specified slot |



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
* module [aspose.threed.shading](..)
* class [A3DObject](/3d/python-net/aspose.threed/a3dobject)
* class [LambertMaterial](/3d/python-net/aspose.threed.shading/lambertmaterial)
* class [Material](/3d/python-net/aspose.threed.shading/material)
* class [PhongMaterial](/3d/python-net/aspose.threed.shading/phongmaterial)
* class [ShaderMaterial](/3d/python-net/aspose.threed.shading/shadermaterial)
