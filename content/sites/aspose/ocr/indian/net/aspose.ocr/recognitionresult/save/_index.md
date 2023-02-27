---
title: RecognitionResult.Save
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: RecognitionResult तरक. दस्तवेज़ क सदे पठ PDF य Microsoft Word दस्तवेज़ के रूप में सहेजत है
type: docs
weight: 130
url: /hi/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

दस्तावेज़ को सादे पाठ, PDF या Microsoft Word दस्तावेज़ के रूप में सहेजता है।

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullFileName | String | चयनित स्वरूप में पहचान परिणाम सहेजने के लिए पथ के साथ फ़ाइल नाम। |
| saveFormat | SaveFormat | दस्तावेज़ प्रारूप (Docx, Txt, Pdf)। |
| applySpellingCorrection | Boolean | गलत वर्तनी वाले शब्दों को सही करने के लिए सही सेट करें यदि आपके पहचान परिणाम में ऐसा है। |
| language | SpellCheckLanguage | वर्तनी जाँच के लिए शब्दकोश (वैकल्पिक)। |
| dictionaryPath | String | वैकल्पिक रूप से। .txt प्रारूप में उपयोगकर्ता शब्दकोश का पूर्ण पथ। प्रारूप है [शब्द - स्थान - आवृत्ति (संख्या)]। |

### यह सभी देखें

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* नाम स्थान [Aspose.OCR](../../recognitionresult/)
* सभा [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

दस्तावेज़ को सादे पाठ, PDF या Microsoft Word दस्तावेज़ के रूप में सहेजता है।

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | चयनित प्रारूप में पहचान परिणाम सहेजने के लिए मेमोरीस्ट्रीम। |
| saveFormat | SaveFormat | दस्तावेज़ प्रारूप (Docx, Txt, Pdf)। |
| applySpellingCorrection | Boolean | गलत वर्तनी वाले शब्दों को सही करने के लिए सही सेट करें यदि आपके पहचान परिणाम में ऐसा है। |
| language | SpellCheckLanguage | वर्तनी जाँच के लिए शब्दकोश (वैकल्पिक)। |
| dictionaryPath | String | वैकल्पिक रूप से। .txt प्रारूप में उपयोगकर्ता शब्दकोश का पूर्ण पथ। प्रारूप है [शब्द - स्थान - आवृत्ति (संख्या)]। |

### यह सभी देखें

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* नाम स्थान [Aspose.OCR](../../recognitionresult/)
* सभा [Aspose.OCR](../../../)


