---
title: "System::Xml::XmlSecureResolver::GetEntity metodo"
linktitle: "GetEntity"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlSecureResolver::GetEntity metodo. Mappa un URI a un oggetto che contiene la risorsa effettiva in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


Mappa un URI a un oggetto che contiene la risorsa effettiva.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI restituito dalla chiamata a [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| ruolo | Stringa | Attualmente non utilizzato. |
| ofObjectToReturn | const TypeInfo\& | Il tipo di oggetto da restituire. La versione corrente restituisce solo oggetti Stream. |

### ReturnValue

Il flusso restituito chiamando **GetEntity** sul [XmlResolver](../../xmlresolver/) sottostante. Se viene specificato un tipo diverso da Stream, il metodo restituisce **nullptr**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
