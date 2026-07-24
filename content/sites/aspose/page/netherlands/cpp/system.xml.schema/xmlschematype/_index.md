---
title: "System::Xml::Schema::XmlSchemaType klasse"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaType klasse. De basisklasse voor alle eenvoudige types en complexe types in C++."
type: docs
weight: 6800
url: /nl/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


De basisklasse voor alle eenvoudige types en complexe types.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Retourneert het objecttype na compilatie of het ingebouwde XML [Schema](../) Definition Language (XSD) gegevenstype, simpleType‑element of complexType‑element. Dit is een waarde van de infoset na schema‑compilatie. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Retourneert de waarde na compilatie voor het basistype van dit schema‑type. |
| [get_Datatype](./get_datatype/)() | Retourneert de waarde na compilatie voor het gegevenstype van het complexe type. |
| [get_DerivedBy](./get_derivedby/)() | Retourneert de informatie na compilatie over hoe dit element is afgeleid van zijn basistype. |
| [get_Final](./get_final/)() | Retourneert het final‑attribuut van de type‑afleiding dat aangeeft of verdere afleidingen zijn toegestaan. |
| [get_FinalResolved](./get_finalresolved/)() | Retourneert de interpretatie na compilatie van de waarde van [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | Retourneert een waarde die aangeeft of dit type een gemengd inhoudsmodel heeft. Deze oproep is alleen geldig in een complex type. |
| [get_Name](./get_name/)() | Retourneert de naam van het type. |
| [get_QualifiedName](./get_qualifiedname/)() | Retourneert de gekwalificeerde naam voor het type dat is opgebouwd uit het **Name**-attribuut van dit type. Dit is een post-schema-compilatiewaarde. |
| [get_TypeCode](./get_typecode/)() | Retourneert de [XmlTypeCode](../xmltypecode/) van het type. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Retourneert een [XmlSchemaComplexType](../xmlschemacomplextype/) die het ingebouwde complexe type van het opgegeven complexe type vertegenwoordigt. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Retourneert een [XmlSchemaComplexType](../xmlschemacomplextype/) die het ingebouwde complexe type van het complexe type, gespecificeerd door een gekwalificeerde naam, vertegenwoordigt. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Retourneert een [XmlSchemaSimpleType](../xmlschemasimpletype/) die het ingebouwde eenvoudige type van het eenvoudige type, gespecificeerd door de gekwalificeerde naam, vertegenwoordigt. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Retourneert een [XmlSchemaSimpleType](../xmlschemasimpletype/) die het ingebouwde eenvoudige type van het opgegeven eenvoudige type vertegenwoordigt. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Retourneert een waarde die aangeeft of het opgegeven afgeleide schematype is afgeleid van het opgegeven basistype. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Stelt het final-attribuut van de type-afleiding in dat aangeeft of verdere afleidingen zijn toegestaan. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Stelt een waarde in die aangeeft of dit type een gemengd inhoudsmodel heeft. Deze aanroep is alleen geldig in een complex type. |
| [set_Name](./set_name/)(const String\&) | Stelt de naam van het type in. |
| [XmlSchemaType](./xmlschematype/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaType](./) klasse. |
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
