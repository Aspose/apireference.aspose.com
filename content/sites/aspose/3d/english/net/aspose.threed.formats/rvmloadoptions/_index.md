---
title: Class RvmLoadOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.RvmLoadOptions class. Load options for AVEVA Plant Design Management Systems RVM file
type: docs
weight: 1380
url: /net/aspose.threed.formats/rvmloadoptions/
---
## RvmLoadOptions class

Load options for AVEVA Plant Design Management System's RVM file.

```csharp
public class RvmLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [RvmLoadOptions](rvmloadoptions/#constructor)() | Construct a `RvmLoadOptions` instance |
| [RvmLoadOptions](rvmloadoptions/#constructor_1)(FileContentType) | Construct a `RvmLoadOptions` instance |

## Properties

| Name | Description |
| --- | --- |
| [AttributePrefix](../../aspose.threed.formats/rvmloadoptions/attributeprefix/) { get; set; } | Gets or sets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:" |
| [CenterScene](../../aspose.threed.formats/rvmloadoptions/centerscene/) { get; set; } | Center the scene after it's loaded. |
| [CylinderRadialSegments](../../aspose.threed.formats/rvmloadoptions/cylinderradialsegments/) { get; set; } | Gets or sets the number of cylinder's radial segments, default value is 16 |
| [DishLatitudeSegments](../../aspose.threed.formats/rvmloadoptions/dishlatitudesegments/) { get; set; } | Gets or sets the number of dish' latitude segments, default value is 8 |
| [DishLongitudeSegments](../../aspose.threed.formats/rvmloadoptions/dishlongitudesegments/) { get; set; } | Gets or sets the number of dish' longitude segments, default value is 12 |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [GenerateMaterials](../../aspose.threed.formats/rvmloadoptions/generatematerials/) { get; set; } | Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true |
| [LookupAttributes](../../aspose.threed.formats/rvmloadoptions/lookupattributes/) { get; set; } | Gets or sets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [RectangularTorusSegments](../../aspose.threed.formats/rvmloadoptions/rectangulartorussegments/) { get; set; } | Gets or sets the number of rectangular torus' radial segments, default value is 20 |
| [TorusTubularSegments](../../aspose.threed.formats/rvmloadoptions/torustubularsegments/) { get; set; } | Gets or sets the number of torus' tubular segments, default value is 20 |

## Examples

The following code shows how to customize the tessellation parameters for primitive geometries imported from RVM file using RvmLoadOptions.

```csharp
RvmLoadOptions opt = new RvmLoadOptions();
opt.RectangularTorusSegments = 30;
opt.CylinderRadialSegments = 20;
opt.DishLatitudeSegments = 20;
opt.DishLongitudeSegments = 20;
opt.CenterScene = true;
var scene = Scene.FromFile("input.rvm", opt);
scene.Save("output.obj");
```

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


