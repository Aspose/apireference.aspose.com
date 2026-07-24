---
title: "System::Xml::XmlNameTable::Add method"
linktitle: "Add"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNameTable::Add method. जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और उसे C++ में XmlNameTable में जोड़ता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और उसे [XmlNameTable](../) में जोड़ता है।

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const ArrayPtr\<char16_t\>\& | जोड़ने के लिए नाम को समाहित करने वाला कैरेक्टर एरे। |
| offset | int32_t | ऐरे में शून्य-आधारित इंडेक्स जो नाम के पहले कैरेक्टर को निर्दिष्ट करता है। |
| length | int32_t | नाम में कैरेक्टरों की संख्या। |

### ReturnValue

नया एटॉमाइज़्ड स्ट्रिंग या यदि पहले से मौजूद है तो वही। यदि लंबाई शून्य है, तो [String::Empty](../../../system/string/empty/) लौटाया जाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और उसे [XmlNameTable](../) में जोड़ता है।

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const String\& | जोड़ने के लिए नाम। |

### ReturnValue

नया एटॉमाइज़्ड स्ट्रिंग या यदि पहले से मौजूद है तो वही।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
