---
title: Class ObjLoadOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.ObjLoadOptions class. Load options for wavefront obj
type: docs
weight: 1720
url: /net/aspose.threed.formats/objloadoptions/
---
## ObjLoadOptions class

Load options for wavefront obj

```csharp
public class ObjLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [ObjLoadOptions](objloadoptions/)() | Constructor of `ObjLoadOptions` |

## Properties

| Name | Description |
| --- | --- |
| [EnableMaterials](../../aspose.threed.formats/objloadoptions/enablematerials/) { get; set; } | Gets or sets whether import materials for each object |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FlipCoordinateSystem](../../aspose.threed.formats/objloadoptions/flipcoordinatesystem/) { get; set; } | Gets or sets whether flip coordinate system of control points/normal during importing |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |
| [NormalizeNormal](../../aspose.threed.formats/objloadoptions/normalizenormal/) { get; set; } | Gets or sets whether to normalize the normal vector during the loading. Default value is true. |
| [Scale](../../aspose.threed.formats/objloadoptions/scale/) { get; set; } | Scales on x/y/z axis, default value is 1.0 |

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


