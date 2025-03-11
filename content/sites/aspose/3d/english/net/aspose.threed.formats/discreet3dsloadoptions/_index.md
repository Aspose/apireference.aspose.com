---
title: Class Discreet3dsLoadOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.Discreet3dsLoadOptions class. Load options for 3DS file
type: docs
weight: 1090
url: /net/aspose.threed.formats/discreet3dsloadoptions/
---
## Discreet3dsLoadOptions class

Load options for 3DS file.

```csharp
public class Discreet3dsLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [Discreet3dsLoadOptions](discreet3dsloadoptions/)() | Constructor of `Discreet3dsLoadOptions` |

## Properties

| Name | Description |
| --- | --- |
| [ApplyAnimationTransform](../../aspose.threed.formats/discreet3dsloadoptions/applyanimationtransform/) { get; set; } | Gets or sets whether to use the transformation defined in the first frame of animation track. |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [FlipCoordinateSystem](../../aspose.threed.formats/discreet3dsloadoptions/flipcoordinatesystem/) { get; set; } | Gets or sets flip coordinate system of control points/normal during importing/exporting. |
| [GammaCorrectedColor](../../aspose.threed.formats/discreet3dsloadoptions/gammacorrectedcolor/) { get; set; } | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


