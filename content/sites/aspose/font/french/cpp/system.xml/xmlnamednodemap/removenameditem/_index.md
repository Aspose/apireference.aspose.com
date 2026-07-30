---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem méthode"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlNamedNodeMap::RemoveNamedItem. Supprime un nœud dont les valeurs XmlNode::get_LocalName et XmlNode::get_NamespaceURI correspondent, en C++."
type: docs
weight: 900
url: /fr/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Supprime un nœud dont les valeurs [XmlNode::get_LocalName](../../xmlnode/get_localname/) et [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) correspondent.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local du nœud à supprimer. |
| namespaceURI | String | L'URI d'espace de noms du nœud à supprimer. |

### ReturnValue

Le [XmlNode](../../xmlnode/) supprimé ou **nullptr** si aucun nœud correspondant n'a été trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Supprime le nœud du [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom qualifié du nœud à supprimer. Le nom est comparé à la valeur [XmlNode::get_Name](../../xmlnode/get_name/) du nœud correspondant. |

### ReturnValue

Le [XmlNode](../../xmlnode/) supprimé de ce [XmlNamedNodeMap](../) ou **nullptr** si aucun nœud correspondant n'a été trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
