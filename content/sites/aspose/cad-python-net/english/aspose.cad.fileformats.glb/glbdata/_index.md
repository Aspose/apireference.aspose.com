---
title: GlbData class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.cad.fileformats.glb/glbdata/
is_root: false
---

## GlbData class

The root object for a glTF asset.



**Inheritance:** [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) → 
[`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties) → 
[`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)



The GlbData type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [extensions](/cad/python-net/aspose.cad.fileformats.glb/glbdata/extensions) | Gets a collection of [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable) instances. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb/glbdata/extras) | Gets or sets the extras content of this instance. |
| [asset](/cad/python-net/aspose.cad.fileformats.glb/glbdata/asset) |  |
| [extensions_used](/cad/python-net/aspose.cad.fileformats.glb/glbdata/extensions_used) |  |
| [extensions_required](/cad/python-net/aspose.cad.fileformats.glb/glbdata/extensions_required) |  |
| [incompatible_extensions](/cad/python-net/aspose.cad.fileformats.glb/glbdata/incompatible_extensions) |  |
| [logical_materials](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_materials) |  |
| [logical_textures](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_textures) |  |
| [logical_texture_samplers](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_texture_samplers) |  |
| [logical_images](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_images) |  |
| [logical_buffers](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_buffers) |  |
| [logical_buffer_views](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_buffer_views) |  |
| [logical_accessors](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_accessors) |  |
| [logical_meshes](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_meshes) |  |
| [logical_skins](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_skins) |  |
| [logical_cameras](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_cameras) |  |
| [logical_nodes](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_nodes) |  |
| [logical_scenes](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_scenes) |  |
| [logical_animations](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_animations) |  |
| [default_scene](/cad/python-net/aspose.cad.fileformats.glb/glbdata/default_scene) |  |
| [mesh_quantization_allowed](/cad/python-net/aspose.cad.fileformats.glb/glbdata/mesh_quantization_allowed) |  |
| [logical_punctual_lights](/cad/python-net/aspose.cad.fileformats.glb/glbdata/logical_punctual_lights) | Gets A collection of [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) instances. |


### Methods
| Method | Description |
| :- | :- |
| [merge_buffers](/cad/python-net/aspose.cad.fileformats.glb/glbdata/merge_buffers/#) | Merges all the [`GlbData.logical_buffers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_buffers) instances into a single big one. |
| [merge_buffers](/cad/python-net/aspose.cad.fileformats.glb/glbdata/merge_buffers/#int) | Merges all the [`GlbData.logical_buffers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_buffers) instances into buffers of `max_size` size. |
| [use_buffer_view](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_buffer_view/#bytes-int-Nullable<int>-int-Nullable<BufferMode>) |  |
| [use_buffer_view](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_buffer_view/#aspose.cad.fileformats.glb.Buffer-int-Nullable<int>-int-Nullable<BufferMode>) |  |
| [create_punctual_light](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_punctual_light/#aspose.cad.fileformats.glb.PunctualLightType) | Creates a new [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) instance and<br/>adds it to [`GlbData.logical_punctual_lights`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_punctual_lights). |
| [create_punctual_light](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_punctual_light/#str-aspose.cad.fileformats.glb.PunctualLightType) | Creates a new [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) instance.<br/>and adds it to [`GlbData.logical_punctual_lights`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_punctual_lights). |
| [use_scene](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_scene/#int) | Creates or reuses a [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) instance<br/>at [`GlbData.logical_scenes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_scenes). |
| [use_scene](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_scene/#str) | Creates or reuses a [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) instance that has the<br/>same `name` at [`GlbData.logical_scenes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_scenes). |
| [use_texture](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_texture/#aspose.cad.fileformats.glb.ImageGlb-aspose.cad.fileformats.glb.TextureSampler) | Creates or reuses a [`Texture`](/cad/python-net/aspose.cad.fileformats.glb/texture) instance<br/>at [`GlbData.logical_textures`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_textures). |
| [use_texture](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_texture/#aspose.cad.fileformats.glb.ImageGlb-aspose.cad.fileformats.glb.ImageGlb-aspose.cad.fileformats.glb.TextureSampler) | Creates or reuses a [`Texture`](/cad/python-net/aspose.cad.fileformats.glb/texture) instance<br/>at [`GlbData.logical_textures`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_textures). |
| [save_gltf](/cad/python-net/aspose.cad.fileformats.glb/glbdata/save_gltf/#str-aspose.cad.fileformats.glb.WriteSettings) | Writes this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) to a file in GLTF format. |
| [save_gltf](/cad/python-net/aspose.cad.fileformats.glb/glbdata/save_gltf/#io.RawIOBase-io.RawIOBase-io.RawIOBase-str-aspose.cad.fileformats.glb.WriteSettings) |  |
| [create_model](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_model/#) | Creates a new [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance. |
| [deep_clone](/cad/python-net/aspose.cad.fileformats.glb/glbdata/deep_clone/#) | Creates a complete clone of this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance. |
| [create_accessor](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_accessor/#str) | Creates a new [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) instance<br/>and adds it to GLTF.Schema2.ModelRoot.LogicalAccessors. |
| [create_animation](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_animation/#str) | Creates a new [`Animation`](/cad/python-net/aspose.cad.fileformats.glb/animation) instance and adds it to [`GlbData.logical_animations`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_animations). |
| [create_buffer](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_buffer/#int) | Creates a new [`Buffer`](/cad/python-net/aspose.cad.fileformats.glb/buffer) instance<br/>and adds it to [`GlbData.logical_buffers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_buffers). |
| [use_buffer](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_buffer/#bytes) | Creates or reuses a [`Buffer`](/cad/python-net/aspose.cad.fileformats.glb/buffer) instance<br/>at [`GlbData.logical_buffers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_buffers). |
| [isolate_memory](/cad/python-net/aspose.cad.fileformats.glb/glbdata/isolate_memory/#) | Refreshes all internal memory buffers. |
| [create_buffer_view](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_buffer_view/#int-int-Nullable<BufferMode>) |  |
| [create_camera](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_camera/#str) | Creates a new [`Camera`](/cad/python-net/aspose.cad.fileformats.glb/camera) instance.<br/>and appends it to [`GlbData.logical_cameras`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_cameras). |
| [create_image](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_image/#str) | Creates a new [`Image`](/cad/python-net/aspose.cad/image) instance.<br/>and appends it to [`GlbData.logical_images`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_images). |
| [use_image](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_image/#aspose.cad.fileformats.glb.memory.MemoryImage) | Creates or reuses a [`Image`](/cad/python-net/aspose.cad/image) instance. |
| [merge_images](/cad/python-net/aspose.cad.fileformats.glb/glbdata/merge_images/#) | Transfers all the [`GlbData.logical_images`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_images) content into [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview) instances |
| [create_material](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_material/#str) | Creates a new [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) instance and appends it to [`GlbData.logical_materials`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_materials). |
| [create_mesh](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_mesh/#str) | Creates a new [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh) instance<br/>and appends it to [`GlbData.logical_meshes`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_meshes). |
| [create_logical_node](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_logical_node/#) |  |
| [validate](/cad/python-net/aspose.cad.fileformats.glb/glbdata/validate/#str) |  |
| [load_glb_image](/cad/python-net/aspose.cad.fileformats.glb/glbdata/load_glb_image/#str-aspose.cad.fileformats.glb.ReadSettings) | Reads a [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance from a path pointing to a GLB or a GLTF file |
| [load](/cad/python-net/aspose.cad.fileformats.glb/glbdata/load/#io.RawIOBase-aspose.cad.fileformats.glb.ReadSettings) |  |
| [read_glb](/cad/python-net/aspose.cad.fileformats.glb/glbdata/read_glb/#io.RawIOBase-aspose.cad.fileformats.glb.ReadSettings) | Reads a [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance from a Stream representing a GLB file |
| [get_satellite_paths](/cad/python-net/aspose.cad.fileformats.glb/glbdata/get_satellite_paths/#str) | Gets the list of satellite / dependency files for a given glTF file.<br/>This includes binary blobs and texture images. |
| [create_skin](/cad/python-net/aspose.cad.fileformats.glb/glbdata/create_skin/#str) | Creates a new [`Skin`](/cad/python-net/aspose.cad.fileformats.glb/skin) instance<br/>and adds it to [`GlbData.logical_skins`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_skins). |
| [use_texture_sampler](/cad/python-net/aspose.cad.fileformats.glb/glbdata/use_texture_sampler/#aspose.cad.fileformats.glb.TextureWrapMode-aspose.cad.fileformats.glb.TextureWrapMode-aspose.cad.fileformats.glb.TextureMipMapFilter-aspose.cad.fileformats.glb.TextureInterpolationFilter) | Creates or reuses a [`TextureSampler`](/cad/python-net/aspose.cad.fileformats.glb/texturesampler) instance<br/>at [`GlbData.logical_texture_samplers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_texture_samplers). |
| [save](/cad/python-net/aspose.cad.fileformats.glb/glbdata/save/#str-aspose.cad.fileformats.glb.WriteSettings) | Writes this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) to a file in GLTF or GLB based on the extension of `file_path`. |
| [save_glb](/cad/python-net/aspose.cad.fileformats.glb/glbdata/save_glb/#str-aspose.cad.fileformats.glb.WriteSettings) | Writes this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) to a file in GLB format. |
| [save_glb_image](/cad/python-net/aspose.cad.fileformats.glb/glbdata/save_glb_image/#io.RawIOBase-aspose.cad.fileformats.glb.WriteSettings) |  |
| [save_gltf_image](/cad/python-net/aspose.cad.fileformats.glb/glbdata/save_gltf_image/#io.RawIOBase-aspose.cad.fileformats.glb.WriteSettings) |  |
| [get_json_preview](/cad/python-net/aspose.cad.fileformats.glb/glbdata/get_json_preview/#) | Gets the JSON document of this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata). |
| [write_glb](/cad/python-net/aspose.cad.fileformats.glb/glbdata/write_glb/#io.RawIOBase-aspose.cad.fileformats.glb.WriteSettings) | Writes this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) to a Stream in GLB format. |



### See Also
* module [`aspose.cad.fileformats.glb`](..)
* class [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor)
* class [`Animation`](/cad/python-net/aspose.cad.fileformats.glb/animation)
* class [`Buffer`](/cad/python-net/aspose.cad.fileformats.glb/buffer)
* class [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview)
* class [`Camera`](/cad/python-net/aspose.cad.fileformats.glb/camera)
* class [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`Image`](/cad/python-net/aspose.cad/image)
* class [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)
* class [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material)
* class [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh)
* class [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight)
* class [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene)
* class [`Skin`](/cad/python-net/aspose.cad.fileformats.glb/skin)
* class [`Texture`](/cad/python-net/aspose.cad.fileformats.glb/texture)
* class [`TextureSampler`](/cad/python-net/aspose.cad.fileformats.glb/texturesampler)
