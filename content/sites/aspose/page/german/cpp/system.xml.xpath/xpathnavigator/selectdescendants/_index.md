---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants-Methode"
linktitle: "SelectDescendants"
second_title: "Aspose.Page für C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants method. Wählt alle Nachfolgerknoten des aktuellen Knotens aus, die den lokalen Namen und den Namespace‑URI haben, die in C++ angegeben sind."
type: docs
weight: 7400
url: /de/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Wählt alle Nachfahrenknoten des aktuellen Knotens aus, die den angegebenen lokalen Namen und die angegebene Namespace‑URI besitzen.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Der lokale Name der Nachfolgerknoten. |
| namespaceURI | String | Der Namespace‑URI der Nachfolgerknoten. |
| matchSelf | bool | **true**, um den Kontextknoten in die Auswahl einzubeziehen; andernfalls **false**. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/), der die ausgewählten Knoten enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Wählt alle Nachfolgerknoten des aktuellen Knotens aus, die einen passenden [XPathNodeType](../../xpathnodetype/) haben.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XPathNodeType | Der [XPathNodeType](../../xpathnodetype/) der Nachfolgerknoten. |
| matchSelf | bool | **true**, um den Kontextknoten in die Auswahl einzubeziehen; andernfalls **false**. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/), der die ausgewählten Knoten enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
