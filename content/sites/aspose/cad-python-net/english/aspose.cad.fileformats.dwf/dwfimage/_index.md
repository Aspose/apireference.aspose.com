---
title: DwfImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.dwf/dwfimage/
is_root: false
---

## DwfImage class

DWF image class.
Provides reading of DWF/DWFX format files, their processing and their export to other formats.



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
| [is_cached](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/is_cached) | Gets a value indicating whether object's data is cached currently and no data reading is required.<br/>Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data.<br/>In this case, we can use this property to determine that only part of the image data is loaded into the cache. |
| [bounds](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/height) | Gets the image height.<br/>Defines the Y-axis distance between the bottommost point of all graphical objects in the image and their topmost point.<br/>The distance is measured in units corresponding to the value of the property [`Image.unit_type`](/cad/python-net/aspose.cad/image#unit_type) |
| [depth](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/depth) | Gets the image depth. |
| [palette](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/width) | Gets the image width.<br/>Defines the X-axis distance between the leftmost point of all graphic objects in the image and their rightmost point.<br/>The distance is measured in units corresponding to the value of the property [`Image.unit_type`](/cad/python-net/aspose.cad/image#unit_type) |
| [unit_type](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [annotation_service](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/annotation_service) | Gets the annotation service. |
| [watermark_guard_service](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/watermark_guard_service) |  |
| [pages](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/pages) | Gets the DWF pages.<br/>Returns an array of all DWF pages that are contained in the DWF image.<br/>Each DWF page defines all its available graphical parameters and all the objects that are drawn on it. |
| [layers](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/layers) | Gets DWF pages layers.<br/>Returns the enumerable collection of DWF layers.<br/>The DWF data can be assigned to a specific DWF layer, which is a grouping drawing objects. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#str-aspose.cad.imageoptions.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/save/#io.RawIOBase-aspose.cad.imageoptions.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
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
| [load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/load/#io.RawIOBase-str-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container).<br/>Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data.<br/>In this case, we can use this method to load all image data into the cache. |
| [get_strings](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/get_strings/#) | Gets all string values from image.<br/>Provides an opportunity to get the values of all text graphic elements present<br/>in the image in the form of an array of strings. |
| [can_save](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/can_save/#aspose.cad.imageoptions.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [add_element](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/add_element/#int-aspose.cad.fileformats.dwf.whip.objects.drawable.DwfWhipDrawable) | Adds graphic element to specified page.<br/>Provides an opportunity to add a new graphic element to the existing ones in the image.<br/>To add it, you need to create a new graphic element and<br/>specify the index of the page in [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages) array to which the element should be added. |
| [remove_element](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/remove_element/#int-int) | Removes graphic element from specified page.<br/>Provides the ability to remove a graphic element from the image.<br/>To remove it, you need to specify the page index in [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages) array from which the element should be removed<br/>and the index of the element in [`DwfPage.entities`](/cad/python-net/aspose.cad.fileformats.dwf/dwfpage#entities) array. |
| [get_element_count](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/get_element_count/#int) | Gets count of graphic elements from specified page.<br/>Provides the ability to determine the number of graphic elements on a specific image page.<br/>To get this value, you need to specify the page index in the array [`DwfImage.pages`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage#pages), the number of elements of which you want to get. |
| [update_size](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage/update_size/#) | Updates the image size.<br/>Provides forced calculation of image size parameters. This calculation must be performed<br/>before using the image size parameters after changing the graphic content of the image<br/>that affects the image size parameters. |



### Example 


Reads an image file in DWG format, changes its contents and saves the image in PNG format.

### See Also
* module [`aspose.cad.fileformats.dwf`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage)
* class [`Image`](/cad/python-net/aspose.cad/image)
