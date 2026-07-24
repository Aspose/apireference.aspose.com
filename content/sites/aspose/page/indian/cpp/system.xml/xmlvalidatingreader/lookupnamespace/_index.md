---
title: "System::Xml::XmlValidatingReader::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlValidatingReader::LookupNamespace method. वर्तमान तत्व के दायरे में एक नेमस्पेस उपसर्ग को C++ में हल करता है।"
type: docs
weight: 3400
url: /hi/cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है।

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | const String\& | वह उपसर्ग जिसका नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) आप हल करना चाहते हैं। डिफ़ॉल्ट नेमस्पेस से मेल खाने के लिए, एक खाली स्ट्रिंग पास करें। |

### ReturnValue

वह नेमस्पेस URI जिससे प्रीफ़िक्स मैप होता है या यदि कोई मेल खाने वाला प्रीफ़िक्स नहीं मिलता तो **nullptr**।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
