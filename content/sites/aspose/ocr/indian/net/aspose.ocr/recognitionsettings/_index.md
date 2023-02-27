---
title: Class RecognitionSettings
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: Aspose.OCR.RecognitionSettings कक्ष. छव पहचन के लए सेटंग्स में ऐसे तत्व शमल हैं ज पहचन प्रक्रय क अनुकूलत करने क अनुमत देते हैं
type: docs
weight: 240
url: /hi/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

छवि पहचान के लिए सेटिंग्स। में ऐसे तत्व शामिल हैं जो पहचान प्रक्रिया को अनुकूलित करने की अनुमति देते हैं।

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | का एक नया उदाहरण प्रारंभ करता है`RecognitionSettings`गुणों के पूर्ण सेट के साथ वर्ग। |

## गुण

| नाम | विवरण |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | अनुमत वर्ण सेट। मान्यता परिणाम के लिए अनुमत वर्णों के प्रकार को निर्धारित करता है। |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | पहचान से पहले छवि के लिए एक अतिरिक्त कंट्रास्ट सुधार एल्गोरिथ्म का उपयोग करने की अनुमति देता है। |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | छवि को बेहतर बनाने के लिए एक अतिरिक्त तंत्रिका नेटवर्क के उपयोग को सक्षम करता है - शोर को कम करता है। स्कैन कलाकृतियों, विरूपण, धब्बे, फ्लेयर्स, ग्रेडिएंट्स, विदेशी तत्वों वाली छवियों के लिए उपयोगी है। |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | एक फ़्लैग प्राप्त करता है या सेट करता है जो दर्शाता है कि स्वचालित छवि तिरछा सुधार सक्षम किया जाना चाहिए। डिफ़ॉल्ट रूप से सक्षम (सत्य) है। |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | दस्तावेज़ प्रकार क्षेत्रों के लिए इष्टतम मोड का चयन करने की अनुमति देता है: दस्तावेज़, फोटो, सादा पाठ, स्तंभ, छवि। |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | मान्यता प्रतीकों के लिए ब्लैकलिस्ट सेट करता है। |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | ओसीआर के लिए प्रयुक्त भाषा प्राप्त या सेट करता है।  मान्यता के दौरान उपयोग किए जाने वाले वर्णमाला को निर्धारित करता है। डिफ़ॉल्ट रूप से बहु-भाषा। |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | तालिकाओं में पाठ को पहचानने की अनुमति देता है (क्षेत्र चारों ओर की रेखाएँ)। |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | पूर्व-प्रसंस्करण विधियों को समायोजित करके ओसीआर के लिए छवि तैयार करने की अनुमति देता है। |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | प्रसंस्करण के लिए पाठ क्षेत्रों की सूची प्राप्त या सेट करता है।  अधिक सटीक पहचान के लिए टेक्स्ट वाले क्षेत्रों को मैन्युअल रूप से निर्दिष्ट करने की अनुमति देता है। यदि कस्टम क्षेत्र सेट हैंDetectAreas और!:AutoSkew संपत्तियों पर ध्यान नहीं दिया जाएगा.  डिटेक्ट एरिया और ऑटो स्क्यू को अक्षम करता है। |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | सिंगल-लाइन छवि पहचान सेट करता है। डिफ़ॉल्ट रूप से अक्षम (झूठा)। लाइनों में विभाजन से जुड़े सभी प्रसंस्करण चरणों को अक्षम करें। यदि आपकी छवि में केवल एक पंक्ति है तो इस पैरामीटर को सत्य पर सेट करें। RecognitionAreas सेटिंग्स को अक्षम करता है, इसलिए सभी क्षेत्रों की सेटिंग्स को अनदेखा कर दिया जाएगा. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | इमेज रोटेशन के लिए डिग्री में कोण प्राप्त या सेट करता है।  इस मान को सेट करने से अक्षम हो जाएगा[`AutoSkew`](../baserecognitionsettings/autoskew/) संपत्ति, ताकि ऑटो तिरछा सुधार लागू न हो। डिफ़ॉल्ट रूप से शून्य। |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | प्रसंस्करण के लिए धागे की संख्या प्राप्त या सेट करता है। डिफ़ॉल्ट रूप से, 0 का अर्थ है कि छवि को आपके प्रोसेसर की संख्या के बराबर थ्रेड्स की संख्या के साथ संसाधित किया जाएगा। थ्रेड्सकाउंट = 1 का अर्थ है कि छवि को मुख्य थ्रेड में संसाधित किया जाएगा। |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | इमेज बाइनेराइज़ेशन के लिए कस्टम थ्रेशोल्ड मान प्राप्त या सेट करता है. 1 से 255 तक की रेंज. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | आपको विशेष रूप से छोटे फ़ॉन्ट पहचान के लिए अतिरिक्त एल्गोरिदम का उपयोग करने की अनुमति देता है। छोटे आकार के वर्णों वाली छवियों के लिए उपयोगी। |

### यह सभी देखें

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* नाम स्थान [Aspose.OCR](../../aspose.ocr/)
* सभा [Aspose.OCR](../../)


