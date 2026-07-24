---
title: "System::Xml::NameTable::Add मेथड"
linktitle: "Add"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::NameTable::Add मेथड। निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और इसे C++ में NameTable में जोड़ता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और इसे [NameTable](../) में जोड़ता है।

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | const ArrayPtr\<char16_t\>\& | स्ट्रिंग जोड़ने के लिए शामिल करने वाला कैरेक्टर एरे। |
| प्रारंभ | int32_t | ऐरे में शून्य-आधारित इंडेक्स जो स्ट्रिंग के पहले कैरेक्टर को निर्दिष्ट करता है। |
| len | int32_t | स्ट्रिंग में कैरेक्टर्स की संख्या। |

### ReturnValue

एटॉमाइज़्ड स्ट्रिंग या मौजूदा स्ट्रिंग यदि वह पहले से [NameTable](../) में मौजूद है। यदि **len** शून्य है, तो [String::Empty](../../../system/string/empty/) लौटाया जाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और इसे [NameTable](../) में जोड़ता है।

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | const String\& | जोड़ने के लिए स्ट्रिंग। |

### ReturnValue

एटॉमाइज़्ड स्ट्रिंग या मौजूदा स्ट्रिंग यदि वह पहले से [NameTable](../) में मौजूद है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
