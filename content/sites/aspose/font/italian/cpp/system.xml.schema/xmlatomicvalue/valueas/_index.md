---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs metodo"
linktitle: "ValueAs"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs metodo. Restituisce il valore convalidato dell'elemento XML o dell'attributo come il tipo specificato utilizzando l'oggetto IXmlNamespaceResolver indicato per risolvere i prefissi di namespace in C++."
type: docs
weight: 1300
url: /it/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Restituisce il valore convalidato dell'elemento XML o dell'attributo come il tipo specificato utilizzando l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) indicato per risolvere i prefissi di namespace.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tipo | const TypeInfo\& | Il tipo con cui restituire il valore convalidato dell'elemento XML o dell'attributo. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilizzato per risolvere i prefissi di namespace. |

### ReturnValue

Il valore dell'elemento XML o dell'attributo convalidato come il tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
