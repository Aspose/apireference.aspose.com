---
title: "Metodo System::Xml::Resolvers::XmlPreloadedResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::Resolvers::XmlPreloadedResolver::GetEntity. Mappa un URI a un oggetto che contiene la risorsa effettiva in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Mappa un URI a un oggetto che contiene la risorsa effettiva.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | L'URI restituito dalla chiamata a [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/). |
| ruolo | Stringa | Attualmente non utilizzato. |
| ofObjectToReturn | const TypeInfo\& | Il tipo di oggetto da restituire. Il [XmlPreloadedResolver](../) supporta oggetti Stream e oggetti TextReader per gli URI aggiunti come [String](../../../system/string/). Se il tipo richiesto non è supportato dal resolver, verrà generata un'eccezione. Utilizzare il metodo XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) per determinare se un determinato **Type** è supportato da questo resolver. |

### ReturnValue

Un oggetto Stream o TextReader che corrisponde alla sorgente effettiva.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
