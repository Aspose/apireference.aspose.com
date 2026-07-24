---
title: "System::Xml::XPath::XPathNavigator::InsertElementAfter विधि"
linktitle: "InsertElementAfter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::InsertElementAfter विधि। निर्दिष्ट नेमस्पेस प्रीफ़िक्स, स्थानीय नाम और नेमस्पेस URI का उपयोग करके वर्तमान नोड के बाद एक नया सहोदर तत्व बनाता है, जिसका मान C++ में निर्दिष्ट किया गया है।"
type: docs
weight: 4300
url: /hi/cpp/system.xml.xpath/xpathnavigator/insertelementafter/
---
## XPathNavigator::InsertElementAfter method


निर्दिष्ट नेमस्पेस प्रीफ़िक्स, स्थानीय नाम और नेमस्पेस URI का उपयोग करके, तथा निर्दिष्ट मान के साथ, वर्तमान नोड के बाद एक नया सिब्लिंग एलिमेंट बनाता है।

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertElementAfter(String prefix, String localName, String namespaceURI, String value)
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
