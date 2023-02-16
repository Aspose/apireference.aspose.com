---
title: FbxSaveOptions class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.threed.formats/fbxsaveoptions/
is_root: false
---

## FbxSaveOptions class

Save options for Fbx file.



**Inheritance:** [`FbxSaveOptions`](/3d/python-net/aspose.threed.formats/fbxsaveoptions) → 
[`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions) → 
[`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)



The FbxSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [FbxSaveOptions(format)](/3d/python-net/aspose.threed.formats/fbxsaveoptions/__init__/#FileFormat) | Initializes a [`FbxSaveOptions`](/3d/python-net/aspose.threed.formats/fbxsaveoptions) |
| [FbxSaveOptions(content_type)](/3d/python-net/aspose.threed.formats/fbxsaveoptions/__init__/#FileContentType) | Initialize a [`FbxSaveOptions`](/3d/python-net/aspose.threed.formats/fbxsaveoptions) using latest supported version. |


### Properties
| Property | Description |
| :- | :- |
| [file_format](/3d/python-net/aspose.threed.formats/fbxsaveoptions/file_format) | Gets the file format that specified in current Save/Load option. |
| [encoding](/3d/python-net/aspose.threed.formats/fbxsaveoptions/encoding) | Gets or sets the default encoding for text-based files.<br/>Default value is null which means the importer/exporter will decide which encoding to use. |
| [file_system](/3d/python-net/aspose.threed.formats/fbxsaveoptions/file_system) | Allow user to handle how to manage the external dependencies during load/save. |
| [lookup_paths](/3d/python-net/aspose.threed.formats/fbxsaveoptions/lookup_paths) | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [file_name](/3d/python-net/aspose.threed.formats/fbxsaveoptions/file_name) | The file name of the exporting/importing scene.<br/>This is optional, but useful when serialize external assets like OBJ's material. |
| [reuse_primitive_mesh](/3d/python-net/aspose.threed.formats/fbxsaveoptions/reuse_primitive_mesh) | Reuse the mesh for the primitives with same parameters, this will significantly reduce the size of FBX output which scene was constructed by large set of primitive shapes(like imported from CAD files).<br/>Default value is false |
| [enable_compression](/3d/python-net/aspose.threed.formats/fbxsaveoptions/enable_compression) | Compression large binary data in the FBX file(e.g. animation data, control points, vertex element data, indices), default value is true. |
| [fold_repeated_curve_data](/3d/python-net/aspose.threed.formats/fbxsaveoptions/fold_repeated_curve_data) | Gets or sets whether reuse repeated curve data by increasing last data's ref count |
| [export_legacy_material_properties](/3d/python-net/aspose.threed.formats/fbxsaveoptions/export_legacy_material_properties) | Gets or sets whether export legacy material properties, used for back compatibility.<br/>This option is turned on by default. |
| [video_for_texture](/3d/python-net/aspose.threed.formats/fbxsaveoptions/video_for_texture) | Gets or sets whether generate a Video instance for [`Texture`](/3d/python-net/aspose.threed.shading/texture) when exporting as FBX. |
| [embed_textures](/3d/python-net/aspose.threed.formats/fbxsaveoptions/embed_textures) | Gets or sets whether to embed the texture to the final output file.<br/>FBX Exporter will try to find the texture's raw data from [`IOConfig.file_system`](/3d/python-net/aspose.threed.formats/ioconfig#file_system), and embed the file to final FBX file.<br/>Default value is false. |
| [generate_vertex_element_material](/3d/python-net/aspose.threed.formats/fbxsaveoptions/generate_vertex_element_material) | Gets or sets whether always generate a [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial) for geometries if the attached node contains materials.<br/>This is turned off by default. |



### See Also
* module [`aspose.threed.formats`](..)
* class [`FbxSaveOptions`](/3d/python-net/aspose.threed.formats/fbxsaveoptions)
* class [`IOConfig`](/3d/python-net/aspose.threed.formats/ioconfig)
* class [`SaveOptions`](/3d/python-net/aspose.threed.formats/saveoptions)
* class [`Texture`](/3d/python-net/aspose.threed.shading/texture)
* class [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial)
