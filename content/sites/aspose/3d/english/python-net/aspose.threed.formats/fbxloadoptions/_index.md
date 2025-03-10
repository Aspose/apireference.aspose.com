---
title: FbxLoadOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed.formats/fbxloadoptions/
is_root: false
---

## FbxLoadOptions class

Load options for Fbx format.



**Inheritance:** [`FbxLoadOptions`](/3d/python-net/aspose.threed.formats/fbxloadoptions) → 
[`LoadOptions`](/3d/python-net/aspose.threed.formats/loadoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The FbxLoadOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, format)`](/3d/python-net/aspose.threed.formats/fbxloadoptions/__init__/#aspose.threed.fileformat) | Constructor of [`FbxLoadOptions`](/3d/python-net/aspose.threed.formats/fbxloadoptions) |
| [`__init__(self)`](/3d/python-net/aspose.threed.formats/fbxloadoptions/__init__/#) | Constructor of [`FbxLoadOptions`](/3d/python-net/aspose.threed.formats/fbxloadoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/fbxloadoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/fbxloadoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/fbxloadoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/fbxloadoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/fbxloadoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [keep_builtin_global_settings](/3d/python-net/aspose.threed.formats/fbxloadoptions/keep_builtin_global_settings) | Gets or sets whether to keep the builtin properties in GlobalSettings which have a native property replacement in [`AssetInfo`](/3d/python-net/aspose.threed/assetinfo).<br/>Set this to true if you want the full properties in GlobalSettings<br/>Default value is false |
| [compatible_mode](/3d/python-net/aspose.threed.formats/fbxloadoptions/compatible_mode) | Gets or sets whether to enable compatible mode.<br/>Compatible mode will try to support non-standard FBX definitions like PBR materials exported by Blender.<br/>Default value is false. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`AssetInfo`](/3d/python-net/aspose.threed/assetinfo)
* class [`FbxLoadOptions`](/3d/python-net/aspose.threed.formats/fbxloadoptions)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`LoadOptions`](/3d/python-net/aspose.threed.formats/loadoptions)
