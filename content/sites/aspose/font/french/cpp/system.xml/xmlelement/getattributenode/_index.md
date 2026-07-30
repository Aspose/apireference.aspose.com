---
title: "Méthode System::Xml::XmlElement::GetAttributeNode"
linktitle: "GetAttributeNode"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlElement::GetAttributeNode. Retourne le XmlAttribute avec le nom local et l'URI d'espace de noms spécifiés en C++."
type: docs
weight: 1400
url: /fr/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Retourne le [XmlAttribute](../../xmlattribute/) avec le nom local et l'URI d'espace de noms spécifiés.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

Le [XmlAttribute](../../xmlattribute/) spécifié ou **nullptr** si aucun attribut correspondant n'a été trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Retourne le [XmlAttribute](../../xmlattribute/) avec le nom spécifié.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom de l'attribut à récupérer. Il s'agit d'un nom qualifié. Il est comparé à la valeur de **get_Name** du nœud correspondant. |

### ReturnValue

Le [XmlAttribute](../../xmlattribute/) spécifié ou **nullptr** si aucun attribut correspondant n'a été trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
