---
title: "System::Xml::XmlNameTable::Get method"
linktitle: "प्राप्तकरें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNameTable::Get method. जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो दिए गए ऐरे में निर्दिष्ट कैरेक्टर रेंज के समान कैरेक्टरों वाले एटॉमाइज़्ड स्ट्रिंग को C++ में प्राप्त करता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो दिए गए एरे में निर्दिष्ट वर्णों की रेंज के समान अक्षरों वाले एटॉमाइज़्ड स्ट्रिंग को प्राप्त करता है।

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const ArrayPtr\<char16_t\>\& | खोजने के लिए नाम को समाहित करने वाला कैरेक्टर एरे। |
| offset | int32_t | ऐरे में शून्य-आधारित इंडेक्स जो नाम के पहले कैरेक्टर को निर्दिष्ट करता है। |
| length | int32_t | नाम में कैरेक्टरों की संख्या। |

### ReturnValue

एटॉमाइज़्ड स्ट्रिंग या **nullptr** यदि स्ट्रिंग अभी तक एटॉमाइज़ नहीं हुई है। यदि **length** शून्य है, तो [String::Empty](../../../system/string/empty/) लौटाया जाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट स्ट्रिंग के समान मान वाले एटॉमाइज़्ड स्ट्रिंग को प्राप्त करता है।

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const String\& | देखने के लिए नाम। |

### ReturnValue

यदि स्ट्रिंग पहले से एटॉमाइज़ नहीं हुई है तो एटॉमाइज़्ड स्ट्रिंग या **nullptr**।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
