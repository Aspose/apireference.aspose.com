---
title: PdfSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 190
url: /python-net/aspose.threed.formats/pdfsaveoptions/
is_root: false
---

## PdfSaveOptions class

The save options in PDF exporting.



**Inheritance:** [`PdfSaveOptions`](/3d/python-net/aspose.threed.formats/pdfsaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The PdfSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/pdfsaveoptions/__init__/#) | Constructor of [`PdfSaveOptions`](/3d/python-net/aspose.threed.formats/pdfsaveoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/pdfsaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/pdfsaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/pdfsaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/pdfsaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/pdfsaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/pdfsaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [render_mode](/3d/python-net/aspose.threed.formats/pdfsaveoptions/render_mode) | Render mode specifies the style in which the 3D artwork is rendered. |
| [lighting_scheme](/3d/python-net/aspose.threed.formats/pdfsaveoptions/lighting_scheme) | LightingScheme specifies the lighting to apply to 3D artwork. |
| [background_color](/3d/python-net/aspose.threed.formats/pdfsaveoptions/background_color) | Background color of the 3D view in PDF file. |
| [face_color](/3d/python-net/aspose.threed.formats/pdfsaveoptions/face_color) | Gets or sets the face color to be used  when rendering the 3D content. <br/>This is only relevant only when the [`PdfSaveOptions.render_mode`](/3d/python-net/aspose.threed.formats/pdfsaveoptions#render_mode) has a value of Illustration. |
| [auxiliary_color](/3d/python-net/aspose.threed.formats/pdfsaveoptions/auxiliary_color) | Gets or sets the auxiliary color to be used  when rendering the 3D content.<br/>The interpretation of this color depends on the [`PdfSaveOptions.render_mode`](/3d/python-net/aspose.threed.formats/pdfsaveoptions#render_mode) |
| [flip_coordinate_system](/3d/python-net/aspose.threed.formats/pdfsaveoptions/flip_coordinate_system) | Gets or sets to flip the coordinate system of the scene during exporting. |
| [embed_textures](/3d/python-net/aspose.threed.formats/pdfsaveoptions/embed_textures) | Embed the external textures into the PDF file, default value is false. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`PdfSaveOptions`](/3d/python-net/aspose.threed.formats/pdfsaveoptions)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
