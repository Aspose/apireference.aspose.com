---
title: "AsposeOcr Class"
linktitle: "AsposeOcr"
articleTitle: "AsposeOcr"
second_title: "Aspose.OCR for Python via Java"
description: "AsposeOcr main class for recognition. This sample shows how to recognize image."
type: docs
weight: 10
url: /python-java/asposeocr/asposeocr/
---

## AsposeOcr class

**Module:** `asposeocr`


AsposeOcr main class for recognition. This sample shows how to recognize image.


## Constructors

| Name | Description |
| --- | --- |
| [__init__](./asposeocr/) |  |

## Methods

| Name | Return Type | Static | Description |
| --- | --- | --- | --- |
| [calculate_skew](./calculate_skew/) | `typing.List[SkewOutput]` | No | Calculates the skew angles of an images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [compare_image_texts](./compare_image_texts/) | `bool` | No | Check if two images contain the same text. |
| [correct_spelling](./correct_spelling/) | `str` | No | Corrects text (replaces misspelled words). |
| [detect_rectangles](./detect_rectangles/) | `typing.List[RectangleOutput]` | No | Detects text areas on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [image_has_text](./image_has_text/) | `bool` | No | Check if the image contains the provided text fragment. |
| [image_text_diff](./image_text_diff/) | `float` | No | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [recognize](./recognize/) | `typing.List[RecognitionResult]` | No | Recognizes image with the ability to specify RecognitionSettings. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [recognize_car_plate](./recognize_car_plate/) | `typing.List[RecognitionResult]` | No | Recognizes car plate with the ability to specify CarPlateRecognitionSettings. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [recognize_fast](./recognize_fast/) | `typing.List[RecognitionResult]` | No | Recognizes text on good quality image. Doesn't use automatic image skew correction and text areas detection. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [recognize_id_card](./recognize_id_card/) | `typing.List[RecognitionResult]` | No | Recognizes ID card with the ability to specify IDCardRecognitionSettings. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [recognize_invoice](./recognize_invoice/) | `typing.List[RecognitionResult]` | No | Recognize invoice with the ability to specify InvoiceRecognitionSettings Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [recognize_lines](./recognize_lines/) | `typing.List[RecognitionResult]` | No | Recognizes single line image with the ability to specify RecognitionSettings. |
| [recognize_passport](./recognize_passport/) | `typing.List[RecognitionResult]` | No | Recognizes passport with the ability to specify PassportRecognitionSettings. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [recognize_receipt](./recognize_receipt/) | `typing.List[RecognitionResult]` | No | Recognize receipts with the ability to specify ReceiptRecognitionSettings. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [recognize_street_photo](./recognize_street_photo/) | `typing.List[RecognitionResult]` | No | Recognizes text on street photos. Extract text from street photos, traffic camera images, ID cards, driver licenses, and other images with sparse text and noisy/colored backgrounds. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64. |
| [save_multipage_document](./save_multipage_document/) |  | Yes | Allows to get multipage document from list of RecognitionResult objects. |
| [shutdown](./shutdown/) |  | No | Shut down the JVM machine. |
