---
title: DracoSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.formats/dracosaveoptions/
is_root: false
---

## DracoSaveOptions class

Save options for Google draco files



**Inheritance:** [DracoSaveOptions](/3d/python-net/aspose.threed.formats/dracosaveoptions) → 
[SaveOptions](/3d/python-net/aspose.threed.formats/saveoptions) → 
[IOConfig](/3d/python-net/aspose.threed.formats/ioconfig)



The DracoSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [DracoSaveOptions()](/3d/python-net/aspose.threed.formats/dracosaveoptions/__init__/#) | Construct a default configuration for saving draco files. |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/dracosaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/dracosaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/dracosaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/dracosaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/dracosaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [position_bits](/3d/python-net/aspose.threed.formats/dracosaveoptions/position_bits) | Quantization bits for position, default value is 14 |
| [texture_coordinate_bits](/3d/python-net/aspose.threed.formats/dracosaveoptions/texture_coordinate_bits) | Quantization bits for texture coordinate, default value is 12 |
| [color_bits](/3d/python-net/aspose.threed.formats/dracosaveoptions/color_bits) | Quantization bits for vertex color, default value is 10 |
| [normal_bits](/3d/python-net/aspose.threed.formats/dracosaveoptions/normal_bits) | Quantization bits for normal vectors, default value is 10 |
| [compression_level](/3d/python-net/aspose.threed.formats/dracosaveoptions/compression_level) | Compression level, default value is [DracoCompressionLevel.STANDARD](/3d/python-net/aspose.threed.formats/dracocompressionlevel#STANDARD) |
| [point_cloud](/3d/python-net/aspose.threed.formats/dracosaveoptions/point_cloud) | Export the scene as point cloud, default value is false. |


### See Also

* module [aspose.threed.formats](../)
* class [SaveOptions](/3d/python-net/aspose.threed.formats/saveoptions)
