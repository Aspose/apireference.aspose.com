---
title: "System::Xml::Schema::XmlSchemaElement klasse"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaElement klasse. Vertegenwoordigt het element‑element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse is de basisklasse voor alle particle‑typen en wordt gebruikt om een element in een XML‑document te beschrijven in C++."
type: docs
weight: 2600
url: /nl/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


Vertegenwoordigt het **element**‑element van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse is de basisklasse voor alle particle‑typen en wordt gebruikt om een element in een XML‑document te beschrijven.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Block](./get_block/)() | Retourneert een **Block**‑afleiding. |
| [get_BlockResolved](./get_blockresolved/)() | Retourneert de post‑compilatie‑interpretatie van de **Block**‑waarde. |
| [get_Constraints](./get_constraints/)() | Retourneert de verzameling beperkingen op het element. |
| [get_DefaultValue](./get_defaultvalue/)() | Retourneert de standaardwaarde van het element als de inhoud een simple type is of de inhoud van het element **textOnly** is. |
| [get_ElementSchemaType](./get_elementschematype/)() | Retourneert een [XmlSchemaType](../xmlschematype/) object dat het type van het element weergeeft op basis van de [XmlSchemaElement::get_SchemaType](./get_schematype/) of [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) waarden van het element. |
| [get_ElementType](./get_elementtype/)() | Retourneert een object gebaseerd op de [XmlSchemaElement](./) of [XmlSchemaElement](./) van het element, die de post‑compilatie‑interpretatie van de **ElementType**‑waarde bevat. |
| [get_Final](./get_final/)() | Retourneert de **Final**‑waarde om aan te geven dat geen verdere afleidingen zijn toegestaan. |
| [get_FinalResolved](./get_finalresolved/)() | Retourneert de post‑compilatie‑interpretatie van de **Final**‑waarde. |
| [get_FixedValue](./get_fixedvalue/)() | Retourneert de vaste waarde. |
| [get_Form](./get_form/)() | Retourneert de vorm voor het element. |
| [get_IsAbstract](./get_isabstract/)() | Retourneert informatie om aan te geven of het element kan worden gebruikt in een instantie‑document. |
| [get_IsNillable](./get_isnillable/)() | Retourneert informatie die aangeeft of **xsi:nil** kan voorkomen in de instantie‑gegevens. Geeft aan of een expliciete nil‑waarde aan het element kan worden toegewezen. |
| [get_Name](./get_name/)() | Retourneert de naam van het element. |
| [get_QualifiedName](./get_qualifiedname/)() | Retourneert de werkelijke gekwalificeerde naam voor het opgegeven element. |
| [get_RefName](./get_refname/)() | Retourneert de referentienaam van een element dat in dit schema is gedeclareerd (of een ander schema dat wordt aangegeven door de opgegeven namespace). |
| [get_SchemaType](./get_schematype/)() | Retourneert het type van het element. Dit kan een complex type of een simple type zijn. |
| [get_SchemaTypeName](./get_schematypename/)() | Retourneert de naam van een ingebouwd gegevenstype dat is gedefinieerd in dit schema of een ander schema dat wordt aangegeven door de opgegeven namespace. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Retourneert de naam van een element dat door dit element wordt vervangen. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Stelt een **Block** afleiding in. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Stelt de standaardwaarde van het element in als de inhoud een eenvoudig type is of de inhoud van het element **textOnly** is. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Stelt de **Final**-waarde in om aan te geven dat verdere afleidingen niet zijn toegestaan. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Stelt de vaste waarde in. |
| [set_Form](./set_form/)(XmlSchemaForm) | Stelt de vorm voor het element in. |
| [set_IsAbstract](./set_isabstract/)(bool) | Stelt informatie in om aan te geven of het element kan worden gebruikt in een instantiedocument. |
| [set_IsNillable](./set_isnillable/)(bool) | Stelt informatie in die aangeeft of **xsi:nil** kan voorkomen in de instantiedata. Geeft aan of een expliciete nil‑waarde aan het element kan worden toegewezen. |
| [set_Name](./set_name/)(const String\&) | Stelt de naam van het element in. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de referentienaam in van een element dat in dit schema is gedeclareerd (of in een ander schema dat door de opgegeven namespace wordt aangegeven). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Stelt het type van het element in. Dit kan een complex type of een eenvoudig type zijn. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van een ingebouwd gegevenstype dat is gedefinieerd in dit schema of in een ander schema dat door de opgegeven namespace wordt aangegeven. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van een element dat door dit element wordt vervangen. |
| [XmlSchemaElement](./xmlschemaelement/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaElement](./). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
