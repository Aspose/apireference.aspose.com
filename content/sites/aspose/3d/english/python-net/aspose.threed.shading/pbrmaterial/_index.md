---
title: PbrMaterial class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.shading/pbrmaterial/
is_root: false
---

## PbrMaterial class

Material for physically based rendering based on albedo color/metallic/roughness



**Inheritance:** [`PbrMaterial`](/3d/python-net/aspose.threed.shading/pbrmaterial) → 
[`Material`](/3d/python-net/aspose.threed.shading/material) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The PbrMaterial type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.shading/pbrmaterial/__init__/#) | Construct a default PBR material instance |
| [`__init__(self, albedo)`](/3d/python-net/aspose.threed.shading/pbrmaterial/__init__/#aspose.threed.utilities.vector3) | Construct a default PBR material with specified albedo color value. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/pbrmaterial/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/pbrmaterial/properties) | Gets the collection of all properties. |
| [MAP_SPECULAR](/3d/python-net/aspose.threed.shading/pbrmaterial/map_specular) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a specular texture mapping. |
| [MAP_DIFFUSE](/3d/python-net/aspose.threed.shading/pbrmaterial/map_diffuse) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](/3d/python-net/aspose.threed.shading/pbrmaterial/map_emissive) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a emissive texture mapping. |
| [MAP_AMBIENT](/3d/python-net/aspose.threed.shading/pbrmaterial/map_ambient) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a ambient texture mapping. |
| [MAP_NORMAL](/3d/python-net/aspose.threed.shading/pbrmaterial/map_normal) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a normal texture mapping. |
| [transparency](/3d/python-net/aspose.threed.shading/pbrmaterial/transparency) | Gets or sets the transparency factor.<br/>The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent)<br/>Any invalid factor value will be clamped. |
| [normal_texture](/3d/python-net/aspose.threed.shading/pbrmaterial/normal_texture) | Gets or sets the texture of normal mapping |
| [specular_texture](/3d/python-net/aspose.threed.shading/pbrmaterial/specular_texture) | Gets or sets the texture for specular color |
| [albedo_texture](/3d/python-net/aspose.threed.shading/pbrmaterial/albedo_texture) | Gets or sets the texture for albedo |
| [albedo](/3d/python-net/aspose.threed.shading/pbrmaterial/albedo) | Gets or sets the base color of the material |
| [occlusion_texture](/3d/python-net/aspose.threed.shading/pbrmaterial/occlusion_texture) | Gets or sets the texture for ambient occlusion |
| [occlusion_factor](/3d/python-net/aspose.threed.shading/pbrmaterial/occlusion_factor) | Gets or sets the factor of ambient occlusion |
| [metallic_factor](/3d/python-net/aspose.threed.shading/pbrmaterial/metallic_factor) | Gets or sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. |
| [roughness_factor](/3d/python-net/aspose.threed.shading/pbrmaterial/roughness_factor) | Gets or sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth |
| [metallic_roughness](/3d/python-net/aspose.threed.shading/pbrmaterial/metallic_roughness) | Gets or sets the texture for metallic(in R channel) and roughness(in G channel) |
| [emissive_texture](/3d/python-net/aspose.threed.shading/pbrmaterial/emissive_texture) | Gets or sets the texture for emissive |
| [emissive_color](/3d/python-net/aspose.threed.shading/pbrmaterial/emissive_color) | Gets or sets the emissive color |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.shading/pbrmaterial/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.shading/pbrmaterial/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.shading/pbrmaterial/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.shading/pbrmaterial/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.shading/pbrmaterial/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_texture(self, slot_name)`](/3d/python-net/aspose.threed.shading/pbrmaterial/get_texture/#system.string) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [`set_texture(self, slot_name, texture)`](/3d/python-net/aspose.threed.shading/pbrmaterial/set_texture/#system.string-aspose.threed.shading.texturebase) | Sets the texture to specified slot |
| [`from_material(, material)`](/3d/python-net/aspose.threed.shading/pbrmaterial/from_material/#aspose.threed.shading.material) | Allow convert other material to PbrMaterial |



### See Also
* module [`aspose.threed.shading`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Material`](/3d/python-net/aspose.threed.shading/material)
* class [`PbrMaterial`](/3d/python-net/aspose.threed.shading/pbrmaterial)
