---
title: A3dwSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.formats/a3dwsaveoptions/
is_root: false
---

## A3dwSaveOptions class

Save options for A3DW format.



**Inheritance:** [`A3dwSaveOptions`](/3d/python-net/aspose.threed.formats/a3dwsaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The A3dwSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/__init__/#) | Constructor of [`A3dwSaveOptions`](/3d/python-net/aspose.threed.formats/a3dwsaveoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [export_meta_data](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/export_meta_data) | Export meta data associated with Scene/Node to client<br/>Default value is true |
| [meta_data_prefix](/3d/python-net/aspose.threed.formats/a3dwsaveoptions/meta_data_prefix) | If this property is non-null, only the properties of Scene/Node that start with this prefix will be exported, and the prefix will be removed. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`A3dwSaveOptions`](/3d/python-net/aspose.threed.formats/a3dwsaveoptions)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
