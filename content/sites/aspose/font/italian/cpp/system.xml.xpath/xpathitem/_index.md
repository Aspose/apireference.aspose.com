---
title: "System::Xml::XPath::XPathItem classe"
linktitle: "XPathItem"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathItem classe. Rappresenta un elemento nel modello dati XQuery 1.0 e XPath 2.0 in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Rappresenta un elemento nel XQuery 1.0 e nel modello [XPath](../) 2.0 [Data](../../system.data/).

```cpp
class XPathItem : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | Quando sovrascritto in una classe derivata, ottiene un valore che indica se l'elemento rappresenta un nodo [XPath](../) o un valore atomico. |
| virtual [get_TypedValue](./get_typedvalue/)() | Quando sovrascritto in una classe derivata, ottiene l'elemento corrente come oggetto boxed del tipo più appropriato in base al suo tipo di schema. |
| virtual [get_Value](./get_value/)() | Quando sovrascritto in una classe derivata, ottiene il valore **string** dell'elemento. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | Quando sovrascritto in una classe derivata, ottiene il valore dell'elemento come [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | Quando sovrascritto in una classe derivata, ottiene il valore dell'elemento come [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | Quando sovrascritto in una classe derivata, ottiene il valore dell'elemento come [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | Quando sovrascritto in una classe derivata, ottiene il valore dell'elemento come [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | Quando sovrascritto in una classe derivata, ottiene il valore dell'elemento come [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | Quando sovrascritto in una classe derivata, ottiene il tipo dell'elemento. |
| virtual [get_XmlType](./get_xmltype/)() | Quando sovrascritto in una classe derivata, ottiene l'XmlSchemaType per l'elemento. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Restituisce il valore dell'elemento come il tipo specificato. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Quando sovrascritto in una classe derivata, restituisce il valore dell'elemento come il tipo specificato usando l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di namespace. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
