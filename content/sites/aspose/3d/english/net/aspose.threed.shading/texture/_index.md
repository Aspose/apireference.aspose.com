---
title: Class Texture
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Shading.Texture class. This class defines the texture from an external file
type: docs
weight: 380
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
| [Alpha](../../aspose.threed.shading/texturebase/alpha/) { get; set; } | Gets or sets the default alpha value of the texture This is valid when the [`AlphaSource`](../texturebase/alphasource/) is PixelAlpha Default value is 1.0, valid value range is between 0 and 1(Inherited from [`TextureBase`](../texturebase/).) |
| [AlphaSource](../../aspose.threed.shading/texturebase/alphasource/) { get; set; } | Gets or sets whether the texture defines the alpha channel. Default value is None(Inherited from [`TextureBase`](../texturebase/).) |
| [Content](../../aspose.threed.shading/texture/content/) { get; set; } | Gets or sets the binary content of the texture. The embedded texture content is optional, user should load texture from external file if this is missing. |
| [EnableMipMap](../../aspose.threed.shading/texture/enablemipmap/) { get; set; } | Gets or sets if the mipmap is enabled for this texture |
| [FileName](../../aspose.threed.shading/texture/filename/) { get; set; } | Gets or sets the associated texture file. |
| [MagFilter](../../aspose.threed.shading/texturebase/magfilter/) { get; set; } | Gets or sets the filter for magnification.(Inherited from [`TextureBase`](../texturebase/).) |
| [MinFilter](../../aspose.threed.shading/texturebase/minfilter/) { get; set; } | Gets or sets the filter for minification.(Inherited from [`TextureBase`](../texturebase/).) |
| [MipFilter](../../aspose.threed.shading/texturebase/mipfilter/) { get; set; } | Gets or sets the filter for mip-level sampling.(Inherited from [`TextureBase`](../texturebase/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [UVRotation](../../aspose.threed.shading/texturebase/uvrotation/) { get; set; } | Gets or sets the rotation of the texture(Inherited from [`TextureBase`](../texturebase/).) |
| [UVScale](../../aspose.threed.shading/texturebase/uvscale/) { get; set; } | Gets or sets the UV scale.(Inherited from [`TextureBase`](../texturebase/).) |
| [UVTranslation](../../aspose.threed.shading/texturebase/uvtranslation/) { get; set; } | Gets or sets the UV translation.(Inherited from [`TextureBase`](../texturebase/).) |
| [WrapModeU](../../aspose.threed.shading/texturebase/wrapmodeu/) { get; set; } | Gets or sets the texture wrap modes in U.(Inherited from [`TextureBase`](../texturebase/).) |
| [WrapModeV](../../aspose.threed.shading/texturebase/wrapmodev/) { get; set; } | Gets or sets the texture wrap modes in V.(Inherited from [`TextureBase`](../texturebase/).) |
| [WrapModeW](../../aspose.threed.shading/texturebase/wrapmodew/) { get; set; } | Gets or sets the texture wrap modes in W.(Inherited from [`TextureBase`](../texturebase/).) |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetRotation](../../aspose.threed.shading/texturebase/setrotation/)(double, double) | Sets the UV rotation.(Inherited from [`TextureBase`](../texturebase/).) |
| [SetScale](../../aspose.threed.shading/texturebase/setscale/)(double, double) | Sets the UV scale.(Inherited from [`TextureBase`](../texturebase/).) |
| [SetTranslation](../../aspose.threed.shading/texturebase/settranslation/)(double, double) | Sets the UV translation.(Inherited from [`TextureBase`](../texturebase/).) |

### See Also

* class [TextureBase](../texturebase/)
* namespace [Aspose.ThreeD.Shading](../../aspose.threed.shading/)
* assembly [Aspose.3D](../../)


