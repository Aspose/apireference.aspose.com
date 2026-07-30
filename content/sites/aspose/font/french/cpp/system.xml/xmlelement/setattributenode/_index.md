---
title: "Méthode System::Xml::XmlElement::SetAttributeNode"
linktitle: "SetAttributeNode"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlElement::SetAttributeNode. Ajoute le XmlAttribute spécifié en C++."
type: docs
weight: 2700
url: /fr/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Ajoute le [XmlAttribute](../../xmlattribute/) spécifié.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Le nœud [XmlAttribute](../../xmlattribute/) à ajouter à la collection d'attributs de cet élément. |

### ReturnValue

Si l'attribut remplace un attribut existant portant le même nom, l'ancien [XmlAttribute](../../xmlattribute/) est retourné ; sinon, **nullptr** est retourné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Ajoute le [XmlAttribute](../../xmlattribute/) spécifié.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

Le [XmlAttribute](../../xmlattribute/) à ajouter.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
