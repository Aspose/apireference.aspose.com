---
title: Class LambertMaterial
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.LambertMaterial class. Material for lambert shading model
type: docs
weight: 2430
url: /net/aspose.threed.shading/lambertmaterial/
---
## LambertMaterial class

Material for lambert shading model

```csharp
public class LambertMaterial : Material
```

## Constructors

| Name | Description |
| --- | --- |
| [LambertMaterial](lambertmaterial/#constructor)() | Initializes a new instance of the `LambertMaterial` class. |
| [LambertMaterial](lambertmaterial/#constructor_1)(string) | Initializes a new instance of the `LambertMaterial` class. |

## Properties

| Name | Description |
| --- | --- |
| [AmbientColor](../../aspose.threed.shading/lambertmaterial/ambientcolor/) { get; set; } | Gets or sets the ambient color |
| [DiffuseColor](../../aspose.threed.shading/lambertmaterial/diffusecolor/) { get; set; } | Gets or sets the diffuse color |
| [EmissiveColor](../../aspose.threed.shading/lambertmaterial/emissivecolor/) { get; set; } | Gets or sets the emissive color |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Transparency](../../aspose.threed.shading/lambertmaterial/transparency/) { get; set; } | Gets or sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped. |
| [TransparentColor](../../aspose.threed.shading/lambertmaterial/transparentcolor/) { get; set; } | Gets or sets the transparent color. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetEnumerator](../../aspose.threed.shading/material/getenumerator/)() | Gets the enumerator to enumerate internal texture slots. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [GetTexture](../../aspose.threed.shading/material/gettexture/)(string) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |
| [SetTexture](../../aspose.threed.shading/material/settexture/)(string, TextureBase) | Sets the texture to specified slot |
| override [ToString](../../aspose.threed.shading/material/tostring/)() | Formats object to string |

### See Also

* class [Material](../material/)
* namespace [Aspose.ThreeD.Shading](../../aspose.threed.shading/)
* assembly [Aspose.3D](../../)


