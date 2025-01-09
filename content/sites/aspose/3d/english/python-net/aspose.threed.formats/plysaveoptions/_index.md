---
title: PlySaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 250
url: /aspose.threed.formats/plysaveoptions/
is_root: false
---

## PlySaveOptions class

Save options for exporting scene as PLY file.



**Inheritance:** [`PlySaveOptions`](/3d/python-net/aspose.threed.formats/plysaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The PlySaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/plysaveoptions/__init__/#) | Constructor of [`PlySaveOptions`](/3d/python-net/aspose.threed.formats/plysaveoptions) |
| [__init__](/3d/python-net/aspose.threed.formats/plysaveoptions/__init__/#aspose.threed.FileContentType) | Constructor of [`PlySaveOptions`](/3d/python-net/aspose.threed.formats/plysaveoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/plysaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/plysaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/plysaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/plysaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/plysaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/plysaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [point_cloud](/3d/python-net/aspose.threed.formats/plysaveoptions/point_cloud) | Export the scene as point cloud, the default value is false. |
| [flip_coordinate](/3d/python-net/aspose.threed.formats/plysaveoptions/flip_coordinate) | Flip the coordinate while saving the scene, default value is true |
| [vertex_element](/3d/python-net/aspose.threed.formats/plysaveoptions/vertex_element) | The element name for the vertex data, default value is "vertex" |
| [face_element](/3d/python-net/aspose.threed.formats/plysaveoptions/face_element) | The element name for the face data, default value is "face" |
| [face_property](/3d/python-net/aspose.threed.formats/plysaveoptions/face_property) | The property name for the face data, default value is "vertex_index" |
| [axis_system](/3d/python-net/aspose.threed.formats/plysaveoptions/axis_system) | Gets or sets the axis system in the exported stl file. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`PlySaveOptions`](/3d/python-net/aspose.threed.formats/plysaveoptions)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
