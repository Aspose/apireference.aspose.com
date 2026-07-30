---
title: "System::Xml::XmlResolver::GetEntity metodo"
linktitle: "GetEntity"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlResolver::GetEntity metodo. Quando sovrascritto in una classe derivata, mappa un URI a un oggetto che contiene la risorsa effettiva in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Quando sovrascritto in una classe derivata, mappa un URI a un oggetto che contiene la risorsa effettiva.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI restituito dalla chiamata a [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| ruolo | Stringa | Attualmente non utilizzato. |
| ofObjectToReturn | const TypeInfo\& | Il tipo di oggetto da restituire. La versione corrente restituisce solo oggetti Stream. |

### ReturnValue

Un oggetto stream o **nullptr** se viene specificato un tipo diverso da stream.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
