---
title: Class DracoFormat
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.DracoFormat class. Google Draco format
type: docs
weight: 1120
url: /net/aspose.threed.formats/dracoformat/
---
## DracoFormat class

Google Draco format

```csharp
public class DracoFormat : FileFormat
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
| [Decode](../../aspose.threed.formats/dracoformat/decode/#decode)(byte[]) | Decode the point cloud or mesh from memory data |
| [Decode](../../aspose.threed.formats/dracoformat/decode/#decode_1)(string) | Decode the point cloud or mesh from specified file name |
| [Encode](../../aspose.threed.formats/dracoformat/encode/#encode)(Entity, DracoSaveOptions) | Encode the entity to Draco raw data |
| [Encode](../../aspose.threed.formats/dracoformat/encode/#encode_1)(Entity, Stream, DracoSaveOptions) | Encode the entity to specified stream |
| [Encode](../../aspose.threed.formats/dracoformat/encode/#encode_2)(Entity, string, DracoSaveOptions) | Encode the entity to specified file |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | Formats to string |

## Examples

The following code shows how to encode and decode a Mesh to/from byte array:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into Draco format
byte[] draco = FileFormat.Draco.Encode(mesh);
//decode mesh from Draco format
Mesh decodedMesh = (Mesh)FileFormat.Draco.Decode(draco);
```

### See Also

* class [FileFormat](../../aspose.threed/fileformat/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


