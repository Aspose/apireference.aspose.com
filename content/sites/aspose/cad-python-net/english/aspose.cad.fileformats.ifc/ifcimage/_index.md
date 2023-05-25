---
title: IfcImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /aspose.cad.fileformats.ifc/ifcimage/
is_root: false
---

## IfcImage class

Ifc Image class



**Inheritance:** [`IfcImage`](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The IfcImage type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/is_cached) | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [bounds](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/height) | Gets the image height. |
| [palette](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/width) | Gets the image width. |
| [has_background_color](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/has_background_color) | Gets or sets a value indicating whether image has background color. |
| [background_color](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/background_color) | Gets or sets a value for the background color. |
| [unit_type](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [header](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/header) | Gets the header. |
| [layers](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/layers) | Gets list of layers in image |
| [depth](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/depth) | Gets the depth. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#str-aspose.cad.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#io.RawIOBase-aspose.cad.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container). |
| [get_strings](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/can_save/#aspose.cad.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |



### See Also
* module [`aspose.cad.fileformats.ifc`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`IfcImage`](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage)
* class [`Image`](/cad/python-net/aspose.cad/image)
