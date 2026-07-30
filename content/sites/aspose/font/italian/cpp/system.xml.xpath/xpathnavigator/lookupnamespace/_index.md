---
title: "Metodo System::Xml::XPath::XPathNavigator::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XPath::XPathNavigator::LookupNamespace. Restituisce l'URI dello spazio dei nomi per il prefisso specificato in C++."
type: docs
weight: 4700
url: /it/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


Restituisce l'URI dello spazio dei nomi per il prefisso specificato.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | const String\& | Il prefisso il cui URI dello spazio dei nomi si desidera risolvere. Per corrispondere allo spazio dei nomi predefinito, passare [String::Empty](../../../system/string/empty/). |

### ReturnValue

Una [String](../../../system/string/) che contiene l'URI dello spazio dei nomi assegnato al prefisso specificato; **nullptr** se nessun URI è assegnato al prefisso specificato. La [String](../../../system/string/) restituita è atomizzata.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
