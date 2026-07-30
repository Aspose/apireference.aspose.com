---
title: "Méthode System::Xml::XPath::XPathNavigator::MoveToChild"
linktitle: "MoveToChild"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XPath::XPathNavigator::MoveToChild. Déplace le XPathNavigator vers le nœud enfant dont le nom local et l’URI d’espace de noms sont spécifiés en C++."
type: docs
weight: 5200
url: /fr/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


Déplace le [XPathNavigator](../) vers le nœud enfant dont le nom local et l’URI d’espace de noms sont spécifiés.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local du nœud enfant vers lequel se déplacer. |
| namespaceURI | String | L’URI d’espace de noms du nœud enfant vers lequel se déplacer. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


Déplace le [XPathNavigator](../) vers le nœud enfant du [XPathNodeType](../../xpathnodetype/) spécifié.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XPathNodeType | Le [XPathNodeType](../../xpathnodetype/) du nœud enfant vers lequel se déplacer. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Voir aussi

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
