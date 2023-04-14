---
title: RvmSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 250
url: /python-net/aspose.threed.formats/rvmsaveoptions/
is_root: false
---

## RvmSaveOptions class

Save options for Aveva PDMS RVM file.



**Inheritance:** [`RvmSaveOptions`](/3d/python-net/aspose.threed.formats/rvmsaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The RvmSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/rvmsaveoptions/__init__/#) | Constructor of [`RvmSaveOptions`](/3d/python-net/aspose.threed.formats/rvmsaveoptions) |
| [__init__](/3d/python-net/aspose.threed.formats/rvmsaveoptions/__init__/#aspose.threed.FileContentType) | Constructor of [`RvmSaveOptions`](/3d/python-net/aspose.threed.formats/rvmsaveoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/rvmsaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/rvmsaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/rvmsaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/rvmsaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/rvmsaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/rvmsaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [file_note](/3d/python-net/aspose.threed.formats/rvmsaveoptions/file_note) | File note in the file header. |
| [author](/3d/python-net/aspose.threed.formats/rvmsaveoptions/author) | Author information, default value is '3d@aspose' |
| [creation_time](/3d/python-net/aspose.threed.formats/rvmsaveoptions/creation_time) | The timestamp that exported this file, default value is current time |
| [attribute_prefix](/3d/python-net/aspose.threed.formats/rvmsaveoptions/attribute_prefix) | Gets or sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'.<br/>For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped. |
| [attribute_list_file](/3d/python-net/aspose.threed.formats/rvmsaveoptions/attribute_list_file) | Gets or sets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null. |
| [export_attributes](/3d/python-net/aspose.threed.formats/rvmsaveoptions/export_attributes) | Gets or sets whether to export the attribute list to an external .att file, default value is false. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`RvmSaveOptions`](/3d/python-net/aspose.threed.formats/rvmsaveoptions)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
