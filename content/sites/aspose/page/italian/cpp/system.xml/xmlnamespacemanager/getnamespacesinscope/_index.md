---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope metodo"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope metodo. Restituisce una raccolta di nomi di namespace indicizzati per prefisso che può essere usata per enumerare i namespace attualmente in scope in C++."
type: docs
weight: 600
url: /it/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


Restituisce una collezione di nomi di namespace indicizzati per prefisso, che può essere usata per enumerare i namespace attualmente in ambito.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ambito | XmlNamespaceScope | Un valore di enumerazione che specifica il tipo di nodi di namespace da restituire. |

### ReturnValue

Una raccolta di coppie di namespace e prefisso attualmente in scope.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
