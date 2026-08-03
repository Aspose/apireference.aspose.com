---
title: "aspose::ocr::RecognitionSettings struct"
linktitle: "RecognitionSettings"
articleTitle: "RecognitionSettings"
second_title: "Aspose.                                   CR for C++"
description: "Settings for the image recognition."
type: docs
weight: 10
url: /cpp/aspose.ocr/recognitionsettings/
---

## RecognitionSettings struct

Settings for the image recognition. Contains elements that allow customizing the recognition process.

## Methods

| Name | Description |
| --- | --- |
| [all_image](./all_image/) | Disabled (false) by default. Turning on means recognizing the image as a single area. Useless in methods: asposeocr_recognize_receipt, aspose::ocr::recognize_receipt . |
| [allowed_characters](./allowed_characters/) | Allowed characters set. Determines the type of characters allowed for recognition result. allowed_characters contains enum characters_allowed_type value. |
| [alphabet](./alphabet/) | L"" by default (all alphabet allowed). Set of allowed characters in the alphabet (symbols for recognition) . |
| [auto_contrast](./auto_contrast/) | Allows using an additional contrast correction algorithm for the image before recognition. |
| [auto_denoising](./auto_denoising/) | Enables the use of an additional neural network for the image before recognition. Useful for images with noice, spots, flares, gradients, foreign elements. |
| [correct_skew](./correct_skew/) | Enabled (true) by default. Detects orientation and auto-rotate image if needed. |
| [defects](./defects/) | They will determine what types of defects need to be recognized at the moment. use case 1: defect_type = defect_type::ASPOSE_OCR_DETECT_DARK_IMAGES | defect_type::ASPOSE_OCR_DETECT_SALT_PEPPER_NOISE; use case 2: defect_type = defect_type::ASPOSE_OCR_DETECT_ALL;. |
| [detect_areas_mode](./detect_areas_mode/) | Allows to select the optimal mode for document type areas: document, photo, plain text, column, image. Useless in methods: asposeocr_recognize_receipt, aspose::ocr::recognize_receipt . |
| [filters](./filters/) | Allows to prepare the image for OCR by adjusting pre-processing methods. Allows to set 12 filters. Example to set: RecognitionSettings settings; settings.filters.filter_1 = OCR_IMG_PREPROCESS_GRAYSCALE; settings.filters.filter_2 = OCR_IMG_PREPROCESS_SCALE(2); settings.filters.filter_3 = OCR_IMG_PREPROCESS_THRESHOLD(200);. |
| [format](./format/) | Choose result format: simple text or JSON-formatted text saved in wchar_t* buffer. Default simple text. Supported formats: text, json. |
| [ignoredCharacters](./ignoredcharacters/) | L"" by default (all alphabet allowed). Sets blacklist for recognition symbols. |
| [language_alphabet](./language_alphabet/) | Multi-language by default. Language used for OCR. Supported languages: English (en), German (de), Portuguese (pt), Spanish (es), French (fr), Italian (it), Czech (cze), Danish (dan), Dutch (dum), Estonian (est), Finnish (fin), Latvian (lav), Lithuanian (lit), Norwegian (nor), Polish (pol), Romanian (rum), Serbo-Croatian (srp_hrv), Slovak (slk), Slovene (slv), Swedish (swe), Chinese (chi) |
| [lines_filtration](./lines_filtration/) | Disabled (false) by default. Allows to recognize text in the tables (regions surrounded lines). |
| [preprocess_area](./preprocess_area/) | User area to be pre-processed rect are = {3 , 50, 100, 100}. |
| [rectangles](./rectangles/) | Choose areas for recognition. rect rectangles[2] = { { 3, 50, 100, 70 }, { 3, 160, 100, 75 } };. |
| [rectangles_size](./rectangles_size/) | Set areas for recognition size. |
| [save_format](./save_format/) | Choose result save format for "page_save" method. Default format - txt. Supported formats: file_format::docx, file_format::txt, file_format::pdf, file_format::xlsx, file_format::json, file_format::xml, file_fromat::rtf. Doesn't work for other methods. |
| [skew](./skew/) | Rotate image on specified angle. Doesn't work if rectangles aDere specified. |
| [threshold_value](./threshold_value/) | Sets custom threshold value for image binarization. Range from 1 to 255. |
| [upscale_small_font](./upscale_small_font/) | Allows you to use additional algorithms specifically for small font recognition. Useful for images with small-size characters. |

