---
title: "System::Xml::XPath::XPathNavigator::InsertElementBefore method"
linktitle: "InsertElementBefore"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::InsertElementBefore method. C++ में निर्दिष्ट मान के साथ, निर्दिष्ट नेमस्पेस प्रीफ़िक्स, स्थानीय नाम, और नेमस्पेस URI का उपयोग करके वर्तमान नोड से पहले एक नया सिब्लिंग एलिमेंट बनाता है।"
type: docs
weight: 4400
url: /hi/cpp/system.xml.xpath/xpathnavigator/insertelementbefore/
---
## XPathNavigator::InsertElementBefore method


वर्तमान नोड से पहले निर्दिष्ट नेमस्पेस प्रीफ़िक्स, स्थानीय नाम, और नेमस्पेस URI का उपयोग करके नया सिब्लिंग एलिमेंट बनाता है, निर्दिष्ट मान के साथ।

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertElementBefore(String prefix, String localName, String namespaceURI, String value)
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
