---
title: ThumbnailResource class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.cad.fileformats.psd.resources/thumbnailresource/
is_root: false
---

## ThumbnailResource class

The thumbnail resource block.



**Inheritance:** [`ThumbnailResource`](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource) → 
[`ResourceBlock`](/cad/python-net/aspose.cad.fileformats.psd/resourceblock)



The ThumbnailResource type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/__init__/#) | Initializes a new instance of the [`ThumbnailResource`](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource) class. |


### Properties
| Property | Description |
| :- | :- |
| [signature](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/signature) | Gets the resource signature. Should be always '8BIM'. |
| [id](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/id) | Gets or sets the unique identifier for the resource. |
| [name](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/name) | Gets or sets the resource name. Pascal string, padded to make the size even (a null name consists of two bytes of 0). |
| [data_size](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/data_size) | Gets the resource data size in bytes. |
| [size](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/size) | Gets the resource block size in bytes including its data. |
| [minimal_version](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/minimal_version) | Gets the minimal required psd version. |
| [RESOUCE_BLOCK_SIGNATURE](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/resouce_block_signature) | The resource signature. |
| [jpeg_options](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/jpeg_options) | Gets or sets the JPEG options. Suitable when thumbnail resource is saved into JPEG file format only. This option has no effect when RAW format is defined. |
| [width](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/width) | Gets or sets the width of thumbnail in pixels. |
| [height](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/height) | Gets or sets the height of thumbnail in pixels. |
| [width_bytes](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/width_bytes) | Gets the row width in bytes. |
| [total_size](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/total_size) | Gets the total data size. |
| [size_after_compression](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/size_after_compression) | Gets or sets the size after compression. Used for consistency check. |
| [bits_pixel](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/bits_pixel) | Gets or sets the bits pixel. |
| [planes_count](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/planes_count) | Gets or sets the planes count. |
| [thumbnail_argb_32_data](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/thumbnail_argb_32_data) | Gets or sets the 32-bit ARGB thumbnail data. |
| [thumbnail_data](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/thumbnail_data) | Gets or sets the thumbnail data. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/save/#aspose.cad.StreamContainer) | Saves the resource block to the specified stream. |
| [validate_values](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource/validate_values/#) | Validates the resource values. |



### See Also
* module [`aspose.cad.fileformats.psd.resources`](..)
* class [`ResourceBlock`](/cad/python-net/aspose.cad.fileformats.psd/resourceblock)
* class [`ThumbnailResource`](/cad/python-net/aspose.cad.fileformats.psd.resources/thumbnailresource)
