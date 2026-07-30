---
title: "Méthode System::Xml::XPath::XPathNavigator::MoveToFollowing"
linktitle: "MoveToFollowing"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing méthode. Déplace le XPathNavigator vers l'élément dont le nom local et l'URI d'espace de noms sont spécifiés dans l'ordre du document en C++."
type: docs
weight: 5700
url: /fr/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


Déplace le [XPathNavigator](../) vers l'élément dont le nom local et l'URI d'espace de noms sont spécifiés dans l'ordre du document.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l’élément. |
| namespaceURI | String | L'URI d'espace de noms de l'élément. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


Déplace le [XPathNavigator](../) vers l'élément dont le nom local et l'URI d'espace de noms sont spécifiés, jusqu'à la limite spécifiée, dans l'ordre du document.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l’élément. |
| namespaceURI | String | L'URI d'espace de noms de l'élément. |
| end | SharedPtr\<XPathNavigator\> | L'objet [XPathNavigator](../) positionné sur la limite de l'élément que le [XPathNavigator](../) actuel ne dépassera pas lors de la recherche de l'élément suivant. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


Déplace le [XPathNavigator](../) vers l'élément suivant du [XPathNodeType](../../xpathnodetype/) spécifié dans l'ordre du document.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XPathNodeType | Le [XPathNodeType](../../xpathnodetype/) de l'élément. Le [XPathNodeType](../../xpathnodetype/) ne peut pas être [XPathNodeType::Attribute](../../xpathnodetype/) ou [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Voir aussi

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


Déplace le [XPathNavigator](../) vers l'élément suivant du [XPathNodeType](../../xpathnodetype/) spécifié, jusqu'à la limite spécifiée, dans l'ordre du document.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XPathNodeType | Le [XPathNodeType](../../xpathnodetype/) de l'élément. Le [XPathNodeType](../../xpathnodetype/) ne peut pas être [XPathNodeType::Attribute](../../xpathnodetype/) ou [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | L'objet [XPathNavigator](../) positionné sur la limite de l'élément que le [XPathNavigator](../) actuel ne dépassera pas lors de la recherche de l'élément suivant. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Voir aussi

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
