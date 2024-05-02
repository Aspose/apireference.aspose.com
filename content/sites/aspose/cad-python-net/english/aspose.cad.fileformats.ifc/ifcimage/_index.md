---
title: IfcImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.cad.fileformats.ifc/ifcimage/
is_root: false
---

## IfcImage class

Represents an image in IFC format. 
Contains information about all entities and header information.



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
| [is_cached](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/is_cached) | Gets a value indicating whether object's data is cached currently and no data reading is required.<br/>At present time always returns true |
| [bounds](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/height) | Gets the image height.<br/>It is calculated from all the entities |
| [depth](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/depth) | Gets the depth.<br/>It is calculated from all the entities |
| [palette](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/width) | Gets the image width.<br/>It is calculated from all the entities |
| [unit_type](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [annotation_service](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/annotation_service) | Gets the annotation service. |
| [watermark_guard_service](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/watermark_guard_service) |  |
| [header](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/header) | Gets the header. |
| [entities](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/entities) | Gets all entities that exists on a drawing.<br/>Could be useful for walking through them and check its properties |
| [layout_name](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/layout_name) |  |
| [layers](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/layers) | Gets list of all the layers that are present in the image<br/><br/>Gets the layers from the image. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#str-aspose.cad.imageoptions.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/save/#io.RawIOBase-aspose.cad.imageoptions.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
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
| [load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/load/#io.RawIOBase-str-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container).<br/>At present time is not implemented for IFC file format |
| [get_strings](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/get_strings/#) | Gets all string values from image.<br/>Can be useful to get some text from the image |
| [can_save](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/can_save/#aspose.cad.imageoptions.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [try_remove_entity](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/try_remove_entity/#aspose.cad.fileformats.ifc.IIfcEntity) |  |
| [add](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage/add/#aspose.cad.fileformats.ifc.IIfcEntity) |  |



### Example 


Loading of the drawing in IFC format.

### See Also
* module [`aspose.cad.fileformats.ifc`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`IfcImage`](/cad/python-net/aspose.cad.fileformats.ifc/ifcimage)
* class [`Image`](/cad/python-net/aspose.cad/image)
