---
title: "Méthode System::Xml::XmlElement::RemoveAttributeNode"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlElement::RemoveAttributeNode. Supprime le XmlAttribute spécifié en C++."
type: docs
weight: 2100
url: /fr/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Supprime le [XmlAttribute](../../xmlattribute/) spécifié.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Le nœud [XmlAttribute](../../xmlattribute/) à supprimer. Si l'attribut supprimé possède une valeur par défaut, elle est immédiatement remplacée. |

### ReturnValue

Le [XmlAttribute](../../xmlattribute/) supprimé ou **nullptr** si **oldAttr** n'est pas un nœud d'attribut du [XmlElement](../).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Supprime le [XmlAttribute](../../xmlattribute/) spécifié par le nom local et l'URI d'espace de noms. (Si l'attribut supprimé possède une valeur par défaut, elle est immédiatement remplacée).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

L'[XmlAttribute](../../xmlattribute/) supprimé ou **nullptr** si le [XmlElement](../) n'a pas de nœud d'attribut correspondant.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
