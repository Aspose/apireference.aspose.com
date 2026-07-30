---
title: "System::Xml::XmlTextReader::GetNamespacesInScope metodo"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope metodo. Restituisce una collezione che contiene tutti i namespace attualmente in ambito in C++."
type: docs
weight: 3400
url: /it/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


Restituisce una raccolta che contiene tutti gli spazi dei nomi attualmente in ambito.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| scope | XmlNamespaceScope | Un valore [XmlNamespaceScope](../../xmlnamespacescope/) che specifica il tipo di nodi di namespace da restituire. |

### ReturnValue

Un oggetto IDictionary che contiene tutti i namespace attualmente in ambito. Se il lettore non è posizionato su un elemento, viene restituito un dizionario vuoto (senza namespace).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
