---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: AsposeOcr तरक. स्कैन कए गए पडएफ से पठ क पहचनें चत्र नकलें  नर्दष्ट करने क क्षमत के सथ पडएफ फइल क पहचनत हैDocumentRecognitionSettings . केवल स्कैन कए गए PDF क समर्थन करत है खजने यग्य PDF क समर्थन नहं करत.
type: docs
weight: 220
url: /hi/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

स्कैन किए गए पीडीएफ से पाठ को पहचानें (चित्र निकालें)  निर्दिष्ट करने की क्षमता के साथ पीडीएफ फाइल को पहचानता है[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . केवल स्कैन किए गए PDF का समर्थन करता है। खोजने योग्य PDF का समर्थन नहीं करता.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पूर्ण पथ। |
| settings | DocumentRecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तु।

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

स्कैन किए गए पीडीएफ से पाठ को पहचानें (चित्र निकालें)  निर्दिष्ट करने की क्षमता के साथ पीडीएफ फाइल को पहचानता है[`RecognitionSettings`](../../recognitionsettings/) . केवल स्कैन किए गए PDF का समर्थन करता है। खोजने योग्य PDF का समर्थन नहीं करता.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | पीडीएफ फाइल के साथ मेमोरी स्ट्रीम। |
| settings | DocumentRecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तु।

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)


