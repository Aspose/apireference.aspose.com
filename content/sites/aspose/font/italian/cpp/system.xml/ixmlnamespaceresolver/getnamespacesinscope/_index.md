---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope metodo"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font per C++"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope metodo. Restituisce una collezione di mappature prefisso-spazio dei nomi definite che sono attualmente nel contesto in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


Restituisce una raccolta delle mappature prefisso-spazio dei nomi definite attualmente in ambito.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| scope | XmlNamespaceScope | Un valore [XmlNamespaceScope](../../xmlnamespacescope/) che specifica il tipo di nodi di namespace da restituire. |

### ReturnValue

Una collezione IDictionary che contiene gli spazi dei nomi attualmente nel contesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
