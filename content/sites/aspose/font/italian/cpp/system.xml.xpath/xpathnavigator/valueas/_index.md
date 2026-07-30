---
title: "System::Xml::XPath::XPathNavigator::ValueAs metodo"
linktitle: "ValueAs"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs metodo. Restituisce il valore del nodo corrente come il Tipo specificato, usando l'oggetto IXmlNamespaceResolver specificato per risolvere i prefissi di spazio dei nomi in C++."
type: docs
weight: 8100
url: /it/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Restituisce il valore del nodo corrente come il Tipo specificato, usando l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di spazio dei nomi.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| returnType | const TypeInfo\& | Il Tipo con cui restituire il valore del nodo corrente. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilizzato per risolvere i prefissi di namespace. |

### ReturnValue

Il valore del nodo corrente come il Tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
