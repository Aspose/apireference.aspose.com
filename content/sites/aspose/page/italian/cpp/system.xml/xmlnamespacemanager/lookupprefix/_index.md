---
title: "System::Xml::XmlNamespaceManager::LookupPrefix metodo"
linktitle: "LookupPrefix"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNamespaceManager::LookupPrefix metodo. Trova il prefisso dichiarato per il dato URI dello spazio dei nomi in C++."
type: docs
weight: 900
url: /it/cpp/system.xml/xmlnamespacemanager/lookupprefix/
---
## XmlNamespaceManager::LookupPrefix method


Trova il prefisso dichiarato per il dato URI del namespace.

```cpp
String System::Xml::XmlNamespaceManager::LookupPrefix(const String &uri) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uri | const String\& | Lo spazio dei nomi da risolvere per il prefisso. |

### ReturnValue

Il prefisso corrispondente. Se non esiste alcun prefisso mappato, il metodo restituisce [String::Empty](../../../system/string/empty/). Se viene fornito un valore null, viene restituito **nullptr**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
