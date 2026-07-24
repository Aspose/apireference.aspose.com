---
title: "System::Xml::XmlAttribute::get_BaseURI méthode"
linktitle: "get_BaseURI"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlAttribute::get_BaseURI méthode. Retourne l'identifiant uniforme de ressource (URI) de base du nœud en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/xmlattribute/get_baseuri/
---
## XmlAttribute::get_BaseURI method


Renvoie l’identifiant uniforme de ressource (URI) de base du nœud.

```cpp
String System::Xml::XmlAttribute::get_BaseURI() override
```


### ReturnValue

L'emplacement à partir duquel le nœud a été chargé ou [String::Empty](../../../system/string/empty/) si le nœud n'a pas d'URI de base. Les nœuds [Attribute](../../../system/attribute/) ont la même URI de base que leur élément propriétaire. Si un nœud d'attribut n'a pas d'élément propriétaire, get_BaseURI retourne [String::Empty](../../../system/string/empty/).

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
