---
title: Class PreprocessingFilter
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter कक्ष. इमेज प्रसेसंग कमंड के लए बेस क्लस
type: docs
weight: 170
url: /hi/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

इमेज प्रोसेसिंग कमांड के लिए बेस क्लास।

इमेज प्रोसेसिंग कमांड के लिए बेस क्लास।

```csharp
public class PreprocessingFilter : IEnumerable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | छवि को बेहतर बनाने के लिए एक अतिरिक्त तंत्रिका नेटवर्क के उपयोग को सक्षम करता है - शोर को कम करता है। स्कैन कलाकृतियों, विरूपण, धब्बे, फ्लेयर्स, ग्रेडिएंट्स, विदेशी तत्वों वाली छवियों के लिए उपयोगी है। |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | छवि के हिस्से को बेहतर बनाने के लिए एक अतिरिक्त तंत्रिका नेटवर्क के उपयोग को सक्षम करता है - शोर को कम करता है। स्कैन कलाकृतियों, विरूपण, धब्बे, फ्लेयर्स, ग्रेडिएंट्स, विदेशी तत्वों वाली छवियों के लिए उपयोगी है। |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | स्वचालित रूप से छवि में ज्यामितीय विकृतियों को ठीक करता है। अत्यधिक संसाधन गहन! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | स्वचालित छवि तिरछा सुधार सक्षम करता है। |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | स्वचालित छवि भाग तिरछा सुधार सक्षम करता है। |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | एक छवि को श्वेत-श्याम छवि में परिवर्तित करता है। बाइनरी छवियां ऐसी छवियां होती हैं जिनके पिक्सेल में केवल दो संभावित तीव्रता मान होते हैं। वे आम तौर पर काले और सफेद रंग में प्रदर्शित होते हैं। संख्यात्मक रूप से, दो मान अक्सर काले रंग के लिए 0 और सफ़ेद के लिए 255 होते हैं। बाइनरी छवियां एक छवि को ऑटो थ्रेशोल्ड करके बनाई जाती हैं। |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | छवि के एक हिस्से को श्वेत-श्याम छवि में परिवर्तित करता है। बाइनरी छवियां ऐसी छवियां होती हैं जिनके पिक्सेल में केवल दो संभावित तीव्रता मान होते हैं। वे आम तौर पर काले और सफेद रंग में प्रदर्शित होते हैं। संख्यात्मक रूप से, दो मान अक्सर काले रंग के लिए 0 और सफ़ेद के लिए 255 होते हैं। बाइनरी छवियां एक छवि को ऑटो थ्रेशोल्ड करके बनाई जाती हैं। |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | कंट्रास्ट सुधार फ़िल्टर. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | इमेज के हिस्से के लिए कंट्रास्ट सुधार फ़िल्टर. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | डाइलेशन इमेज में ऑब्जेक्ट की सीमाओं में पिक्सेल जोड़ता है. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | डाइलेशन इमेज के एक हिस्से में ऑब्जेक्ट की सीमाओं में पिक्सेल जोड़ता है. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | दस्तावेज़ छवि में स्वचालित रूप से रंग बदलता है। |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | स्वचालित रूप से छवि के एक हिस्से में रंगों को बदल देता है। |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | माध्यिका फ़िल्टर छवि के प्रत्येक तत्व के माध्यम से चलता है और प्रत्येक पिक्सेल को उसके पड़ोसी पिक्सेल के माध्यिका से प्रतिस्थापित करता है। |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | माध्यिका फ़िल्टर छवि भाग के प्रत्येक तत्व के माध्यम से चलता है और प्रत्येक पिक्सेल को उसके पड़ोसी पिक्सेल के माध्यिका से प्रतिस्थापित करता है। |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | पुनर्विक्रय छवि - अपस्केल या डाउनस्केल छवि रिज़ॉल्यूशन। इंटरपोलेशनफ़िल्टरटाइप = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | पुनर्विक्रय छवि - अपस्केल या डाउनस्केल छवि रिज़ॉल्यूशन। |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | मूल छवि को घुमाएं. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | इमेज का एक हिस्सा घुमाएं. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | पुनर्विक्रय छवि - अपस्केल या डाउनस्केल छवि रिज़ॉल्यूशन। इंटरपोलेशनफ़िल्टरटाइप = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | पुनर्विक्रय छवि - अपस्केल या डाउनस्केल छवि रिज़ॉल्यूशन। |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | मूल छवि की पिक्सेल तीव्रता पर थ्रेसहोल्ड मान सेट करने के आधार पर एक बाइनरी छवि बनाएं। |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | मूल छवि भाग की पिक्सेल तीव्रता पर थ्रेसहोल्ड मान सेट करने के आधार पर छवि का एक बाइनरी भाग बनाएं। |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | एक छवि को ग्रेस्केल छवि में परिवर्तित करता है। ग्रेस्केल छवि में छवि में प्रकाश का 256 स्तर (0 से 255) होता है। |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | सभी कार्यों को आगे चलाने के लिए संग्रह में नया फ़िल्टर जोड़ें। संग्रह मामलों में संगति। |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | IEnumarable इंटरफ़ेस प्राप्ति के लिए। |

### यह सभी देखें

* नाम स्थान [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* सभा [Aspose.OCR](../../)


