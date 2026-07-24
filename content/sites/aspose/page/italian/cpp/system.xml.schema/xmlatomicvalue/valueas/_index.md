---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs metodo"
linktitle: "ValueAs"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs metodo. Restituisce il valore dell'elemento XML convalidato o dell'attributo'' come il tipo specificato usando l'oggetto IXmlNamespaceResolver specificato per risolvere i prefissi di namespace in C++."
type: docs
weight: 1300
url: /it/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Restituisce il valore dell'elemento XML convalidato o dell'attributo come il tipo specificato usando l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di namespace.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tipo | const TypeInfo\& | Il tipo con cui restituire il valore dell'elemento XML convalidato o dell'attributo. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) usato per risolvere i prefissi di namespace. |

### ReturnValue

Il valore dell'elemento XML convalidato o dell'attributo nel tipo richiesto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
