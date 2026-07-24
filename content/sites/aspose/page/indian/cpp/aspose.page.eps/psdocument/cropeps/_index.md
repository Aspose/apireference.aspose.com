---
title: "Aspose::Page::EPS::PsDocument::CropEps method"
linktitle: "CropEps"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument::CropEps method. दिए गए PsDocument को EPS फ़ाइल के रूप में क्रॉप करता है। यह प्रारंभिक EPS फ़ाइल को अपडेटेड मौजूदा %BoundingBox के साथ सहेजता है या C++ में नया बनाया जाएगा।"
type: docs
weight: 900
url: /hi/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


दिए गए [PsDocument](../) को [EPS](../../) फ़ाइल के रूप में क्रॉप करता है। यह प्रारंभिक [EPS](../../) फ़ाइल को अपडेटेड मौजूदा %BoundingBox के साथ सहेजता है या नया बनाया जाएगा।

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | आउटपुट [EPS](../../) फ़ाइल की स्ट्रीम। |
| cropBox | System::ArrayPtr\<float\> | क्रॉप बॉक्स (x0, y0, x, y)। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


दिए गए [PsDocument](../) को [EPS](../../) फ़ाइल के रूप में क्रॉप करता है। यह प्रारंभिक [EPS](../../) फ़ाइल को अपडेटेड मौजूदा %BoundingBox के साथ सहेजता है या नया बनाया जाएगा।

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outEpsFilePath | System::String | आउटपुट [EPS](../../) फ़ाइल पथ। |
| cropBox | System::ArrayPtr\<float\> | क्रॉप बॉक्स (x0, y0, x, y)। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
