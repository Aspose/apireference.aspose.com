---
title: ObjImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.obj/objimage/
is_root: false
---

## ObjImage class

Represents an image in OBJ format. 
Contains information about bounds of the drawing, materials, vertices, and shapes.
Each shape contains information about set of faces with corresponding material, vertex, texture, and normal indices.



**Inheritance:** [`ObjImage`](/cad/python-net/aspose.cad.fileformats.obj/objimage) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The ObjImage type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.obj/objimage/__init__/#aspose.cad.fileformats.obj.elements.ObjRoot) | Initializes a new instance of the [`ObjImage`](/cad/python-net/aspose.cad.fileformats.obj/objimage) class. |


### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad.fileformats.obj/objimage/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad.fileformats.obj/objimage/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad.fileformats.obj/objimage/is_cached) | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [bounds](/cad/python-net/aspose.cad.fileformats.obj/objimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad.fileformats.obj/objimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad.fileformats.obj/objimage/height) | Gets the height of the image.<br/>Calculated as the difference between maximum and minimum values of the Y coordinate amongst all vertices.<br/>Minimal allowed height is 1. |
| [depth](/cad/python-net/aspose.cad.fileformats.obj/objimage/depth) | Gets the depth of the image.<br/>Calculated as the difference between maximum and minimum values of the Z coordinate amongst all vertices.<br/>Minimal allowed depth is 0. |
| [palette](/cad/python-net/aspose.cad.fileformats.obj/objimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad.fileformats.obj/objimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad.fileformats.obj/objimage/width) | Gets the width of the image.<br/>Calculated as the difference between maximum and minimum values of the X coordinate amongst all vertices.<br/>Minimal allowed width is 1. |
| [unit_type](/cad/python-net/aspose.cad.fileformats.obj/objimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad.fileformats.obj/objimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [annotation_service](/cad/python-net/aspose.cad.fileformats.obj/objimage/annotation_service) | Gets the annotation service. |
| [watermark_guard_service](/cad/python-net/aspose.cad.fileformats.obj/objimage/watermark_guard_service) |  |
| [obj_root](/cad/python-net/aspose.cad.fileformats.obj/objimage/obj_root) | Gets or sets root information about the drawing.<br/>ObjRoot contains data about vertices, materials, and shapes.<br/>Could be useful for the exposing information about faces. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.obj/objimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad.fileformats.obj/objimage/save/#str-aspose.cad.imageoptions.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.obj/objimage/save/#io.RawIOBase-aspose.cad.imageoptions.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad.fileformats.obj/objimage/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad.fileformats.obj/objimage/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad.fileformats.obj/objimage/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad.fileformats.obj/objimage/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad.fileformats.obj/objimage/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad.fileformats.obj/objimage/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad.fileformats.obj/objimage/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.obj/objimage/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad.fileformats.obj/objimage/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad.fileformats.obj/objimage/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.obj/objimage/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad.fileformats.obj/objimage/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.obj/objimage/load/#io.RawIOBase-str-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad.fileformats.obj/objimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [cache_data](/cad/python-net/aspose.cad.fileformats.obj/objimage/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container).<br/>Not implemented. |
| [get_strings](/cad/python-net/aspose.cad.fileformats.obj/objimage/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad.fileformats.obj/objimage/can_save/#aspose.cad.imageoptions.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [get_shapes](/cad/python-net/aspose.cad.fileformats.obj/objimage/get_shapes/#) | Gets data about drawable shapes for OBJ image.<br/>Each shape contains information about its name, material and faces.<br/>ObjFace includes data about correspoinding vertex, texture, and normal indices. |



### Example 


Loading of the drawing in OBJ format.

### See Also
* module [`aspose.cad.fileformats.obj`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`Image`](/cad/python-net/aspose.cad/image)
* class [`ObjImage`](/cad/python-net/aspose.cad.fileformats.obj/objimage)
