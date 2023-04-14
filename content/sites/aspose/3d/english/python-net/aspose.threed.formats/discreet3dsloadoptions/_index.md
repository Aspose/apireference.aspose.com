---
title: Discreet3dsLoadOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.formats/discreet3dsloadoptions/
is_root: false
---

## Discreet3dsLoadOptions class

Load options for 3DS file.



**Inheritance:** [`Discreet3dsLoadOptions`](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions) → 
[`LoadOptions`](/3d/python-net/aspose.threed.formats/loadoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The Discreet3dsLoadOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/__init__/#) | Constructor of [`Discreet3dsLoadOptions`](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [gamma_corrected_color](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/gamma_corrected_color) | A 3ds file may contains original color and gamma corrected color for same attribute,<br/>Setting this to true will use the gamma corrected color if possible, <br/>otherwise the Aspose.3D will try to use the original color. |
| [flip_coordinate_system](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/flip_coordinate_system) | Gets or sets flip coordinate system of control points/normal during importing/exporting. |
| [apply_animation_transform](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions/apply_animation_transform) | Gets or sets whether to use the transformation defined in the first frame of animation track. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`Discreet3dsLoadOptions`](/3d/python-net/aspose.threed.formats/discreet3dsloadoptions)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`LoadOptions`](/3d/python-net/aspose.threed.formats/loadoptions)
