---
title: "System::Xml::XmlUrlResolver::GetEntity Methode"
linktitle: "GetEntity"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlUrlResolver::GetEntity Methode. Ordnet eine URI einem Objekt zu, das die eigentliche Ressource in C++ enthält."
type: docs
weight: 200
url: /de/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Ordnet einen URI einem Objekt zu, das die eigentliche Ressource enthält.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Die URI, die von dem Aufruf [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/) zurückgegeben wird. |
| Rolle | String | Derzeit nicht verwendet. |
| ofObjectToReturn | const TypeInfo\& | Der Typ des zurückzugebenden Objekts. Die aktuelle Implementierung gibt nur Stream‑Objekte zurück. |

### ReturnValue

Ein Stream‑Objekt oder **nullptr**, wenn ein anderer Typ als Stream angegeben wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
