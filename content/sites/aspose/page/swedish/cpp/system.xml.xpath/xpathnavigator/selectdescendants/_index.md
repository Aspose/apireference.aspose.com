---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants metod"
linktitle: "SelectDescendants"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants metod. Väljer alla efterkommande noder för det aktuella nodet med det lokala namnet och namnrymd-URI:n som anges i C++."
type: docs
weight: 7400
url: /sv/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Väljer alla ättlingnoder till den aktuella noden med det angivna lokala namnet och namnrymds‑URI:n.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Det lokala namnet för de efterkommande noderna. |
| namespaceURI | String | Namnrymd-URI:n för de efterkommande noderna. |
| matchSelf | bool | **true** för att inkludera kontextnoden i urvalet; annars **false**. |

### ReturnValue

En [XPathNodeIterator](../../xpathnodeiterator/) som innehåller de valda noderna.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Väljer alla efterkommande noder för det aktuella nodet som har en matchande [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| type | XPathNodeType | Den [XPathNodeType](../../xpathnodetype/) för de efterkommande noderna. |
| matchSelf | bool | **true** för att inkludera kontextnoden i urvalet; annars **false**. |

### ReturnValue

En [XPathNodeIterator](../../xpathnodeiterator/) som innehåller de valda noderna.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
