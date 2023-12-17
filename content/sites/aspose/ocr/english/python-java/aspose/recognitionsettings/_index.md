---
title: RecognitionSettings
second_title: Aspose.OCR for Python via Java API Reference
description: 
type: docs
weight: 191
url: /python-java/aspose/recognitionsettings/
---

Module recognitionsettings
==========================

Classes
-------

`CarPlateRecognitionSettings()`
:   

    ### Class variables

    `JAVA_CLASS_NAME`
    :

    ### Methods

    `set_allowed_characters(self, allowedCharacters: str)`
    :   
        Allowed characters set. Determines the array of characters allowed for recognition result.
        @param allowedCharacters: contains string of characters.

    `set_ignored_characters(self, ignoredCharacters: str)`
    :   
        Sets blacklist for recognition symbols.
        @param ignoredCharacters: Characters excluded from recognition.

    `set_language(self, language: aspose.models.Language)`
    :   
        Sets the language used for OCR.
        Multi-language (none) by default.
        @param language: contains enum Language value.

    `set_threads_count(self, threadsCount: int)`
    :   
        Gets or sets the number of threads for processing.
        By default, 0 means that the image will be processed with the number of threads equal to your number of processors.
        ThreadsCount = 1 means that the image will be processed in the main thread.
        @param threadsCount: the number of threads that will be created for parallel recognition of image fragments.

`IDCardRecognitionSettings()`
:   

    ### Class variables

    `JAVA_CLASS_NAME`
    :

    ### Methods

    `set_allowed_characters(self, allowedCharacters: str)`
    :   
        Allowed characters set. Determines the array of characters allowed for recognition result.
        @param allowedCharacters: contains string of characters.

    `set_automatic_color_inversion(self, automaticColorInversion: bool)`
    :   
        Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.
        @param automaticColorInversion: contains boolean value - a automaticColorInversion is set. True by default.

    `set_ignored_characters(self, ignoredCharacters: str)`
    :   
        Sets blacklist for recognition symbols.
        @param ignoredCharacters: Characters excluded from recognition.

    `set_language(self, language: aspose.models.Language)`
    :   
        Sets the language used for OCR.
        Multi-language (none) by default.
        @param language: contains enum Language value.

    `set_threads_count(self, threadsCount: int)`
    :   
        Gets or sets the number of threads for processing.
        By default, 0 means that the image will be processed with the number of threads equal to your number of processors.
        ThreadsCount = 1 means that the image will be processed in the main thread.
        @param threadsCount: the number of threads that will be created for parallel recognition of image fragments.

    `set_upscale_small_font(self, upscaleSmallFont: bool)`
    :   
        Allows you to use additional algorithms specifically for small font recognition.
        Useful for images with small size characters.
        @param upscaleSmallFont: contains boolean value - an upscaleSmallFont is set.

`InvoiceRecognitionSettings()`
:   

    ### Class variables

    `JAVA_CLASS_NAME`
    :

    ### Methods

    `set_allowed_characters(self, allowedCharacters: str)`
    :   
        Allowed characters set. Determines the array of characters allowed for recognition result.
        @param allowedCharacters: contains string of characters.

    `set_automatic_color_inversion(self, automaticColorInversion: bool)`
    :   
        Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.
        @param automaticColorInversion: contains boolean value - a automaticColorInversion is set. True by default.

    `set_ignored_characters(self, ignoredCharacters: str)`
    :   
        Sets blacklist for recognition symbols.
        @param ignoredCharacters: Characters excluded from recognition.

    `set_language(self, language: aspose.models.Language)`
    :   
        Sets the language used for OCR.
        Multi-language (none) by default.
        @param language: contains enum Language value.

    `set_threads_count(self, threadsCount: int)`
    :   
        Gets or sets the number of threads for processing.
        By default, 0 means that the image will be processed with the number of threads equal to your number of processors.
        ThreadsCount = 1 means that the image will be processed in the main thread.
        @param threadsCount: the number of threads that will be created for parallel recognition of image fragments.

    `set_upscale_small_font(self, upscaleSmallFont: bool)`
    :   
        Allows you to use additional algorithms specifically for small font recognition.
        Useful for images with small size characters.
        @param upscaleSmallFont: contains boolean value - an upscaleSmallFont is set.

`PassportRecognitionSettings()`
:   

    ### Class variables

    `JAVA_CLASS_NAME`
    :

    ### Methods

    `set_allowed_characters(self, allowedCharacters: str)`
    :   
        Allowed characters set. Determines the array of characters allowed for recognition result.
        @param allowedCharacters: contains string of characters.

    `set_automatic_color_inversion(self, automaticColorInversion: bool)`
    :   
        Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.
        @param automaticColorInversion: contains boolean value - a automaticColorInversion is set. True by default.

    `set_ignored_characters(self, ignoredCharacters: str)`
    :   
        Sets blacklist for recognition symbols.
        @param ignoredCharacters: Characters excluded from recognition.

    `set_language(self, language: aspose.models.Language)`
    :   
        Sets the language used for OCR.
        Multi-language (none) by default.
        @param language: contains enum Language value.

    `set_threads_count(self, threadsCount: int)`
    :   
        Gets or sets the number of threads for processing.
        By default, 0 means that the image will be processed with the number of threads equal to your number of processors.
        ThreadsCount = 1 means that the image will be processed in the main thread.
        @param threadsCount: the number of threads that will be created for parallel recognition of image fragments.

    `set_upscale_small_font(self, upscaleSmallFont: bool)`
    :   
        Allows you to use additional algorithms specifically for small font recognition.
        Useful for images with small size characters.
        @param upscaleSmallFont: contains boolean value - an upscaleSmallFont is set.

`ReceiptRecognitionSettings()`
:   

    ### Class variables

    `JAVA_CLASS_NAME`
    :

    ### Methods

    `set_allowed_characters(self, allowedCharacters: str)`
    :   
        Allowed characters set. Determines the array of characters allowed for recognition result.
        @param allowedCharacters: contains string of characters.

    `set_automatic_color_inversion(self, automaticColorInversion: bool)`
    :   
        Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.
        @param automaticColorInversion: contains boolean value - a automaticColorInversion is set. True by default.

    `set_ignored_characters(self, ignoredCharacters: str)`
    :   
        Sets blacklist for recognition symbols.
        @param ignoredCharacters: Characters excluded from recognition.

    `set_language(self, language: aspose.models.Language)`
    :   
        Sets the language used for OCR.
        Multi-language (none) by default.
        @param language: contains enum Language value.

    `set_threads_count(self, threadsCount: int)`
    :   
        Gets or sets the number of threads for processing.
        By default, 0 means that the image will be processed with the number of threads equal to your number of processors.
        ThreadsCount = 1 means that the image will be processed in the main thread.
        @param threadsCount: the number of threads that will be created for parallel recognition of image fragments.

    `set_upscale_small_font(self, upscaleSmallFont: bool)`
    :   
        Allows you to use additional algorithms specifically for small font recognition.
        Useful for images with small size characters.
        @param upscaleSmallFont: contains boolean value - an upscaleSmallFont is set.

`RecognitionSettings()`
:   
    Settings for the image recognition.
    Contains elements that allow customizing the recognition process.
    
    
    Default constructor: set recognitionAreas null, linesFiltration false, autoSkew false, recognizeSingleLine false.

    ### Class variables

    `JAVA_CLASS_NAME`
    :

    ### Methods

    `set_allowed_characters(self, allowedCharacters: str)`
    :   
        Allowed characters set. Determines the array of characters allowed for recognition result.
        @param allowedCharacters: contains string of characters.

    `set_automatic_color_inversion(self, automaticColorInversion: bool)`
    :   
        Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.
        @param automaticColorInversion: contains boolean value - a automaticColorInversion is set. True by default.

    `set_detect_areas_mode(self, detectAreasMode: aspose.models.DetectAreasMode)`
    :   
        Determines the type of neural network used for areas detection.
        @param detectAreasMode: contains enum DetectAreasMode value.

    `set_ignored_characters(self, ignoredCharacters: str)`
    :   
        Sets blacklist for recognition symbols.
        @param ignoredCharacters: Characters excluded from recognition.

    `set_language(self, language: aspose.models.Language)`
    :   
        Sets the language used for OCR.
        Multi-language (none) by default.
        @param language: contains enum Language value.

    `set_recognize_single_line(self, recognizeSingleLine: bool)`
    :   
        Sets single-line image recognition.
        Disabled (false) by default.
        Disable all the processing steps associated with splitting into lines.
        Set this parameter to true if your image contains only one line. Disables set_recognition_areas settings, so all areas settings will be ignored.
        @param recognizeSingleLine: True for single-line image

    `set_threads_count(self, threadsCount: int)`
    :   
        Gets or sets the number of threads for processing.
        By default, 0 means that the image will be processed with the number of threads equal to your number of processors.
        ThreadsCount = 1 means that the image will be processed in the main thread.
        @param threadsCount: the number of threads that will be created for parallel recognition of image fragments.

    `set_upscale_small_font(self, upscaleSmallFont: bool)`
    :   
        Allows you to use additional algorithms specifically for small font recognition.
        Useful for images with small size characters.
        @param upscaleSmallFont: contains boolean value - an upscaleSmallFont is set.



### See Also

* namespace [aspose](/ocr/python-java/aspose/)
* assembly [Aspose](/ocr/python-java/)