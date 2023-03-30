---
title: Class TemplateProcessor
second_title: .NET API संदर्भ के लिए Aspose.OMR
description: Aspose.OMR.Api.TemplateProcessor कक्ष. टेम्प्लेट और इमेज प्रसेस करने के लए क्लस.  इस वर्ग क प्रत्येक उदहरण एक ओएमआर टेम्पलेट के सथ कम करत है यह कन्स्ट्रक्टर में नर्दष्ट टेम्पलेट क छवयं क पहचनने में सक्षम है
type: docs
weight: 30
url: /hi/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

टेम्प्लेट और इमेज प्रोसेस करने के लिए क्लास.  इस वर्ग का प्रत्येक उदाहरण एक ओएमआर टेम्पलेट के साथ काम करता है। यह कन्स्ट्रक्टर में निर्दिष्ट टेम्पलेट की छवियों को पहचानने में सक्षम है।

```csharp
public class TemplateProcessor
```

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | फ़ाइन ट्यून किए गए पैरामीटर का उपयोग करके पहचान परिणाम अपडेट करता है. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | फ़ोल्डर से छवियों को पहचानता है |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | मेमोरी स्ट्रीम से छवि को पहचानना |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | छवि को पहचानता है |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | बहु-पृष्ठ टेम्पलेट को पहचानता है |

### उदाहरण

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### यह सभी देखें

* नाम स्थान [Aspose.OMR.Api](../../aspose.omr.api/)
* सभा [Aspose.OMR](../../)


