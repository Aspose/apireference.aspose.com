---
title: "System::Xml::XPath::XPathNavigator::LookupPrefix metodo"
linktitle: "LookupPrefix"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNavigator::LookupPrefix metodo. Restituisce il prefisso dichiarato per l'URI dello spazio dei nomi specificato in C++."
type: docs
weight: 4800
url: /it/cpp/system.xml.xpath/xpathnavigator/lookupprefix/
---
## XPathNavigator::LookupPrefix method


Restituisce il prefisso dichiarato per l'URI di spazio dei nomi specificato.

```cpp
String System::Xml::XPath::XPathNavigator::LookupPrefix(const String &namespaceURI) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| namespaceURI | const String\& | L'URI dello spazio dei nomi da risolvere per il prefisso. |

### ReturnValue

Una [String](../../../system/string/) che contiene il prefisso dello spazio dei nomi assegnato all'URI dello spazio dei nomi specificato; altrimenti, [String::Empty](../../../system/string/empty/) se nessun prefisso è assegnato all'URI dello spazio dei nomi specificato. La [String](../../../system/string/) restituita è atomizzata.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
