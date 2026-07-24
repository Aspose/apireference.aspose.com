---
title: "System::Xml::XmlReader::LookupNamespace मेथड"
linktitle: "LookupNamespace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::LookupNamespace मेथड। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को C++ में हल करता है।"
type: docs
weight: 3100
url: /hi/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है।

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | const String\& | वह उपसर्ग जिसका नेमस्पेस URI आप हल करना चाहते हैं। डिफ़ॉल्ट नेमस्पेस से मेल खाने के लिए, एक खाली स्ट्रिंग पास करें। |

### ReturnValue

वह नेमस्पेस URI जिससे प्रीफ़िक्स मैप होता है या यदि कोई मेल खाने वाला प्रीफ़िक्स नहीं मिलता तो **nullptr**।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
