---
title: JtLoadOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 140
url: /python-net/aspose.threed.formats/jtloadoptions/
is_root: false
---

## JtLoadOptions class

Load options for Siemens JT



**Inheritance:** [`JtLoadOptions`](/3d/python-net/aspose.threed.formats/jtloadoptions) → 
[`LoadOptions`](/3d/python-net/aspose.threed.formats/loadoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The JtLoadOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.formats/jtloadoptions/__init__/#) |  |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/jtloadoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/jtloadoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/jtloadoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/jtloadoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/jtloadoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [load_properties](/3d/python-net/aspose.threed.formats/jtloadoptions/load_properties) | Load properties from JT's property table as Aspose.3D properties. <br/>Default value is false. |
| [load_pmi](/3d/python-net/aspose.threed.formats/jtloadoptions/load_pmi) | Load PMI information from JT file if possible, the data will be saved as property "PMI" of [`Scene.asset_info`](/3d/python-net/aspose.threed/scene#asset_info).<br/>Default value is false. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`JtLoadOptions`](/3d/python-net/aspose.threed.formats/jtloadoptions)
* class [`LoadOptions`](/3d/python-net/aspose.threed.formats/loadoptions)
