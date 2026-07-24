---
title: "System::Xml::XPath::XPathNavigator::SelectChildren metod"
linktitle: "SelectChildren"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::SelectChildren metod. Väljer alla underordnade noder för den aktuella noden som har det lokala namnet och namnrymds-URI som specificeras i C++."
type: docs
weight: 7300
url: /sv/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


Väljer alla barnnoder till den aktuella noden som har det angivna lokala namnet och namnrymds‑URI:n.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Det lokala namnet på underordnade noder. |
| namespaceURI | String | Namnrymds-URI för underordnade noder. |

### ReturnValue

En [XPathNodeIterator](../../xpathnodeiterator/) som innehåller de valda noderna.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


Väljer alla underordnade noder för den aktuella noden som har matchande [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| type | XPathNodeType | Den [XPathNodeType](../../xpathnodetype/) för underordnade noder. |

### ReturnValue

En [XPathNodeIterator](../../xpathnodeiterator/) som innehåller de valda noderna.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
