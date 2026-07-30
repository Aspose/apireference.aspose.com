---
title: "Classe System::Xml::IXmlNamespaceResolver"
linktitle: "IXmlNamespaceResolver"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::IXmlNamespaceResolver. Fornisce accesso in sola lettura a un insieme di mappature di prefisso e spazio dei nomi in C++."
type: docs
weight: 400
url: /it/cpp/system.xml/ixmlnamespaceresolver/
---
## IXmlNamespaceResolver class


Fornisce accesso in sola lettura a un insieme di mappature di prefissi e namespace.

```cpp
class IXmlNamespaceResolver : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) | Restituisce una raccolta delle mappature prefisso-spazio dei nomi definite attualmente in ambito. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Restituisce l'URI dello spazio dei nomi mappato al prefisso specificato. |
| virtual [LookupPrefix](./lookupprefix/)(const String\&) | Restituisce il prefisso che è mappato all'URI dello spazio dei nomi specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
