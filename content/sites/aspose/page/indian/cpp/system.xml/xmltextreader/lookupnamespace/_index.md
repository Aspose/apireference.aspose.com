---
title: "System::Xml::XmlTextReader::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader::LookupNamespace method. C++ में वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है।"
type: docs
weight: 3700
url: /hi/cpp/system.xml/xmltextreader/lookupnamespace/
---
## XmlTextReader::LookupNamespace method


वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है।

```cpp
String System::Xml::XmlTextReader::LookupNamespace(const String &prefix) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | const String\& | वह प्रीफ़िक्स जिसका नेमस्पेस URI आप हल करना चाहते हैं। डिफ़ॉल्ट नेमस्पेस से मेल खाने के लिए, एक खाली स्ट्रिंग पास करें। इस स्ट्रिंग को एटॉमाइज़ करने की आवश्यकता नहीं है। |

### ReturnValue

वह नेमस्पेस URI जिससे प्रीफ़िक्स मैप होता है या यदि कोई मेल खाने वाला प्रीफ़िक्स नहीं मिलता तो **nullptr**।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
