---
title: models
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 271
url: /python-java/aspose/models/
---

Module models
=============

Classes
-------

`AreasType(value, names=None, *, module=None, qualname=None, type=None, start=1)`
:   Determines the type of regions detected by the model.
    Used in the get_text_areas to indicate which result will be obtained - paragraph coordinates or line coordinates.

    ### Ancestors (in MRO)

    * enum.Enum

    ### Class variables

    `LINES`
    :   Sets regions as lines

    `PARAGRAPHS`
    :   Sets regions as paragraphs

    `WORDS`
    :   Sets regions as words

`DetectAreasMode(value, names=None, *, module=None, qualname=None, type=None, start=1)`
:   Determines the type of neural network used for areas detection.
    Used in the RecognitionSettings to specify which type of image you want to recognize.

    ### Ancestors (in MRO)

    * enum.Enum

    ### Class variables

    `COMBINE`
    :   Detects paragraphs with text and then uses other NN model to detect areas inside of paragraphs.
        Better for images with complex structure.

    `CURVED_TEXT`
    :   Detects lines and recognizes text on curved images.
        Preferred mode for photos of book and magazine pages.

    `DOCUMENT`
    :   Detects paragraphs uses NN model for documents. 
        Better for multicolumn document, document with pictures or with other not text objects.

    `NONE`
    :   Doesn't detect paragraphs.
        Better for a simple one-column document without pictures.

    `PHOTO`
    :   Detects paragraphs uses NN model for photos. 
        Better for image with a lot of pictures and other not text objects.

    `TABLE`
    :   Detects cells with text.
        Preferable mode for images with table structure.

    `TEXT_IN_WILD`
    :   A super-powerful neural network specialized in extracting words from low-quality images such as street photos, license plates, passport photos, meter photos, and photos with noisy backgrounds.

`Format(value, names=None, *, module=None, qualname=None, type=None, start=1)`
:   Format to save recognition result as document.

    ### Ancestors (in MRO)

    * enum.Enum

    ### Class variables

    `DOCX`
    :   Saves the result as an Office Open XML Word processing ML Document (macro-free).

    `EPUB`
    :   Saves the document as an EPUB file.

    `HTML`
    :   Saves the document as an HTML file.

    `JSON`
    :   Saves the result as an plain text written in JavaScript object notation.

    `PDF`
    :   Saves the result as a PDF (Adobe Portable Document) Document.

    `PDF_NO_IMG`
    :   Saves the document as a Searchable PDF (Adobe Portable Document) Document without image.

    `RTF`
    :   Saves the document as an rtf file.

    `TEXT`
    :   Saves the result in the plain text format.

    `XLSX`
    :   Saves the result as an Excel ( 2007 and later) workbook Document.

    `XML`
    :   Saves the result as an XML Document.

`ImageData(javaClass)`
:   

    ### Ancestors (in MRO)

    * aspose.helper.BaseJavaClass

    ### Methods

    `initParams(self)`
    :

`InputType(value, names=None, *, module=None, qualname=None, type=None, start=1)`
:   Types of image/ documents for processing / recognition.

    ### Ancestors (in MRO)

    * enum.Enum

    ### Class variables

    `BASE64`
    :   base64 string with the image or path to the .txt file with the base64 content. Supports GIF, PNG, JPEG, BMP, TIFF.

    `DIRECTORY`
    :   Path to the directory. Nested archives and folders are not supported.
        Supports GIF, PNG, JPEG, BMP, TIFF.
        Default amount of processed images is all.

    `PDF`
    :   Scanned PDF document from file or from bynary array.

    `SINGLE_IMAGE`
    :   Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, binary array.

    `TIFF`
    :   Multipage TIFF, TIF document from file or from InputStream.

    `URL`
    :   Link on the image. Supports GIF, PNG, JPEG, BMP, TIFF.

    `ZIP`
    :   Full name of the ZIP archive. Nested archives and folders are not supported.
        Supports GIF, PNG, JPEG, BMP, TIFF, JFIF.
        Default amount of processed images is all.

`Language(value, names=None, *, module=None, qualname=None, type=None, start=1)`
:   Language model for the recognition.

    ### Ancestors (in MRO)

    * enum.Enum

    ### Class variables

    `BEL`
    :   Belorussian alphabet

    `BUL`
    :   Bulgarian alphabet

    `CHI`
    :   Chinese alphabet

    `CYRILLIC`
    :   Multi - language(cyrillic alphabet) support

    `CZE`
    :   Czech alphabet

    `DAN`
    :   Danish alphabet

    `DEU`
    :   German alphabet

    `DUM`
    :   Dutch alphabet

    `ENG`
    :   English alphabet

    `EST`
    :   Estonian alphabet

    `FIN`
    :   Finnish alphabet

    `FRA`
    :   French alphabet

    `HIN`
    :   Hindi alphabet

    `ITA`
    :   Italian alphabet

    `KAZ`
    :   Kazakh alphabet

    `LATIN`
    :   Multi - language(latin alphabet) support

    `LAV`
    :   Latvian alphabet

    `LIT`
    :   Lithuanian alphabet

    `NONE`
    :   Multi - language support

    `NOR`
    :   Norwegian alphabet

    `POL`
    :   Polish alphabet

    `POR`
    :   Portuguese alphabet

    `RUM`
    :   Romanian alphabet

    `RUS`
    :   Russian alphabet

    `SLK`
    :   Slovak alphabet

    `SLV`
    :   Slovene alphabet

    `SPA`
    :   Spanish alphabet

    `SRP`
    :   Serbian alphabet

    `SRP_HRV`
    :   Serbo-Croatian alphabet

    `SWE`
    :   Swedish alphabet

    `UKR`
    :   Ukrainian alphabet

`ModelsConverter()`
:   

    ### Methods

    `convertInputTypeToJava(jType)`
    :

    `convertToJavaAreasMode(jType)`
    :

    `convertToJavaAreasType(jType)`
    :

    `convertToJavaFormat(jType)`
    :

    `convertToJavaLanguage(jType)`
    :

    `convertToJavaSpellCheckLanguage(jType)`
    :

`OcrInput(type: models.InputType, filters: models.PreprocessingFilter = None)`
:   Main class to collect images.
    
    Constructor to create container and set the type of images / documents and filters for further processing / recognition.
    @param type: Set the images/documents type will be added to container.
    @param filters: Set processing filters will be applied for further processing or recognition.

    ### Methods

    `add(self, fullPath: str, startPage: int = None, pagesNumber: int = None)`
    :   Add the path or URI containing the image for recognition / processing.
        The type of the image must correspond to the type specified in the constructor.
        @param fullPath: Path to the image/ document / folder / archive.
        @param startPage: The first page/image for processing / recognition. Use for documents, zip, folders.
        @param pagesNumber: The total amount of pages/images for processing / recognition. Use for documents, zip, folders. Default = all.

    `addStream(self, image_data_binary, startPage: int = None, pagesNumber: int = None)`
    :   Add the InputStream containing the image for recognition / processing.
        The type of the image must correspond to the type specified in the constructor.
        
        \code
             input = OcrInput(InputType.SINGLE_IMAGE)
            file = open(imgPath, "rb")
            image_data_binary = file.read()
            file.close()
            input.addStream(image_data_binary)
            result = api.recognize(input, RecognitionSettings())
        \endcode
        
        @param image_data_binary: containing the image or document.
        @param startPage: The first page/image for processing / recognition. Use for documents, zip, folders.
        @param pagesNumber: The total amount of pages/images for processing / recognition. Use for documents, zip, folders. Default = all.

    `add_base64(self, base64: str)`
    :   Add the base64 string containing the image for recognition / processing.
        The type of the image must correspond to the type specified in the constructor.
        @param base64: Base64 string with single image.

    `clear(self)`
    :   Set the amount of items for processing / recognition as 0.
        Clear the collection.

    `clear_filters(self)`
    :   Remove all filters.

    `get(self, index: int) ‑> models.ImageData`
    :   Returns information about processed / recognized image.
        @param index: Position of the image in the List.
        @return: The object of ImageData.

    `getJavaClass(self)`
    :

    `init(self, javaClass)`
    :

    `size(self)`
    :   Amount of items for processing / recognition.
        @return: Amount of items.

`PreprocessingFilter()`
:   Base class for image processing commands.

    ### Ancestors (in MRO)

    * aspose.helper.BaseJavaClass

    ### Class variables

    `JAVA_CLASS_NAME`
    :

    ### Static methods

    `auto_denoising()`
    :   Enables the use of an additional neural network to improve the image - reduce noise.
        Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements.
        @return: AutoDenoisingFilter object.

    `auto_dewarping()`
    :   Automatically corrects geometric distortions in the image.
        Extremely resource intensive!
        @return: AutoDewarpingFilter object.

    `auto_skew()`
    :   Enables the automatic image skew correction.
        @return: AutoSkewFilter object.

    `binarize()`
    :   Converts an image to black-and-white image.
        Binary images are images whose pixels have only two possible intensity values.
        They are normally displayed as black and white. Numerically, the two values are often 0 for black, and 255 for white.
        Binary images are produced by auto thresholding an image.
        @return: BinarizeFilter object.

    `binarize_and_dilate()`
    :   Dilation adds pixels to the boundaries of objects in an image.
        @return: DilateFilter object.

    `contrast_correction()`
    :   Contrast correction filter.
        @return: ContrastCorrectionFilter object.

    `invert()`
    :   Automatically inverts colors in a document image.
        @return: InvertFilter object.

    `median()`
    :   The median filter run through each element of the image and replace each pixel with the median of its neighboring pixels.
        @return: MedianFilter object.

    `resize(width: int, height: int)`
    :   Rescale image - upscale or downscale image resolution.
        @param width: The new width of the image.
        @param height: The new height of the image.
        @return: ResizeFilter object.

    `rotate(angle: float)`
    :   Rotate original image.
        @param angle: Angle of rotation. Value from -360 to 360.
        @return: RotateFilter object.

    `scale(ratio: float)`
    :   Rescale image - Upscale or downscale image resolution.
        InterpolationFilterType bilinear or nearest neighbor.
        @param ratio: The scaling factor. Recommended value from 0.1 to 1 to shrink. From 1 to 10 to enlarge.
        @return: ScaleFilter object.

    `threshold(value: int)`
    :   Create a binary image based on setting a threshold value on the pixel intensity of the original image.
        @param value: The max value.
        @return: BinarizeFilter object.

    `to_grayscale()`
    :   Converts an image to grayscale image.
        Grayscale image have 256 level of light in image (0 to 255).
        @return: GrayscaleFilter object.

    ### Methods

    `add(self, filter)`
    :   Add filter to collection for further preprocessing.
        @param filter: PreprocessingFilter object.

    `getJavaClass(self)`
    :

`SpellCheckError(javaClass)`
:   Representing misspelled word with additional data.

    ### Ancestors (in MRO)

    * aspose.helper.BaseJavaClass

    ### Methods

    `initParams(self)`
    :

`SpellCheckLanguage(value, names=None, *, module=None, qualname=None, type=None, start=1)`
:   Dictionary language for spell-check correction.

    ### Ancestors (in MRO)

    * enum.Enum

    ### Class variables

    `CZE`
    :   Czech dictionary

    `DAN`
    :   Danish dictionary

    `DEU`
    :   German dictionary

    `DUM`
    :   Dutch dictionary

    `ENG`
    :   English dictionary

    `EST`
    :   Estonian dictionary

    `FIN`
    :   Finnish dictionary

    `FRA`
    :   French dictionary

    `ITA`
    :   Italian dictionary

    `LAV`
    :   Latvian dictionary

    `LIT`
    :   Lithuanian dictionary

    `POL`
    :   Polish dictionary

    `POR`
    :   Portuguese dictionary

    `RUM`
    :   Romanian dictionary

    `SLK`
    :   Slovak dictionary

    `SLV`
    :   Slovene dictionary

    `SPA`
    :   Spanish dictionary

    `SWE`
    :   Swedish dictionary

`SuggestedWord(javaClass)`
:   Spelling suggestion returned from get_spell_check_error_list.

    ### Ancestors (in MRO)

    * aspose.helper.BaseJavaClass

    ### Methods

    `initParams(self)`
    :


### See Also

* namespace [aspose](/ocr/python-java/aspose/)
* assembly [Aspose.OCR](/ocr/python-java/)