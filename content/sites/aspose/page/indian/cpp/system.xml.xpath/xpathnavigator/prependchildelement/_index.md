---
title: "System::Xml::XPath::XPathNavigator::PrependChildElement विधि"
linktitle: "PrependChildElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::PrependChildElement विधि। C++ में निर्दिष्ट मान के साथ नेमस्पेस प्रीफ़िक्स, स्थानीय नाम, और नेमस्पेस URI का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची की शुरुआत में एक नया चाइल्ड एलिमेंट बनाता है।"
type: docs
weight: 6700
url: /hi/cpp/system.xml.xpath/xpathnavigator/prependchildelement/
---
## XPathNavigator::PrependChildElement method


निर्दिष्ट मान के साथ नेमस्पेस प्रीफ़िक्स, लोकल नाम, और नेमस्पेस URI का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची की शुरुआत में एक नया चाइल्ड एलिमेंट बनाता है।

```cpp
virtual void System::Xml::XPath::XPathNavigator::PrependChildElement(String prefix, String localName, String namespaceURI, String value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | String | नए चाइल्ड एलिमेंट का नेमस्पेस प्रीफ़िक्स (यदि कोई हो)। |
| localName | String | नए चाइल्ड एलिमेंट का स्थानीय नाम (यदि कोई हो)। |
| namespaceURI | String | नए चाइल्ड एलिमेंट का नेमस्पेस URI (यदि कोई हो)। [String::Empty](../../../system/string/empty/) और **nullptr** समान हैं। |
| value | String | नए चाइल्ड एलिमेंट का मान। यदि [String::Empty](../../../system/string/empty/) या **nullptr** पास किया जाता है, तो एक खाली एलिमेंट बनाया जाता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
