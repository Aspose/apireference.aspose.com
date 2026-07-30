---
title: "System::Xml::XmlDocument::CreateNode méthode"
linktitle: "CreateNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlDocument::CreateNode méthode. Crée un XmlNode avec le type de nœud spécifié, XmlDocument::get_Name et XmlNode::get_NamespaceURI en C++."
type: docs
weight: 1100
url: /fr/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Crée un [XmlNode](../../xmlnode/) avec le type de nœud spécifié, [XmlDocument::get_Name](../get_name/) et [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nodeTypeString | const String\& | Version [String](../../../system/string/) du [XmlNodeType](../../xmlnodetype/) du nouveau nœud. Ce paramètre doit être l'une des valeurs listées dans le tableau ci‑dessous. |
| name | const String\& | Le nom qualifié du nouveau nœud. Si le nom contient un deux-points, il est analysé en composants [XmlNode::get_Prefix](../../xmlnode/get_prefix/) et [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | L'URI d'espace de noms du nouveau nœud. |

### ReturnValue

Le nouveau [XmlNode](../../xmlnode/).
## Remarques



Le paramètre **nodeTypeString** est sensible à la casse et doit être l'une des valeurs du tableau suivant : |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribut | Attribut |
| sectionCDATA | CDATA |
| commentaire | Commentaire |
| document | Document |
| documentfragment | Fragment de document |
| documenttype | Type de document |
| élément | Élément |
| référence d'entité | Référence d'entité |
| instruction de traitement | Instruction de traitement |
| espace blanc significatif | Espacement significatif |
| texte | Texte |
| espace blanc | Espacement |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Crée un [XmlNode](../../xmlnode/) avec le [XmlNodeType](../../xmlnodetype/) spécifié, [XmlDocument::get_Name](../get_name/) et [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XmlNodeType | Le [XmlNodeType](../../xmlnodetype/) du nouveau nœud. |
| name | const String\& | Le nom qualifié du nouveau nœud. Si le nom contient deux-points, il est analysé en composants [XmlNode::get_Prefix](../../xmlnode/get_prefix/) et [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | L'URI d'espace de noms du nouveau nœud. |

### ReturnValue

Le nouveau [XmlNode](../../xmlnode/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Crée un [XmlNode](../../xmlnode/) avec le [XmlNodeType](../../xmlnodetype/) spécifié, [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) et [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | XmlNodeType | Le [XmlNodeType](../../xmlnodetype/) du nouveau nœud. |
| préfixe | const String\& | Le préfixe du nouveau nœud. |
| nom | const String\& | Le nom local du nouveau nœud. |
| namespaceURI | const String\& | L'URI d'espace de noms du nouveau nœud. |

### ReturnValue

Le nouveau [XmlNode](../../xmlnode/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
