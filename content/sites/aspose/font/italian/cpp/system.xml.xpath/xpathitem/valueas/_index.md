---
title: "System::Xml::XPath::XPathItem::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathItem::ValueAs method. Restituisce il valore dell'elemento come il tipo specificato in C++."
type: docs
weight: 1100
url: /it/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


Restituisce il valore dell'elemento come il tipo specificato.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| returnType | const TypeInfo\& | Il tipo con cui restituire il valore dell'elemento. |

### ReturnValue

Il valore dell'elemento come il tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Quando viene sovrascritto in una classe derivata, restituisce il valore dell'elemento come il tipo specificato utilizzando l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di namespace.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| returnType | const TypeInfo\& | Il tipo con cui restituire il valore dell'elemento. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilizzato per risolvere i prefissi di namespace. |

### ReturnValue

Il valore dell'elemento come il tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
