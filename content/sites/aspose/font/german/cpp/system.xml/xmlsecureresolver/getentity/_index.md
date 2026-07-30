---
title: "System::Xml::XmlSecureResolver::GetEntity-Methode"
linktitle: "GetEntity"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlSecureResolver::GetEntity-Methode. Ordnet einen URI einem Objekt zu, das die eigentliche Ressource in C++ enthält."
type: docs
weight: 200
url: /de/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


Ordnet einen URI einem Objekt zu, das die eigentliche Ressource enthält.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Der von dem Aufruf [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) zurückgegebene URI. |
| Rolle | String | Derzeit nicht verwendet. |
| ofObjectToReturn | const TypeInfo\& | Der Typ des zurückzugebenden Objekts. Die aktuelle Version gibt nur Stream-Objekte zurück. |

### ReturnValue

Der Stream, der durch Aufruf von **GetEntity** auf dem zugrunde liegenden [XmlResolver](../../xmlresolver/) zurückgegeben wird. Wenn ein anderer Typ als Stream angegeben wird, gibt die Methode **nullptr** zurück.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
