---
title: "aspose::ocr namespace"
linktitle: "aspose::ocr"
articleTitle: "aspose::ocr"
second_title: "Aspose.                                   CR for C++"
description: "The aspose::ocr namespace offers core OCR types and utilities for configuring, processing, and retrieving text recognition results in Aspose.OCR for C++."
type: docs
weight: 10
url: /cpp/aspose.ocr/
---

## aspose::ocr namespace

This namespace groups the essential classes and enums that define input images, defect and recognition areas, logging settings, progress monitoring, and detailed recognition results such as pages and text blocks, enabling fine‑grained control over OCR operations in C++ applications.


## Classes

| Name | Description |
| --- | --- |
| [AsposeOCRDefectArea](./asposeocrdefectarea/) |  |
| [AsposeOCRInput](./asposeocrinput/) |  |
| [AsposeOCRLogSettings](./asposeocrlogsettings/) | Structure for describing a logging settings. |
| [AsposeOCRProgress](./asposeocrprogress/) | This structure contains a current recognition state. |
| [AsposeOCRRecognitionArea](./asposeocrrecognitionarea/) |  |
| [AsposeOCRRecognitionResult](./asposeocrrecognitionresult/) |  |
| [AsposeOCRRecognizedPage](./asposeocrrecognizedpage/) |  |
| [ImageDescriptor](./imagedescriptor/) |  |
| [OCR_IMG_Autoskew](./ocr_img_autoskew/) | Autoskew filter Use in C++ -compatible API. |
| [OCR_IMG_Binarize](./ocr_img_binarize/) | Converts an image to black-and-white image. Binary images are images whose pixel |
| [OCR_IMG_Contrast_Correction](./ocr_img_contrast_correction/) | Contrast correction filter. Use in C++ -compatible API. |
| [OCR_IMG_Denoising](./ocr_img_denoising/) | Image denoising filter Use in C++ -compatible API. |
| [OCR_IMG_Dilate](./ocr_img_dilate/) | Dilation adds pixels to the boundaries of objects in an image. Use in C++ -compa |
| [OCR_IMG_Grayscale](./ocr_img_grayscale/) | Converts an image to grayscale image. Grayscale image have 256 level of light in |
| [OCR_IMG_Invert](./ocr_img_invert/) | Automatically inverts colors in a document image. Use in C++ -compatible API. |
| [OCR_IMG_Median](./ocr_img_median/) | The median filter run through each element of the image and replace each pixel w |
| [OCR_IMG_Resize](./ocr_img_resize/) | Rescale image - Upscale or downscale image resolution. Use in C++ -compatible AP |
| [OCR_IMG_Rotate](./ocr_img_rotate/) | Rotate original image. Use in C++ -compatible API. |
| [OCR_IMG_Scale](./ocr_img_scale/) | Rescale image - Upscale or downscale image resolution. Use in C++ -compatible AP |
| [OCR_IMG_Threshold](./ocr_img_threshold/) | Create a binary image based on setting a threshold value on the pixel intensity  |
| [RecognitionSettings](./recognitionsettings/) | Settings for the image recognition. Contains elements that allow customizing the |
| [custom_preprocessing_filters](./custom_preprocessing_filters/) | Structure to set 12 preprocessing filters (or less as you need) in some order. U |
| [filter_operation](./filter_operation/) | Preprocessing filter type base structure. Use in C++ -compatible API. |

## Functions

| Name | Description |
| --- | --- |
| [page](./page/) | Optical character recognition image with automatic detection of text areas and detecting, correct skew of the text. Allo |
| [page_from_raw_bytes](./page_from_raw_bytes/) | Optical character recognition image with automatic detection of text areas and detecting, correct skew of the text. Allo |
| [page_fast](./page_fast/) *(Deprecated)* | Optical character recognition image. Doesn't use automatic text areas detecting and skew correction. Allowed formats is  |
| [page_fast_from_raw_bytes](./page_fast_from_raw_bytes/) *(Deprecated)* | Optical character recognition image. Doesn't use automatic text areas detecting and skew correction. Allowed formats is  |
| [page_settings](./page_settings/) | Optical character recognition image from file with recognition settings Allowed formats is PNG, JPG, BMP. Buffer allocat |
| [page_settings_from_raw_bytes](./page_settings_from_raw_bytes/) | Optical character recognition image from file with recognition settings Allowed formats is PNG, JPG, BMP. Buffer allocat |
| [page_tiff](./page_tiff/) | Optical character recognition image from file with recognition settings Allowed formats is multi-page TIFF, TIF. Buffer  |
| [pages_multi](./pages_multi/) | Batch text recognition in several images packed in ZIP archive or images from folder Internal archives and folders are n |
| [pages_multi_array](./pages_multi_array/) | Recognizes multiple images from vector. |
| [pages_multi_array_from_raw_bytes](./pages_multi_array_from_raw_bytes/) | Recognizes multiple images from vector. |
| [page_from_uri](./page_from_uri/) | Optical character recognition image from uri with reconition settings Allowed formats is PNG, JPG, BMP. Buffer allocated |
| [page_save](./page_save/) | Optical character recognition image from file with reconition settings. Allowed formats is PNG, JPG, BMP. Buffer allocat |
| [page_all](./page_all/) | Optical character recognition image without automatic detection of text areas Get all image as text area. Correct skew o |
| [page_all_from_raw_bytes](./page_all_from_raw_bytes/) | Optical character recognition image without automatic detection of text areas Get all image as text area. Correct skew o |
| [page_rect](./page_rect/) | Optical character recognition image in the defined rectangle. Allowed formats is PNG, JPG, BMP. Buffer allocated by the  |
| [page_rect_from_raw_bytes](./page_rect_from_raw_bytes/) | Optical character recognition image in the defined rectangle. Allowed formats is PNG, JPG, BMP. Buffer allocated by the  |
| [page_abc](./page_abc/) | Optical character recognition image with automatic detection of text areas and detecting, correct skew of the text. Only |
| [page_abc_from_raw_bytes](./page_abc_from_raw_bytes/) | Optical character recognition image with automatic detection of text areas and detecting, correct skew of the text. Only |
| [page_abc_all](./page_abc_all/) | Optical character recognition image without automatic detection of text areas Get all image as text area. Correct skew o |
| [page_abc_all_from_raw_bytes](./page_abc_all_from_raw_bytes/) | Optical character recognition image without automatic detection of text areas Get all image as text area. Correct skew o |
| [page_rect_abc](./page_rect_abc/) | Optical character recognition image in the defined rectangle. Allowed formats is PNG, JPG, BMP. Only allowed characters  |
| [page_rect_abc_from_raw_bytes](./page_rect_abc_from_raw_bytes/) | Optical character recognition image in the defined rectangle. Allowed formats is PNG, JPG, BMP. Only allowed characters  |
| [page_characters_choices](./page_characters_choices/) | A set of characters found by the recognition algorithm and arranged in descending order of probability. |
| [page_characters_choices_from_raw_bytes](./page_characters_choices_from_raw_bytes/) | A set of characters found by the recognition algorithm and arranged in descending order of probability. |
| [preprocess_page_and_save](./preprocess_page_and_save/) | Use image preprocessing to improve the accuracy of OCR. Create an array of filters that will be applied to the input ima |
| [preprocess_page_and_save_from_raw_bytes](./preprocess_page_and_save_from_raw_bytes/) | Use image preprocessing to improve the accuracy of OCR. Create an array of filters that will be applied to the input ima |
| [line](./line/) | Optical character recognition image with one text line. Allowed formats is PNG, JPG, BMP. Buffer allocated by the caller |
| [line_from_raw_bytes](./line_from_raw_bytes/) | Optical character recognition image with one text line. Allowed formats is PNG, JPG, BMP. Buffer allocated by the caller |
| [line_abc](./line_abc/) | Optical character recognition image with one text line. Only allowed characters from the alphabet are recognized. Allowe |
| [line_abc_from_raw_bytes](./line_abc_from_raw_bytes/) | Optical character recognition image with one text line. Only allowed characters from the alphabet are recognized. Allowe |
| [set_license](./set_license/) | Set license to library. License is XML file. |
| [get_state](./get_state/) | Check license. |
| [get_skew](./get_skew/) | Returns the skew angle in degrees. |
| [get_skew_from_raw_bytes](./get_skew_from_raw_bytes/) | Returns the skew angle in degrees. |
| [get_skew_from_uri](./get_skew_from_uri/) | Returns the skew angle in degrees. This product includes software developed by the OpenSSL Project for use in the OpenSS |
| [get_rectangles_number](./get_rectangles_number/) | Detects the number of text areas in the image. Automatic image skew correction is not applied. |
| [get_rectangles_number_from_raw_bytes](./get_rectangles_number_from_raw_bytes/) | Detects the number of text areas in the image. Automatic image skew correction is not applied. |
| [get_rectangles_number_from_uri](./get_rectangles_number_from_uri/) | Detects the number of text areas in the image. Automatic image skew correction is not applied. This product includes sof |
| [get_rectangles](./get_rectangles/) | Detects the text areas in the image. Automatic image skew correction is not applied. |
| [get_rectangles_from_raw_bytes](./get_rectangles_from_raw_bytes/) | Detects the text areas in the image. Automatic image skew correction is not applied. |
| [get_rectangles_from_uri](./get_rectangles_from_uri/) | Detects the text areas in the image. Automatic image skew correction is not applied. This product includes software deve |
| [recognize_receipt](./recognize_receipt/) | Recognizes a special type of image - cash receipts Allowed formats is PNG, JPG, BMP. Buffer allocated by the caller. If  |

