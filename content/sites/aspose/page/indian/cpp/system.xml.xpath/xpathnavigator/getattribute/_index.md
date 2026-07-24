---
title: "System::Xml::XPath::XPathNavigator::GetAttribute मेथड"
linktitle: "GetAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::GetAttribute मेथड। निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले एट्रिब्यूट का मान लौटाता है C++ में।"
type: docs
weight: 3800
url: /hi/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


वापस देता है निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण का मान।

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एट्रिब्यूट का स्थानीय नाम। **localName** केस-सेंसिटिव है। |
| namespaceURI | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

एक [String](../../../system/string/) जिसमें निर्दिष्ट गुण का मान होता है; यदि मिलते‑जुलते गुण नहीं मिलते हैं, या यदि [XPathNavigator](../) किसी तत्व नोड पर स्थित नहीं है, तो [String::Empty](../../../system/string/empty/)।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
