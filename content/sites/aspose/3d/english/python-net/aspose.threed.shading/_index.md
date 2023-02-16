---
title: aspose.threed.shading
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.shading/
is_root: false
---

All shading related classes are defined in this namespace.

### Classes
| Class | Description |
| :- | :- |
| [`LambertMaterial`](/3d/python-net/aspose.threed.shading/lambertmaterial) | Material for lambert shading model |
| [`Material`](/3d/python-net/aspose.threed.shading/material) | Material defines the parameters necessary for visual appearance of geometry.<br/>Aspose.3D provides shading model for [`LambertMaterial`](/3d/python-net/aspose.threed.shading/lambertmaterial), [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial) and [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) |
| [`PbrMaterial`](/3d/python-net/aspose.threed.shading/pbrmaterial) | Material for physically based rendering based on albedo color/metallic/roughness |
| [`PbrSpecularMaterial`](/3d/python-net/aspose.threed.shading/pbrspecularmaterial) | Material for physically based rendering based on diffuse color/specular/glossiness |
| [`PhongMaterial`](/3d/python-net/aspose.threed.shading/phongmaterial) | Material for blinn-phong shading model. |
| [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) | A shader material allows to describe the material by external rendering engine or shader language.<br/>[`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) uses [`ShaderTechnique`](/3d/python-net/aspose.threed.shading/shadertechnique) to describe the concrete rendering details, <br/>and the most suitable one will be used according to the final rendering platform.<br/>For example, your [`ShaderMaterial`](/3d/python-net/aspose.threed.shading/shadermaterial) instance can have two technique, one is defined by HLSL, and another is defined by GLSL<br/>Under non-window platform the GLSL should be used instead of HLSL |
| [`ShaderTechnique`](/3d/python-net/aspose.threed.shading/shadertechnique) | A shader technique represents a concrete rendering implementation. |
| [`Texture`](/3d/python-net/aspose.threed.shading/texture) | This class defines the texture from an external file. |
| [`TextureBase`](/3d/python-net/aspose.threed.shading/texturebase) | Base class for all concrete textures.<br/>Texture defines the look and feel of a geometry surface. |
| [`TextureSlot`](/3d/python-net/aspose.threed.shading/textureslot) | Texture slot in [`Material`](/3d/python-net/aspose.threed.shading/material), can be enumerated through material instance. |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`AlphaSource`](/3d/python-net/aspose.threed.shading/alphasource) | Defines whether the texture contains the alpha channel. |
| [`RenderingAPI`](/3d/python-net/aspose.threed.shading/renderingapi) | Commonly used rendering APIs |
| [`ShadingLanguage`](/3d/python-net/aspose.threed.shading/shadinglanguage) | Commonly used shading languages |
| [`TextureFilter`](/3d/python-net/aspose.threed.shading/texturefilter) | Filter options during texture sampling. |
| [`WrapMode`](/3d/python-net/aspose.threed.shading/wrapmode) | Texture's wrap mode. |


