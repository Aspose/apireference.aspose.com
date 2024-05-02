---
title: FbxImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.fbx/fbximage/
is_root: false
---

## FbxImage class

Fbx Image class



**Inheritance:** [`FbxImage`](/cad/python-net/aspose.cad.fileformats.fbx/fbximage) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The FbxImage type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/is_cached) | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [bounds](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/height) | Gets the image height. |
| [depth](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/depth) | Gets the image depth. |
| [palette](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/width) | Gets the image width. |
| [unit_type](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [annotation_service](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/annotation_service) | Gets the annotation service. |
| [watermark_guard_service](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/watermark_guard_service) |  |
| [entities](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/entities) |  |
| [version](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/version) | Gets the image height. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/save/#str-aspose.cad.imageoptions.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/save/#io.RawIOBase-aspose.cad.imageoptions.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/load/#io.RawIOBase-str-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container). |
| [get_strings](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/can_save/#aspose.cad.imageoptions.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [try_remove_entity](/cad/python-net/aspose.cad.fileformats.fbx/fbximage/try_remove_entity/#aspose.cad.DrawingEntity3D) |  |



### See Also
* module [`aspose.cad.fileformats.fbx`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`FbxImage`](/cad/python-net/aspose.cad.fileformats.fbx/fbximage)
* class [`Image`](/cad/python-net/aspose.cad/image)
