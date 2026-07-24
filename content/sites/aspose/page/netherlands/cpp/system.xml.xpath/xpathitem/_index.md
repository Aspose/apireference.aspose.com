---
title: "System::Xml::XPath::XPathItem-klasse"
linktitle: "XPathItem"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathItem-klasse. Vertegenwoordigt een item in het XQuery 1.0- en XPath 2.0-gegevensmodel in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Vertegenwoordigt een item in XQuery 1.0 en [XPath](../) 2.0 [Data](../../system.data/) Model.

```cpp
class XPathItem : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | Wanneer overschreven in een afgeleide klasse, krijgt een waarde die aangeeft of het item een [XPath](../) knoop of een atomische waarde vertegenwoordigt. |
| virtual [get_TypedValue](./get_typedvalue/)() | Wanneer overschreven in een afgeleide klasse, krijgt het huidige item als een verpakt object van het meest geschikte type volgens zijn schematype. |
| virtual [get_Value](./get_value/)() | Wanneer overschreven in een afgeleide klasse, krijgt de **string**-waarde van het item. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | Wanneer overschreven in een afgeleide klasse, krijgt de waarde van het item als een [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | Wanneer overschreven in een afgeleide klasse, krijgt de waarde van het item als een [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | Wanneer overschreven in een afgeleide klasse, krijgt de waarde van het item als een [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | Wanneer overschreven in een afgeleide klasse, krijgt de waarde van het item als een [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | Wanneer overschreven in een afgeleide klasse, krijgt de waarde van het item als een [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | Wanneer overschreven in een afgeleide klasse, haalt het het type van het item op. |
| virtual [get_XmlType](./get_xmltype/)() | Wanneer overschreven in een afgeleide klasse, krijgt het XmlSchemaType voor het item. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Retourneert de waarde van het item als het opgegeven type. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Wanneer overschreven in een afgeleide klasse, retourneert de waarde van het item als het type dat is opgegeven met behulp van het [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object dat is opgegeven om namespace‑prefixen op te lossen. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
