---
title: "Metodo System::Xml::XPath::XPathNavigator::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XPath::XPathNavigator::GetAttribute. Restituisce il valore dell'attributo con il nome locale e l'URI del namespace specificati in C++."
type: docs
weight: 3800
url: /it/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


Restituisce il valore dell'attributo con il nome locale e l'URI dello spazio dei nomi specificati.

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'attributo. **localName** è sensibile al maiuscolo/minuscolo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

Una [String](../../../system/string/) che contiene il valore dell'attributo specificato; [String::Empty](../../../system/string/empty/) se non viene trovato un attributo corrispondente, o se il [XPathNavigator](../) non è posizionato su un nodo elemento.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
