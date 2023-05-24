---
title: TiffUnknownType class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 150
url: /aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/
is_root: false
---

## TiffUnknownType class

The unknown tiff type. In case the tiff tag cannot be recognized this type is instantinated.



**Inheritance:** [`TiffUnknownType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype) → 
[`TiffDataType`](/cad/python-net/aspose.cad.fileformats.tiff/tiffdatatype)



The TiffUnknownType type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/__init__/#aspose.cad.fileformats.tiff.filemanagement.TiffStreamReader-int-int-int-int) | Initializes a new instance of the [`TiffUnknownType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype) class. |


### Properties
| Property | Description |
| :- | :- |
| [count](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/count) | Gets the count of elements. |
| [id](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/id) | Gets tag id integer representation. |
| [tag_id](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/tag_id) | Gets the tag id. |
| [tag_type](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/tag_type) | Gets the tag type. |
| [aligned_data_size](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/aligned_data_size) | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [data_size](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/data_size) | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [value](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/value) | Gets or sets the value this data type contains. |
| [is_valid](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/is_valid) | Gets a value indicating whether tag data is valid. The valid tag contains data which may be preserved. The invalid tag cannot be stored. |
| [offset_or_value](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/offset_or_value) | Gets the offset value for an additional data or value itself in case count is 1. |
| [stream](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/stream) | Gets the stream to read additional data from. |


### Methods
| Method | Description |
| :- | :- |
| [read_tag](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/read_tag/#aspose.cad.fileformats.tiff.filemanagement.TiffStreamReader-int) | Reads the tag data. |
| [compare_to](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/compare_to/#any) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| [deep_clone](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/deep_clone/#) | Performs a deep clone of this instance. |
| [write_tag](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/write_tag/#aspose.cad.fileformats.tiff.filemanagement.TiffStreamWriter-int) | Writes the tag data. |
| [write_additional_data](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/write_additional_data/#aspose.cad.fileformats.tiff.filemanagement.TiffStreamWriter) | Writes the additional tag data. |



### Remarks 


Note the [`TiffUnknownType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype) is not serialized back to stream.

### See Also
* module [`aspose.cad.fileformats.tiff.tifftagtypes`](..)
* class [`TiffDataType`](/cad/python-net/aspose.cad.fileformats.tiff/tiffdatatype)
* class [`TiffUnknownType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype)
