---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope method"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope method. एक संग्रह लौटाता है जिसमें प्रीफ़िक्स द्वारा कुंजीबद्ध नेमस्पेस नाम होते हैं, जिन्हें C++ में वर्तमान में स्कोप में मौजूद नेमस्पेस को सूचीबद्ध करने के लिए उपयोग किया जा सकता है।"
type: docs
weight: 600
url: /hi/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


एक संग्रह लौटाता है जिसमें प्रीफ़िक्स द्वारा कुंजीबद्ध नेमस्पेस नाम होते हैं, जिन्हें वर्तमान में स्कोप में मौजूद नेमस्पेस को एनेमरेट करने के लिए उपयोग किया जा सकता है।

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्कोप | XmlNamespaceScope | एक enumeration मान जो लौटाने के लिए नेमस्पेस नोड्स के प्रकार को निर्दिष्ट करता है। |

### ReturnValue

वर्तमान में स्कोप में मौजूद नेमस्पेस और प्रीफ़िक्स जोड़े का एक संग्रह।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
