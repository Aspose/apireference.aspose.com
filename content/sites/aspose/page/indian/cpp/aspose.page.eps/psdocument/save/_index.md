---
title: "Aspose::Page::EPS::PsDocument::Save विधि"
linktitle: "Save"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument::Save विधि। दिए गए PsDocument को PS या EPS फ़ाइल के रूप में सहेजता है। यह विधि केवल तब उपयोग की जाती है जब PsDocument को C++ में शून्य से बनाया गया हो।"
type: docs
weight: 4200
url: /hi/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


दिए गए [PsDocument](../) को PS या [EPS](../../) फ़ाइल के रूप में सहेजता है। यह विधि केवल तब उपयोग की जाती है जब [PsDocument](../) को शून्य से बनाया गया हो।

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## संबंधित देखें

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


दिए गए [PsDocument](../) को स्ट्रीम में सहेजता है। यह विधि केवल [XMP](../../../aspose.page.eps.xmp/) मेटाडेटा को अपडेट करने के बाद उपयोग की जाती है। यह प्रारंभिक [EPS](../../) फ़ाइल को अपडेटेड मौजूदा मेटाडेटा या GetMetadata विधि को कॉल करते समय बनाई गई नई मेटाडेटा के साथ सहेजता है। अंतिम मामले में सभी आवश्यक PostScript कोड और [EPS](../../) टिप्पणियाँ जोड़ी जाती हैं।

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | आउटपुट [EPS](../../) फ़ाइल की स्ट्रीम। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


दिए गए [PsDocument](../) को [EPS](../../) फ़ाइल के रूप में सहेजता है। यह विधि केवल [XMP](../../../aspose.page.eps.xmp/) मेटाडेटा को अपडेट करने के बाद उपयोग की जाती है। यह प्रारंभिक [EPS](../../) फ़ाइल को अपडेटेड मौजूदा मेटाडेटा या GetMetadata विधि को कॉल करते समय बनाई गई नई मेटाडेटा के साथ सहेजता है। अंतिम मामले में सभी आवश्यक PostScript कोड और [EPS](../../) टिप्पणियाँ जोड़ी जाती हैं।

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outEpsFilePath | System::String | एक आउटपुट [EPS](../../) फ़ाइल पथ। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
