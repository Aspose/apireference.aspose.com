---
title: Class Texture
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.Texture class. This class defines the texture from an external file
type: docs
weight: 2500
url: /net/aspose.threed.shading/texture/
---
## Texture class

This class defines the texture from an external file.

```csharp
public class Texture : TextureBase
```

## Constructors

| Name | Description |
| --- | --- |
| [Texture](texture/#constructor)() | Initializes a new instance of the `Texture` class. |
| [Texture](texture/#constructor_1)(string) | Initializes a new instance of the `Texture` class. |

## Properties

| Name | Description |
| --- | --- |
| [Alpha](../../aspose.threed.shading/texturebase/alpha/) { get; set; } | Gets or sets the default alpha value of the texture This is valid when the [`AlphaSource`](../texturebase/alphasource/) is PixelAlpha Default value is 1.0, valid value range is between 0 and 1 |
| [AlphaSource](../../aspose.threed.shading/texturebase/alphasource/) { get; set; } | Gets or sets whether the texture defines the alpha channel. Default value is None |
| [Content](../../aspose.threed.shading/texture/content/) { get; set; } | Gets or sets the binary content of the texture. The embedded texture content is optional, user should load texture from external file if this is missing. |
| [EnableMipMap](../../aspose.threed.shading/texture/enablemipmap/) { get; set; } | Gets or sets if the mipmap is enabled for this texture |
| [FileName](../../aspose.threed.shading/texture/filename/) { get; set; } | Gets or sets the associated texture file. |
| [MagFilter](../../aspose.threed.shading/texturebase/magfilter/) { get; set; } | Gets or sets the filter for magnification. |
| [MinFilter](../../aspose.threed.shading/texturebase/minfilter/) { get; set; } | Gets or sets the filter for minification. |
| [MipFilter](../../aspose.threed.shading/texturebase/mipfilter/) { get; set; } | Gets or sets the filter for mip-level sampling. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [UVRotation](../../aspose.threed.shading/texturebase/uvrotation/) { get; set; } | Gets or sets the rotation of the texture |
| [UVScale](../../aspose.threed.shading/texturebase/uvscale/) { get; set; } | Gets or sets the UV scale. |
| [UVTranslation](../../aspose.threed.shading/texturebase/uvtranslation/) { get; set; } | Gets or sets the UV translation. |
| [WrapModeU](../../aspose.threed.shading/texturebase/wrapmodeu/) { get; set; } | Gets or sets the texture wrap modes in U. |
| [WrapModeV](../../aspose.threed.shading/texturebase/wrapmodev/) { get; set; } | Gets or sets the texture wrap modes in V. |
| [WrapModeW](../../aspose.threed.shading/texturebase/wrapmodew/) { get; set; } | Gets or sets the texture wrap modes in W. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |
| [SetRotation](../../aspose.threed.shading/texturebase/setrotation/)(double, double) | Sets the UV rotation. |
| [SetScale](../../aspose.threed.shading/texturebase/setscale/)(double, double) | Sets the UV scale. |
| [SetTranslation](../../aspose.threed.shading/texturebase/settranslation/)(double, double) | Sets the UV translation. |

### See Also

* class [TextureBase](../texturebase/)
* namespace [Aspose.ThreeD.Shading](../../aspose.threed.shading/)
* assembly [Aspose.3D](../../)


