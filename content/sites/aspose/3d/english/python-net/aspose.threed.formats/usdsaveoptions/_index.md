---
title: UsdSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 340
url: /aspose.threed.formats/usdsaveoptions/
is_root: false
---

## UsdSaveOptions class

Save options for USD/USDZ formats.



**Inheritance:** [`UsdSaveOptions`](/3d/python-net/aspose.threed.formats/usdsaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The UsdSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/usdsaveoptions/__init__/#) | Initialize a new [`UsdSaveOptions`](/3d/python-net/aspose.threed.formats/usdsaveoptions) with [`FileFormat.USD`](/3d/python-net/aspose.threed/fileformat) format |
| [__init__](/3d/python-net/aspose.threed.formats/usdsaveoptions/__init__/#aspose.threed.FileFormat) | Initialize a new [`UsdSaveOptions`](/3d/python-net/aspose.threed.formats/usdsaveoptions) with specified USD/USDZ format. |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/usdsaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/usdsaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/usdsaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/usdsaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/usdsaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/usdsaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [primitive_to_mesh](/3d/python-net/aspose.threed.formats/usdsaveoptions/primitive_to_mesh) | Convert the primitive entities to mesh during the export.<br/>Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus)<br/>Default value is true. |
| [export_meta_data](/3d/python-net/aspose.threed.formats/usdsaveoptions/export_meta_data) | Export node's properties through USD's customData field. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
* class [`UsdSaveOptions`](/3d/python-net/aspose.threed.formats/usdsaveoptions)
