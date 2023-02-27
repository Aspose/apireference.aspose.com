---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: AsposeOcr तरक. छव पर पठ क पहचनत है
type: docs
weight: 140
url: /hi/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

छवि पर पाठ को पहचानता है।

```csharp
public string RecognizeImage(string fullPath)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पथ। |

### प्रतिलाभ की मात्रा

मान्यता प्राप्त पाठ।

### टिप्पणियों

स्वचालित छवि तिरछा सुधार और पाठ क्षेत्रों का पता लगाने का उपयोग करता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है।

### यह सभी देखें

* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

छवि पर पाठ को पहचानता है।

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पथ। |
| settings | RecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तु।

### टिप्पणियों

छवि को निर्दिष्ट करने की क्षमता के साथ पहचानता है[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF को सपोर्ट करता है.

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

छवि पर पाठ को पहचानता है।

```csharp
public string RecognizeImage(MemoryStream stream)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | छवि युक्त मेमोरी स्ट्रीम। |

### प्रतिलाभ की मात्रा

मान्यता प्राप्त पाठ।

### टिप्पणियों

स्वचालित छवि तिरछा सुधार और पाठ क्षेत्रों का पता लगाने का उपयोग करता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है।

### यह सभी देखें

* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

छवि पर पाठ को पहचानता है।  छवि को निर्दिष्ट करने की क्षमता के साथ पहचानता है[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF को सपोर्ट करता है.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | छवि युक्त मेमोरी स्ट्रीम। |
| settings | RecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तु।

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

छवि पर पाठ को पहचानता है।

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imageData | Byte[] | बाइट सरणी में डिकोड की गई छवि। BitsPerPixel &gt; 1 के लिए RGB लाइटिंग तकनीक का उपयोग करता है। |
| width | Int32 | इमेज की चौड़ाई। |
| height | Int32 | चित्र की ऊंचाई। |
| pixelFormat | PixelType | बाइट, आरजीबी, बीजीआर, आरजीबीए का समर्थन करता है। |
| settings | RecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तु।

### टिप्पणियों

छवि को निर्दिष्ट करने की क्षमता के साथ पहचानता है[`RecognitionSettings`](../../recognitionsettings/) . पंक्ति डीकोडेड बाइट डेटा का समर्थन करता है।

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

छवि पर पाठ को पहचानता है।

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imageData | Color[] | Aspose.Drawing.Color सरणी में डिकोड की गई छवि। |
| width | Int32 | इमेज की चौड़ाई। |
| height | Int32 | चित्र की ऊंचाई। |
| settings | RecognitionSettings | मान्यता सेटिंग्स। |

### प्रतिलाभ की मात्रा

[`RecognitionResult`](../../recognitionresult/) छवि पहचान परिणामों के साथ वस्तु।

### टिप्पणियों

छवि को निर्दिष्ट करने की क्षमता के साथ पहचानता है[`RecognitionSettings`](../../recognitionsettings/) . पंक्ति डीकोडेड बाइट डेटा का समर्थन करता है।

### यह सभी देखें

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)


