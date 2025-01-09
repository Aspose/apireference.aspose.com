---
title: Class PbrMaterial
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.PbrMaterial class. Material for physically based rendering based on albedo color/metallic/roughness
type: docs
weight: 2450
url: /net/aspose.threed.shading/pbrmaterial/
---
## PbrMaterial class

Material for physically based rendering based on albedo color/metallic/roughness

```csharp
public class PbrMaterial : Material
```

## Constructors

| Name | Description |
| --- | --- |
| [PbrMaterial](pbrmaterial/#constructor)() | Construct a default PBR material instance |
| [PbrMaterial](pbrmaterial/#constructor_1)(Vector3) | Construct a default PBR material with specified albedo color value. |

## Properties

| Name | Description |
| --- | --- |
| [Albedo](../../aspose.threed.shading/pbrmaterial/albedo/) { get; set; } | Gets or sets the base color of the material |
| [AlbedoTexture](../../aspose.threed.shading/pbrmaterial/albedotexture/) { get; set; } | Gets or sets the texture for albedo |
| [EmissiveColor](../../aspose.threed.shading/pbrmaterial/emissivecolor/) { get; set; } | Gets or sets the emissive color |
| [EmissiveTexture](../../aspose.threed.shading/pbrmaterial/emissivetexture/) { get; set; } | Gets or sets the texture for emissive |
| [MetallicFactor](../../aspose.threed.shading/pbrmaterial/metallicfactor/) { get; set; } | Gets or sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. |
| [MetallicRoughness](../../aspose.threed.shading/pbrmaterial/metallicroughness/) { get; set; } | Gets or sets the texture for metallic(in R channel) and roughness(in G channel) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [NormalTexture](../../aspose.threed.shading/pbrmaterial/normaltexture/) { get; set; } | Gets or sets the texture of normal mapping |
| [OcclusionFactor](../../aspose.threed.shading/pbrmaterial/occlusionfactor/) { get; set; } | Gets or sets the factor of ambient occlusion |
| [OcclusionTexture](../../aspose.threed.shading/pbrmaterial/occlusiontexture/) { get; set; } | Gets or sets the texture for ambient occlusion |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RoughnessFactor](../../aspose.threed.shading/pbrmaterial/roughnessfactor/) { get; set; } | Gets or sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth |
| [SpecularTexture](../../aspose.threed.shading/pbrmaterial/speculartexture/) { get; set; } | Gets or sets the texture for specular color |
| [Transparency](../../aspose.threed.shading/pbrmaterial/transparency/) { get; set; } | Gets or sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped. |

## Methods

| Name | Description |
| --- | --- |
| static [FromMaterial](../../aspose.threed.shading/pbrmaterial/frommaterial/)(Material) | Allow convert other material to PbrMaterial |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetEnumerator](../../aspose.threed.shading/material/getenumerator/)() | Gets the enumerator to enumerate internal texture slots.(Inherited from [`Material`](../material/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetTexture](../../aspose.threed.shading/material/gettexture/)(string) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name(Inherited from [`Material`](../material/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetTexture](../../aspose.threed.shading/material/settexture/)(string, TextureBase) | Sets the texture to specified slot(Inherited from [`Material`](../material/).) |
| override [ToString](../../aspose.threed.shading/material/tostring/)() | Formats object to string(Inherited from [`Material`](../material/).) |

### See Also

* class [Material](../material/)
* namespace [Aspose.ThreeD.Shading](../../aspose.threed.shading/)
* assembly [Aspose.3D](../../)
* [Tutorial - Create a sphere with a PBR-based material](https://products.aspose.com/3d/tutorial/create-sphere-material/)


