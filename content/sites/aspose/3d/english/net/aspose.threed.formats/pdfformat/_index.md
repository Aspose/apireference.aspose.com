---
title: Class PdfFormat
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.PdfFormat class. Adobes Portable Document Format
type: docs
weight: 1380
url: /net/aspose.threed.formats/pdfformat/
---
## PdfFormat class

Adobe's Portable Document Format

```csharp
public class PdfFormat : FileFormat
```

## Properties

| Name | Description |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | Gets whether Aspose.3D supports export scene to current file format. |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | Gets whether Aspose.3D supports import scene from current file format. |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | Gets file format content type |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | Gets the extension name of this type. |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | Gets the extension names of this type. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | Gets file format type |
| [Version](../../aspose.threed/fileformat/version/) { get; } | Gets file format version |

## Methods

| Name | Description |
| --- | --- |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | Create a default load options for this file format |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | Create a default save options for this file format |
| [Extract](../../aspose.threed.formats/pdfformat/extract/#extract)(Stream, byte[]) | Extract raw 3D content from PDF stream. |
| [Extract](../../aspose.threed.formats/pdfformat/extract/#extract_1)(string, byte[]) | Extract raw 3D content from PDF file. |
| [ExtractScene](../../aspose.threed.formats/pdfformat/extractscene/#extractscene_1)(string) | Extract 3D scenes from PDF file. |
| [ExtractScene](../../aspose.threed.formats/pdfformat/extractscene/#extractscene)(Stream, byte[]) | Extract raw 3D content from PDF stream. |
| [ExtractScene](../../aspose.threed.formats/pdfformat/extractscene/#extractscene_2)(string, byte[]) | Extract 3D scenes from PDF file. |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | Formats to string |

## Examples

The following code shows how to extract all supported 3D scenes from a 3D PDF file, and write them to obj format.

```csharp
var scenes = FileFormat.PDF.ExtractScene("input.pdf");
for(int i = 0; i < scenes.Count; i++) 
{
    scenes[i].Save($"output-{i}.obj");
}
```

### See Also

* class [FileFormat](../../aspose.threed/fileformat/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


