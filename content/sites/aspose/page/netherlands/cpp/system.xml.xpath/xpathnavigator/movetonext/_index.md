---
title: "System::Xml::XPath::XPathNavigator::MoveToNext methode"
linktitle: "MoveToNext"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::MoveToNext methode. Wanneer overschreven in een afgeleide klasse, verplaatst de XPathNavigator naar het volgende siblingknooppunt van het huidige knooppunt in C++."
type: docs
weight: 6000
url: /nl/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](../) naar het volgende siblingknooppunt van het huidige knooppunt.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Zie ook

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


Verplaatst de [XPathNavigator](../) naar het volgende siblingknooppunt met de opgegeven lokale naam en namespace-URI.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het volgende siblingknooppunt waarnaar verplaatst moet worden. |
| namespaceURI | String | De namespace-URI van het volgende siblingknooppunt waarnaar verplaatst moet worden. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Zie ook

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


Verplaatst de [XPathNavigator](../) naar het volgende siblingknooppunt van het huidige knooppunt dat overeenkomt met de opgegeven [XPathNodeType](../../xpathnodetype/).

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| type | XPathNodeType | De [XPathNodeType](../../xpathnodetype/) van het siblingknooppunt waarnaar verplaatst moet worden. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Zie ook

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
