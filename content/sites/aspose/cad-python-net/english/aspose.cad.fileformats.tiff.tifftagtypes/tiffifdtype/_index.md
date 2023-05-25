---
title: TiffIfdType class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/
is_root: false
---

## TiffIfdType class

Represents the TIFF Exif image file directory type class.



**Inheritance:** [`TiffIfdType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype) → 
[`TiffCommonArrayType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffcommonarraytype) → 
[`TiffDataType`](/cad/python-net/aspose.cad.fileformats.tiff/tiffdatatype)



The TiffIfdType type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/__init__/#aspose.cad.fileformats.tiff.enums.TiffTags) | Initializes a new instance of the [`TiffIfdType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype) class. |
| [__init__](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/__init__/#int) | Initializes a new instance of the [`TiffIfdType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype) class. |


### Properties
| Property | Description |
| :- | :- |
| [count](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/count) | Gets the count of elements. |
| [id](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/id) | Gets tag id integer representation. |
| [tag_id](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/tag_id) | Gets the tag id. |
| [tag_type](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/tag_type) | Gets the tag type. |
| [aligned_data_size](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/aligned_data_size) | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [data_size](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/data_size) | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [value](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/value) | Gets or sets the value this data type contains. |
| [is_valid](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/is_valid) | Gets a value indicating whether tag data is valid. The valid tag contains data which may be preserved. The invalid tag cannot be stored. |
| [element_size](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/element_size) | Gets the element size in bytes. |
| [values_container](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/values_container) | Gets the values container. |
| [values](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/values) | Gets or sets the values. |


### Methods
| Method | Description |
| :- | :- |
| [read_tag](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/read_tag/#aspose.cad.fileformats.tiff.filemanagement.TiffStreamReader-int) | Reads the tag data. |
| [compare_to](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/compare_to/#any) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| [deep_clone](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/deep_clone/#) | Performs a deep clone of this instance. |
| [write_tag](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/write_tag/#aspose.cad.fileformats.tiff.filemanagement.TiffStreamWriter-int) | Writes the tag data. |
| [write_additional_data](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype/write_additional_data/#aspose.cad.fileformats.tiff.filemanagement.TiffStreamWriter) | Writes the additional tag data. |



### See Also
* module [`aspose.cad.fileformats.tiff.tifftagtypes`](..)
* class [`TiffCommonArrayType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffcommonarraytype)
* class [`TiffDataType`](/cad/python-net/aspose.cad.fileformats.tiff/tiffdatatype)
* class [`TiffIfdType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffifdtype)
