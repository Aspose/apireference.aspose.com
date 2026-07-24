---
title: "System::Xml::Schema::XmlSchemaInference klasse"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaInference klasse. Berekent een XML Schema Definition Language (XSD)-schema van een XML-document. De XmlSchemaInference klasse kan niet worden geërfd in C++."
type: docs
weight: 3700
url: /nl/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Berekent een XML [Schema](../) Definition Language (XSD)-schema van een XML-document. De [XmlSchemaInference](./) klasse kan niet worden geërfd.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Enum | Beschrijving |
| --- | --- |
| [InferenceOption](./inferenceoption/) | Beïnvloedt de voorkomen- en type-informatie die door de [XmlSchemaInference](./) klasse wordt afgeleid voor elementen en attributen in een XML-document. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | Retourneert de [XmlSchemaInference::InferenceOption](./inferenceoption/) waarde die de schema‑voorkomensdeclaraties beïnvloedt die uit het XML-document zijn afgeleid. |
| [get_TypeInference](./get_typeinference/)() | Retourneert de [XmlSchemaInference::InferenceOption](./inferenceoption/) waarde die de types beïnvloedt die uit het XML-document zijn afgeleid. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Berekent een XML [Schema](../) Definition Language (XSD)-schema van het XML-document dat zich bevindt in het opgegeven [XmlReader](../../system.xml/xmlreader/) object. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Berekent een XML [Schema](../) Definition Language (XSD)-schema van het XML-document dat zich bevindt in het opgegeven [XmlReader](../../system.xml/xmlreader/) object, en verfijnt het afgeleide schema met behulp van een bestaand schema in het opgegeven [XmlSchemaSet](../xmlschemaset/) object met dezelfde doel‑namespace. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | Stelt de [XmlSchemaInference::InferenceOption](./inferenceoption/) waarde in die de schema‑voorkomensdeclaraties beïnvloedt die uit het XML-document zijn afgeleid. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | Stelt de [XmlSchemaInference::InferenceOption](./inferenceoption/) waarde in die van invloed is op types die uit het XML-document zijn afgeleid. |
| [XmlSchemaInference](./xmlschemainference/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaInference](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
