---
title: Class U3dSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.U3dSaveOptions class. Save options for universal 3d
type: docs
weight: 1440
url: /net/aspose.threed.formats/u3dsaveoptions/
---
## U3dSaveOptions class

Save options for universal 3d

```csharp
public class U3dSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [U3dSaveOptions](u3dsaveoptions/)() | Constructor of `U3dSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [EmbedTextures](../../aspose.threed.formats/u3dsaveoptions/embedtextures/) { get; set; } | Embed the external textures into the U3D file, default value is false. |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [ExportNormals](../../aspose.threed.formats/u3dsaveoptions/exportnormals/) { get; set; } | Gets or sets whether to export normal data. |
| [ExportTextureCoordinates](../../aspose.threed.formats/u3dsaveoptions/exporttexturecoordinates/) { get; set; } | Gets or sets whether to export texture coordinates. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../saveoptions/).) |
| [ExportVertexDiffuse](../../aspose.threed.formats/u3dsaveoptions/exportvertexdiffuse/) { get; set; } | Gets or sets whether to export vertex's diffuse color. |
| [ExportVertexSpecular](../../aspose.threed.formats/u3dsaveoptions/exportvertexspecular/) { get; set; } | Gets or sets whether to export vertex' specular color. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FlipCoordinateSystem](../../aspose.threed.formats/u3dsaveoptions/flipcoordinatesystem/) { get; set; } | Gets or sets whether flip coordinate system of control points/normal during importing/exporting. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |
| [MeshCompression](../../aspose.threed.formats/u3dsaveoptions/meshcompression/) { get; set; } | Gets or sets whether to enable mesh data compression. |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


