---
title: "System::Xml::XmlResolver::GetEntity-Methode"
linktitle: "GetEntity"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlResolver::GetEntity-Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, ordnet sie einen URI einem Objekt zu, das die eigentliche Ressource in C++ enthält."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Wenn in einer abgeleiteten Klasse überschrieben, ordnet es einen URI einem Objekt zu, das die eigentliche Ressource enthält.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Der von dem Aufruf [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) zurückgegebene URI. |
| Rolle | String | Derzeit nicht verwendet. |
| ofObjectToReturn | const TypeInfo\& | Der Typ des zurückzugebenden Objekts. Die aktuelle Version gibt nur Stream-Objekte zurück. |

### ReturnValue

Ein Stream‑Objekt oder **nullptr**, wenn ein anderer Typ als Stream angegeben wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
