---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: AsposeOcr तरक. जंचें क क्य इमेज में दय गय टेक्स्ट फ़्रैगमेंट है.
type: docs
weight: 80
url: /hi/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

जांचें कि क्या इमेज में दिया गया टेक्स्ट फ़्रैगमेंट है.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पथ। |
| text | String | छवि पर खोज के लिए पाठ खंड। |
| settings | RecognitionSettings | मान्यता सेटिंग्स। |
| ignoreCase | Boolean | सत्य - का अर्थ केस-संवेदी खोज है। |

### प्रतिलाभ की मात्रा

सच है अगर छवि में पाठ का टुकड़ा है। असत्य - छवि में पाठ खंड नहीं है।

### टिप्पणियों

छवि को निर्दिष्ट करने की क्षमता के साथ पहचानता है[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF को सपोर्ट करता है.

### यह सभी देखें

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

जांचें कि छवि टेक्स्ट प्रदान किए गए नियमित अभिव्यक्ति से मेल खाता है या नहीं।

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पथ। |
| regex | Regex | दिए गए पैटर्न और विकल्पों के साथ System.Text.RegularExpressions ऑब्जेक्ट। |
| settings | RecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

सही है अगर छवि टेक्स्ट प्रदान किए गए रेगुलर एक्सप्रेशन से मेल खाता है।

### टिप्पणियों

छवि को निर्दिष्ट करने की क्षमता के साथ पहचानता है[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF को सपोर्ट करता है.

### यह सभी देखें

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)


