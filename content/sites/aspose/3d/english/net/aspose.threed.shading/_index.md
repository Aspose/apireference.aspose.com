---
title: Aspose.ThreeD.Shading
second_title: Aspose.3D for .NET API Reference
description: All shading related classes are defined in this namespace
type: docs
weight: 90
url: /net/aspose.threed.shading/
---
All shading related classes are defined in this namespace.

## Classes

| Class | Description |
| --- | --- |
| [LambertMaterial](./lambertmaterial/) | Material for lambert shading model |
| [Material](./material/) | Material defines the parameters necessary for visual appearance of geometry. Aspose.3D provides shading model for [`LambertMaterial`](../aspose.threed.shading/lambertmaterial/), [`PhongMaterial`](../aspose.threed.shading/phongmaterial/) and [`ShaderMaterial`](../aspose.threed.shading/shadermaterial/) |
| [PbrMaterial](./pbrmaterial/) | Material for physically based rendering based on albedo color/metallic/roughness |
| [PbrSpecularMaterial](./pbrspecularmaterial/) | Material for physically based rendering based on diffuse color/specular/glossiness |
| [PhongMaterial](./phongmaterial/) | Material for blinn-phong shading model. |
| [ShaderMaterial](./shadermaterial/) | A shader material allows to describe the material by external rendering engine or shader language. [`ShaderMaterial`](../aspose.threed.shading/shadermaterial/) uses [`ShaderTechnique`](../aspose.threed.shading/shadertechnique/) to describe the concrete rendering details, and the most suitable one will be used according to the final rendering platform. For example, your [`ShaderMaterial`](../aspose.threed.shading/shadermaterial/) instance can have two technique, one is defined by HLSL, and another is defined by GLSL Under non-window platform the GLSL should be used instead of HLSL |
| [ShaderTechnique](./shadertechnique/) | A shader technique represents a concrete rendering implementation. |
| [Texture](./texture/) | This class defines the texture from an external file. |
| [TextureBase](./texturebase/) | Base class for all concrete textures. Texture defines the look and feel of a geometry surface. |
| [TextureSlot](./textureslot/) | Texture slot in [`Material`](../aspose.threed.shading/material/), can be enumerated through material instance. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [AlphaSource](./alphasource/) | Defines whether the texture contains the alpha channel. |
| [TextureFilter](./texturefilter/) | Filter options during texture sampling. |
| [WrapMode](./wrapmode/) | Texture's wrap mode. |


