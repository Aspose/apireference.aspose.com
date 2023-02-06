---
title: PbrSpecularMaterial class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.shading/pbrspecularmaterial/
is_root: false
---

## PbrSpecularMaterial class

Material for physically based rendering based on diffuse color/specular/glossiness



**Inheritance:** [PbrSpecularMaterial](/3d/python-net/aspose.threed.shading/pbrspecularmaterial) → 
[Material](/3d/python-net/aspose.threed.shading/material) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The PbrSpecularMaterial type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [PbrSpecularMaterial()](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/__init__/#) | Constructor of the [PbrSpecularMaterial](/3d/python-net/aspose.threed.shading/pbrspecularmaterial) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/properties) | Gets the collection of all properties. |
| [MAP_SPECULAR](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/map_specular) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a specular texture mapping. |
| [MAP_DIFFUSE](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/map_diffuse) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/map_emissive) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a emissive texture mapping. |
| [MAP_AMBIENT](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/map_ambient) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a ambient texture mapping. |
| [MAP_NORMAL](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/map_normal) | Used in [Material.set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a normal texture mapping. |
| [transparency](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/transparency) | Gets or sets the transparency factor.<br/>The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent)<br/>Any invalid factor value will be clamped. |
| [normal_texture](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/normal_texture) | Gets or sets the texture of normal mapping |
| [specular_glossiness_texture](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/specular_glossiness_texture) | Gets or sets the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness. |
| [glossiness_factor](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/glossiness_factor) | Gets or sets the glossiness(smoothness) of the material, 1 means perfectly smooth and 0 means perfectly rough, default value is 1, range is [0, 1] |
| [specular](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/specular) | Gets or sets the specular color of the material, default value is (1, 1, 1). |
| [diffuse_texture](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/diffuse_texture) | Gets or sets the texture for diffuse |
| [diffuse](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/diffuse) | Gets or sets the diffuse color of the material, default value is (1, 1, 1) |
| [emissive_texture](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/emissive_texture) | Gets or sets the texture for emissive |
| [emissive_color](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/emissive_color) | Gets or sets the emissive color, default value is (0, 0, 0) |
| [MAP_SPECULAR_GLOSSINESS](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/map_specular_glossiness) | The texture map for specular glossiness |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_texture(slot_name)](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/get_texture/#str) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [set_texture(slot_name, texture)](/3d/python-net/aspose.threed.shading/pbrspecularmaterial/set_texture/#str-TextureBase) | Sets the texture to specified slot |



### See Also
* module [aspose.threed.shading](..)
* class [A3DObject](/3d/python-net/aspose.threed/a3dobject)
* class [Material](/3d/python-net/aspose.threed.shading/material)
* class [PbrSpecularMaterial](/3d/python-net/aspose.threed.shading/pbrspecularmaterial)
