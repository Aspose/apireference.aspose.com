---
title: GltfSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 110
url: /aspose.threed.formats/gltfsaveoptions/
is_root: false
---

## GltfSaveOptions class

Save options for glTF format.



**Inheritance:** [`GltfSaveOptions`](/3d/python-net/aspose.threed.formats/gltfsaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The GltfSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.formats/gltfsaveoptions/__init__/#aspose.threed.FileContentType) | Constructor of [`GltfSaveOptions`](/3d/python-net/aspose.threed.formats/gltfsaveoptions) |
| [__init__](/3d/python-net/aspose.threed.formats/gltfsaveoptions/__init__/#aspose.threed.FileFormat) | Constructor of [`GltfSaveOptions`](/3d/python-net/aspose.threed.formats/gltfsaveoptions) |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/gltfsaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/gltfsaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/gltfsaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/gltfsaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/gltfsaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [export_textures](/3d/python-net/aspose.threed.formats/gltfsaveoptions/export_textures) | Try to copy textures used in scene to output directory. |
| [pretty_print](/3d/python-net/aspose.threed.formats/gltfsaveoptions/pretty_print) | The JSON content of GLTF file is indented for human reading, default value is false |
| [fallback_normal](/3d/python-net/aspose.threed.formats/gltfsaveoptions/fallback_normal) | When GLTF2 exporter detected an invalid normal, this will be used instead of its original value to bypass the validation.<br/>Default value is (0, 1, 0) |
| [embed_assets](/3d/python-net/aspose.threed.formats/gltfsaveoptions/embed_assets) | Embed all external assets as base64 into single file in ASCII mode, default value is false. |
| [image_format](/3d/python-net/aspose.threed.formats/gltfsaveoptions/image_format) | Standard glTF only supports PNG/JPG as its texture format, this option will guide how Aspose.3D<br/>convert the non-standard images to supported format during the exporting.<br/>Default value is [`GltfEmbeddedImageFormat.PNG`](/3d/python-net/aspose.threed.formats/gltfembeddedimageformat#PNG) |
| [use_common_materials](/3d/python-net/aspose.threed.formats/gltfsaveoptions/use_common_materials) | Serialize materials using KHR common material extensions, default value is false.<br/>Set this to false will cause Aspose.3D export a set of vertex/fragment shader if [`GltfSaveOptions.ExportShaders`](/3d/python-net/aspose.threed.formats/gltfsaveoptions) |
| [external_draco_encoder](/3d/python-net/aspose.threed.formats/gltfsaveoptions/external_draco_encoder) | Use external draco encoder to accelerate the draco compression speed. |
| [flip_tex_coord_v](/3d/python-net/aspose.threed.formats/gltfsaveoptions/flip_tex_coord_v) | Flip texture coordinate  v(t) component, default value is true. |
| [buffer_file](/3d/python-net/aspose.threed.formats/gltfsaveoptions/buffer_file) | The file name of the external buffer file used to store binary data.<br/>If this file is not specified, Aspose.3D will generate a name for you.<br/>This is ignored when export glTF in binary mode. |
| [save_extras](/3d/python-net/aspose.threed.formats/gltfsaveoptions/save_extras) | Save scene object's dynamic properties into 'extra' fields in the generated glTF file.<br/>This is useful to provide application-specific data.<br/>Default value is false. |
| [apply_unit_scale](/3d/python-net/aspose.threed.formats/gltfsaveoptions/apply_unit_scale) | Apply [`AssetInfo.unit_scale_factor`](/3d/python-net/aspose.threed/assetinfo#unit_scale_factor) to the mesh.<br/>Default value is false. |
| [draco_compression](/3d/python-net/aspose.threed.formats/gltfsaveoptions/draco_compression) | Gets or sets whether to enable draco compression |



### See Also
* module [`aspose.threed.formats`](..)
* class [`GltfSaveOptions`](/3d/python-net/aspose.threed.formats/gltfsaveoptions)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
