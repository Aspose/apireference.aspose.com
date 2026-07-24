---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute metodo"
linktitle: "CreateAttribute"
second_title: "Aspose.Page per C++"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute metodo. Crea un nodo attributo sul nodo elemento corrente utilizzando il prefisso di namespace, il nome locale e l'URI di namespace specificati con il valore indicato in C++."
type: docs
weight: 700
url: /it/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


Crea un nodo attributo sul nodo elemento corrente utilizzando il prefisso di spazio dei nomi, il nome locale e l'URI dello spazio dei nomi specificati con il valore indicato.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefisso | String | Il prefisso di namespace del nuovo nodo attributo (se presente). |
| localName | String | Il nome locale del nuovo nodo attributo che non può essere [String::Empty](../../../system/string/empty/) o **nullptr**. |
| namespaceURI | String | L'URI di namespace per il nuovo nodo attributo (se presente). |
| value | String | Il valore del nuovo nodo attributo. Se vengono passati [String::Empty](../../../system/string/empty/) o **nullptr**, viene creato un nodo attributo vuoto. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
