---
title: CgmFile class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.cgm/cgmfile/
is_root: false
---

## CgmFile class

CGM image class.



The CgmFile type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/name) | Gets the name of the file |
| [colour_index_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/colour_index_precision) | Gets or sets the current reading colour index precision |
| [colour_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/colour_precision) | Gets or sets the current reading colour precision |
| [colour_model](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/colour_model) | Gets or sets the current reading colour model |
| [colour_selection_mode](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/colour_selection_mode) | Gets or sets the current reading colour selecion mode |
| [colour_value_extent_minimum_color_value_rgb](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/colour_value_extent_minimum_color_value_rgb) | Gets or sets the current reading MinimumColorValueRGB |
| [colour_value_extent_maximum_color_value_rgb](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/colour_value_extent_maximum_color_value_rgb) | Gets or sets the current reading MaximumColorValueRGB |
| [device_viewport_specification_mode](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/device_viewport_specification_mode) | Gets or sets the current reading DeviceViewportSpecificationMode |
| [edge_width_specification_mode](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/edge_width_specification_mode) | Gets or sets the current reading EdgeWidthSpecificationMode |
| [index_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/index_precision) | Gets or sets the current reading Index Precision |
| [integer_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/integer_precision) | Gets or sets the current reading integer Precision |
| [name_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/name_precision) | Gets or sets the current reading name Precision |
| [vdc_integer_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/vdc_integer_precision) | Gets or sets the current reading vdc integer Precision |
| [vdc_real_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/vdc_real_precision) | Gets or sets the current reading vdc real Precision |
| [real_precision](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/real_precision) | Gets or sets the current reading real Precision |
| [real_precision_processed](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/real_precision_processed) | Gets or sets the current reading real Precision processed flag |
| [line_width_specification_mode](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/line_width_specification_mode) | Gets or sets the current reading LineWidthSpecificationMode |
| [marker_size_specification_mode](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/marker_size_specification_mode) | Gets or sets the current reading MarkerSizeSpecificationMode |
| [interior_style_specification_mode](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/interior_style_specification_mode) | Gets or sets the current reading interior style SpecificationMode |
| [restricted_text_type](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/restricted_text_type) | Gets or sets the current reading RestrictedTextType |
| [vdc_type](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/vdc_type) | Gets or sets the current reading VDC Type |
| [commands](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/commands) | The read CGM commands |
| [messages](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/messages) | Any messages occured while reading or writing the file |


### Methods
| Method | Description |
| :- | :- |
| [reset_meta_definitions](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/reset_meta_definitions/#) | Resets settings like VDCRealPrecision or ColourModel |
| [apply_values](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/apply_values/#aspose.cad.fileformats.cgm.CgmFile) | Copies the current meta information |
| [contains_text_element](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/contains_text_element/#str) | Determines whether any text element equals the specified text. |
| [get_meta_title](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/get_meta_title/#) | Gets the title. |
| [get_graphic_name](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/get_graphic_name/#) | Gets the title of the illustration. |
| [get_figure_item_texts](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/get_figure_item_texts/#bool) | Gets all texts of the figure items. |
| [contains_figure_item_text](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/contains_figure_item_text/#str) | Determines whether CGM contains a specific figure item text. |
| [contains_consumable_number](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/contains_consumable_number/#str) | Determines whether CGM contains a specific consumable number text |
| [contains_torque_text_to_fig_item](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/contains_torque_text_to_fig_item/#str-str) | Determines whether the torque text ("20 Nm (177 lb-in)" exists nearby the figure item) |
| [get_information](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/get_information/#aspose.cad.fileformats.cgm.commands.TextCommand) |  |
| [is_written_down_to_up](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/is_written_down_to_up/#aspose.cad.fileformats.cgm.commands.TextCommand) | Determines whether text is rotated 90 dec counterwise |
| [get_rectangles](/cad/python-net/aspose.cad.fileformats.cgm/cgmfile/get_rectangles/#) | Gets all found rectangles. |



### See Also
* module [`aspose.cad.fileformats.cgm`](..)
