---
title: "System::Xml::XPath::XPathItem::ValueAs metodo"
linktitle: "ValueAs"
second_title: "Aspose.Page per C++"
description: "System::Xml::XPath::XPathItem::ValueAs metodo. Restituisce il valore dell'item''s come il tipo specificato in C++."
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
| returnType | const TypeInfo\& | Il tipo a cui restituire il valore dell'elemento. |

### ReturnValue

Il valore dell'elemento come il tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Quando sovrascritto in una classe derivata, restituisce il valore dell'elemento come il tipo specificato usando l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di namespace.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| returnType | const TypeInfo\& | Il tipo a cui restituire il valore dell'elemento. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) usato per risolvere i prefissi di namespace. |

### ReturnValue

Il valore dell'elemento come il tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
