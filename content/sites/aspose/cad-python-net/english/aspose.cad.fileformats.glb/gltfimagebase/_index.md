---
title: GltfImageBase class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 140
url: /python-net/aspose.cad.fileformats.glb/gltfimagebase/
is_root: false
---

## GltfImageBase class

Represents the base class of a serializable glTF schema2 object.
Inherited by [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties).



**Inheritance:** [`GltfImageBase`](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The GltfImageBase type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/__init__/#) | Initializes a new instance of the [`Image`](/cad/python-net/aspose.cad/image) class. |


### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/is_cached) | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [bounds](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/height) | Gets the image height. |
| [depth](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/depth) | Gets the image depth. |
| [palette](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/width) | Gets the image width. |
| [unit_type](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [annotation_service](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/annotation_service) | Gets the annotation service. |
| [watermark_guard_service](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/watermark_guard_service) |  |
| [data](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/data) |  |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/save/#str-aspose.cad.imageoptions.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/save/#io.RawIOBase-aspose.cad.imageoptions.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/load/#io.RawIOBase-str-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container). |
| [get_strings](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase/can_save/#aspose.cad.imageoptions.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |



### See Also
* module [`aspose.cad.fileformats.glb`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties)
* class [`GltfImageBase`](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase)
* class [`Image`](/cad/python-net/aspose.cad/image)
