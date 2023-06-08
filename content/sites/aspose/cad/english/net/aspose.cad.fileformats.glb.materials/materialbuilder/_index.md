---
title: Class MaterialBuilder
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Materials.MaterialBuilder class. Represents the root object of a material instance structure
type: docs
weight: 10550
url: /net/aspose.cad.fileformats.glb.materials/materialbuilder/
---
## MaterialBuilder class

Represents the root object of a material instance structure.

```csharp
public class MaterialBuilder : BaseBuilder, ICloneable
```

## Constructors

| Name | Description |
| --- | --- |
| [MaterialBuilder](materialbuilder/#constructor)(MaterialBuilder) |  |
| [MaterialBuilder](materialbuilder/#constructor_1)(string) |  |

## Properties

| Name | Description |
| --- | --- |
| [AlphaCutoff](../../aspose.cad.fileformats.glb.materials/materialbuilder/alphacutoff/) { get; set; } |  |
| [AlphaMode](../../aspose.cad.fileformats.glb.materials/materialbuilder/alphamode/) { get; set; } |  |
| [Channels](../../aspose.cad.fileformats.glb.materials/materialbuilder/channels/) { get; } |  |
| [CompatibilityFallback](../../aspose.cad.fileformats.glb.materials/materialbuilder/compatibilityfallback/) { get; set; } |  |
| [DoubleSided](../../aspose.cad.fileformats.glb.materials/materialbuilder/doublesided/) { get; set; } | Gets or sets a value indicating whether triangles must be rendered from both sides. |
| [Extras](../../aspose.cad.fileformats.glb.geometry/basebuilder/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [IndexOfRefraction](../../aspose.cad.fileformats.glb.materials/materialbuilder/indexofrefraction/) { get; set; } |  |
| [Name](../../aspose.cad.fileformats.glb.geometry/basebuilder/name/) { get; set; } | Gets or sets the display text name, or null. |
| [ShaderStyle](../../aspose.cad.fileformats.glb.materials/materialbuilder/shaderstyle/) { get; set; } |  |
| static [ContentComparer](../../aspose.cad.fileformats.glb.materials/materialbuilder/contentcomparer/) { get; } |  |
| static [ReferenceComparer](../../aspose.cad.fileformats.glb.materials/materialbuilder/referencecomparer/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| static [CreateDefault](../../aspose.cad.fileformats.glb.materials/materialbuilder/createdefault/)() |  |
| [Clone](../../aspose.cad.fileformats.glb.materials/materialbuilder/clone/)() |  |
| [GetChannel](../../aspose.cad.fileformats.glb.materials/materialbuilder/getchannel/#getchannel)(KnownChannel) |  |
| [GetChannel](../../aspose.cad.fileformats.glb.materials/materialbuilder/getchannel/#getchannel_1)(string) |  |
| [RemoveChannel](../../aspose.cad.fileformats.glb.materials/materialbuilder/removechannel/)(KnownChannel) |  |
| [UseChannel](../../aspose.cad.fileformats.glb.materials/materialbuilder/usechannel/#usechannel)(KnownChannel) |  |
| [UseChannel](../../aspose.cad.fileformats.glb.materials/materialbuilder/usechannel/#usechannel_1)(string) |  |
| [WithAlpha](../../aspose.cad.fileformats.glb.materials/materialbuilder/withalpha/)(AlphaMode, float) |  |
| [WithBaseColor](../../aspose.cad.fileformats.glb.materials/materialbuilder/withbasecolor/#withbasecolor_1)(Vector4) |  |
| [WithBaseColor](../../aspose.cad.fileformats.glb.materials/materialbuilder/withbasecolor/#withbasecolor)(ImageBuilder, Vector4?) |  |
| [WithChannelImage](../../aspose.cad.fileformats.glb.materials/materialbuilder/withchannelimage/#withchannelimage)(KnownChannel, ImageBuilder) |  |
| [WithChannelImage](../../aspose.cad.fileformats.glb.materials/materialbuilder/withchannelimage/#withchannelimage_1)(string, ImageBuilder) |  |
| [WithChannelParam](../../aspose.cad.fileformats.glb.materials/materialbuilder/withchannelparam/#withchannelparam_1)(KnownChannel, Vector4) |  |
| [WithChannelParam](../../aspose.cad.fileformats.glb.materials/materialbuilder/withchannelparam/#withchannelparam_2)(string, Vector4) |  |
| [WithChannelParam](../../aspose.cad.fileformats.glb.materials/materialbuilder/withchannelparam/#withchannelparam)(KnownChannel, KnownProperty, object) |  |
| [WithClearCoat](../../aspose.cad.fileformats.glb.materials/materialbuilder/withclearcoat/)(ImageBuilder, float) |  |
| [WithClearCoatNormal](../../aspose.cad.fileformats.glb.materials/materialbuilder/withclearcoatnormal/)(ImageBuilder) |  |
| [WithClearCoatRoughness](../../aspose.cad.fileformats.glb.materials/materialbuilder/withclearcoatroughness/)(ImageBuilder, float) |  |
| [WithDiffuse](../../aspose.cad.fileformats.glb.materials/materialbuilder/withdiffuse/#withdiffuse_1)(Vector4) |  |
| [WithDiffuse](../../aspose.cad.fileformats.glb.materials/materialbuilder/withdiffuse/#withdiffuse)(ImageBuilder, Vector4?) |  |
| [WithDoubleSide](../../aspose.cad.fileformats.glb.materials/materialbuilder/withdoubleside/)(bool) |  |
| [WithEmissive](../../aspose.cad.fileformats.glb.materials/materialbuilder/withemissive/#withemissive_1)(Vector3, float) |  |
| [WithEmissive](../../aspose.cad.fileformats.glb.materials/materialbuilder/withemissive/#withemissive)(ImageBuilder, Vector3?, float) |  |
| [WithFallback](../../aspose.cad.fileformats.glb.materials/materialbuilder/withfallback/)(MaterialBuilder) | Defines a fallback `MaterialBuilder` instance for the current `MaterialBuilder`. |
| [WithIridiscence](../../aspose.cad.fileformats.glb.materials/materialbuilder/withiridiscence/)(ImageBuilder, float, float) |  |
| [WithIridiscenceThickness](../../aspose.cad.fileformats.glb.materials/materialbuilder/withiridiscencethickness/)(ImageBuilder, float, float) |  |
| [WithMetallicRoughness](../../aspose.cad.fileformats.glb.materials/materialbuilder/withmetallicroughness/#withmetallicroughness_1)(float?, float?) |  |
| [WithMetallicRoughness](../../aspose.cad.fileformats.glb.materials/materialbuilder/withmetallicroughness/#withmetallicroughness)(ImageBuilder, float?, float?) |  |
| [WithMetallicRoughnessFallback](../../aspose.cad.fileformats.glb.materials/materialbuilder/withmetallicroughnessfallback/)(ImageBuilder, Vector4?, ImageBuilder, float?, float?) |  |
| [WithMetallicRoughnessShader](../../aspose.cad.fileformats.glb.materials/materialbuilder/withmetallicroughnessshader/)() | Sets [`ShaderStyle`](./shaderstyle/) to use [`SHADERPBRMETALLICROUGHNESS`](./shaderpbrmetallicroughness/). |
| [WithNormal](../../aspose.cad.fileformats.glb.materials/materialbuilder/withnormal/)(ImageBuilder, float) |  |
| [WithOcclusion](../../aspose.cad.fileformats.glb.materials/materialbuilder/withocclusion/)(ImageBuilder, float) |  |
| [WithShader](../../aspose.cad.fileformats.glb.materials/materialbuilder/withshader/)(string) | Sets [`ShaderStyle`](./shaderstyle/). |
| [WithSpecularColor](../../aspose.cad.fileformats.glb.materials/materialbuilder/withspecularcolor/)(ImageBuilder, Vector3?) |  |
| [WithSpecularFactor](../../aspose.cad.fileformats.glb.materials/materialbuilder/withspecularfactor/)(ImageBuilder, float) |  |
| [WithSpecularGlossiness](../../aspose.cad.fileformats.glb.materials/materialbuilder/withspecularglossiness/#withspecularglossiness_1)(Vector3?, float?) |  |
| [WithSpecularGlossiness](../../aspose.cad.fileformats.glb.materials/materialbuilder/withspecularglossiness/#withspecularglossiness)(ImageBuilder, Vector3?, float?) |  |
| [WithSpecularGlossinessShader](../../aspose.cad.fileformats.glb.materials/materialbuilder/withspecularglossinessshader/)() | Sets [`ShaderStyle`](./shaderstyle/) to use [`SHADERPBRSPECULARGLOSSINESS`](./shaderpbrspecularglossiness/). |
| [WithTransmission](../../aspose.cad.fileformats.glb.materials/materialbuilder/withtransmission/)(ImageBuilder, float) |  |
| [WithUnlitShader](../../aspose.cad.fileformats.glb.materials/materialbuilder/withunlitshader/)() | Sets [`ShaderStyle`](./shaderstyle/) to use [`SHADERUNLIT`](./shaderunlit/). |
| [WithVolumeAttenuation](../../aspose.cad.fileformats.glb.materials/materialbuilder/withvolumeattenuation/)(Vector3, float) |  |
| [WithVolumeThickness](../../aspose.cad.fileformats.glb.materials/materialbuilder/withvolumethickness/)(ImageBuilder, float) |  |
| static [AreEqualByContent](../../aspose.cad.fileformats.glb.materials/materialbuilder/areequalbycontent/)(MaterialBuilder, MaterialBuilder) |  |
| static [GetContentHashCode](../../aspose.cad.fileformats.glb.materials/materialbuilder/getcontenthashcode/)(MaterialBuilder) |  |

## Fields

| Name | Description |
| --- | --- |
| const [SHADERPBRMETALLICROUGHNESS](../../aspose.cad.fileformats.glb.materials/materialbuilder/shaderpbrmetallicroughness/) |  |
| const [SHADERPBRSPECULARGLOSSINESS](../../aspose.cad.fileformats.glb.materials/materialbuilder/shaderpbrspecularglossiness/) |  |
| const [SHADERUNLIT](../../aspose.cad.fileformats.glb.materials/materialbuilder/shaderunlit/) |  |

### See Also

* class [BaseBuilder](../../aspose.cad.fileformats.glb.geometry/basebuilder/)
* namespace [Aspose.CAD.FileFormats.GLB.Materials](../../aspose.cad.fileformats.glb.materials/)
* assembly [Aspose.CAD](../../)


