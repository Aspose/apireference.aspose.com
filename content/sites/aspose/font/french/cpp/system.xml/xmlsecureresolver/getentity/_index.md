---
title: "Méthode System::Xml::XmlSecureResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlSecureResolver::GetEntity. Associe un URI à un objet contenant la ressource réelle en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


Mappe un URI à un objet contenant la ressource réelle.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI renvoyé par l'appel [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| rôle | String | Actuellement non utilisé. |
| ofObjectToReturn | const TypeInfo\& | Le type d'objet à renvoyer. La version actuelle ne renvoie que des objets Stream. |

### ReturnValue

Le flux renvoyé en appelant **GetEntity** sur le [XmlResolver](../../xmlresolver/) sous-jacent. Si un type autre que Stream est spécifié, la méthode renvoie **nullptr**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
