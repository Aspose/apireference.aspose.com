---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors Methode"
linktitle: "SelectAncestors"
second_title: "Aspose.Page für C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors Methode. Wählt alle Vorfahrenknoten des aktuellen Knotens aus, die den angegebenen lokalen Namen und Namespace‑URI in C++ besitzen."
type: docs
weight: 7200
url: /de/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Wählt alle Vorfahrenknoten des aktuellen Knotens aus, die den angegebenen lokalen Namen und die angegebene Namespace‑URI besitzen.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Der lokale Name der Vorfahrenknoten. |
| namespaceURI | String | Der Namespace‑URI der Vorfahrenknoten. |
| matchSelf | bool | Um den Kontextknoten in die Auswahl einzuschließen, **true**; andernfalls **false**. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/), der die ausgewählten Knoten enthält. Die zurückgegebenen Knoten sind in umgekehrter Dokumentreihenfolge.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Wählt alle Vorfahrenknoten des aktuellen Knotens aus, die einen passenden [XPathNodeType](../../xpathnodetype/) haben.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XPathNodeType | Der [XPathNodeType](../../xpathnodetype/) der Vorfahrenknoten. |
| matchSelf | bool | Um den Kontextknoten in die Auswahl einzuschließen, **true**; andernfalls **false**. |

### ReturnValue

Ein [XPathNodeIterator](../../xpathnodeiterator/), der die ausgewählten Knoten enthält. Die zurückgegebenen Knoten sind in umgekehrter Dokumentreihenfolge.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
