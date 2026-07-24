---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage method"
linktitle: "SaveAsImage"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage method. दस्तावेज़ को इमेज फ़ाइल में सहेजता है। आउटपुट डायरेक्टरी और फ़ाइल नाम इनपुट XPS फ़ाइल के समान होंगे। फ़ाइल एक्सटेंशन \"options\" पैरामीटर में इमेज फ़ॉर्मेट के अनुरूप होगा। यदि दस्तावेज़ को ऐसी स्ट्रीम से इनिशियलाइज़ किया गया है जो FileStream नहीं है, तो इमेज फ़ाइल वर्तमान फ़ोल्डर में डिफ़ॉल्ट फ़ाइल नाम टेम्पलेट के साथ C++ में सहेजी जाएगी।"
type: docs
weight: 5500
url: /hi/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


दस्तावेज़ को इमेज फ़ाइल में सहेजता है। आउटपुट डायरेक्टरी और फ़ाइल नाम इनपुट [XPS](../../) फ़ाइल के समान होंगे। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट से मेल खाएगा। यदि दस्तावेज़ को ऐसी स्ट्रीम से इनिशियलाइज़ किया गया है जो FileStream नहीं है, तो इमेज फ़ाइल वर्तमान फ़ोल्डर में डिफ़ॉल्ट फ़ाइल नाम टेम्प्लेट के साथ सहेजी जाएगी।

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विकल्प | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | बिटमैप इमेज फ़ॉर्मेट में दस्तावेज़ को सहेजने के विकल्प। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


दस्तावेज़ को निर्दिष्ट डायरेक्टरी में निर्दिष्ट फ़ाइल नाम के साथ इमेज फ़ाइल में सहेजता है। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट के अनुरूप होगा।

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विकल्प | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | बिटमैप इमेज फ़ॉर्मेट में दस्तावेज़ को सहेजने के विकल्प। |
| outDir | System::String | इमेज फ़ाइल जहाँ सहेजी जाएगी, उसकी आउटपुट डायरेक्टरी। |
| fileNameTemplate | System::String | इमेज के लिए फ़ाइल नाम टेम्प्लेट (एक्सटेंशन के बिना)। यदि इनपुट [XPS](../../) फ़ाइल एक पृष्ठीय है तो यह ठीक फ़ाइल नाम होगा, अन्यथा "_[n]" जहाँ "n" - पृष्ठ संख्या 0 से शुरू होती है, इस पर प्रत्यय जोड़ा जाएगा। फ़ाइल एक्सटेंशन "option" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट से मेल खाएगा। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
