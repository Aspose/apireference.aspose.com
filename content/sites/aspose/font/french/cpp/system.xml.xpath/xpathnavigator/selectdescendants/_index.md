---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants méthode"
linktitle: "SelectDescendants"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants méthode. Sélectionne tous les nœuds descendants du nœud actuel avec le nom local et l'URI d'espace de noms spécifiés en C++."
type: docs
weight: 7400
url: /fr/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Sélectionne tous les nœuds descendants du nœud actuel avec le nom local et l'URI d'espace de noms spécifiés.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom local des nœuds descendants. |
| namespaceURI | String | L'URI d'espace de noms des nœuds descendants. |
| matchSelf | bool | **true** pour inclure le nœud de contexte dans la sélection ; sinon, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) qui contient les nœuds sélectionnés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Sélectionne tous les nœuds descendants du nœud actuel qui ont un [XPathNodeType](../../xpathnodetype/) correspondant.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XPathNodeType | Le [XPathNodeType](../../xpathnodetype/) des nœuds descendants. |
| matchSelf | bool | **true** pour inclure le nœud de contexte dans la sélection ; sinon, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) qui contient les nœuds sélectionnés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
