---
title: Class GlbData
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.GlbData class. The root object for a glTF asset
type: docs
weight: 10320
url: /net/aspose.cad.fileformats.glb/glbdata/
---
## GlbData class

The root object for a glTF asset.

```csharp
public class GlbData : ExtraProperties, IConvertibleToGltf2
```

## Properties

| Name | Description |
| --- | --- |
| [Asset](../../aspose.cad.fileformats.glb/glbdata/asset/) { get; } |  |
| [DefaultScene](../../aspose.cad.fileformats.glb/glbdata/defaultscene/) { get; set; } |  |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [ExtensionsRequired](../../aspose.cad.fileformats.glb/glbdata/extensionsrequired/) { get; } |  |
| [ExtensionsUsed](../../aspose.cad.fileformats.glb/glbdata/extensionsused/) { get; } |  |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [IncompatibleExtensions](../../aspose.cad.fileformats.glb/glbdata/incompatibleextensions/) { get; } |  |
| [LogicalAccessors](../../aspose.cad.fileformats.glb/glbdata/logicalaccessors/) { get; } |  |
| [LogicalAnimations](../../aspose.cad.fileformats.glb/glbdata/logicalanimations/) { get; } |  |
| [LogicalBuffers](../../aspose.cad.fileformats.glb/glbdata/logicalbuffers/) { get; } |  |
| [LogicalBufferViews](../../aspose.cad.fileformats.glb/glbdata/logicalbufferviews/) { get; } |  |
| [LogicalCameras](../../aspose.cad.fileformats.glb/glbdata/logicalcameras/) { get; } |  |
| [LogicalImages](../../aspose.cad.fileformats.glb/glbdata/logicalimages/) { get; } |  |
| [LogicalMaterials](../../aspose.cad.fileformats.glb/glbdata/logicalmaterials/) { get; } |  |
| [LogicalMeshes](../../aspose.cad.fileformats.glb/glbdata/logicalmeshes/) { get; } |  |
| [LogicalNodes](../../aspose.cad.fileformats.glb/glbdata/logicalnodes/) { get; } |  |
| [LogicalPunctualLights](../../aspose.cad.fileformats.glb/glbdata/logicalpunctuallights/) { get; } | Gets A collection of [`PunctualLight`](../punctuallight/) instances. |
| [LogicalScenes](../../aspose.cad.fileformats.glb/glbdata/logicalscenes/) { get; } |  |
| [LogicalSkins](../../aspose.cad.fileformats.glb/glbdata/logicalskins/) { get; } |  |
| [LogicalTextures](../../aspose.cad.fileformats.glb/glbdata/logicaltextures/) { get; } |  |
| [LogicalTextureSamplers](../../aspose.cad.fileformats.glb/glbdata/logicaltexturesamplers/) { get; } |  |
| [MeshQuantizationAllowed](../../aspose.cad.fileformats.glb/glbdata/meshquantizationallowed/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| static [CreateModel](../../aspose.cad.fileformats.glb/glbdata/createmodel/)() | Creates a new [`GlbImage`](../glbimage/) instance. |
| static [Load](../../aspose.cad.fileformats.glb/glbdata/load/)(Stream, ReadSettings) |  |
| static [LoadGlbImage](../../aspose.cad.fileformats.glb/glbdata/loadglbimage/)(string, ReadSettings) | Reads a [`GlbImage`](../glbimage/) instance from a path pointing to a GLB or a GLTF file |
| static [ParseGLB](../../aspose.cad.fileformats.glb/glbdata/parseglb/)(ArraySegment&lt;byte&gt;, ReadSettings) | Parses a [`GlbImage`](../glbimage/) instance from a Byte array representing a GLB file |
| static [ReadGLB](../../aspose.cad.fileformats.glb/glbdata/readglb/)(Stream, ReadSettings) | Reads a [`GlbImage`](../glbimage/) instance from a Stream representing a GLB file |
| [ApplyBasisTransform](../../aspose.cad.fileformats.glb/glbdata/applybasistransform/)(Matrix4x4, string) | Applies a world transform to all the scenes of the model. |
| [CreateAccessor](../../aspose.cad.fileformats.glb/glbdata/createaccessor/)(string) | Creates a new [`Accessor`](../accessor/) instance and adds it to !:GLTF.Schema2.ModelRoot.LogicalAccessors. |
| [CreateAnimation](../../aspose.cad.fileformats.glb/glbdata/createanimation/)(string) | Creates a new [`Animation`](../animation/) instance and adds it to !:GlbImage.LogicalAnimations. |
| [CreateBuffer](../../aspose.cad.fileformats.glb/glbdata/createbuffer/)(int) | Creates a new [`Buffer`](../buffer/) instance and adds it to !:GlbImage.LogicalBuffers. |
| [CreateBufferView](../../aspose.cad.fileformats.glb/glbdata/createbufferview/)(int, int, BufferMode?) |  |
| [CreateCamera](../../aspose.cad.fileformats.glb/glbdata/createcamera/)(string) | Creates a new [`Camera`](../camera/) instance. and appends it to !:GlbImage.LogicalCameras. |
| [CreateImage](../../aspose.cad.fileformats.glb/glbdata/createimage/)(string) | Creates a new [`Image`](../../aspose.cad/image/) instance. and appends it to !:GlbImage.LogicalImages. |
| [CreateLogicalNode](../../aspose.cad.fileformats.glb/glbdata/createlogicalnode/)() |  |
| [CreateMaterial](../../aspose.cad.fileformats.glb/glbdata/creatematerial/)(string) | Creates a new [`Material`](../material/) instance and appends it to !:GlbImage.LogicalMaterials. |
| [CreateMesh](../../aspose.cad.fileformats.glb/glbdata/createmesh/)(string) | Creates a new [`Mesh`](../mesh/) instance and appends it to !:GlbImage.LogicalMeshes. |
| [CreatePunctualLight](../../aspose.cad.fileformats.glb/glbdata/createpunctuallight/#createpunctuallight)(PunctualLightType) | Creates a new [`PunctualLight`](../punctuallight/) instance and adds it to !:GlbImage.LogicalPunctualLights. |
| [CreatePunctualLight](../../aspose.cad.fileformats.glb/glbdata/createpunctuallight/#createpunctuallight_1)(string, PunctualLightType) | Creates a new [`PunctualLight`](../punctuallight/) instance. and adds it to !:GlbImage.LogicalPunctualLights. |
| [CreateSkin](../../aspose.cad.fileformats.glb/glbdata/createskin/)(string) | Creates a new [`Skin`](../skin/) instance and adds it to !:GlbImage.LogicalSkins. |
| [DeepClone](../../aspose.cad.fileformats.glb/glbdata/deepclone/)() | Creates a complete clone of this `GlbData` instance. |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [GetJSON](../../aspose.cad.fileformats.glb/glbdata/getjson/)(bool) |  |
| [GetJsonPreview](../../aspose.cad.fileformats.glb/glbdata/getjsonpreview/)() | Gets the JSON document of this [`GlbImage`](../glbimage/). |
| [IsolateMemory](../../aspose.cad.fileformats.glb/glbdata/isolatememory/)() | Refreshes all internal memory buffers. |
| [MergeBuffers](../../aspose.cad.fileformats.glb/glbdata/mergebuffers/#mergebuffers)() | Merges all the !:GlbImage.LogicalBuffers instances into a single big one. |
| [MergeBuffers](../../aspose.cad.fileformats.glb/glbdata/mergebuffers/#mergebuffers_1)(int) | Merges all the !:GlbImage.LogicalBuffers instances into buffers of *maxSize* size. |
| [MergeImages](../../aspose.cad.fileformats.glb/glbdata/mergeimages/)() | Transfers all the !:GlbImage.LogicalImages content into [`BufferView`](../bufferview/) instances |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [Save](../../aspose.cad.fileformats.glb/glbdata/save/)(string, WriteSettings) | Writes this [`GlbImage`](../glbimage/) to a file in GLTF or GLB based on the extension of *filePath*. |
| [SaveGLB](../../aspose.cad.fileformats.glb/glbdata/saveglb/)(string, WriteSettings) | Writes this [`GlbImage`](../glbimage/) to a file in GLB format. |
| [SaveGlbImage](../../aspose.cad.fileformats.glb/glbdata/saveglbimage/)(Stream, WriteSettings) |  |
| [SaveGLTF](../../aspose.cad.fileformats.glb/glbdata/savegltf/#savegltf_1)(string, WriteSettings) | Writes this [`GlbImage`](../glbimage/) to a file in GLTF format. |
| [SaveGLTF](../../aspose.cad.fileformats.glb/glbdata/savegltf/#savegltf)(Stream, Stream, string, WriteSettings) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseBuffer](../../aspose.cad.fileformats.glb/glbdata/usebuffer/)(byte[]) | Creates or reuses a [`Buffer`](../buffer/) instance at !:GlbImage.LogicalBuffers. |
| [UseBufferView](../../aspose.cad.fileformats.glb/glbdata/usebufferview/#usebufferview_2)(ArraySegment&lt;byte&gt;, int, BufferMode?) | Creates or reuses a [`BufferView`](../bufferview/) instance at !:GlbImage.LogicalBufferViews. |
| [UseBufferView](../../aspose.cad.fileformats.glb/glbdata/usebufferview/#usebufferview)(Buffer, int, int?, int, BufferMode?) | Creates or reuses a [`BufferView`](../bufferview/) instance at !:GlbImage.LogicalBufferViews. |
| [UseBufferView](../../aspose.cad.fileformats.glb/glbdata/usebufferview/#usebufferview_1)(byte[], int, int?, int, BufferMode?) | Creates or reuses a [`BufferView`](../bufferview/) instance at !:GlbImage.LogicalBufferViews. |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |
| [UseImage](../../aspose.cad.fileformats.glb/glbdata/useimage/)(MemoryImage) | Creates or reuses a [`Image`](../../aspose.cad/image/) instance. |
| [UseScene](../../aspose.cad.fileformats.glb/glbdata/usescene/#usescene)(int) | Creates or reuses a [`Scene`](../scene/) instance at !:GlbImage.LogicalScenes. |
| [UseScene](../../aspose.cad.fileformats.glb/glbdata/usescene/#usescene_1)(string) | Creates or reuses a [`Scene`](../scene/) instance that has the same *name* at !:GlbImage.LogicalScenes. |
| [UseTexture](../../aspose.cad.fileformats.glb/glbdata/usetexture/#usetexture_1)(ImageGlb, TextureSampler) | Creates or reuses a [`Texture`](../texture/) instance at !:GlbImage.LogicalTextures. |
| [UseTexture](../../aspose.cad.fileformats.glb/glbdata/usetexture/#usetexture)(ImageGlb, ImageGlb, TextureSampler) | Creates or reuses a [`Texture`](../texture/) instance at !:GlbImage.LogicalTextures. |
| [UseTextureSampler](../../aspose.cad.fileformats.glb/glbdata/usetexturesampler/)(TextureWrapMode, TextureWrapMode, TextureMipMapFilter, TextureInterpolationFilter) | Creates or reuses a [`TextureSampler`](../texturesampler/) instance at !:GlbImage.LogicalTextureSamplers. |
| [WriteGLB](../../aspose.cad.fileformats.glb/glbdata/writeglb/#writeglb)(WriteSettings) | Writes this [`GlbImage`](../glbimage/) to a Byte array in GLB format. |
| [WriteGLB](../../aspose.cad.fileformats.glb/glbdata/writeglb/#writeglb_1)(Stream, WriteSettings) | Writes this [`GlbImage`](../glbimage/) to a Stream in GLB format. |
| static [GetSatellitePaths](../../aspose.cad.fileformats.glb/glbdata/getsatellitepaths/)(string) | Gets the list of satellite / dependency files for a given glTF file. This includes binary blobs and texture images. |
| static [Validate](../../aspose.cad.fileformats.glb/glbdata/validate/)(string) |  |

### See Also

* class [ExtraProperties](../extraproperties/)
* interface [IConvertibleToGltf2](../iconvertibletogltf2/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


