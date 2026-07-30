---
title: "Méthode System::Xml::XmlDocument::CreateElement"
linktitle: "CreateElement"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlDocument::CreateElement. Crée un élément avec le nom spécifié en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Crée un élément avec le nom spécifié.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | const String\& | Le nom qualifié de l'élément. Si le nom contient deux-points, la valeur [XmlNode::get_Prefix](../../xmlnode/get_prefix/) reflète la partie du nom précédant les deux-points et la valeur [XmlDocument::get_LocalName](../get_localname/) reflète la partie du nom suivant les deux-points. Le nom qualifié ne peut pas inclure de préfixe **xmlns**. |

### ReturnValue

Le nouvel [XmlElement](../../xmlelement/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Crée un élément avec le [XmlNode::get_Prefix](../../xmlnode/get_prefix/), le [XmlDocument::get_LocalName](../get_localname/), et le [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prefix | const String\& | Le préfixe du nouvel élément (le cas échéant). [String::Empty](../../../system/string/empty/) et **nullptr** sont équivalents. |
| localName | const String\& | Le nom local du nouvel élément. |
| namespaceURI | const String\& | L'URI d'espace de noms du nouvel élément (le cas échéant). [String::Empty](../../../system/string/empty/) et **nullptr** sont équivalents. |

### ReturnValue

Le nouvel [XmlElement](../../xmlelement/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


Crée un [XmlElement](../../xmlelement/) avec le nom qualifié et le [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| qualifiedName | const String\& | Le nom qualifié de l'élément. Si le nom contient deux-points, alors la valeur de [XmlNode::get_Prefix](../../xmlnode/get_prefix/) reflétera la partie du nom précédant les deux-points et la valeur de [XmlDocument::get_LocalName](../get_localname/) reflétera la partie du nom suivant les deux-points. Le nom qualifié ne peut pas inclure un préfixe **xmlns**. |
| namespaceURI | const String\& | L'URI d'espace de noms de l'élément. |

### ReturnValue

Le nouvel [XmlElement](../../xmlelement/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
