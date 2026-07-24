---
title: "System::Xml::NameTable::Get मेथड"
linktitle: "प्राप्तकरें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::NameTable::Get मेथड। दिए गए ऐरे में निर्दिष्ट रेंज के समान कैरेक्टर्स वाली एटॉमाइज़्ड स्ट्रिंग को C++ में लौटाता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


निर्दिष्ट वर्ण सीमा के समान अक्षरों को सम्मिलित करने वाली एटॉमाइज़्ड स्ट्रिंग को लौटाता है।

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुंजी | const ArrayPtr\<char16_t\>\& | जिस नाम को खोजने के लिए है, वह कैरेक्टर एरे। |
| प्रारंभ | int32_t | ऐरे में शून्य-आधारित इंडेक्स जो नाम के पहले कैरेक्टर को निर्दिष्ट करता है। |
| len | int32_t | नाम में कैरेक्टरों की संख्या। |

### ReturnValue

एटॉमाइज़्ड स्ट्रिंग या **nullptr** यदि स्ट्रिंग अभी तक एटॉमाइज़ नहीं हुई है। यदि **len** शून्य है, तो [String::Empty](../../../system/string/empty/) लौटाया जाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


निर्दिष्ट मान के साथ एटॉमाइज़्ड स्ट्रिंग लौटाता है।

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | खोजने के लिए नाम। |

### ReturnValue

एटॉमाइज़्ड स्ट्रिंग ऑब्जेक्ट या **nullptr** यदि स्ट्रिंग अभी तक एटॉमाइज़ नहीं हुई है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
