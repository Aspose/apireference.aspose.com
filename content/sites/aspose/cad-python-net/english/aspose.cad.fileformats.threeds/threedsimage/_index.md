---
title: ThreeDSImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.threeds/threedsimage/
is_root: false
---

## ThreeDSImage class

3DS image class.
Allows to load 3D models from 3DS files. In example below 3D model loaded from file and exported to PDF.
The resulting PDF file will contain projection of 3D model occupying the entire page with margins.



**Inheritance:** [`ThreeDSImage`](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The ThreeDSImage type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/__init__/#) | Initializes a new instance of the [`Image`](/cad/python-net/aspose.cad/image) class. |


### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/is_cached) | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [bounds](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/height) | Gets the image height. |
| [depth](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/depth) | Gets the image depth. |
| [palette](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/width) | Gets the image width. |
| [unit_type](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [annotation_service](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/annotation_service) | Gets the annotation service. |
| [watermark_guard_service](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/watermark_guard_service) |  |
| [ambient_light](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/ambient_light) | The ambient light color. |
| [has_materials](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/has_materials) | Gets a value indicating whether object has materials. |
| [materials](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/materials) | The list of the materials. |
| [has_meshes](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/has_meshes) | Gets a value indicating whether object has meshes. |
| [meshes](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/meshes) | The list of the meshes. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/save/#str-aspose.cad.imageoptions.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/save/#io.RawIOBase-aspose.cad.imageoptions.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/load/#io.RawIOBase-str-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/cache_data/#) | Caches the data and ensures no additional data loading will be performed <br/>from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container). |
| [get_strings](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/can_save/#aspose.cad.imageoptions.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [update_image](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage/update_image/#) |  |



### Example 


Loading of 3DS model and exporting of ThreeDSImage into PDF document of desired size.

### See Also
* module [`aspose.cad.fileformats.threeds`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`Image`](/cad/python-net/aspose.cad/image)
* class [`ThreeDSImage`](/cad/python-net/aspose.cad.fileformats.threeds/threedsimage)
