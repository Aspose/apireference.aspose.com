---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors metod"
linktitle: "SelectAncestors"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors‑metod. Väljer alla föräldranoder till den aktuella noden som har det angivna lokala namnet och namnrymds‑URI:n i C++."
type: docs
weight: 7200
url: /sv/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Väljer alla föräldranoder till den aktuella noden som har det angivna lokala namnet och namnrymds‑URI:n.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Det lokala namnet på föräldranoderna. |
| namespaceURI | String | Namnrymds‑URI:n för föräldranoderna. |
| matchSelf | bool | För att inkludera kontextnoden i urvalet, **true**; annars, **false**. |

### ReturnValue

En [XPathNodeIterator](../../xpathnodeiterator/) som innehåller de valda noderna. De returnerade noderna är i omvänd dokumentordning.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Väljer alla föräldranoder till den aktuella noden som har en matchande [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) för föräldranoderna. |
| matchSelf | bool | För att inkludera kontextnoden i urvalet, **true**; annars, **false**. |

### ReturnValue

En [XPathNodeIterator](../../xpathnodeiterator/) som innehåller de valda noderna. De returnerade noderna är i omvänd dokumentordning.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
