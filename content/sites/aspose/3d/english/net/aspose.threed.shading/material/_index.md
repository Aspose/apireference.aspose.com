---
title: Class Material
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.Material class. Material defines the parameters necessary for visual appearance of geometry. Aspose.3D provides shading model for LambertMaterial PhongMaterial and ShaderMaterial
type: docs
weight: 2540
url: /net/aspose.threed.shading/material/
---
## Material class

Material defines the parameters necessary for visual appearance of geometry. Aspose.3D provides shading model for [`LambertMaterial`](../lambertmaterial/), [`PhongMaterial`](../phongmaterial/) and [`ShaderMaterial`](../shadermaterial/)

```csharp
public abstract class Material : A3DObject, IEnumerable<TextureSlot>
```

## Properties

| Name | Description |
| --- | --- |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |

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

## Fields

| Name | Description |
| --- | --- |
| const [MapAmbient](../../aspose.threed.shading/material/mapambient/) | Used in [`SetTexture`](./settexture/) to assign a ambient texture mapping. |
| const [MapDiffuse](../../aspose.threed.shading/material/mapdiffuse/) | Used in [`SetTexture`](./settexture/) to assign a diffuse texture mapping. |
| const [MapEmissive](../../aspose.threed.shading/material/mapemissive/) | Used in [`SetTexture`](./settexture/) to assign a emissive texture mapping. |
| const [MapNormal](../../aspose.threed.shading/material/mapnormal/) | Used in [`SetTexture`](./settexture/) to assign a normal texture mapping. |
| const [MapSpecular](../../aspose.threed.shading/material/mapspecular/) | Used in [`SetTexture`](./settexture/) to assign a specular texture mapping. |

## Examples

```csharp
var mat = new LambertMaterial();
var tex = new Texture();
tex.FileName = "diffuse.png";
mat.SetTexture(Material.MapDiffuse, tex);
foreach(var slot in mat)
{
    Console.WriteLine($"Texture slot {slot.SlotName} = {slot.Texture}");
}
```

### See Also

* class [A3DObject](../../aspose.threed/a3dobject/)
* class [TextureSlot](../textureslot/)
* namespace [Aspose.ThreeD.Shading](../../aspose.threed.shading/)
* assembly [Aspose.3D](../../)


