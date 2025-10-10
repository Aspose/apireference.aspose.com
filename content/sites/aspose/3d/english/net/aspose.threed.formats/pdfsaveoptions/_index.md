---
title: Class PdfSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.PdfSaveOptions class. The save options in PDF exporting
type: docs
weight: 1420
url: /net/aspose.threed.formats/pdfsaveoptions/
---
## PdfSaveOptions class

The save options in PDF exporting.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Constructor of `PdfSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [AuxiliaryColor](../../aspose.threed.formats/pdfsaveoptions/auxiliarycolor/) { get; set; } | Gets or sets the auxiliary color to be used when rendering the 3D content. The interpretation of this color depends on the [`RenderMode`](./rendermode/) |
| [BackgroundColor](../../aspose.threed.formats/pdfsaveoptions/backgroundcolor/) { get; set; } | Background color of the 3D view in PDF file. |
| [EmbedTextures](../../aspose.threed.formats/pdfsaveoptions/embedtextures/) { get; set; } | Embed the external textures into the PDF file, default value is false. |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory. |
| [FaceColor](../../aspose.threed.formats/pdfsaveoptions/facecolor/) { get; set; } | Gets or sets the face color to be used when rendering the 3D content. This is only relevant only when the [`RenderMode`](./rendermode/) has a value of Illustration. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [FlipCoordinateSystem](../../aspose.threed.formats/pdfsaveoptions/flipcoordinatesystem/) { get; set; } | Gets or sets to flip the coordinate system of the scene during exporting. |
| [LightingScheme](../../aspose.threed.formats/pdfsaveoptions/lightingscheme/) { get; set; } | LightingScheme specifies the lighting to apply to 3D artwork. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [RenderMode](../../aspose.threed.formats/pdfsaveoptions/rendermode/) { get; set; } | Render mode specifies the style in which the 3D artwork is rendered. |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


