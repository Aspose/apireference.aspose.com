---
title: "System::Xml::XmlNamespaceManager::LookupNamespace metodo"
linktitle: "LookupNamespace"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace metodo. Restituisce l'URI dello spazio dei nomi per il prefisso specificato in C++."
type: docs
weight: 800
url: /it/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Restituisce l'URI del namespace per il prefisso specificato.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | const String\& | Il prefisso il cui URI dello spazio dei nomi vuoi risolvere. Per corrispondere allo spazio dei nomi predefinito, passa [String::Empty](../../../system/string/empty/). |

### ReturnValue

L'URI dello spazio dei nomi per **prefix** o **nullptr** se non esiste uno spazio dei nomi mappato. La stringa restituita è atomizzata. Per ulteriori informazioni sulle stringhe atomizzate, vedere la classe [XmlNameTable](../../xmlnametable/).

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
