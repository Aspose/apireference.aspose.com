---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: AsposeOcr तरक. छव पर पठ क्षेत्रं क पत लगत है  स्वचलत छव तरछ सुधर लगू नहं हत है GIF PNG JPEG BMP TIFF JFIF क समर्थन करत है
type: docs
weight: 70
url: /hi/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

छवि पर पाठ क्षेत्रों का पता लगाता है।  स्वचालित छवि तिरछा सुधार लागू नहीं होता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है।

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पथ। |
| areasType | AreasType | निर्धारित करता है कि कौन से आयत वापस लौटेंगे - रेखा या अनुच्छेद। |
| detectAreas | Boolean | स्वचालित पाठ क्षेत्रों का पता लगाना सक्षम करें। |

### प्रतिलाभ की मात्रा

पता लगाए गए पाठ क्षेत्रों या पंक्तियों की सूची।

### यह सभी देखें

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

छवि पर पाठ क्षेत्रों का पता लगाता है।  स्वचालित छवि तिरछा सुधार लागू नहीं होता है। GIF, PNG, JPEG, BMP, TIFF, JFIF का समर्थन करता है।

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | MemoryStream | छवि युक्त मेमोरी स्ट्रीम। |
| areasType | AreasType | निर्धारित करता है कि कौन से आयत वापस लौटेंगे - रेखा या अनुच्छेद। |
| detectAreas | Boolean | स्वचालित पाठ क्षेत्रों का पता लगाना सक्षम करें। |

### प्रतिलाभ की मात्रा

पता लगाए गए पाठ क्षेत्रों या पंक्तियों की सूची।

### यह सभी देखें

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)


