---
title: "System::Xml::XPath::XPathNavigator::MoveToNext‑metod"
linktitle: "MoveToNext"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::MoveToNext‑metod. När den åsidosätts i en avledd klass flyttar den XPathNavigator till nästa syskonnod till den aktuella noden i C++."
type: docs
weight: 6000
url: /sv/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


När den åsidosätts i en avledd klass flyttar den [XPathNavigator](../) till nästa syskonnod till den aktuella noden.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Se även

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


Flyttar [XPathNavigator](../) till nästa syskonnod med det angivna lokala namnet och namnrymdens URI.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på nästa syskonnod att flytta till. |
| namespaceURI | String | Namnutrymmes-URI:n för nästa syskonnod att flytta till. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Se även

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


Flyttar [XPathNavigator](../) till nästa syskonnod till den aktuella noden som matchar den angivna [XPathNodeType](../../xpathnodetype/).

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/)-typen för syskonnoden att flytta till. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Se även

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
