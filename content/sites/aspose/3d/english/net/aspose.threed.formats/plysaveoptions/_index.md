---
title: Class PlySaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.PlySaveOptions class. Save options for exporting scene as PLY file
type: docs
weight: 1810
url: /net/aspose.threed.formats/plysaveoptions/
---
## PlySaveOptions class

Save options for exporting scene as PLY file.

```csharp
public class PlySaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PlySaveOptions](plysaveoptions/#constructor)() | Constructor of `PlySaveOptions` |
| [PlySaveOptions](plysaveoptions/#constructor_1)(FileContentType) | Constructor of `PlySaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [AxisSystem](../../aspose.threed.formats/plysaveoptions/axissystem/) { get; set; } | Gets or sets the axis system in the exported stl file. |
| [ColorComponents](../../aspose.threed.formats/plysaveoptions/colorcomponents/) { get; set; } | The component names for vertex color, default value is ("red", "green", "blue") |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../saveoptions/).) |
| [FaceElement](../../aspose.threed.formats/plysaveoptions/faceelement/) { get; set; } | The element name for the face data, default value is "face" |
| [FaceProperty](../../aspose.threed.formats/plysaveoptions/faceproperty/) { get; set; } | The property name for the face data, default value is "vertex_index" |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FlipCoordinate](../../aspose.threed.formats/plysaveoptions/flipcoordinate/) { get; set; } | Flip the coordinate while saving the scene, default value is true |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |
| [NormalComponents](../../aspose.threed.formats/plysaveoptions/normalcomponents/) { get; set; } | The component names for normal data, default value is ("nx", "ny", "nz") |
| [PointCloud](../../aspose.threed.formats/plysaveoptions/pointcloud/) { get; set; } | Export the scene as point cloud, the default value is false. |
| [PositionComponents](../../aspose.threed.formats/plysaveoptions/positioncomponents/) { get; set; } | The component names for position data, default value is ("x", "y", "z") |
| [TextureCoordinateComponents](../../aspose.threed.formats/plysaveoptions/texturecoordinatecomponents/) { get; set; } | The component names for texture coordinate data, default value is ("u", "v") |
| [VertexElement](../../aspose.threed.formats/plysaveoptions/vertexelement/) { get; set; } | The element name for the vertex data, default value is "vertex" |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


