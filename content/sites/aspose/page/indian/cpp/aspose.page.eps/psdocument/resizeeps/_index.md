---
title: "Aspose::Page::EPS::PsDocument::ResizeEps method"
linktitle: "ResizeEps"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument::ResizeEps method. दिए गए PsDocument को EPS फ़ाइल के रूप में आकार बदलता है। यह विधि केवल EPS आकार निकालने के बाद उपयोग की जाती है। यह प्रारंभिक EPS फ़ाइल को अद्यतन मौजूदा %BoundingBox के साथ सहेजता है या नया बनाया जाएगा। पृष्ठ परिवर्तन मैट्रिक्स भी C++ में सेट किया जाएगा।"
type: docs
weight: 4000
url: /hi/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


दिए गए [PsDocument](../) को [EPS](../../) फ़ाइल के रूप में आकार बदलता है। यह विधि केवल [EPS](../../) आकार निकालने के बाद उपयोग की जाती है। यह प्रारंभिक [EPS](../../) फ़ाइल को अपडेटेड मौजूदा %BoundingBox के साथ सहेजता है या नया बनाया जाएगा। [Page](../../../aspose.page/) ट्रांसफ़ॉर्मेशन मैट्रिक्स भी सेट किया जाएगा।

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | आउटपुट [EPS](../../) फ़ाइल की स्ट्रीम। |
| newSizeInUnits | System::Drawing::SizeF | निर्धारित इकाइयों में [EPS](../../) छवि का नया आकार। |
| इकाइयाँ | इकाइयाँ | नए आकार की इकाइयाँ। यह पॉइंट्स, इंच, मिलीमीटर, सेंटीमीटर और प्रारंभिक आकार के प्रतिशत हो सकते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


दिए गए [PsDocument](../) को [EPS](../../) फ़ाइल के रूप में आकार बदलता है। यह विधि केवल [EPS](../../) आकार निकालने के बाद उपयोग की जाती है। यह प्रारंभिक [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e को अपडेटेड मौजूदा %BoundingBox के साथ सहेजता है या नया बनाया जाएगा। [Page](../../../aspose.page/) ट्रांसफ़ॉर्मेशन मैट्रिक्स भी सेट किया जाएगा।

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outEpsFilePath | System::String | आउटपुट [EPS](../../) फ़ाइल पथ। |
| newSizeInUnits | System::Drawing::SizeF | निर्धारित इकाइयों में [EPS](../../) छवि का नया आकार। |
| इकाइयाँ | इकाइयाँ | नए आकार की इकाइयाँ। यह पॉइंट्स, इंच, मिलीमीटर, सेंटीमीटर और प्रारंभिक आकार के प्रतिशत हो सकते हैं। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
