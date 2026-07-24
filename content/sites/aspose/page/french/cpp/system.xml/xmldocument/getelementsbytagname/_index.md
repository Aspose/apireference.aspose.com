---
title: "Méthode System::Xml::XmlDocument::GetElementsByTagName"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlDocument::GetElementsByTagName. Retourne un XmlNodeList contenant la liste de tous les éléments descendants qui correspondent au XmlDocument::get_LocalName et XmlNode::get_NamespaceURI spécifiés en C++."
type: docs
weight: 3200
url: /fr/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Retourne un [XmlNodeList](../../xmlnodelist/) contenant la liste de tous les éléments descendants qui correspondent aux [XmlDocument::get_LocalName](../get_localname/) et [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) spécifiés.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le LocalName à correspondre. La valeur spéciale **\"*\"** correspond à toutes les balises. |
| namespaceURI | String | NamespaceURI à correspondre. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenant la liste de tous les nœuds correspondants. Si aucun nœud ne correspond aux **localName** et **namespaceURI** spécifiés, la collection retournée sera vide.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Retourne un [XmlNodeList](../../xmlnodelist/) contenant la liste de tous les éléments descendants qui correspondent au nom spécifié.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom qualifié à correspondre. Il est comparé à la valeur **get_Name** du nœud correspondant. La valeur spéciale **\"*\"** correspond à toutes les balises. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenant la liste de tous les nœuds correspondants. Si aucun nœud ne correspond au **name**, la collection retournée sera vide.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
