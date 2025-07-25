﻿---
title: XlsxSaveOptions class
linktitle: XlsxSaveOptions class
articleTitle: XlsxSaveOptions class
second_title: Aspose.Words for Python
description: "aspose.words.saving.XlsxSaveOptions class. Can be used to specify additional options when saving a document into the [SaveFormat.XLSX](../../aspose.words/saveformat/#XLSX) format"
type: docs
weight: 940
url: /python-net/aspose.words.saving/xlsxsaveoptions/
---

## XlsxSaveOptions class

Can be used to specify additional options when saving a document into the [SaveFormat.XLSX](../../aspose.words/saveformat/#XLSX)
format.
To learn more, visit the [Specify
            Save Options](https://docs.aspose.com/words/python-net/specify-save-options/) documentation article.




**Inheritance:** [XlsxSaveOptions](./) → [SaveOptions](../saveoptions/)

### Constructors
| Name | Description |
| --- | --- |
| [XlsxSaveOptions()](./__init__/#default) | The default constructor. |

### Properties

| Name | Description |
| --- | --- |
| [allow_embedding_post_script_fonts](../saveoptions/allow_embedding_post_script_fonts/) | Gets or sets a boolean value indicating whether to allow embedding fonts with PostScript outlines when embedding TrueType fonts in a document upon it is saved. The default value is ``False``.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [compression_level](./compression_level/) | Specifies the compression level used to save document. The default value is [CompressionLevel.NORMAL](../compressionlevel/#NORMAL). |
| [date_time_parsing_mode](./date_time_parsing_mode/) | Gets or sets the mode that specifies how document text is parsed to identify date and time values. The default value is [XlsxDateTimeParsingMode.USE_CURRENT_LOCALE](../xlsxdatetimeparsingmode/#USE_CURRENT_LOCALE). |
| [default_template](../saveoptions/default_template/) | Gets or sets path to default template (including filename). Default value for this property is **empty string** ().<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [dml_3d_effects_rendering_mode](../saveoptions/dml_3d_effects_rendering_mode/) | Gets or sets a value determining how 3D effects are rendered.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [dml_effects_rendering_mode](../saveoptions/dml_effects_rendering_mode/) | Gets or sets a value determining how DrawingML effects are rendered.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [dml_rendering_mode](../saveoptions/dml_rendering_mode/) | Gets or sets a value determining how DrawingML shapes are rendered.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [export_generator_name](../saveoptions/export_generator_name/) | When ``True``, causes the name and version of Aspose.Words to be embedded into produced files. Default value is ``True``.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [iml_rendering_mode](../saveoptions/iml_rendering_mode/) | Gets or sets a value determining how ink (InkML) objects are rendered.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [memory_optimization](../saveoptions/memory_optimization/) | Gets or sets value determining if memory optimization should be performed before saving the document. Default value for this property is ``False``.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [pretty_format](../saveoptions/pretty_format/) | When ``True``, pretty formats output where applicable. Default value is ``False``.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [progress_callback](../saveoptions/progress_callback/) | Called during saving a document and accepts data about saving progress.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [save_format](./save_format/) | Specifies the format in which the document will be saved if this save options object is used. Can only be [SaveFormat.XLSX](../../aspose.words/saveformat/#XLSX). |
| [section_mode](./section_mode/) | Gets or sets the way how sections are handled when saving to the output XLSX document. The default value is [XlsxSectionMode.MULTIPLE_WORKSHEETS](../xlsxsectionmode/#MULTIPLE_WORKSHEETS). |
| [temp_folder](../saveoptions/temp_folder/) | Specifies the folder for temporary files used when saving to a DOC or DOCX file. By default this property is ``None`` and no temporary files are used.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [update_ambiguous_text_font](../saveoptions/update_ambiguous_text_font/) | Determines whether the font attributes will be changed according to the character code being used.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [update_created_time_property](../saveoptions/update_created_time_property/) | Gets or sets a value determining whether the [BuiltInDocumentProperties.created_time](../../aspose.words.properties/builtindocumentproperties/created_time/) property is updated before saving. Default value is ``False``;<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [update_fields](../saveoptions/update_fields/) | Gets or sets a value determining if fields of certain types should be updated before saving the document to a fixed page format. Default value for this property is ``True``.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [update_last_printed_property](../saveoptions/update_last_printed_property/) | Gets or sets a value determining whether the [BuiltInDocumentProperties.last_printed](../../aspose.words.properties/builtindocumentproperties/last_printed/) property is updated before saving.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [update_last_saved_time_property](../saveoptions/update_last_saved_time_property/) | Gets or sets a value determining whether the [BuiltInDocumentProperties.last_saved_time](../../aspose.words.properties/builtindocumentproperties/last_saved_time/) property is updated before saving.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [use_anti_aliasing](../saveoptions/use_anti_aliasing/) | Gets or sets a value determining whether or not to use anti-aliasing for rendering.<br>(Inherited from [SaveOptions](../saveoptions/)) |
| [use_high_quality_rendering](../saveoptions/use_high_quality_rendering/) | Gets or sets a value determining whether or not to use high quality (i.e. slow) rendering algorithms.<br>(Inherited from [SaveOptions](../saveoptions/)) |

### Methods

| Name | Description |
| --- | --- |
|[ create_save_options(save_format)](../saveoptions/create_save_options/#saveformat) | Creates a save options object of a class suitable for the specified save format.<br>(Inherited from [SaveOptions](../saveoptions/)) |
|[ create_save_options(file_name)](../saveoptions/create_save_options/#str) | Creates a save options object of a class suitable for the file extension specified in the given file name.<br>(Inherited from [SaveOptions](../saveoptions/)) |

### Examples

Shows how to compress XLSX document.

```python
doc = aw.Document(file_name=MY_DIR + 'Shape with linked chart.docx')
xlsx_save_options = aw.saving.XlsxSaveOptions()
xlsx_save_options.compression_level = aw.saving.CompressionLevel.MAXIMUM
xlsx_save_options.save_format = aw.SaveFormat.XLSX
doc.save(file_name=ARTIFACTS_DIR + 'XlsxSaveOptions.CompressXlsx.xlsx', save_options=xlsx_save_options)
```

### See Also

* module [aspose.words.saving](../)
* class [SaveOptions](../saveoptions/)

