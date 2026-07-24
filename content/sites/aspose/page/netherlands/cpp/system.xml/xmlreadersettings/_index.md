---
title: "System::Xml::XmlReaderSettings class"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReaderSettings class. Specificeert een set functies die ondersteund moeten worden op het XmlReader-object dat is gemaakt door de XmlReader::Create-methode in C++."
type: docs
weight: 3400
url: /nl/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


Specificeert een set functies die ondersteund moeten worden op het [XmlReader](../xmlreader/) object dat is gemaakt door de [XmlReader::Create](../xmlreader/create/) methode.

```cpp
class XmlReaderSettings : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | Maakt een kopie van de [XmlReaderSettings](./) instantie. |
| [get_CheckCharacters](./get_checkcharacters/)() | Geeft een waarde terug die aangeeft of tekencontrole moet worden uitgevoerd. |
| [get_CloseInput](./get_closeinput/)() | Geeft een waarde terug die aangeeft of de onderliggende stream of TextReader moet worden gesloten wanneer de lezer wordt gesloten. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Geeft het conformiteitsniveau terug waaraan de [XmlReader](../xmlreader/) zal voldoen. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Geeft een waarde terug die de verwerking van DTD's bepaalt. |
| [get_IgnoreComments](./get_ignorecomments/)() | Geeft een waarde terug die aangeeft of opmerkingen moeten worden genegeerd. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | Geeft een waarde terug die aangeeft of verwerkingsinstructies moeten worden genegeerd. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | Geeft een waarde terug die aangeeft of onbeduidende witruimte moet worden genegeerd. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | Geeft de regelnummeroffset van het [XmlReader](../xmlreader/) object terug. |
| [get_LinePositionOffset](./get_linepositionoffset/)() | Geeft de regelpositieoffset van het [XmlReader](../xmlreader/) object terug. |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | Geeft een waarde terug die het maximaal toegestane aantal tekens in een document aangeeft dat voortkomt uit het uitbreiden van entiteiten. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | Retourneert een waarde die het maximaal toegestane aantal tekens in een XML-document aangeeft. Een nul (0) waarde betekent geen limieten voor de grootte van het XML-document. Een niet-nul waarde specificeert de maximale grootte, in tekens. |
| [get_NameTable](./get_nametable/)() | Retourneert de [XmlNameTable](../xmlnametable/) die wordt gebruikt voor geatomiseerde tekenreeksvergelijkingen. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Retourneert een waarde die aangeeft of documenttype-definitie (DTD) verwerking verboden moet worden. |
| [get_Schemas](./get_schemas/)() | Retourneert de XmlSchemaSet die moet worden gebruikt bij het uitvoeren van schemavalidatie. |
| [get_ValidationFlags](./get_validationflags/)() | Retourneert een waarde die de instellingen voor schemavalidatie aangeeft. Deze instelling is van toepassing op [XmlReader](../xmlreader/) objecten die schema's valideren ([XmlReaderSettings::get_ValidationType](./get_validationtype/) waarde is [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | Retourneert een waarde die aangeeft of de [XmlReader](../xmlreader/) validatie of type-toewijzing zal uitvoeren tijdens het lezen. |
| [Reset](./reset/)() | Reset de leden van de instellingenklasse naar hun standaardwaarden. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Stelt een waarde in die aangeeft of tekencontrole moet worden uitgevoerd. |
| [set_CloseInput](./set_closeinput/)(bool) | Stelt een waarde in die aangeeft of de onderliggende stream of TextReader moet worden gesloten wanneer de lezer wordt gesloten. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Stelt het conformiteitsniveau in waaraan de [XmlReader](../xmlreader/) moet voldoen. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Stelt een waarde in die de verwerking van DTD's bepaalt. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | Stelt een waarde in die aangeeft of opmerkingen moeten worden genegeerd. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | Stelt een waarde in die aangeeft of verwerkingsinstructies moeten worden genegeerd. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | Stelt een waarde in die aangeeft of onbelangrijke witruimte moet worden genegeerd. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | Stelt de regelnummer-offset in van het [XmlReader](../xmlreader/) object. |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | Stelt de regelpositie-offset in van het [XmlReader](../xmlreader/) object. |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | Stelt een waarde in die het maximaal toegestane aantal tekens in een document aangeeft dat voortkomt uit het uitbreiden van entiteiten. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | Stelt een waarde in die het maximaal toegestane aantal tekens in een XML-document aangeeft. Een nul (0) waarde betekent geen limieten voor de grootte van het XML-document. Een niet-nul waarde specificeert de maximale grootte, in tekens. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Stelt de [XmlNameTable](../xmlnametable/) in die wordt gebruikt voor geatomiseerde tekenreeksvergelijkingen. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Stelt een waarde in die aangeeft of documenttype-definitie (DTD) verwerking verboden moet worden. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Stelt de XmlSchemaSet in die moet worden gebruikt bij het uitvoeren van schemavalidatie. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | Stelt een waarde in die de instellingen voor schemavalidatie aangeeft. Deze instelling is van toepassing op [XmlReader](../xmlreader/) objecten die schema's valideren ([XmlReaderSettings::get_ValidationType](./get_validationtype/) waarde is [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Stelt een waarde in die aangeeft of de [XmlReader](../xmlreader/) validatie of type-toewijzing zal uitvoeren tijdens het lezen. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Stelt de [XmlResolver](../xmlresolver/) in die wordt gebruikt om externe documenten te benaderen. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Voegt een gebeurtenisafhandelaar toe die optreedt wanneer de lezer validatiefouten tegenkomt. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Verwijdert een gebeurtenisafhandelaar die optreedt wanneer de lezer validatiefouten tegenkomt. |
| [XmlReaderSettings](./xmlreadersettings/)() | Initialiseert een nieuw exemplaar van de klasse [XmlReaderSettings](./). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
