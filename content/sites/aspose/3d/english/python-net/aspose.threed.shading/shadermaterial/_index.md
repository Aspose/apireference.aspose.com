---
title: ShaderMaterial class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.shading/shadermaterial/
is_root: false
---

## ShaderMaterial class

A shader material allows to describe the material by external rendering engine or shader language.
[`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) uses [`ShaderTechnique`](/3d/python-net/aspose.threed.shading/shadertechnique) to describe the concrete rendering details, 
and the most suitable one will be used according to the final rendering platform.
For example, your [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) instance can have two technique, one is defined by HLSL, and another is defined by GLSL
Under non-window platform the GLSL should be used instead of HLSL



**Inheritance:** [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) → 
[`Material`](/3d/python-net/aspose.threed.shading/material) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The ShaderMaterial type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.shading/shadermaterial/__init__/#) | Initializes a new instance of the [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) class. |
| [__init__](/3d/python-net/aspose.threed.shading/shadermaterial/__init__/#str) | Initializes a new instance of the [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.shading/shadermaterial/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.shading/shadermaterial/properties) | Gets the collection of all properties. |
| [MAP_SPECULAR](/3d/python-net/aspose.threed.shading/shadermaterial/map_specular) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a specular texture mapping. |
| [MAP_DIFFUSE](/3d/python-net/aspose.threed.shading/shadermaterial/map_diffuse) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a diffuse texture mapping. |
| [MAP_EMISSIVE](/3d/python-net/aspose.threed.shading/shadermaterial/map_emissive) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a emissive texture mapping. |
| [MAP_AMBIENT](/3d/python-net/aspose.threed.shading/shadermaterial/map_ambient) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a ambient texture mapping. |
| [MAP_NORMAL](/3d/python-net/aspose.threed.shading/shadermaterial/map_normal) | Used in [`Material.set_texture`](/3d/python-net/aspose.threed.shading/material/set_texture) to assign a normal texture mapping. |
| [techniques](/3d/python-net/aspose.threed.shading/shadermaterial/techniques) | Gets all available techniques defined in this material. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.shading/shadermaterial/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.shading/shadermaterial/remove_property/#str) | Remove the specified property identified by name |
| [get_property](/3d/python-net/aspose.threed.shading/shadermaterial/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.shading/shadermaterial/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.shading/shadermaterial/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_texture](/3d/python-net/aspose.threed.shading/shadermaterial/get_texture/#str) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [set_texture](/3d/python-net/aspose.threed.shading/shadermaterial/set_texture/#str-aspose.threed.shading.TextureBase) | Sets the texture to specified slot |



### See Also
* module [`aspose.threed.shading`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Material`](/3d/python-net/aspose.threed.shading/material)
* class [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial)
* class [`ShaderTechnique`](/3d/python-net/aspose.threed.shading/shadertechnique)
