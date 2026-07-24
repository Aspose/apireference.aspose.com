---
title: "Méthode System::Xml::XPath::XPathNavigator::SelectAncestors"
linktitle: "SelectAncestors"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XPath::XPathNavigator::SelectAncestors. Sélectionne tous les nœuds ancêtres du nœud actuel qui ont le nom local et l'URI d'espace de noms spécifiés en C++."
type: docs
weight: 7200
url: /fr/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Sélectionne tous les nœuds ancêtres du nœud actuel qui ont le nom local et l'URI d'espace de noms spécifiés.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom local des nœuds ancêtres. |
| namespaceURI | String | L'URI d'espace de noms des nœuds ancêtres. |
| matchSelf | bool | Pour inclure le nœud de contexte dans la sélection, **true** ; sinon, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) qui contient les nœuds sélectionnés. Les nœuds retournés sont dans l'ordre inverse du document.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Sélectionne tous les nœuds ancêtres du nœud actuel qui ont un [XPathNodeType](../../xpathnodetype/) correspondant.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XPathNodeType | Le [XPathNodeType](../../xpathnodetype/) des nœuds ancêtres. |
| matchSelf | bool | Pour inclure le nœud de contexte dans la sélection, **true** ; sinon, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) qui contient les nœuds sélectionnés. Les nœuds retournés sont dans l'ordre inverse du document.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
