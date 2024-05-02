---
title: DgnImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.cad.fileformats.dgn/dgnimage/
is_root: false
---

## DgnImage class

Dgn image class



**Inheritance:** [`DgnImage`](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The DgnImage type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/is_cached) | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [bounds](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/height) | Gets the image height.<br/>Defines the Y-axis distance between the bottommost point of all graphical objects in the image and their topmost point.<br/>The distance is measured in units corresponding to the value of the property [`Image.unit_type`](/cad/python-net/aspose.cad/image#unit_type) |
| [depth](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/depth) | Gets the image depth. |
| [palette](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/width) | Gets the image width.<br/>Defines the X-axis distance between the leftmost point of all graphic objects in the image and their rightmost point.<br/>The distance is measured in units corresponding to the value of the property [`Image.unit_type`](/cad/python-net/aspose.cad/image#unit_type) |
| [unit_type](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [annotation_service](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/annotation_service) | Gets the annotation service. |
| [watermark_guard_service](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/watermark_guard_service) |  |
| [entities](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/entities) |  |
| [sub_unit_type](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/sub_unit_type) | Gets current sub-unit type. |
| [version](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/version) | Gets DGN version of loaded image |
| [is_3d_image](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/is_3d_image) | Gets a value indicating whether file is 3D or not |
| [tags](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/tags) | Gets the tags. |
| [max_point](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/max_point) | Gets the max point. |
| [min_point](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/min_point) | Gets the min point. |
| [views](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/views) | Gets the views. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/save/#str-aspose.cad.imageoptions.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/save/#io.RawIOBase-aspose.cad.imageoptions.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/load/#io.RawIOBase-str-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container). |
| [get_strings](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/can_save/#aspose.cad.imageoptions.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [try_remove_entity](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage/try_remove_entity/#aspose.cad.fileformats.dgn.dgnelements.DgnDrawableEntityBase) |  |



### See Also
* module [`aspose.cad.fileformats.dgn`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DgnImage`](/cad/python-net/aspose.cad.fileformats.dgn/dgnimage)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`Image`](/cad/python-net/aspose.cad/image)
