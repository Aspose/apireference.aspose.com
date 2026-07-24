---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructor. खाली PsDocument को प्रारंभ करता है। यह कंस्ट्रक्टर केवल अतिरिक्त कार्यों के लिए उपयोग किया जाता है जो PostScript फ़ाइलों से संबंधित नहीं हैं, उदाहरण के लिए, C++ में फ़ॉन्ट बदलना।"
type: docs
weight: 100
url: /hi/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


खाली [PsDocument](../) को प्रारंभ करता है। यह कंस्ट्रक्टर केवल अतिरिक्त कार्यों के लिए उपयोग किया जाता है जो PostScript फ़ाइलों से संबंधित नहीं हैं, उदाहरण के लिए, फ़ॉन्ट बदलना।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## संबंधित देखें

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


[PsDocument](../) को PS/EPS फ़ाइल की स्ट्रीम के साथ प्रारंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS फ़ाइल का इनपुट स्ट्रीम। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


खाली [PsDocument](../) को प्रारंभिक पृष्ठ के साथ प्रारंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | स्ट्रीम जहाँ PS/EPS फ़ाइल को सहेजा जाता है। |
| विकल्प | System::SharedPtr\<Device::PsSaveOptions\> | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


खाली [PsDocument](../) को आरंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | स्ट्रीम जहाँ PS/EPS फ़ाइल को सहेजा जाता है। |
| विकल्प | System::SharedPtr\<Device::PsSaveOptions\> | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| बहु-पृष्ठीय | bool | यदि false है तो पृष्ठ को आरंभ नहीं किया जाएगा। इस मामले में पृष्ठ आरंभ करना स्पष्ट "openPage(width, height)" कॉल के द्वारा किया जाना चाहिए। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


जब [Postscript](../../../aspose.page.eps.postscript/) दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली [PsDocument](../) को आरंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | स्ट्रीम जहाँ PS/EPS फ़ाइल को सहेजा जाता है। |
| विकल्प | System::SharedPtr\<Device::PsSaveOptions\> | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| numberOfPages | int32_t | PostScript दस्तावेज़ में पृष्ठों की संख्या। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


खाली [PsDocument](../) को प्रारंभिक पृष्ठ के साथ प्रारंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsFilePath | System::String | आउटपुट PS/EPS फ़ाइल पथ। |
| विकल्प | System::SharedPtr\<Device::PsSaveOptions\> | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


खाली [PsDocument](../) को आरंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsFilePath | System::String | आउटपुट PS/EPS फ़ाइल पथ। |
| विकल्प | System::SharedPtr\<Device::PsSaveOptions\> | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| बहु-पृष्ठीय | bool | यदि false है तो पृष्ठ को आरंभ नहीं किया जाएगा। इस मामले में पृष्ठ आरंभ करना स्पष्ट "openPage(width, height)" कॉल के द्वारा किया जाना चाहिए। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


जब [Postscript](../../../aspose.page.eps.postscript/) दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली [PsDocument](../) को आरंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsFilePath | System::String | आउटपुट PS/EPS फ़ाइल पथ। |
| विकल्प | System::SharedPtr\<Device::PsSaveOptions\> | PostScript फ़ाइल को सहेजने को नियंत्रित करने वाले पैरामीटरों का सेट। |
| numberOfPages | int32_t | PostScript दस्तावेज़ में पृष्ठों की संख्या। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


[PsDocument](../) को इनपुट PS/EPS फ़ाइल के साथ आरंभ करता है।

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS फ़ाइल पथ। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
