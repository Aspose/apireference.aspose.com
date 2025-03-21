﻿---
title: PhongMaterial class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed.shading/phongmaterial/
is_root: false
---

## PhongMaterial class

Material for blinn-phong shading model.



**Inheritance:** [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial) → 
[`LambertMaterial`](/3d/python-net/aspose.threed.shading/lambertmaterial) → 
[`Material`](/3d/python-net/aspose.threed.shading/material) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The PhongMaterial type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.shading/phongmaterial/__init__/#) | Initializes a new instance of the [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial) class. |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.shading/phongmaterial/__init__/#str) | Initializes a new instance of the [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/phongmaterial/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/phongmaterial/properties) | Gets the collection of all properties. |
| [MAP_SPECULAR](/3d/python-net/aspose.threed.shading/phongmaterial/map_specular) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a specular texture mapping. |
| [MAP_DIFFUSE](/3d/python-net/aspose.threed.shading/phongmaterial/map_diffuse) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](/3d/python-net/aspose.threed.shading/phongmaterial/map_emissive) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a emissive texture mapping. |
| [MAP_AMBIENT](/3d/python-net/aspose.threed.shading/phongmaterial/map_ambient) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a ambient texture mapping. |
| [MAP_NORMAL](/3d/python-net/aspose.threed.shading/phongmaterial/map_normal) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a normal texture mapping. |
| [emissive_color](/3d/python-net/aspose.threed.shading/phongmaterial/emissive_color) | Gets or sets the emissive color |
| [ambient_color](/3d/python-net/aspose.threed.shading/phongmaterial/ambient_color) | Gets or sets the ambient color |
| [diffuse_color](/3d/python-net/aspose.threed.shading/phongmaterial/diffuse_color) | Gets or sets the diffuse color |
| [transparent_color](/3d/python-net/aspose.threed.shading/phongmaterial/transparent_color) | Gets or sets the transparent color. |
| [transparency](/3d/python-net/aspose.threed.shading/phongmaterial/transparency) | Gets or sets the transparency factor.<br/>The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent)<br/>Any invalid factor value will be clamped. |
| [specular_color](/3d/python-net/aspose.threed.shading/phongmaterial/specular_color) | Gets or sets the specular color. |
| [specular_factor](/3d/python-net/aspose.threed.shading/phongmaterial/specular_factor) | Gets or sets the specular factor. <br/>The formula of specular:<br/>SpecularColor * SpecularFactor * (N dot H) ^ Shininess |
| [shininess](/3d/python-net/aspose.threed.shading/phongmaterial/shininess) | Gets or sets the shininess, this controls the specular highlight's size.<br/>The formula of specular:<br/>SpecularColor * SpecularFactor * (N dot H) ^ Shininess |
| [reflection_color](/3d/python-net/aspose.threed.shading/phongmaterial/reflection_color) | Gets or sets the reflection color. |
| [reflection_factor](/3d/python-net/aspose.threed.shading/phongmaterial/reflection_factor) | Gets or sets the attenuation of the reflection color. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.shading/phongmaterial/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.shading/phongmaterial/remove_property/#str) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.shading/phongmaterial/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.shading/phongmaterial/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.shading/phongmaterial/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_texture(self, slot_name)`](/3d/python-net/aspose.threed.shading/phongmaterial/get_texture/#str) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [`set_texture(self, slot_name, texture)`](/3d/python-net/aspose.threed.shading/phongmaterial/set_texture/#str-aspose.threed.shading.texturebase) | Sets the texture to specified slot |



### See Also
* module [`aspose.threed.shading`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`LambertMaterial`](/3d/python-net/aspose.threed.shading/lambertmaterial)
* class [`Material`](/3d/python-net/aspose.threed.shading/material)
* class [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial)
