---
title: "System::Xml::Schema::XmlAtomicValue classe"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlAtomicValue classe. Rappresenta il valore tipizzato di un elemento o attributo XML convalidato. La classe XmlAtomicValue non può essere ereditata in C++."
type: docs
weight: 300
url: /it/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


Rappresenta il valore tipizzato di un elemento o attributo XML convalidato. La classe [XmlAtomicValue](./) non può essere ereditata.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Restituisce una copia di questo oggetto [XmlAtomicValue](./). |
| [get_IsNode](./get_isnode/)() override | Restituisce un valore che indica se l'elemento o attributo XML convalidato è un nodo [XPath](../../system.xml.xpath/) o un valore atomico. |
| [get_TypedValue](./get_typedvalue/)() override | Restituisce l'attuale elemento o attributo XML convalidato come oggetto incapsulato del tipo più appropriato in base al suo tipo di schema. |
| [get_Value](./get_value/)() override | Restituisce il valore [String](../../system/string/) dell'elemento o attributo XML convalidato. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Restituisce il valore dell'elemento o attributo XML convalidato come [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Restituisce il valore dell'elemento o attributo XML convalidato come [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Restituisce il valore dell'elemento o attributo XML convalidato come [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Restituisce il valore dell'elemento o attributo XML convalidato come [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Restituisce il valore dell'elemento o attributo XML convalidato come [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Restituisce il tipo dell'elemento o attributo XML convalidato. |
| [get_XmlType](./get_xmltype/)() override | Restituisce il [XmlSchemaType](../xmlschematype/) per l'elemento o attributo XML convalidato. |
| [ToString](./tostring/)() const override | Restituisce il valore [String](../../system/string/) dell'elemento o attributo XML convalidato. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Restituisce il valore dell'elemento o attributo XML convalidato come il tipo specificato utilizzando l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di namespace. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
