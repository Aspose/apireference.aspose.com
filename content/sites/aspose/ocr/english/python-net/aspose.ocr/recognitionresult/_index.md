---
title: RecognitionResult
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 40
url: /ocr/python-net/aspose.ocr/recognitionresult/
---

## RecognitionResult class

The results of the image recognition.<br/>            Contains elements with recognition information and methods for result export.

The RecognitionResult type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|recognition_lines_result|Gets a list of recognition results with a list of rows (Rectangles).|
|recognition_areas_text|Gets list recognition results of a list of areas (Rectangles).|
|recognition_characters_list|A set of characters found by the recognition algorithm and arranged in descending order of probability.|
|recognition_text|Gets recognition result in one string.|
|file_name|Full path to the file.|
|skew|Gets skew angle.|
|warnings|Gets list of the warning messages describing non-critical faults appeared during generation.|
## Methods
| Name | Description |
| :- | :- |
|save(full_file_name, save_format, apply_spelling_correction, language, dictionary_path)|Saves the document as the plain text, PDF or Microsoft Word Document.|
|save(stream, save_format, apply_spelling_correction, language, dictionary_path)|Saves the document as the plain text, PDF or Microsoft Word Document.|
|get_spell_check_corrected_text(language, dictionary_path)|Corrects text (replaces misspelled words).|
|get_spell_check_error_list(language, dictionary_path)|Find the misspelled words with suggested spellings for a given input text.|
|get_json(is_readable)|Form JSON string with recognition results.|
|get_xml()|Form XML string with recognition results.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

