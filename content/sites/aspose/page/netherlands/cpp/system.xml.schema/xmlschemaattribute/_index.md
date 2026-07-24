---
title: "System::Xml::Schema::XmlSchemaAttribute class"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaAttribute class. Vertegenwoordigt het attribute-element uit de XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Attributen bieden extra informatie voor andere documentelementen. Het attribute‑tag staat genest tussen de tags van een document‑element voor het schema. Het XML‑document toont attributen als benoemde items in de openings‑tag van een element in C++."
type: docs
weight: 1100
url: /nl/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


Vertegenwoordigt het **attribute**-element van de XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Attributen bieden extra informatie voor andere documentelementen. Het attribute‑tag staat genest tussen de tags van een document‑element voor het schema. Het XML‑document toont attributen als benoemde items in de openings‑tag van een element.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Geeft een [XmlSchemaSimpleType](../xmlschemasimpletype/) object terug dat het type van het attribute weergeeft op basis van de [XmlSchemaAttribute::get_SchemaType](./get_schematype/) of [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) waarde van het attribute. |
| [get_AttributeType](./get_attributetype/)() | Geeft het object terug op basis van de [XmlSchemaAttribute::get_SchemaType](./get_schematype/) of [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) waarde van het attribute dat de post‑compilatie‑interpretatie van de **AttributeType**‑waarde bevat. |
| [get_DefaultValue](./get_defaultvalue/)() | Geeft de standaardwaarde voor het attribute terug. |
| [get_FixedValue](./get_fixedvalue/)() | Geeft de vaste waarde voor het attribute terug. |
| [get_Form](./get_form/)() | Geeft de vorm voor het attribute terug. |
| [get_Name](./get_name/)() | Geeft de naam van het attribute terug. |
| [get_QualifiedName](./get_qualifiedname/)() | Geeft de gekwalificeerde naam voor het attribute terug. |
| [get_RefName](./get_refname/)() | Geeft de naam van een attribute terug dat is gedeclareerd in dit schema (of een ander schema aangegeven door de opgegeven namespace). |
| [get_SchemaType](./get_schematype/)() | Retourneert het attribuuttype naar een eenvoudig type. |
| [get_SchemaTypeName](./get_schematypename/)() | Retourneert de naam van het eenvoudige type dat in dit schema is gedefinieerd (of een ander schema dat wordt aangegeven door de opgegeven namespace). |
| [get_Use](./get_use/)() | Retourneert informatie over hoe het attribuut wordt gebruikt. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Stelt de standaardwaarde in voor het attribuut. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Stelt de vaste waarde in voor het attribuut. |
| [set_Form](./set_form/)(XmlSchemaForm) | Stelt de vorm in voor het attribuut. |
| [set_Name](./set_name/)(const String\&) | Stelt de naam van het attribuut in. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van een attribuut dat in dit schema is gedeclareerd (of een ander schema dat wordt aangegeven door de opgegeven namespace). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Stelt het attribuuttype in op een eenvoudig type. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van het eenvoudige type dat in dit schema is gedefinieerd (of een ander schema dat wordt aangegeven door de opgegeven namespace). |
| [set_Use](./set_use/)(XmlSchemaUse) | Stelt informatie in over hoe het attribuut wordt gebruikt. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaAttribute](./). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
