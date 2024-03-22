---
title: Class Html5SaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.Html5SaveOptions class. Save options for HTML5
type: docs
weight: 1670
url: /net/aspose.threed.formats/html5saveoptions/
---
## Html5SaveOptions class

Save options for HTML5

```csharp
public class Html5SaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [Html5SaveOptions](html5saveoptions/)() | Constructor of `Html5SaveOptions` with all default settings. |

## Properties

| Name | Description |
| --- | --- |
| [CameraPosition](../../aspose.threed.formats/html5saveoptions/cameraposition/) { get; set; } | Gets or sets the initial position of the camera, default value is (10, 10, 10) |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../saveoptions/).) |
| [FarPlane](../../aspose.threed.formats/html5saveoptions/farplane/) { get; set; } | Gets or sets the far plane of the camera, default value is 1000. |
| [FieldOfView](../../aspose.threed.formats/html5saveoptions/fieldofview/) { get; set; } | Gets or sets the field of the view, default value is 45, measured in degree. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [LookAt](../../aspose.threed.formats/html5saveoptions/lookat/) { get; set; } | Gets or sets the default look at position, default value is (0, 0, 0) |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |
| [NearPlane](../../aspose.threed.formats/html5saveoptions/nearplane/) { get; set; } | Gets or sets the near plane of the camera, default value is 1 |
| [OrientationBox](../../aspose.threed.formats/html5saveoptions/orientationbox/) { get; set; } | Display a orientation box. Default value is true. |
| [ShowGrid](../../aspose.threed.formats/html5saveoptions/showgrid/) { get; set; } | Display a grid in the scene. Default value is true. |
| [ShowRulers](../../aspose.threed.formats/html5saveoptions/showrulers/) { get; set; } | Display rulers of x/y/z axes in the scene to measure the model. Default value is false. |
| [ShowUI](../../aspose.threed.formats/html5saveoptions/showui/) { get; set; } | Display a simple UI in the scene. Default value is true. |
| [UpVector](../../aspose.threed.formats/html5saveoptions/upvector/) { get; set; } | Gets or sets the up vector, value can be "x"/"y"/"z", default value is "y" |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


