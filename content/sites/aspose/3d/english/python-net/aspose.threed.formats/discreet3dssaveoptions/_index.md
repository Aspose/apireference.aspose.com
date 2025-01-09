---
title: Discreet3dsSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.threed.formats/discreet3dssaveoptions/
is_root: false
---

## Discreet3dsSaveOptions class

Save options for 3DS file.



**Inheritance:** [`Discreet3dsSaveOptions`](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The Discreet3dsSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/__init__/#) | Constructor of [`Discreet3dsSaveOptions`](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [export_light](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/export_light) | Gets or sets whether export all lights in the scene. |
| [export_camera](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/export_camera) | Gets or sets whether export all cameras in the scene. |
| [duplicated_name_separator](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/duplicated_name_separator) | The separator between object's name and the duplicated counter, default value is "_".<br/><br/>When scene contains objects that use the same name, Aspose.3D 3DS exporter will generate a different name for the object.<br/>For example there's two nodes named "Box", the first node will have a name "Box",<br/>and the second node will get a new name "Box_2" using the default configuration. |
| [duplicated_name_counter_base](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/duplicated_name_counter_base) | The counter used by generating new name for duplicated names, default value is 2. |
| [duplicated_name_counter_format](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/duplicated_name_counter_format) | The format of the duplicated counter, default value is empty string. |
| [master_scale](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/master_scale) | Gets or sets the master scale used in exporting. |
| [gamma_corrected_color](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/gamma_corrected_color) | A 3ds file may contains original color and gamma corrected color for same attribute,<br/>Setting this to true will use the gamma corrected color if possible, <br/>otherwise the Aspose.3D will try to use the original color. |
| [flip_coordinate_system](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/flip_coordinate_system) | Gets or sets flip coordinate system of control points/normal during importing/exporting. |
| [high_precise_color](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions/high_precise_color) | If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float.<br/>Otherwise the generated file will use 24bit color, each channel use 8bit byte.<br/>The default value is false, because not all applications supports the high-precise color. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`Discreet3dsSaveOptions`](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
