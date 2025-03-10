---
title: Class PlyFormat
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.PlyFormat class. The PLY format
type: docs
weight: 1340
url: /net/aspose.threed.formats/plyformat/
---
## PlyFormat class

The PLY format.

```csharp
public class PlyFormat : FileFormat
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
| [Decode](../../aspose.threed.formats/plyformat/decode/#decode)(Stream) | Decode a point cloud or mesh from the specified stream. |
| [Decode](../../aspose.threed.formats/plyformat/decode/#decode_2)(string) | Decode a point cloud or mesh from the specified stream. |
| [Decode](../../aspose.threed.formats/plyformat/decode/#decode_1)(Stream, PlyLoadOptions) | Decode a point cloud or mesh from the specified stream. |
| [Decode](../../aspose.threed.formats/plyformat/decode/#decode_3)(string, PlyLoadOptions) | Decode a point cloud or mesh from the specified stream. |
| [Encode](../../aspose.threed.formats/plyformat/encode/#encode)(Entity, Stream) | Encode the entity and save the result into the stream. |
| [Encode](../../aspose.threed.formats/plyformat/encode/#encode_2)(Entity, string) | Encode the entity and save the result into an external file. |
| [Encode](../../aspose.threed.formats/plyformat/encode/#encode_1)(Entity, Stream, PlySaveOptions) | Encode the entity and save the result into the stream. |
| [Encode](../../aspose.threed.formats/plyformat/encode/#encode_3)(Entity, string, PlySaveOptions) | Encode the entity and save the result into an external file. |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | Formats to string |

## Examples

The following code shows how to encode a mesh into PLY file:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into PLY format
FileFormat.PLY.Encode(mesh, "sphere.ply");
```

The following code shows how to decode a mesh from a PLY file:

```csharp
//Generate a test file for decoding
FileFormat.PLY.Encode(new Sphere(), "sphere.ply");
//Decode the file
var mesh = (Mesh)FileFormat.PLY.Decode("sphere.ply")
```

### See Also

* class [FileFormat](../../aspose.threed/fileformat/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


