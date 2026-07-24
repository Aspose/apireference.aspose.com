---
title: "System::Xml::Schema::XmlSchema klasse"
linktitle: "XmlSchema"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchema klasse. Een in‑memory weergave van een XML‑schema, zoals gespecificeerd door het World Wide Web Consortium (W3C) en in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


Een in‑memory weergave van een XML [Schema](../), zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) en [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/).

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | Compileert het XML [Schema](../)[Object](../../system/object/) Model (SOM) naar schemainformatie voor validatie. Wordt gebruikt om de syntactische en semantische structuur van het programmatisch gebouwde SOM te controleren. Semantische validatiecontrole wordt uitgevoerd tijdens de compilatie. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | Compileert het XML [Schema](../)[Object](../../system/object/) Model (SOM) naar schemainformatie voor validatie. Wordt gebruikt om de syntactische en semantische structuur van het programmatisch gebouwde SOM te controleren. Semantische validatiecontrole wordt uitgevoerd tijdens de compilatie. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | Retourneert de vorm voor attributen die gedeclareerd zijn in de doel‑namespace van het schema. |
| [get_AttributeGroups](./get_attributegroups/)() | Retourneert de post‑schema‑compilatie‑waarde van alle globale attribuuttgroepen in het schema. |
| [get_Attributes](./get_attributes/)() | Retourneert de post‑schema‑compilatie‑waarde voor alle attributen in het schema. |
| [get_BlockDefault](./get_blockdefault/)() | Retourneert het **blockDefault** attribuut dat de standaardwaarde van het **block** attribuut instelt op elementen en complexe types in de **targetNamespace** van het schema. |
| [get_ElementFormDefault](./get_elementformdefault/)() | Retourneert de vorm voor elementen die gedeclareerd zijn in de doel‑namespace van het schema. |
| [get_Elements](./get_elements/)() | Retourneert de post‑schema‑compilatie‑waarde voor alle elementen in het schema. |
| [get_FinalDefault](./get_finaldefault/)() | Retourneert het **finalDefault** attribuut dat de standaardwaarde van het **final** attribuut instelt op elementen en complexe types in de doel‑namespace van het schema. |
| [get_Groups](./get_groups/)() | Retourneert de post-schema-compilatiewaarde van alle groepen in het schema. |
| [get_Id](./get_id/)() | Retourneert de tekenreeks-ID. |
| [get_Includes](./get_includes/)() | Retourneert de collectie van inbegrepen en geïmporteerde schema's. |
| [get_IsCompiled](./get_iscompiled/)() | Geeft aan of het schema is gecompileerd. |
| [get_Items](./get_items/)() | Retourneert de collectie van schema‑elementen in het schema en wordt gebruikt om nieuwe elementtypen toe te voegen op **schema** elementniveau. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | Retourneert het regelnummmer in het bestand waarnaar het **schema** element verwijst. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | Retourneert de regelpositie in het bestand waarnaar het **schema** element verwijst. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | Retourneert de XmlSerializerNamespaces die met dit schema‑object moeten worden gebruikt. |
| [get_Notations](./get_notations/)() | Retourneert de post-schema-compilatiewaarde voor alle notaties in het schema. |
| [get_Parent](../xmlschemaobject/get_parent/)() | Retourneert de ouder van dit [XmlSchemaObject](../xmlschemaobject/). |
| [get_SchemaTypes](./get_schematypes/)() | Retourneert de post-schema-compilatiewaarde van alle schematypen in het schema. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | Retourneert de bronlocatie van het bestand dat het schema heeft geladen. |
| [get_TargetNamespace](./get_targetnamespace/)() | Retourneert de Uniform Resource Identifier (URI) van de doel‑namespace van het schema. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Retourneert de gekwalificeerde attributen die niet tot de doel‑namespace van het schema behoren. |
| [get_Version](./get_version/)() | Retourneert de versie van het schema. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | Leest een XML [Schema](../) van de opgegeven [IO::TextReader](../../system.io/textreader/). |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | Leest een XML [Schema](../) van de opgegeven stream. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | Leest een XML [Schema](../) van de opgegeven [XmlReader](../../system.xml/xmlreader/). |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | Stelt de vorm in voor attributen die zijn gedeclareerd in de doel‑namespace van het schema. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | Stelt het **blockDefault**‑attribuut in dat de standaardwaarde van het **block**‑attribuut instelt voor elementen en complexe typen in de **targetNamespace** van het schema. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | Stelt de vorm in voor elementen die zijn gedeclareerd in de doel‑namespace van het schema. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | Stelt het **finalDefault**‑attribuut in dat de standaardwaarde van het **final**‑attribuut instelt voor elementen en complexe typen in de doel‑namespace van het schema. |
| [set_Id](./set_id/)(const String\&) | Stelt de tekenreeks-ID in. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | Stelt het regelnummmer in het bestand in waarnaar het **schema** element verwijst. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | Stelt de regelpositie in het bestand in waarnaar het **schema** element verwijst. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Stelt de XmlSerializerNamespaces in die gebruikt worden met dit schema-object. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Stelt de ouder van dit [XmlSchemaObject](../xmlschemaobject/) in. |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | Stelt de bronlocatie in voor het bestand dat het schema heeft geladen. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | Stelt de Uniform Resource Identifier (URI) van de doel-namespace van het schema in. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Stelt de gekwalificeerde attributen in die niet tot de doel-namespace van het schema behoren. |
| [set_Version](./set_version/)(const String\&) | Stelt de versie van het schema in. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | Schrijft de XML [Schema](../) naar de opgegeven datastroom. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Schrijft de XML [Schema](../) naar de opgegeven Stream met behulp van de opgegeven [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/). |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | Schrijft de XML [Schema](../) naar de opgegeven [IO::TextWriter](../../system.io/textwriter/). |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Schrijft de XML [Schema](../) naar de opgegeven TextWriter. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | Schrijft de XML [Schema](../) naar de opgegeven [XmlWriter](../../system.xml/xmlwriter/). |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Schrijft de XML [Schema](../) naar de opgegeven [XmlWriter](../../system.xml/xmlwriter/). |
| [XmlSchema](./xmlschema/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaObject](../xmlschemaobject/). |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | De XML-schema‑instantie‑namespace. Dit veld is constant. |
| static [Namespace](./namespace/) | De XML-schema‑namespace. Dit veld is constant. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
