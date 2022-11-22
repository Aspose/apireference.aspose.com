---
title: IOConfig class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.threed.formats/ioconfig/
is_root: false
---

## IOConfig class

IO config for serialization/deserialization.
            User can specify detailed configurations like dependency look-up path
            Or format-related configs here



The IOConfig type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/ioconfig/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/ioconfig/encoding) | Gets or sets the default encoding for text-based files.<br/>            Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/ioconfig/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/ioconfig/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/ioconfig/file_name) | The file name of the exporting/importing scene.<br/>            This is optional, but useful when serialize external assets like OBJ's material. |


### See Also

* module [aspose.threed.formats](../)
