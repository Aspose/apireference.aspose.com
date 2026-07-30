---
title: "Méthode System::Xml::XmlElement::GetElementsByTagName"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlElement::GetElementsByTagName. Retourne un XmlNodeList contenant une liste de tous les éléments descendants qui correspondent aux valeurs spécifiées XmlElement::get_LocalName et XmlElement::get_NamespaceURI en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Retourne un [XmlNodeList](../../xmlnodelist/) contenant une liste de tous les éléments descendants qui correspondent aux valeurs spécifiées [XmlElement::get_LocalName](../get_localname/) et [XmlElement::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local à faire correspondre. L'astérisque (*) est une valeur spéciale qui correspond à toutes les balises. |
| namespaceURI | String | L'URI d'espace de noms à faire correspondre. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenant une liste de tous les nœuds correspondants. La liste est vide s'il n'y a aucun nœud correspondant.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Retourne un [XmlNodeList](../../xmlnodelist/) contenant une liste de tous les éléments descendants qui correspondent à la [XmlElement::get_Name](../get_name/) spécifiée.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | La balise de nom à faire correspondre. Il s'agit d'un nom qualifié. Elle est comparée à la valeur **get_Name** du nœud correspondant. L'astérisque (*) est une valeur spéciale qui correspond à toutes les balises. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenant une liste de tous les nœuds correspondants. La liste est vide s'il n'y a aucun nœud correspondant.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
