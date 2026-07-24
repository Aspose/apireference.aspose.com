---
title: "Aspose::Page::EPS::PsDocument::OutlineText विधि"
linktitle: "OutlineText"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument::OutlineText विधि। C++ में ग्लिफ़ कंटूर को ड्रॉ करके एक टेक्स्ट स्ट्रिंग जोड़ता है।"
type: docs
weight: 3900
url: /hi/cpp/aspose.page.eps/psdocument/outlinetext/
---
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| एडवांसेज | System::ArrayPtr\<float\> | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है जो कस्टम फ़ोल्डर में स्थित है। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| एडवांसेज | System::ArrayPtr\<float\> | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है जो कस्टम फ़ोल्डर में स्थित है। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | ग्लिफ़ आउटलाइन ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| एडवांसेज | System::ArrayPtr\<float\> | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| फ़ॉन्ट | System::SharedPtr\<System::Drawing::Font\> | फ़ॉन्ट जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| एडवांसेज | System::ArrayPtr\<float\> | ग्लिफ़ की चौड़ाई का एक एरे। इसकी लंबाई स्ट्रिंग में ग्लिफ़ की संख्या के अनुरूप होनी चाहिए। |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) फ़ॉन्ट जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | ग्लिफ़ आउटलाइन ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है जो कस्टम फ़ोल्डर में स्थित है। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। इसे कस्टम फ़ॉन्ट के साथ उपयोग किया जा सकता है जो कस्टम फ़ोल्डर में स्थित है। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | ग्लिफ़ आउटलाइन ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) फ़ॉन्ट जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::OutlineText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) method


ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है।

```cpp
void Aspose::Page::EPS::PsDocument::OutlineText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Pen> stroke)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | System::String | जोड़ने के लिए टेक्स्ट। |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) फ़ॉन्ट जो टेक्स्ट ड्रॉ करने के लिए उपयोग किया जाएगा। |
| x | फ़्लोट | टेक्स्ट मूल बिंदु के लिए X निर्देशांक। |
| y | फ़्लोट | टेक्स्ट मूल बिंदु के लिए Y निर्देशांक। |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | ग्लिफ़ आउटलाइन ड्रॉ करने के लिए उपयोग किया गया स्ट्रोक। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
