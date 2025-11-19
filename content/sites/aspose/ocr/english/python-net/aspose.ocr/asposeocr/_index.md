---
title: AsposeOcr
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 10
url: /python-net/aspose.ocr/asposeocr/
---

## AsposeOcr class

Main API for Aspose OCR library

The AsposeOcr type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|AsposeOcr()|Initializes a new instance of the [AsposeOcr](/ocr/python-net/aspose.ocr/asposeocr/) class.<br/>            Empty constructor.|
## Properties
| Name | Description |
| :- | :- |
|set_debug_mode|  |
|set_debug_mode_save_directory|  |
## Methods
| Name | Description |
| :- | :- |
|recognize(images)|Recognizes text on images / documents.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, directory, arrays, archives.|
|recognize(images, preset)|  |
|recognize(images, settings)|Recognizes text on images / documents.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, directory, arrays, archives.|
|recognize_receipt(images)|Recognizes text on receipts.|
|recognize_receipt(images, settings)|Recognizes text on receipts.|
|recognize_invoice(images)|Recognizes text on invoices.|
|recognize_invoice(images, settings)|Recognizes text on invoices.|
|recognize_id_card(images)|Recognizes text on ID card.|
|recognize_id_card(images, settings)|Recognizes text on ID card.|
|recognize_car_plate(images)|Recognizes text on car plate.|
|recognize_car_plate(images, settings)|Recognizes text on car plate.|
|recognize_passport(images)|Recognizes text on passport.|
|recognize_passport(images, settings)|Recognizes text on passport.|
|recognize_lines(images)|Recognizes images that contain single line of text.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.|
|recognize_lines(images, settings)|Recognizes images that contain single line of text.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.|
|detect_rectangles(images)|Detects text areas on images.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.|
|detect_rectangles(images, areas_type, detect_areas)|Detects text areas on images.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.|
|recognize_characters(images)|Detects symbols on images.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.|
|recognize_characters(images, detect_areas_mode, language)|Detects symbols on images.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.|
|save_multipage_document(full_file_name, save_format, results, embedded_font_path, optimize_pdf)|  |
|save_multipage_document(full_file_name, save_format, results, apply_spelling_correction, language, dictionary_path, embedded_font_path, optimize_pdf)|  |
|save_multipage_document(full_file_name, save_format, results, optimize_pdf)|  |
|save_multipage_document(full_file_name, save_format, results)|  |
|save_multipage_document(stream, save_format, results)|  |
|save_multipage_document(stream, save_format, results, optimize_pdf)|  |
|save_multipage_document(stream, save_format, results, embedded_font_path)|  |
|save_multipage_document(stream, save_format, results, embedded_font_path, optimize_pdf)|  |
|save_multipage_document(stream, save_format, results, apply_spelling_correction, language, dictionary_path, embedded_font_path)|  |
|save_multipage_document(stream, save_format, results, apply_spelling_correction, language, dictionary_path, embedded_font_path, optimize_pdf)|  |
|recognize_fast(images)|Recognizes text on images / documents.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, directory, arrays, archives.|
|recognize_handwritten_text(images)|Recognizes handwritten text on images.|
|detect_document_layout(images)|  |
|recognize_formula(images, detect_areas)|  |
|calculate_skew(images)|Calculates the skew angles of an images.<br/>            Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives.|
|detect_defects(images, defect_type)|Automatically find problematic areas of an image that can significantly impact the accuracy of OCR.<br/>            Supports PNG, JPEG, BMP, TIFF, JFIF, and GIF images provided as a file, stream, or pixel array. Supports bulk recognition.|
|detect_languages(images)|  |
|image_has_text(full_path, text, settings, ignore_case, auto_skew)|Check if the image contains the provided text fragment.|
|compare_image_texts(full_path1, full_path2, settings, ignore_case)|Check if two images contain the same text.|
|image_text_diff(full_path1, full_path2, settings, ignore_case, auto_skew)|Compare the texts on the two images and return a number representing how similar they are (0 to 1).|
|correct_spelling(text, language, dictionary_path)|Corrects text (replaces misspelled words).|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

