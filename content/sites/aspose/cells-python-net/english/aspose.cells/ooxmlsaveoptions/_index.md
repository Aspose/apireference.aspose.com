﻿---
title: OoxmlSaveOptions class
second_title: Aspose.Cells for Python via .NET API References
description: 
type: docs
weight: 1050
url: /aspose.cells/ooxmlsaveoptions/
is_root: false
---

## OoxmlSaveOptions class

Represents the options of saving office open xml file.



**Inheritance:** [`OoxmlSaveOptions`](/cells/python-net/aspose.cells/ooxmlsaveoptions) → 
[`SaveOptions`](/cells/python-net/aspose.cells/saveoptions)



The OoxmlSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/cells/python-net/aspose.cells/ooxmlsaveoptions/__init__/#) | Creates the options for saving office open xml file. |
| [`__init__(self, save_format)`](/cells/python-net/aspose.cells/ooxmlsaveoptions/__init__/#aspose.cells.saveformat) | Creates the options for saving office open xml file. |


### Properties
| Property | Description |
| :- | :- |
| [save_format](/cells/python-net/aspose.cells/ooxmlsaveoptions/save_format) | Gets the save file format. |
| [clear_data](/cells/python-net/aspose.cells/ooxmlsaveoptions/clear_data) | Make the workbook empty after saving the file. |
| [cached_file_folder](/cells/python-net/aspose.cells/ooxmlsaveoptions/cached_file_folder) | The folder for temporary files that may be used as data cache. |
| [validate_merged_areas](/cells/python-net/aspose.cells/ooxmlsaveoptions/validate_merged_areas) | Indicates whether validate merged cells before saving the file. |
| [merge_areas](/cells/python-net/aspose.cells/ooxmlsaveoptions/merge_areas) | Indicates whether merge the areas of conditional formatting and validation before saving the file. |
| [create_directory](/cells/python-net/aspose.cells/ooxmlsaveoptions/create_directory) | If true and the directory does not exist, the directory will be automatically created before saving the file. |
| [sort_names](/cells/python-net/aspose.cells/ooxmlsaveoptions/sort_names) | Indicates whether sorting defined names before saving file. |
| [sort_external_names](/cells/python-net/aspose.cells/ooxmlsaveoptions/sort_external_names) | Indicates whether sorting external defined names before saving file. |
| [refresh_chart_cache](/cells/python-net/aspose.cells/ooxmlsaveoptions/refresh_chart_cache) | Indicates whether refreshing chart cache data |
| [check_excel_restriction](/cells/python-net/aspose.cells/ooxmlsaveoptions/check_excel_restriction) | Whether check restriction of excel file when user modify cells related objects.<br/>For example, excel does not allow inputting string value longer than 32K.<br/>When you input a value longer than 32K, it will be truncated. |
| [update_smart_art](/cells/python-net/aspose.cells/ooxmlsaveoptions/update_smart_art) | Indicates whether updating smart art setting.<br/>The default value is false. |
| [encrypt_document_properties](/cells/python-net/aspose.cells/ooxmlsaveoptions/encrypt_document_properties) | Indicates whether encrypt document properties when saving as .xls file.<br/>The default value is true. |
| [export_cell_name](/cells/python-net/aspose.cells/ooxmlsaveoptions/export_cell_name) | Indicates if export cell name to Excel2007 .xlsx (.xlsm, .xltx, .xltm) file. <br/>If the output file may be accessed by SQL Server DTS, this value must be true.<br/>Setting the value to false will highly increase the performance and reduce the file size when creating large file.<br/>Default value is true. |
| [update_zoom](/cells/python-net/aspose.cells/ooxmlsaveoptions/update_zoom) | Indicates whether update scaling factor before saving the file <br/>if the PageSetup.FitToPagesWide and PageSetup.FitToPagesTall properties control how the worksheet is scaled. |
| [enable_zip64](/cells/python-net/aspose.cells/ooxmlsaveoptions/enable_zip64) | Always use ZIP64 extensions when writing zip archives, even when unnecessary. |
| [embed_ooxml_as_ole_object](/cells/python-net/aspose.cells/ooxmlsaveoptions/embed_ooxml_as_ole_object) | Indicates whether embedding Ooxml files of OleObject as ole object. |
| [compression_type](/cells/python-net/aspose.cells/ooxmlsaveoptions/compression_type) | Gets and sets the compression type for ooxml file. |
| [wps_compatibility](/cells/python-net/aspose.cells/ooxmlsaveoptions/wps_compatibility) | Indicates whether to make the xls more compatible with WPS. |



### See Also
* module [`aspose.cells`](..)
* class [`OoxmlSaveOptions`](/cells/python-net/aspose.cells/ooxmlsaveoptions)
* class [`SaveOptions`](/cells/python-net/aspose.cells/saveoptions)
