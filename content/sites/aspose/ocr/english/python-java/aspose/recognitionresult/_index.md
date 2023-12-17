---
title: RecognitionResult
second_title: Aspose.OCR for Python via Java API Reference
description: 
type: docs
weight: 171
url: /python-java/aspose/recognitionresult/
---

Module recognitionresult
========================

Classes
-------

`LinesResult(javaClass)`
:   

    ### Ancestors (in MRO)

    * aspose.helper.BaseJavaClass

    ### Methods

    `initParams(self)`
    :

`RecognitionResult(javaClass)`
:   
    The results of the image recognition. Contains elements with recognition
    information and methods for result export.

    ### Static methods

    `save_multipage_document(self, fullPath: str)`
    :   
        Private

    ### Instance variables

    `recognition_areas_text`
    :   List recognition results of a list of areas (Rectangles).

    `recognition_lines_result`
    :   Gets a list of recognition results with a list of rows (Rectangles).

    ### Methods

    `getJavaClass(self)`
    :

    `get_json(self)`
    :   
        Form JSON string with recognition results.
        @return: Recognition results as JSON string.

    `get_spell_check_corrected_text(self, language: aspose.models.SpellCheckLanguage) ‑> str`
    :   
        Corrects text (replaces misspelled words).
        @param language: Dictionary to use.
        @return: Corrected recognition results string.

    `get_spell_check_error_list(self, language: aspose.models.SpellCheckLanguage = SpellCheckLanguage.ENG)`
    :   
        Find the misspelled words with suggested spellings for a given input text.
        @param language: Dictionary to use.
        @return: List of SpellCheckError object representing misspelled words with lists suggested correct spellings for the each misspelled word,
        and with the edit distance.

    `get_xml(self)`
    :   
        Form JSON string with recognition results.
        @return: Recognition results as XML string.

    `init(self)`
    :

    `save(self, fullFileName: str, format: aspose.models.Format)`
    :   
        Saves the document in the plain text or other document format.
        @param fullFileName: Filename with a path for saving recognition result.
        @param format: Document format enum type of Format.

    `save_spell_check_corrected_text(self, fullFileName: str, format: aspose.models.Format, language: aspose.models.SpellCheckLanguage = SpellCheckLanguage.ENG)`
    :   
        Corrects text (replaces misspelled words).
        Saves the corrected text in the document in the plain text or other format.
        @param fullFileName: Filename with a path for saving recognition result
        @param format: Document format enum type of Format.
        @param language: Dictionary for spell check.

    `use_user_dictionary(self, dictionaryPath: str)`
    :   
                Allows to use own dictionary for spell-check correction.
                @param dictionaryPath: Full path to the user dictionary (frequency dictionary).
                Dictionary file format:
                Plain text file in UTF-8 encoding.
                Word and Word Frequency are separated by comma, the word is expected in the first column and the frequency in the second column.
                Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("
        "), a carriage return ("
"),
                or a carriage return immediately followed by a line feed("

        ").
                Every word is expected to be in lower case.
                Example:
                \code
                    word,5984819
                    hello,5761742
                    down,5582768
                \endcode

`RectangleOutput(javaClass)`
:   
    Data about detected text areas or lines.
    \code
        source - The full path to the file or URL, if any. Empty for streams, byte arrays, base64.
        page - Page number.
        image_index - Sequence number of the image on the page.
        rectangles - List of detected text areas or lines.
    \endcode

    ### Ancestors (in MRO)

    * aspose.helper.BaseJavaClass

    ### Methods

    `initParams(self)`
    :

`SkewOutput(javaClass)`
:   
    Data about skew angle in degrees and name of the file.
    \code
        source - The full path to the file or URL, if any. Empty for streams, byte arrays, base64.
        page - Page number.
        image_index - Sequence number of the image on the page.
        angle - Skew angle in degrees.
    \endcode

    ### Ancestors (in MRO)

    * aspose.helper.BaseJavaClass

    ### Methods

    `initParams(self)`
    :


### See Also

* namespace [aspose](/ocr/python-java/aspose/)
* assembly [Aspose](/ocr/python-java/)