---
title: "System::Xml::XPath::XPathNavigator::MoveToNext मेथड"
linktitle: "MoveToNext"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::MoveToNext मेथड। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में XPathNavigator को वर्तमान नोड के अगले सहोदर नोड पर ले जाता है।"
type: docs
weight: 6000
url: /hi/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XPathNavigator](../) को वर्तमान नोड के अगले सहोदर नोड पर ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## संबंधित देखें

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


[XPathNavigator](../) को निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले सहोदर नोड पर ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | जिस अगले सहोदर नोड पर जाना है, उसका स्थानीय नाम। |
| namespaceURI | String | जिस अगले सहोदर नोड पर जाना है, उसका नेमस्पेस URI। |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


[XPathNavigator](../) को वर्तमान नोड के अगले सहोदर नोड पर ले जाता है जो निर्दिष्ट [XPathNodeType](../../xpathnodetype/) से मेल खाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XPathNodeType | जिस सहोदर नोड पर जाना है, उसका [XPathNodeType](../../xpathnodetype/)। |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## संबंधित देखें

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
