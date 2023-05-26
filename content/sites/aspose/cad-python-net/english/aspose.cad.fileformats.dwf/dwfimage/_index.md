---
title: DwfImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /aspose.cad.fileformats.dwf/dwfimage/
is_root: false
---

## DwfImage class

DWF image class



**Inheritance:** [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The DwfImage type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/is_cached) | Gets is image cached |
| [bounds](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/height) | Gets the image height. |
| [palette](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/width) | Gets the image width. |
| [has_background_color](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/has_background_color) | Gets or sets a value indicating whether image has background color. |
| [background_color](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/background_color) | Gets or sets a value for the background color. |
| [unit_type](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [pages](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/pages) | Gets pages |
| [layers](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/layers) | Gets layers |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#str-aspose.cad.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#io.RawIOBase-aspose.cad.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/cache_data/#) | Caches data |
| [get_strings](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/can_save/#aspose.cad.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [add_element](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/add_element/#int-aspose.cad.fileformats.dwf.whip.objects.drawable.DwfWhipDrawable) | Adds render able element to specified page |
| [remove_element](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/remove_element/#int-int) | Removes element from specified page |
| [get_element_count](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/get_element_count/#int) | Gets count of render able elements from specified page |
| [update_size](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/update_size/#) | Updates the size. |



### See Also
* module [`aspose.cad.fileformats.dwf`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage)
* class [`Image`](/cad/python-net/aspose.cad/image)
