---
title: "Méthode System::Xml::Resolvers::XmlPreloadedResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::Resolvers::XmlPreloadedResolver::GetEntity. Associe un URI à un objet contenant la ressource réelle en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Mappe un URI à un objet contenant la ressource réelle.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L’URI retourné par l’appel à [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/). |
| rôle | String | Actuellement non utilisé. |
| ofObjectToReturn | const TypeInfo\& | Le type d'objet à retourner. Le [XmlPreloadedResolver](../) prend en charge les objets Stream et TextReader pour les URI qui ont été ajoutés en tant que [String](../../../system/string/). Si le type demandé n’est pas pris en charge par le résolveur, une exception sera levée. Utilisez la méthode XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) pour déterminer si un certain **Type** est pris en charge par ce résolveur. |

### ReturnValue

Un objet Stream ou TextReader correspondant à la source réelle.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
