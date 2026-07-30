---
title: "Méthode System::Xml::XmlResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlResolver::GetEntity. Lorsqu'elle est redéfinie dans une classe dérivée, associe un URI à un objet contenant la ressource réelle en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Lorsqu'elle est remplacée dans une classe dérivée, associe un URI à un objet contenant la ressource réelle.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI renvoyé par l'appel [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| rôle | String | Actuellement non utilisé. |
| ofObjectToReturn | const TypeInfo\& | Le type d'objet à renvoyer. La version actuelle ne renvoie que des objets Stream. |

### ReturnValue

Un objet stream ou **nullptr** si un type autre que stream est spécifié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
