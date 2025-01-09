---
title: Microsoft3MFSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 170
url: /aspose.threed.formats/microsoft3mfsaveoptions/
is_root: false
---

## Microsoft3MFSaveOptions class

Save options for Microsoft 3MF file.



**Inheritance:** [`Microsoft3MFSaveOptions`](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The Microsoft3MFSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/__init__/#) | Construct a [`Microsoft3MFSaveOptions`](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [enable_compression](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/enable_compression) | Enable compression on the output 3mf file<br/>Default value is true |
| [build_all](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions/build_all) | Mark all geometries in scene to be printable.<br/>Or you can manually mark node to be printable by [`Microsoft3MFFormat.set_buildable`](/3d/python-net/aspose.threed.formats/microsoft3mfformat/set_buildable)<br/>Default value is true |



### See Also
* module [`aspose.threed.formats`](..)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`Microsoft3MFSaveOptions`](/3d/python-net/aspose.threed.formats/microsoft3mfsaveoptions)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
