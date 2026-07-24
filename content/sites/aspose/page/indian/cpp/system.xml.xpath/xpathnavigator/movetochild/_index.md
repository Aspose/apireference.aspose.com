---
title: "System::Xml::XPath::XPathNavigator::MoveToChild मेथड"
linktitle: "MoveToChild"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::MoveToChild मेथड. XPathNavigator को C++ में निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले चाइल्ड नोड पर ले जाता है।"
type: docs
weight: 5200
url: /hi/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


[XPathNavigator](../) को निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले चाइल्ड नोड पर ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | जिस चाइल्ड नोड पर जाना है, उसका स्थानीय नाम। |
| namespaceURI | String | जिस चाइल्ड नोड पर जाना है, उसका नेमस्पेस URI। |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


[XPathNavigator](../) को निर्दिष्ट [XPathNodeType](../../xpathnodetype/) के चाइल्ड नोड पर ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XPathNodeType | जिस चाइल्ड नोड पर जाना है, उसका [XPathNodeType](../../xpathnodetype/)। |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## संबंधित देखें

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
