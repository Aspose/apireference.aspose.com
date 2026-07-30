---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem méthode"
linktitle: "GetNamedItem"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem méthode. Récupère un nœud dont les valeurs XmlNode::get_LocalName et XmlNode::get_NamespaceURI correspondent en C++."
type: docs
weight: 700
url: /fr/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Récupère un nœud dont les valeurs [XmlNode::get_LocalName](../../xmlnode/get_localname/) et [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) correspondent.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local du nœud à récupérer. |
| namespaceURI | String | L'identifiant uniforme de ressource (URI) de l'espace de noms du nœud à récupérer. |

### ReturnValue

Un [XmlNode](../../xmlnode/) avec le nom local et l'URI d'espace de noms correspondants ou **nullptr** si aucun nœud correspondant n'a été trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


Récupère un [XmlNode](../../xmlnode/) spécifié par son nom.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom qualifié du nœud à récupérer. Il est comparé à la valeur [XmlNode::get_Name](../../xmlnode/get_name/) du nœud correspondant. |

### ReturnValue

Un [XmlNode](../../xmlnode/) avec le nom spécifié ou **nullptr** si aucun nœud correspondant n'est trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
