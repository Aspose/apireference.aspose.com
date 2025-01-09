---
title: Class ShaderMaterial
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.ShaderMaterial class. A shader material allows to describe the material by external rendering engine or shader language. ShaderMaterial uses ShaderTechnique to describe the concrete rendering details and the most suitable one will be used according to the final rendering platform. For example your ShaderMaterial instance can have two technique one is defined by HLSL and another is defined by GLSL Under nonwindow platform the GLSL should be used instead of HLSL
type: docs
weight: 2480
url: /net/aspose.threed.shading/shadermaterial/
---
## ShaderMaterial class

A shader material allows to describe the material by external rendering engine or shader language. `ShaderMaterial` uses [`ShaderTechnique`](../shadertechnique/) to describe the concrete rendering details, and the most suitable one will be used according to the final rendering platform. For example, your `ShaderMaterial` instance can have two technique, one is defined by HLSL, and another is defined by GLSL Under non-window platform the GLSL should be used instead of HLSL

```csharp
public class ShaderMaterial : Material
```

## Constructors

| Name | Description |
| --- | --- |
| [ShaderMaterial](shadermaterial/#constructor)() | Initializes a new instance of the `ShaderMaterial` class. |
| [ShaderMaterial](shadermaterial/#constructor_1)(string) | Initializes a new instance of the `ShaderMaterial` class. |

## Properties

| Name | Description |
| --- | --- |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Techniques](../../aspose.threed.shading/shadermaterial/techniques/) { get; } | Gets all available techniques defined in this material. |

## Methods

| Name | Description |
| --- | --- |
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


