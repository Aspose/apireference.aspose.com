---
title: "System::Xml::IXmlNamespaceResolver classe"
linktitle: "IXmlNamespaceResolver"
second_title: "Aspose.Page per C++"
description: "System::Xml::IXmlNamespaceResolver classe. Fornisce accesso in sola lettura a un insieme di mappature prefisso e namespace in C++."
type: docs
weight: 400
url: /it/cpp/system.xml/ixmlnamespaceresolver/
---
## IXmlNamespaceResolver class


Fornisce accesso in sola lettura a un insieme di mappature di prefisso e spazio dei nomi.

```cpp
class IXmlNamespaceResolver : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) | Restituisce una raccolta di mappature prefisso-namespace definite che sono attualmente in ambito. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Restituisce l'URI del namespace mappato al prefisso specificato. |
| virtual [LookupPrefix](./lookupprefix/)(const String\&) | Restituisce il prefisso che è mappato all'URI del namespace specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
