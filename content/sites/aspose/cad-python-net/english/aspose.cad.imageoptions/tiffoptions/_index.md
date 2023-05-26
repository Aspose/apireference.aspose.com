---
title: TiffOptions class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 280
url: /aspose.cad.imageoptions/tiffoptions/
is_root: false
---

## TiffOptions class

The tiff file format options.
Note that width and height tags will get overwritten on image creation by width and height parameters so there is no need to specify them directly.
Note that many options return a default value but that does not mean that this option is set explicitly as a tag value. To verify the tag is present use Tags property or the corresponding IsTagPresent method.



**Inheritance:** [`TiffOptions`](/cad/python-net/aspose.cad.imageoptions/tiffoptions) → 
[`ImageOptionsBase`](/cad/python-net/aspose.cad/imageoptionsbase)



The TiffOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.imageoptions/tiffoptions/__init__/#aspose.cad.fileformats.tiff.enums.TiffExpectedFormat-aspose.cad.fileformats.tiff.enums.TiffByteOrder) | Initializes a new instance of the [`TiffOptions`](/cad/python-net/aspose.cad.imageoptions/tiffoptions) class. |
| [__init__](/cad/python-net/aspose.cad.imageoptions/tiffoptions/__init__/#aspose.cad.fileformats.tiff.enums.TiffExpectedFormat) | Initializes a new instance of the [`TiffOptions`](/cad/python-net/aspose.cad.imageoptions/tiffoptions) class. By default little endian convention is used. |
| [__init__](/cad/python-net/aspose.cad.imageoptions/tiffoptions/__init__/#aspose.cad.imageoptions.TiffOptions) | Initializes a new instance of the [`TiffOptions`](/cad/python-net/aspose.cad.imageoptions/tiffoptions) class. |
| [__init__](/cad/python-net/aspose.cad.imageoptions/tiffoptions/__init__/#list) | Initializes a new instance of the [`TiffOptions`](/cad/python-net/aspose.cad.imageoptions/tiffoptions) class. |


### Properties
| Property | Description |
| :- | :- |
| [target_format](/cad/python-net/aspose.cad.imageoptions/tiffoptions/target_format) |  |
| [rotation](/cad/python-net/aspose.cad.imageoptions/tiffoptions/rotation) | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [layers](/cad/python-net/aspose.cad.imageoptions/tiffoptions/layers) | Gets or sets a of layer names must be exported.<br/>All data will be exported without layers if names is not sets. |
| [xmp_data](/cad/python-net/aspose.cad.imageoptions/tiffoptions/xmp_data) | Gets or sets the XMP metadata container. |
| [source](/cad/python-net/aspose.cad.imageoptions/tiffoptions/source) | Gets or sets the source to create image in. |
| [palette](/cad/python-net/aspose.cad.imageoptions/tiffoptions/palette) | Gets or sets the color palette. |
| [resolution_settings](/cad/python-net/aspose.cad.imageoptions/tiffoptions/resolution_settings) | Gets or sets the resolution settings. |
| [vector_rasterization_options](/cad/python-net/aspose.cad.imageoptions/tiffoptions/vector_rasterization_options) | Gets or sets the vector rasterization options. |
| [timeout](/cad/python-net/aspose.cad.imageoptions/tiffoptions/timeout) | Timeout value for export operation (in milliseconds) |
| [pc_3_file](/cad/python-net/aspose.cad.imageoptions/tiffoptions/pc_3_file) | Gets or sets the PC3 file full name. |
| [user_watermark_text](/cad/python-net/aspose.cad.imageoptions/tiffoptions/user_watermark_text) | Text for user-generated watermark |
| [user_watermark_color](/cad/python-net/aspose.cad.imageoptions/tiffoptions/user_watermark_color) | Color for user-generated watermark |
| [is_valid](/cad/python-net/aspose.cad.imageoptions/tiffoptions/is_valid) | Gets a value indicating whether the [`TiffOptions`](/cad/python-net/aspose.cad.imageoptions/tiffoptions) have been properly configured. Use Validate method as to find the failure reason. |
| [artist](/cad/python-net/aspose.cad.imageoptions/tiffoptions/artist) | Gets or sets the artist. |
| [byte_order](/cad/python-net/aspose.cad.imageoptions/tiffoptions/byte_order) | Gets or sets a value indicating the tiff byte order. |
| [bits_per_sample](/cad/python-net/aspose.cad.imageoptions/tiffoptions/bits_per_sample) | Gets or sets the bits per sample. |
| [compression](/cad/python-net/aspose.cad.imageoptions/tiffoptions/compression) | Gets or sets the compression. |
| [copyright](/cad/python-net/aspose.cad.imageoptions/tiffoptions/copyright) | Gets or sets the copyright. |
| [color_map](/cad/python-net/aspose.cad.imageoptions/tiffoptions/color_map) | Gets or sets the color map. |
| [date_time](/cad/python-net/aspose.cad.imageoptions/tiffoptions/date_time) | Gets or sets the date and time. |
| [document_name](/cad/python-net/aspose.cad.imageoptions/tiffoptions/document_name) | Gets or sets the name of the document. |
| [alpha_storage](/cad/python-net/aspose.cad.imageoptions/tiffoptions/alpha_storage) | Gets or sets the alpha storage option. Options other than [`TiffAlphaStorage.UNSPECIFIED`](/cad/python-net/aspose.cad.fileformats.tiff.enums/tiffalphastorage#UNSPECIFIED)<br/>are used when there are more than 3 [`TiffOptions.samples_per_pixel`](/cad/python-net/aspose.cad.imageoptions/tiffoptions#samples_per_pixel) defined. |
| [is_extra_samples_present](/cad/python-net/aspose.cad.imageoptions/tiffoptions/is_extra_samples_present) | Gets a value indicating whether the extra samples is present. |
| [fill_order](/cad/python-net/aspose.cad.imageoptions/tiffoptions/fill_order) | Gets or sets the byte bits fill order. |
| [half_tone_hints](/cad/python-net/aspose.cad.imageoptions/tiffoptions/half_tone_hints) | Gets or sets the halftone hints. |
| [image_description](/cad/python-net/aspose.cad.imageoptions/tiffoptions/image_description) | Gets or sets the image description. |
| [ink_names](/cad/python-net/aspose.cad.imageoptions/tiffoptions/ink_names) | Gets or sets the ink names. |
| [scanner_manufacturer](/cad/python-net/aspose.cad.imageoptions/tiffoptions/scanner_manufacturer) | Gets or sets the scanner manufacturer. |
| [max_sample_value](/cad/python-net/aspose.cad.imageoptions/tiffoptions/max_sample_value) | Gets or sets the max sample value. |
| [min_sample_value](/cad/python-net/aspose.cad.imageoptions/tiffoptions/min_sample_value) | Gets or sets the min sample value. |
| [scanner_model](/cad/python-net/aspose.cad.imageoptions/tiffoptions/scanner_model) | Gets or sets the scanner model. |
| [orientation](/cad/python-net/aspose.cad.imageoptions/tiffoptions/orientation) | Gets or sets the orientation. |
| [page_name](/cad/python-net/aspose.cad.imageoptions/tiffoptions/page_name) | Gets or sets the page name. |
| [page_number](/cad/python-net/aspose.cad.imageoptions/tiffoptions/page_number) | Gets or sets the page number tag. |
| [photometric](/cad/python-net/aspose.cad.imageoptions/tiffoptions/photometric) | Gets or sets the photometric. |
| [planar_configuration](/cad/python-net/aspose.cad.imageoptions/tiffoptions/planar_configuration) | Gets or sets the planar configuration. |
| [resolution_unit](/cad/python-net/aspose.cad.imageoptions/tiffoptions/resolution_unit) | Gets or sets the resolution unit. |
| [rows_per_strip](/cad/python-net/aspose.cad.imageoptions/tiffoptions/rows_per_strip) | Gets or sets the rows per strip. |
| [sample_format](/cad/python-net/aspose.cad.imageoptions/tiffoptions/sample_format) | Gets or sets the sample format. |
| [samples_per_pixel](/cad/python-net/aspose.cad.imageoptions/tiffoptions/samples_per_pixel) | Gets the samples per pixel. To change this property value use the [`TiffOptions.bits_per_sample`](/cad/python-net/aspose.cad.imageoptions/tiffoptions#bits_per_sample) property setter. |
| [smax_sample_value](/cad/python-net/aspose.cad.imageoptions/tiffoptions/smax_sample_value) | Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [smin_sample_value](/cad/python-net/aspose.cad.imageoptions/tiffoptions/smin_sample_value) | Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [software_type](/cad/python-net/aspose.cad.imageoptions/tiffoptions/software_type) | Gets or sets the software type. |
| [strip_byte_counts](/cad/python-net/aspose.cad.imageoptions/tiffoptions/strip_byte_counts) | Gets or sets the strip byte counts. |
| [strip_offsets](/cad/python-net/aspose.cad.imageoptions/tiffoptions/strip_offsets) | Gets or sets the strip offsets. |
| [sub_file_type](/cad/python-net/aspose.cad.imageoptions/tiffoptions/sub_file_type) | Gets or sets a general indication of the kind of data contained in this subfile. |
| [target_printer](/cad/python-net/aspose.cad.imageoptions/tiffoptions/target_printer) | Gets or sets the target printer. |
| [threshholding](/cad/python-net/aspose.cad.imageoptions/tiffoptions/threshholding) | Gets or sets the threshholding. |
| [total_pages](/cad/python-net/aspose.cad.imageoptions/tiffoptions/total_pages) | Gets the total pages. |
| [xposition](/cad/python-net/aspose.cad.imageoptions/tiffoptions/xposition) | Gets or sets the x position. |
| [xresolution](/cad/python-net/aspose.cad.imageoptions/tiffoptions/xresolution) | Gets or sets the x resolution. |
| [yposition](/cad/python-net/aspose.cad.imageoptions/tiffoptions/yposition) | Gets or sets the y position. |
| [yresolution](/cad/python-net/aspose.cad.imageoptions/tiffoptions/yresolution) | Gets or sets the y resolution. |
| [fax_t4_options](/cad/python-net/aspose.cad.imageoptions/tiffoptions/fax_t4_options) | Gets or sets the fax t4 options. |
| [predictor](/cad/python-net/aspose.cad.imageoptions/tiffoptions/predictor) | Gets or sets the predictor for LZW compression. |
| [image_length](/cad/python-net/aspose.cad.imageoptions/tiffoptions/image_length) | Gets or sets the image length. |
| [image_width](/cad/python-net/aspose.cad.imageoptions/tiffoptions/image_width) | Gets or sets the image width. |
| [tags](/cad/python-net/aspose.cad.imageoptions/tiffoptions/tags) | Gets or sets the tags. |
| [valid_tag_count](/cad/python-net/aspose.cad.imageoptions/tiffoptions/valid_tag_count) | Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved. |
| [bits_per_pixel](/cad/python-net/aspose.cad.imageoptions/tiffoptions/bits_per_pixel) | Gets the bits per pixel. |


### Methods
| Method | Description |
| :- | :- |
| [is_tag_present](/cad/python-net/aspose.cad.imageoptions/tiffoptions/is_tag_present/#aspose.cad.fileformats.tiff.enums.TiffTags) | Determines whether tag is present in the options or not. |
| [get_valid_tags_count](/cad/python-net/aspose.cad.imageoptions/tiffoptions/get_valid_tags_count/#list) | Gets the valid tags count. |
| [remove_tag](/cad/python-net/aspose.cad.imageoptions/tiffoptions/remove_tag/#aspose.cad.fileformats.tiff.enums.TiffTags) | Removes the tag. |
| [validate](/cad/python-net/aspose.cad.imageoptions/tiffoptions/validate/#) | Validates if options have valid combination of tags |
| [add_tags](/cad/python-net/aspose.cad.imageoptions/tiffoptions/add_tags/#list) | Adds the tags. |
| [add_tag](/cad/python-net/aspose.cad.imageoptions/tiffoptions/add_tag/#aspose.cad.fileformats.tiff.TiffDataType) | Adds a new tag. |
| [get_tag_by_type](/cad/python-net/aspose.cad.imageoptions/tiffoptions/get_tag_by_type/#aspose.cad.fileformats.tiff.enums.TiffTags) | Gets the instance of the tag by type. |



### See Also
* module [`aspose.cad.imageoptions`](..)
* class [`ImageOptionsBase`](/cad/python-net/aspose.cad/imageoptionsbase)
* class [`TiffOptions`](/cad/python-net/aspose.cad.imageoptions/tiffoptions)
