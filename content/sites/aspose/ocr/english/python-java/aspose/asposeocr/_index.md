---
title: AsposeOcr
second_title: Aspose.OCR for Python via Java API Reference
description: 
type: docs
weight: 11
url: /python-java/aspose/asposeocr/
---


Module asposeocr
================
Python interface to the Aspose OCR

**Aspose.OCR for Python via .Java** is a powerful,
while easy-to-use optical character recognition (OCR)
 engine for your Python applications and notebooks.
In less than **10** lines of code, you can recognize
text in **28** languages based on Latin, Cyrillic,
and Asian scripts, returning results in the most popular
document and data interchange formats.
There is no need to learn complex mathematical models,
build machine learning algorithms and train neural
networks — our simple and robust API will do everything for you.

Classes
-------

`AsposeOcr()`
:   
    AsposeOcr main class for recognition.
    
    This sample shows how to recognize image.
    \code
        api = AsposeOcr()
        input = OcrInput(InputType.SINGLE_IMAGE)
        input.add(os.path.join(self.dataDir, "SpanishOCR.bmp"))
        result = api.recognize(input)
    \endcode

    ### Static methods

    `save_multipage_document(fullFileName: str, saveFormat: aspose.models.Format, results: List)`
    :   
        Allows to get multipage document from list of RecognitionResult objects.
        @param fullFileName: Filename with a path for saving recognition result in the selected format.
        @param saveFormat: Document format (Docx, Txt, Pdf, Xlsx, Xml, Json).
        @param results:

    ### Methods

    `calculate_skew(self, input: aspose.models.OcrInput) ‑> List[aspose.recognitionresult.SkewOutput]`
    :   
        Calculates the skew angles of an images.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance. The container with sources.
        @return: List of skew angles in degrees - SkewOutput.

    `compare_image_texts(self, fullPath1: str, fullPath2: str, settings: aspose.recognitionsettings.RecognitionSettings = None, ignoreCase: bool = True) ‑> bool`
    :   
        Check if two images contain the same text.
        @param fullPath1: Path to the first image.
        @param fullPath2: Path to the second image.
        @param settings: Recognition settings.
        @param ignoreCase: True - means a case-insensitive search.
        @return: True if images have the same text (90% similarity).

    `correct_spelling(self, text: str, language: aspose.models.SpellCheckLanguage) ‑> str`
    :   
        Corrects text (replaces misspelled words).
        @param text: Text for correction.
        @param language: Dictionary to use SpellCheckLanguage.
        @return: Text with replaced words.

    `detect_rectangles(self, input: aspose.models.OcrInput, areasType: aspose.models.AreasType, isDetectAreas: bool) ‑> List[aspose.recognitionresult.RectangleOutput]`
    :   
        Detects text areas on images.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param areasType: Determinates wich rectangles to return - line, paragraphs or words.
        @param isDetectAreas: Enable automatic text areas detection.
        @return: List of RectangleOutput with detected text areas or lines.

    `image_has_text(self, fullPath: str, text: str, settings: aspose.recognitionsettings.RecognitionSettings = None, ignoreCase: bool = True) ‑> bool`
    :   
        Check if the image contains the provided text fragment.
        @param fullPath: Path to the image.
        @param text: Text fragment for searching on the image.
        @param settings: Recognition settings.
        @param ignoreCase: True - means a case-insensitive search.
        @return: True if image contains text fragment. False - image doesn't contains text fragment.

    `image_text_diff(self, fullPath1: str, fullPath2: str, settings: aspose.recognitionsettings.RecognitionSettings = None, ignoreCase: bool = True) ‑> float`
    :   
        Compare the texts on the two images and return a number representing how similar they are (0 to 1).
        @param fullPath1: Path to the first image.
        @param fullPath2: Path to the second image.
        @param settings: Recognition settings.
        @param ignoreCase: True - means a case-insensitive search.
        @return: 0 means that the texts are completely different; 1 means the texts are identical.

    `recognize(self, input: aspose.models.OcrInput, settings: aspose.recognitionsettings.RecognitionSettings = None) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognizes image with the ability to specify RecognitionSettings.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param settings: RecognitionSettings object.
        @return: RecognitionResult list with images recognition results.

    `recognize_car_plate(self, input: aspose.models.OcrInput, settings: aspose.recognitionsettings.CarPlateRecognitionSettings = None) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognizes car plate with the ability to specify CarPlateRecognitionSettings.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param settings: CarPlateRecognitionSettings
        @return: RecognitionResult list with images recognition results.

    `recognize_fast(self, input: aspose.models.OcrInput) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognizes text on good quality image. Doesn't use automatic image skew correction and text areas
        detection.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @return: RecognitionResult list with images recognition results.

    `recognize_id_card(self, input: aspose.models.OcrInput, settings: aspose.recognitionsettings.IDCardRecognitionSettings = None) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognizes ID card with the ability to specify IDCardRecognitionSettings.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param settings: IDCardRecognitionSettings
        @return: RecognitionResult list with images recognition results.

    `recognize_invoice(self, input: aspose.models.OcrInput, settings: aspose.recognitionsettings.InvoiceRecognitionSettings = None) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognize invoice with the ability to specify InvoiceRecognitionSettings
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param settings: InvoiceRecognitionSettings
        @return: RecognitionResult list with images recognition results.

    `recognize_lines(self, input: aspose.models.OcrInput, settings: aspose.recognitionsettings.RecognitionSettings = None) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognizes single line image with the ability to specify RecognitionSettings.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param settings: RecognitionSettings object.
        @return: RecognitionResult list with images recognition results.

    `recognize_passport(self, input: aspose.models.OcrInput, settings: aspose.recognitionsettings.PassportRecognitionSettings = None) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognizes passport with the ability to specify PassportRecognitionSettings.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param settings: PassportRecognitionSettings
        @return: RecognitionResult list with images recognition results.

    `recognize_receipt(self, input: aspose.models.OcrInput, settings: aspose.recognitionsettings.ReceiptRecognitionSettings = None) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognize receipts with the ability to specify ReceiptRecognitionSettings.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @param settings: ReceiptRecognitionSettings
        @return: RecognitionResult list with images recognition results.

    `recognize_street_photo(self, input: aspose.models.OcrInput) ‑> List[aspose.recognitionresult.RecognitionResult]`
    :   
        Recognizes text on street photos.
        Extract text from street photos, traffic camera images, ID cards, driver licenses, and other images with sparse text and noisy/colored backgrounds.
        Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.
        @param input: :py:any:`~aspose.models.OcrInput`. instance.
        @return: RecognitionResult list with images recognition results.

    `shutdown(self)`
    :   
        Shut down the JVM machine.

`ImageProcessing()`
:   
    Helper class for Aspose OCR library. Allows to preprocess and save images.

    ### Static methods

    `save(images, folderPath)`
    :   
        Use image processing to improve the accuracy of OCR.
        Create a list of filters that will be applied to the input image in the order you specify.
        \code
            filters = new PreprocessingFilter();
            filters.add(PreprocessingFilter.auto_dewarping());
            filters.add(PreprocessingFilter.invert());
            filters.add(PreprocessingFilter.threshold(150));
            filters.add(PreprocessingFilter.binarize());
            filters.add(PreprocessingFilter.rotate(180));
            filters.add(PreprocessingFilter.scale(6));
            filters.add(PreprocessingFilter.dilate());
        
            images = OcrInput(InputType.PDF, filters);
        \endcode
        You don't need all of them. Set only what you need.
        @param images: OcrInput object containing different images OcrInput.
        @param folderPath: Path without image names for saving processed images.
        @return: OcrInput object containing result processed images OcrInput.


### See Also

* namespace [aspose](/ocr/python-java/aspose/)
* assembly [Aspose](/ocr/python-java/)