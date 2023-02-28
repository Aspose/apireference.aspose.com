---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: AsposeOcr तरक. ओसआर क सटकत में सुधर के लए इमेज प्रप्रसेसंग क उपयग करें फ़ल्टर क एक सूच बनएं ज आपके द्वर नर्दष्ट क्रम में इनपुट छव पर लगू क जएग फ़ल्टर बनने के लए उदहरण प्रप्रसेसंग फ़ल्टर फ़ल्टर  नय प्रप्रसेसंगफ़ल्टर  प्रप्रसेसंगफ़ल्टर.इनवर्ट   प्रप्रसेसंगफ़ल्टर.थ्रेशल्ड150 प्रप्रसेसंगफ़ल्टर.बनरइज़ प्रप्रसेसंगफ़ल्टर.रटेट 180 प्रप्रसेसंगफ़ल्टर.रसइज़ 30003000 Aspose.OCR.Filters.InterpolationFilterType.Box प्रप्रसेसंग.स्केल.6फ़ल्टर  प्रप्रसेसंगफ़ल्टर.Dilate  आपक उन सभ क आवश्यकत नहं है केवल वह सेट करें जसक आपक आवश्यकत है.
type: docs
weight: 100
url: /hi/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

ओसीआर की सटीकता में सुधार के लिए इमेज प्रीप्रोसेसिंग का उपयोग करें। फ़िल्टर की एक सूची बनाएं जो आपके द्वारा निर्दिष्ट क्रम में इनपुट छवि पर लागू की जाएगी। फ़िल्टर बनाने के लिए उदाहरण: प्रीप्रोसेसिंग फ़िल्टर फ़िल्टर = नया प्रीप्रोसेसिंगफ़िल्टर { प्रीप्रोसेसिंगफ़िल्टर.इनवर्ट () , प्रीप्रोसेसिंगफ़िल्टर.थ्रेशोल्ड(150), प्रीप्रोसेसिंगफ़िल्टर.बिनराइज़(), प्रीप्रोसेसिंगफ़िल्टर.रोटेट (180), प्रीप्रोसेसिंगफ़िल्टर.रीसाइज़ (3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), प्रीप्रोसेसिंग.स्केल.6फ़िल्टर ), प्रीप्रोसेसिंगफ़िल्टर.Dilate() }; आपको उन सभी की आवश्यकता नहीं है। केवल वही सेट करें जिसकी आपको आवश्यकता है.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fullPath | String | छवि के लिए पूर्ण पथ। |
| filters | PreprocessingFilter | छवि अनुकूलन फ़िल्टर[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### प्रतिलाभ की मात्रा

संशोधित छवि के साथ स्ट्रीम करें ताकि आप इसे सहेज सकें या पहचान सकें।

### यह सभी देखें

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

ओसीआर की सटीकता में सुधार के लिए इमेज प्रीप्रोसेसिंग का उपयोग करें। फ़िल्टर की एक सूची बनाएं जो आपके द्वारा निर्दिष्ट क्रम में इनपुट छवि पर लागू की जाएगी। फ़िल्टर बनाने के लिए उदाहरण: प्रीप्रोसेसिंग फ़िल्टर फ़िल्टर = नया प्रीप्रोसेसिंगफ़िल्टर { प्रीप्रोसेसिंगफ़िल्टर.इनवर्ट () , प्रीप्रोसेसिंगफ़िल्टर.थ्रेशोल्ड(150), प्रीप्रोसेसिंगफ़िल्टर.बिनराइज़(), प्रीप्रोसेसिंगफ़िल्टर.रोटेट (180), प्रीप्रोसेसिंगफ़िल्टर.रीसाइज़ (3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), प्रीप्रोसेसिंग.स्केल.6फ़िल्टर ), प्रीप्रोसेसिंगफ़िल्टर.Dilate() }; आपको उन सभी की आवश्यकता नहीं है। केवल वही सेट करें जिसकी आपको आवश्यकता है.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | छवि युक्त मेमोरी स्ट्रीम। |
| filters | PreprocessingFilter | छवि अनुकूलन फ़िल्टर[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### प्रतिलाभ की मात्रा

संशोधित छवि के साथ स्ट्रीम करें ताकि आप इसे सहेज सकें या पहचान सकें।

### यह सभी देखें

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)


