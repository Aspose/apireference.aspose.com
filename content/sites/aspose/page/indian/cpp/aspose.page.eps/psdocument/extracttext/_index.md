---
title: "Aspose::Page::EPS::PsDocument::ExtractText method"
linktitle: "ExtractText"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument::ExtractText method. PS फ़ाइल से पाठ निकालता है। पाठ केवल तभी निकाला जा सकता है जब यह Type 42 (TrueType) फ़ॉन्ट या Type 0 फ़ॉन्ट के साथ Type 42 फ़ॉन्ट्स के वेक्टर मैप में लिखा गया हो C++ में।"
type: docs
weight: 2300
url: /hi/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


PS फ़ाइल से पाठ निकालता है। पाठ केवल तभी निकाला जा सकता है जब वह टाइप 42 (**TrueType**) फ़ॉन्ट या टाइप 0 फ़ॉन्ट के साथ टाइप 42 फ़ॉन्ट्स वाले वेक्टर मैप में लिखा गया हो।

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विकल्प | System::SharedPtr\<SaveOptions\> | सेव विकल्प। |
| startPage | int32_t | पाठ निकालना शुरू करने वाला पृष्ठ। यह पैरामीटर बहु-पृष्ठीय दस्तावेज़ों के लिए उपयोगी है। |
| endPage | int32_t | पाठ निकालना समाप्त करने वाला पृष्ठ। यह पैरामीटर बहु-पृष्ठीय दस्तावेज़ों के लिए उपयोगी है। |

### ReturnValue

निकाला गया पाठ।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
