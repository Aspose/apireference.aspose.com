---
title: Save
second_title: Aspose.OCR for .NET API Reference
description: Saves the document as the plain text PDF or Microsoft Word Document.
type: docs
weight: 120
url: /net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) {#save_2}

Saves the document as the plain text, PDF or Microsoft Word Document.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml). |
| applySpellingCorrection | Boolean | Set true to correct misspelled words in case you have such in your recognition result. |
| language | SpellCheckLanguage | Dictionary for spell check (optional). |
| dictionaryPath | String | Optionally. Full path to the user dictionary in .txt format. Format is [word - space - frequence(number)]. Example: the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | Optionally. Full path to the user font. |
| optimizePdf | PdfOptimizationMode | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### See Also

* enum [SaveFormat](../../saveformat)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

---

## Save(string, SaveFormat, string, PdfOptimizationMode) {#save_3}

Saves the document as the plain text, PDF or Microsoft Word Document.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml). |
| embeddedFontPath | String | Optionally. Full path to the user font. |
| optimizePdf | PdfOptimizationMode | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### See Also

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) {#save}

Saves the document as the plain text, PDF or Microsoft Word Document.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Set true to correct misspelled words in case you have such in your recognition result. |
| language | SpellCheckLanguage | Dictionary for spell check (optional). |
| dictionaryPath | String | Optionally. Full path to the user dictionary in .txt format. Format is [word - space - frequence(number)]. Example: the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | Optionally. Full path to the user font. |
| optimizePdf | PdfOptimizationMode | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### See Also

* enum [SaveFormat](../../saveformat)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, string, PdfOptimizationMode) {#save_1}

Saves the document as the plain text, PDF or Microsoft Word Document.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf). |
| embeddedFontPath | String | Optionally. Full path to the user font. |
| optimizePdf | PdfOptimizationMode | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### See Also

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
