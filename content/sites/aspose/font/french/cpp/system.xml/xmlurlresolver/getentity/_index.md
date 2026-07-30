---
title: "Méthode System::Xml::XmlUrlResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlUrlResolver::GetEntity. Associe une URI à un objet contenant la ressource réelle en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Mappe un URI à un objet contenant la ressource réelle.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI retournée par l'appel [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/). |
| rôle | String | Actuellement non utilisé. |
| ofObjectToReturn | const TypeInfo\& | Le type d'objet à retourner. L'implémentation actuelle ne renvoie que des objets Stream. |

### ReturnValue

Un objet stream ou **nullptr** si un type autre que stream est spécifié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
