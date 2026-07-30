---
title: "System::Xml::XmlUrlResolver::GetEntity method"
linktitle: "GetEntity"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlUrlResolver::GetEntity method. Mappa un URI a un oggetto che contiene la risorsa effettiva in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Mappa un URI a un oggetto che contiene la risorsa effettiva.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI restituito dalla chiamata a [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/). |
| ruolo | Stringa | Attualmente non utilizzato. |
| ofObjectToReturn | const TypeInfo\& | Il tipo di oggetto da restituire. L'implementazione corrente restituisce solo oggetti Stream. |

### ReturnValue

Un oggetto stream o **nullptr** se viene specificato un tipo diverso da stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
