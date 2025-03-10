---
title: Class GltfSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.GltfSaveOptions class. Save options for glTF format
type: docs
weight: 1190
url: /net/aspose.threed.formats/gltfsaveoptions/
---
## GltfSaveOptions class

Save options for glTF format.

```csharp
public class GltfSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [GltfSaveOptions](gltfsaveoptions/#constructor)(FileContentType) | Constructor of `GltfSaveOptions` |
| [GltfSaveOptions](gltfsaveoptions/#constructor_1)(FileFormat) | Constructor of `GltfSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [ApplyUnitScale](../../aspose.threed.formats/gltfsaveoptions/applyunitscale/) { get; set; } | Apply [`UnitScaleFactor`](../../aspose.threed/assetinfo/unitscalefactor/) to the mesh. Default value is false. |
| [BufferFile](../../aspose.threed.formats/gltfsaveoptions/bufferfile/) { get; set; } | The file name of the external buffer file used to store binary data. If this file is not specified, Aspose.3D will generate a name for you. This is ignored when export glTF in binary mode. |
| [DracoCompression](../../aspose.threed.formats/gltfsaveoptions/dracocompression/) { get; set; } | Gets or sets whether to enable draco compression |
| [EmbedAssets](../../aspose.threed.formats/gltfsaveoptions/embedassets/) { get; set; } | Embed all external assets as base64 into single file in ASCII mode, default value is false. |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory. |
| [ExternalDracoEncoder](../../aspose.threed.formats/gltfsaveoptions/externaldracoencoder/) { get; set; } | Use external draco encoder to accelerate the draco compression speed. |
| [FallbackNormal](../../aspose.threed.formats/gltfsaveoptions/fallbacknormal/) { get; set; } | When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation. Default value is (0, 1, 0) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [FlipTexCoordV](../../aspose.threed.formats/gltfsaveoptions/fliptexcoordv/) { get; set; } | Flip texture coordinate v(t) component, default value is true. |
| [ImageFormat](../../aspose.threed.formats/gltfsaveoptions/imageformat/) { get; set; } | Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D convert the non-standard images to supported format during the exporting. Default value is Png |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [MaterialConverter](../../aspose.threed.formats/gltfsaveoptions/materialconverter/) { get; set; } | Custom converter to convert the geometry's material to PBR material If this is unassigned, glTF 2.0 exporter will automatically convert the standard material to PBR material. Default value is null This property is used when exporting a scene to a glTF 2.0 file. |
| [PrettyPrint](../../aspose.threed.formats/gltfsaveoptions/prettyprint/) { get; set; } | The JSON content of GLTF file is indented for human reading, default value is false |
| [SaveExtras](../../aspose.threed.formats/gltfsaveoptions/saveextras/) { get; set; } | Save scene object's dynamic properties into 'extra' fields in the generated glTF file. This is useful to provide application-specific data. Default value is false. |
| [UseCommonMaterials](../../aspose.threed.formats/gltfsaveoptions/usecommonmaterials/) { get; set; } | Serialize materials using KHR common material extensions, default value is false. Set this to false will cause Aspose.3D export a set of vertex/fragment shader if ExportShaders |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


