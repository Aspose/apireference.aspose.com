---
title: "Metodo System::Xml::IXmlNamespaceResolver::GetNamespacesInScope"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::IXmlNamespaceResolver::GetNamespacesInScope. Restituisce una raccolta di mappature prefisso-spazio dei nomi definite attualmente in ambito in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


Restituisce una raccolta di mappature prefisso-namespace definite che sono attualmente in ambito.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| scope | XmlNamespaceScope | Un valore [XmlNamespaceScope](../../xmlnamespacescope/) che specifica il tipo di nodi di namespace da restituire. |

### ReturnValue

Una raccolta IDictionary che contiene gli spazi dei nomi attualmente in ambito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
