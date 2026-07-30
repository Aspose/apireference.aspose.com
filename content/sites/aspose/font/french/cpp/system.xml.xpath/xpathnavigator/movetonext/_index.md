---
title: "System::Xml::XPath::XPathNavigator::MoveToNext méthode"
linktitle: "MoveToNext"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::MoveToNext méthode. Lorsqu'il est remplacé dans une classe dérivée, déplace le XPathNavigator vers le nœud frère suivant du nœud actuel en C++."
type: docs
weight: 6000
url: /fr/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](../) vers le nœud frère suivant du nœud actuel.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Voir aussi

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


Déplace le [XPathNavigator](../) vers le nœud frère suivant dont le nom local et l'URI d'espace de noms sont spécifiés.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local du nœud frère suivant vers lequel se déplacer. |
| namespaceURI | String | L'URI d'espace de noms du nœud frère suivant vers lequel se déplacer. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


Déplace le [XPathNavigator](../) vers le nœud frère suivant du nœud actuel qui correspond au [XPathNodeType](../../xpathnodetype/) spécifié.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XPathNodeType | Le [XPathNodeType](../../xpathnodetype/) du nœud frère vers lequel se déplacer. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Voir aussi

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
