---
title: Class ObjSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.ObjSaveOptions class. Save options for wavefront obj file
type: docs
weight: 1730
url: /net/aspose.threed.formats/objsaveoptions/
---
## ObjSaveOptions class

Save options for wavefront obj file

```csharp
public class ObjSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [ObjSaveOptions](objsaveoptions/)() | Constructor of `ObjSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [ApplyUnitScale](../../aspose.threed.formats/objsaveoptions/applyunitscale/) { get; set; } | Apply [`UnitScaleFactor`](../../aspose.threed/assetinfo/unitscalefactor/) to the mesh. Default value is false. |
| [AxisSystem](../../aspose.threed.formats/objsaveoptions/axissystem/) { get; set; } | Gets or sets the axis system in the exported file. |
| [EnableMaterials](../../aspose.threed.formats/objsaveoptions/enablematerials/) { get; set; } | Gets or sets whether import/export materials for each object |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../saveoptions/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FlipCoordinateSystem](../../aspose.threed.formats/objsaveoptions/flipcoordinatesystem/) { get; set; } | Gets or sets whether flip coordinate system of control points/normal during importing/exporting. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |
| [PointCloud](../../aspose.threed.formats/objsaveoptions/pointcloud/) { get; set; } | Gets or sets the flag whether the exporter should export the scene as point cloud(without topological structure), default value is false |
| [SerializeW](../../aspose.threed.formats/objsaveoptions/serializew/) { get; set; } | Gets or sets whether serialize W component in model's vertex position. |
| [Verbose](../../aspose.threed.formats/objsaveoptions/verbose/) { get; set; } | Gets or sets whether generate comments for each section |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


