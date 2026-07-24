---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute मेथड"
linktitle: "CreateAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute मेथड। C++ में निर्दिष्ट मान का उपयोग करके नेमस्पेस प्रीफ़िक्स, स्थानीय नाम और नेमस्पेस URI के साथ वर्तमान एलिमेंट नोड पर एक एट्रिब्यूट नोड बनाता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


निर्दिष्ट मान के साथ नामस्थान उपसर्ग, स्थानीय नाम और नामस्थान URI का उपयोग करके वर्तमान एलिमेंट नोड पर एक एट्रिब्यूट नोड बनाता है।

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | String | नए एट्रिब्यूट नोड का नेमस्पेस प्रीफ़िक्स (यदि कोई हो)। |
| localName | String | नए एट्रिब्यूट नोड का स्थानीय नाम जो [String::Empty](../../../system/string/empty/) या **nullptr** नहीं हो सकता। |
| namespaceURI | String | नए एट्रिब्यूट नोड के लिए नेमस्पेस URI (यदि कोई हो)। |
| value | String | नए एट्रिब्यूट नोड का मान। यदि [String::Empty](../../../system/string/empty/) या **nullptr** पास किया जाता है, तो एक खाली एट्रिब्यूट नोड बनाया जाता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
