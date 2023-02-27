---
title: AsposeOcr.RecognizeTiff
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: AsposeOcr तरक. बहुपृष्ठ TIFF छव से पठ पहचनें  नर्दष्ट करने क क्षमत के सथ TIFF फ़इल क पहचनत हैDocumentRecognitionSettings . केवल टआईएफएफ टआईएफ क समर्थन करत है अन्य छव प्रकरं क समर्थन नहं करत.
type: docs
weight: 240
url: /hi/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

बहु-पृष्ठ TIFF छवि से पाठ पहचानें।  निर्दिष्ट करने की क्षमता के साथ TIFF फ़ाइल को पहचानता है[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . केवल टीआईएफएफ (टीआईएफ) का समर्थन करता है। अन्य छवि प्रकारों का समर्थन नहीं करता.

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पूर्ण पथ। |
| settings | DocumentRecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तुओं की सूची।

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

बहु-पृष्ठ TIFF छवि से पाठ पहचानें।  निर्दिष्ट करने की क्षमता के साथ TIFF फ़ाइल को पहचानता है[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . केवल टीआईएफएफ (टीआईएफ) का समर्थन करता है। अन्य छवि प्रकारों का समर्थन नहीं करता.

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | TIFF फ़ाइल के साथ मेमोरी स्ट्रीम। |
| settings | DocumentRecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तुओं की सूची।

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)


