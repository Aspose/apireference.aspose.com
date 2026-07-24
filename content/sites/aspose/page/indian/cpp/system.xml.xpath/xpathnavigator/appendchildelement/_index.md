---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement विधि"
linktitle: "AppendChildElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement विधि। निर्दिष्ट नेमस्पेस प्रीफ़िक्स, स्थानीय नाम और नेमस्पेस URI का उपयोग करके वर्तमान नोड की चाइल्ड नोड्स की सूची के अंत में एक नया चाइल्ड तत्व नोड बनाता है, जिसका मान C++ में निर्दिष्ट किया गया है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


निर्दिष्ट मान के साथ नामस्थान उपसर्ग, स्थानीय नाम और नामस्थान URI का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची के अंत में एक नया चाइल्ड एलिमेंट नोड बनाता है।

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | String | नए चाइल्ड तत्व नोड का नेमस्पेस प्रीफ़िक्स (यदि कोई हो)। |
| localName | String | नए चाइल्ड तत्व नोड का स्थानीय नाम (यदि कोई हो)। |
| namespaceURI | String | नए चाइल्ड एलिमेंट नोड का नेमस्पेस URI (यदि कोई हो)। [String::Empty](../../../system/string/empty/) और **nullptr** समान हैं। |
| value | String | नए चाइल्ड एलिमेंट नोड का मान। यदि [String::Empty](../../../system/string/empty/) या **nullptr** पास किया जाता है, तो एक खाली एलिमेंट बनाया जाता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
