---
title: SaveMultipageDocument
second_title: Aspose.OCR for .NET API Reference
description: Allows to get multipage document from list of RecognitionResult objects
type: docs
weight: 210
url: /net/aspose.ocr/asposeocr/savemultipagedocument/
---
## SaveMultipageDocument(string, SaveFormat, List&lt;RecognitionResult&gt;, string) {#savemultipagedocument_3}

Allows to get multipage document from list of RecognitionResult objects

```csharp
public static void SaveMultipageDocument(string fullFileName, SaveFormat saveFormat, 
    List<RecognitionResult> results, string embeddedFontPath = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml). |
| results | List`1 | List of [`RecognitionResult`](../../recognitionresult) objects. |
| embeddedFontPath | String | Optionally. Full path to the user font. |

### See Also

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## SaveMultipageDocument(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, string) {#savemultipagedocument_1}

Allows to get multipage document from list of RecognitionResult objects

```csharp
public static void SaveMultipageDocument(MemoryStream stream, SaveFormat saveFormat, 
    List<RecognitionResult> results, string embeddedFontPath = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml). |
| results | List`1 | List of [`RecognitionResult`](../../recognitionresult) objects. |
| embeddedFontPath | String | Optionally. Full path to the user font. |

### See Also

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## SaveMultipageDocument(string, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string) {#savemultipagedocument_2}

Allows to get multipage document from list of RecognitionResult objects

```csharp
public static void SaveMultipageDocument(string fullFileName, SaveFormat saveFormat, 
    List<RecognitionResult> results, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml). |
| results | List`1 | List of [`RecognitionResult`](../../recognitionresult) objects. |
| applySpellingCorrection | Boolean | Set true to correct misspelled words in case you have such in your recognition result. |
| language | SpellCheckLanguage | Dictionary for spell check (optional). |
| dictionaryPath | String | Optionally. Full path to the user dictionary in .txt format. Format is [word - space - frequence(number)]. Example: the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | Optionally. Full path to the user font. |

### See Also

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## SaveMultipageDocument(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string) {#savemultipagedocument}

Allows to get multipage document from list of RecognitionResult objects

```csharp
public static void SaveMultipageDocument(MemoryStream stream, SaveFormat saveFormat, 
    List<RecognitionResult> results, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml). |
| results | List`1 | List of [`RecognitionResult`](../../recognitionresult) objects. |
| applySpellingCorrection | Boolean | Set true to correct misspelled words in case you have such in your recognition result. |
| language | SpellCheckLanguage | Dictionary for spell check (optional). |
| dictionaryPath | String | Optionally. Full path to the user dictionary in .txt format. Format is [word - space - frequence(number)]. Example: the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | Optionally. Full path to the user font. |

### See Also

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
