---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity Methode"
linktitle: "GetEntity"
second_title: "Aspose.Font für C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity Methode. Ordnet einer URI ein Objekt zu, das die eigentliche Ressource in C++ enthält."
type: docs
weight: 400
url: /de/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Ordnet einen URI einem Objekt zu, das die eigentliche Ressource enthält.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Die von dem Aufruf [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/) zurückgegebene URI. |
| Rolle | String | Derzeit nicht verwendet. |
| ofObjectToReturn | const TypeInfo\& | Der Typ des zurückzugebenden Objekts. Der [XmlPreloadedResolver](../) unterstützt Stream-Objekte und TextReader-Objekte für URIs, die als [String](../../../system/string/) hinzugefügt wurden. Wenn der angeforderte Typ vom Resolver nicht unterstützt wird, wird eine Ausnahme ausgelöst. Verwenden Sie die Methode XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo), um zu bestimmen, ob ein bestimmter **Type** von diesem Resolver unterstützt wird. |

### ReturnValue

Ein Stream- oder TextReader-Objekt, das der tatsächlichen Quelle entspricht.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
