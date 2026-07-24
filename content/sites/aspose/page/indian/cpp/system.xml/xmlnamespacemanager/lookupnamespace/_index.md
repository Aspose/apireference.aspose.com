---
title: "System::Xml::XmlNamespaceManager::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamespaceManager::LookupNamespace method. C++ में निर्दिष्ट उपसर्ग के लिए नेमस्पेस URI लौटाता है।"
type: docs
weight: 800
url: /hi/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


निर्दिष्ट प्रीफ़िक्स के लिए नेमस्पेस URI लौटाता है।

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| prefix | const String\& | उपसर्ग जिसका नेमस्पेस URI आप हल करना चाहते हैं। डिफ़ॉल्ट नेमस्पेस से मेल करने के लिए, [String::Empty](../../../system/string/empty/) पास करें। |

### ReturnValue

यदि कोई मैप किया गया नेमस्पेस नहीं है तो **prefix** या **nullptr** के लिए नेमस्पेस URI। लौटाई गई स्ट्रिंग एटोमाइज़्ड है। एटोमाइज़्ड स्ट्रिंग्स के बारे में अधिक जानकारी के लिए, [XmlNameTable](../../xmlnametable/) क्लास देखें।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
