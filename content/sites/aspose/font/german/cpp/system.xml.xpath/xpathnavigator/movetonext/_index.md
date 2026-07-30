---
title: "System::Xml::XPath::XPathNavigator::MoveToNext-Methode"
linktitle: "MoveToNext"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::MoveToNext-Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, bewegt sie den XPathNavigator zum nächsten Geschwisterknoten des aktuellen Knotens in C++."
type: docs
weight: 6000
url: /de/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, bewegt sie den [XPathNavigator](../) zum nächsten Geschwisterknoten des aktuellen Knotens.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Siehe auch

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


Bewegt den [XPathNavigator](../) zum nächsten Geschwisterknoten mit dem angegebenen lokalen Namen und dem Namespace-URI.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des nächsten Geschwisterknotens, zu dem bewegt werden soll. |
| namespaceURI | String | Der Namespace-URI des nächsten Geschwisterknotens, zu dem bewegt werden soll. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


Bewegt den [XPathNavigator](../) zum nächsten Geschwisterknoten des aktuellen Knotens, der dem angegebenen [XPathNodeType](../../xpathnodetype/) entspricht.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XPathNodeType | Der [XPathNodeType](../../xpathnodetype/) des Geschwisterknotens, zu dem bewegt werden soll. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Siehe auch

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
