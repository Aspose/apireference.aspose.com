---
title: "System::Xml::Schema::XmlAtomicValue klasse"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlAtomicValue klasse. Stelt de getypeerde waarde van een gevalideerd XML-element of -attribuut voor. De XmlAtomicValue klasse kan niet worden geërfd in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


Stelt de getypeerde waarde van een gevalideerd XML-element of -attribuut voor. De [XmlAtomicValue](./) klasse kan niet worden geërfd.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Retourneert een kopie van dit [XmlAtomicValue](./) object. |
| [get_IsNode](./get_isnode/)() override | Retourneert een waarde die aangeeft of het gevalideerde XML-element of -attribuut een [XPath](../../system.xml.xpath/) knoop of een atomische waarde is. |
| [get_TypedValue](./get_typedvalue/)() override | Retourneert het huidige gevalideerde XML-element of -attribuut als een verpakte object van het meest geschikte type volgens zijn schematype. |
| [get_Value](./get_value/)() override | Retourneert de [String](../../system/string/) waarde van het gevalideerde XML-element of -attribuut. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Retourneert de waarde van het gevalideerde XML-element of -attribuut als een [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Retourneert de waarde van het gevalideerde XML-element of -attribuut als een [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Retourneert de waarde van het gevalideerde XML-element of -attribuut als een [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Retourneert de waarde van het gevalideerde XML-element of -attribuut als een [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Retourneert de waarde van het gevalideerde XML-element of -attribuut als een [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Retourneert het type van het gevalideerde XML-element of -attribuut. |
| [get_XmlType](./get_xmltype/)() override | Retourneert de [XmlSchemaType](../xmlschematype/) voor het gevalideerde XML-element of -attribuut. |
| [ToString](./tostring/)() const override | Retourneert de [String](../../system/string/) waarde van het gevalideerde XML-element of -attribuut. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Retourneert de waarde van het gevalideerde XML-element of -attribuut als het type dat is opgegeven met het [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object dat is opgegeven om namespace-prefixen op te lossen. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
