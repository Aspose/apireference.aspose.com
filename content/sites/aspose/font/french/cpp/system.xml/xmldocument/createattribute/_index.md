---
title: "System::Xml::XmlDocument::CreateAttribute méthode"
linktitle: "CreateAttribute"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlDocument::CreateAttribute méthode. Crée un XmlAttribute avec le nom spécifié en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Crée un [XmlAttribute](../../xmlattribute/) avec le nom spécifié.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | const String\& | Le nom qualifié de l'attribut. Si le nom contient deux-points, la valeur de [XmlNode::get_Prefix](../../xmlnode/get_prefix/) reflète la partie du nom précédant le premier deux-points et la valeur de [XmlDocument::get_LocalName](../get_localname/) reflète la partie du nom suivant le premier deux-points. La valeur de [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) reste vide sauf si le préfixe est un préfixe intégré reconnu tel que **xmlns**. Dans ce cas, get_NamespaceURI a la valeur [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Le nouveau [XmlAttribute](../../xmlattribute/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Crée un [XmlAttribute](../../xmlattribute/) avec le [XmlNode::get_Prefix](../../xmlnode/get_prefix/) spécifié, le [XmlDocument::get_LocalName](../get_localname/) spécifié et le [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) spécifié.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prefix | const String\& | Le préfixe de l'attribut (le cas échéant). [String::Empty](../../../system/string/empty/) et **nullptr** sont équivalents. |
| localName | const String\& | Le nom local de l'attribut. |
| namespaceURI | const String\& | L'URI d'espace de noms de l'attribut (le cas échéant). [String::Empty](../../../system/string/empty/) et **nullptr** sont équivalents. Si **prefix** est **xmlns**, alors ce paramètre doit être [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) sinon une exception est levée. |

### ReturnValue

Le nouveau [XmlAttribute](../../xmlattribute/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Crée un [XmlAttribute](../../xmlattribute/) avec le nom qualifié spécifié et [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) spécifié.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| qualifiedName | const String\& | Le nom qualifié de l'attribut. Si le nom contient un deux-points, la valeur de [XmlNode::get_Prefix](../../xmlnode/get_prefix/) reflétera la partie du nom précédant le deux-points et la valeur de [XmlDocument::get_LocalName](../get_localname/) reflétera la partie du nom suivant le deux-points. |
| namespaceURI | const String\& | L'URI d'espace de noms de l'attribut. Si le nom qualifié inclut un préfixe **xmlns**, alors ce paramètre doit être [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Le nouveau [XmlAttribute](../../xmlattribute/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
